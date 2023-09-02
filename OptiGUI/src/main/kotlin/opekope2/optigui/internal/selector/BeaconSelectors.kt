package opekope2.optigui.internal.selector

import opekope2.optigui.annotation.Selector
import opekope2.optigui.api.interaction.Interaction
import opekope2.optigui.api.selector.ISelector
import opekope2.optigui.filter.DisjunctionFilter
import opekope2.optigui.filter.Filter
import opekope2.optigui.filter.FilterResult
import opekope2.optigui.filter.PreProcessorFilter
import opekope2.util.assertNotEmpty
import opekope2.util.joinNotFound
import opekope2.util.map
import opekope2.optigui.properties.IBeaconProperties
import opekope2.util.NumberOrRange
import opekope2.util.delimiters
import opekope2.util.splitIgnoreEmpty


@Selector("beacon.levels")
class BeaconLevelSelector : ISelector {
    override fun createFilter(selector: String): Filter<Interaction, *>? =
        selector.splitIgnoreEmpty(*delimiters)
            ?.assertNotEmpty()
            ?.map(NumberOrRange::tryParse) {
                throw RuntimeException("Invalid levels: ${joinNotFound(it)}")
            }
            ?.assertNotEmpty()
            ?.let { levels ->
                PreProcessorFilter.nullGuarded(
                    { (it.data as? IBeaconProperties)?.level },
                    FilterResult.Mismatch(),
                    DisjunctionFilter(levels.map { it.toFilter() })
                )
            }
}
