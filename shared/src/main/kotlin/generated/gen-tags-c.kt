package kotlinx.html

import kotlinx.html.*
import kotlinx.html.impl.*
import kotlinx.html.attributes.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

open class CANVAS(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("canvas", consumer, initialAttributes), CommonAttributeGroupFacade {
    var width : String
        get()  = attributeStringString.get(this, "width")
        set(newValue) {attributeStringString.set(this, "width", newValue)}

    var height : String
        get()  = attributeStringString.get(this, "height")
        set(newValue) {attributeStringString.set(this, "height", newValue)}


}

open class CAPTION(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("caption", consumer, initialAttributes), HtmlBlockTag {

}

open class CITE(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("cite", consumer, initialAttributes), HtmlInlineTag {

}

open class CODE(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("code", consumer, initialAttributes), HtmlInlineTag {

}

open class COL(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("col", consumer, initialAttributes), CommonAttributeGroupFacade {
    var span : String
        get()  = attributeStringString.get(this, "span")
        set(newValue) {attributeStringString.set(this, "span", newValue)}


}

open class COLGROUP(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("colgroup", consumer, initialAttributes), CommonAttributeGroupFacade {
    var span : String
        get()  = attributeStringString.get(this, "span")
        set(newValue) {attributeStringString.set(this, "span", newValue)}


}
fun COLGROUP.col(classes : String? = null, block : COL.() -> Unit = {}) : Unit = COL(listOf("class" to stringSetDecode(classes)?.stringSetEncode()).toAttributesMap(), consumer).visit(block)


open class COMMAND(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("command", consumer, initialAttributes), CommonAttributeGroupFacade {
    var type : CommandType
        get()  = attributeCommandTypeEnumCommandTypeValues.get(this, "type")
        set(newValue) {attributeCommandTypeEnumCommandTypeValues.set(this, "type", newValue)}

    var label : String
        get()  = attributeStringString.get(this, "label")
        set(newValue) {attributeStringString.set(this, "label", newValue)}

    var icon : String
        get()  = attributeStringString.get(this, "icon")
        set(newValue) {attributeStringString.set(this, "icon", newValue)}

    var disabled : Boolean
        get()  = attributeBooleanTicker.get(this, "disabled")
        set(newValue) {attributeBooleanTicker.set(this, "disabled", newValue)}

    var checked : Boolean
        get()  = attributeBooleanTicker.get(this, "checked")
        set(newValue) {attributeBooleanTicker.set(this, "checked", newValue)}

    var radioGroup : String
        get()  = attributeStringString.get(this, "radiogroup")
        set(newValue) {attributeStringString.set(this, "radiogroup", newValue)}


}

