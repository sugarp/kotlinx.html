package kotlinx.html

import kotlinx.html.impl.*

open class HTMLTag(override val tagName : String, override val consumer : TagConsumer<*>, val initialAttributes : Map<String, String>, override val namespace : String? = null) : Tag {

    override val attributes : DelegatingMap = DelegatingMap(initialAttributes, this){ consumer }
}
