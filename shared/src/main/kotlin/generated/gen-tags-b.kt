package kotlinx.html

import kotlinx.html.*
import kotlinx.html.impl.*
import kotlinx.html.attributes.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

open class B(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("b", consumer, initialAttributes), HtmlInlineTag {

}

open class BASE(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("base", consumer, initialAttributes), CommonAttributeGroupFacade {
    var href : String
        get()  = attributeStringString.get(this, "href")
        set(newValue) {attributeStringString.set(this, "href", newValue)}

    var target : String
        get()  = attributeStringString.get(this, "target")
        set(newValue) {attributeStringString.set(this, "target", newValue)}


}

open class BDI(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("bdi", consumer, initialAttributes), HtmlInlineTag {

}

open class BDO(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("bdo", consumer, initialAttributes), HtmlInlineTag {

}

open class BLOCKQUOTE(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("blockquote", consumer, initialAttributes), HtmlBlockTag {
    var cite : String
        get()  = attributeStringString.get(this, "cite")
        set(newValue) {attributeStringString.set(this, "cite", newValue)}


}

open class BODY(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("body", consumer, initialAttributes), HtmlBlockTag {
    var onAfterprint : String
        get()  = attributeStringString.get(this, "onafterprint")
        set(newValue) {attributeStringString.set(this, "onafterprint", newValue)}

    var onBeforeprint : String
        get()  = attributeStringString.get(this, "onbeforeprint")
        set(newValue) {attributeStringString.set(this, "onbeforeprint", newValue)}

    var onBeforeunLoad : String
        get()  = attributeStringString.get(this, "onbeforeunload")
        set(newValue) {attributeStringString.set(this, "onbeforeunload", newValue)}

    var onHashChange : String
        get()  = attributeStringString.get(this, "onhashchange")
        set(newValue) {attributeStringString.set(this, "onhashchange", newValue)}

    var onMessage : String
        get()  = attributeStringString.get(this, "onmessage")
        set(newValue) {attributeStringString.set(this, "onmessage", newValue)}

    var onOffline : String
        get()  = attributeStringString.get(this, "onoffline")
        set(newValue) {attributeStringString.set(this, "onoffline", newValue)}

    var onOnline : String
        get()  = attributeStringString.get(this, "ononline")
        set(newValue) {attributeStringString.set(this, "ononline", newValue)}

    var onPopstate : String
        get()  = attributeStringString.get(this, "onpopstate")
        set(newValue) {attributeStringString.set(this, "onpopstate", newValue)}

    var onRedo : String
        get()  = attributeStringString.get(this, "onredo")
        set(newValue) {attributeStringString.set(this, "onredo", newValue)}

    var onResize : String
        get()  = attributeStringString.get(this, "onresize")
        set(newValue) {attributeStringString.set(this, "onresize", newValue)}

    var onStorage : String
        get()  = attributeStringString.get(this, "onstorage")
        set(newValue) {attributeStringString.set(this, "onstorage", newValue)}

    var onUndo : String
        get()  = attributeStringString.get(this, "onundo")
        set(newValue) {attributeStringString.set(this, "onundo", newValue)}

    var onUnLoad : String
        get()  = attributeStringString.get(this, "onunload")
        set(newValue) {attributeStringString.set(this, "onunload", newValue)}


}

open class BR(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("br", consumer, initialAttributes), CommonAttributeGroupFacade {

}

open class BUTTON(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("button", consumer, initialAttributes), HtmlInlineTag {
    var autoFocus : Boolean
        get()  = attributeBooleanTicker.get(this, "autofocus")
        set(newValue) {attributeBooleanTicker.set(this, "autofocus", newValue)}

    var disabled : Boolean
        get()  = attributeBooleanTicker.get(this, "disabled")
        set(newValue) {attributeBooleanTicker.set(this, "disabled", newValue)}

    var form : String
        get()  = attributeStringString.get(this, "form")
        set(newValue) {attributeStringString.set(this, "form", newValue)}

    var formAction : String
        get()  = attributeStringString.get(this, "formaction")
        set(newValue) {attributeStringString.set(this, "formaction", newValue)}

    var formEncType : ButtonFormEncType
        get()  = attributeButtonFormEncTypeEnumButtonFormEncTypeValues.get(this, "formenctype")
        set(newValue) {attributeButtonFormEncTypeEnumButtonFormEncTypeValues.set(this, "formenctype", newValue)}

    var formMethod : ButtonFormMethod
        get()  = attributeButtonFormMethodEnumButtonFormMethodValues.get(this, "formmethod")
        set(newValue) {attributeButtonFormMethodEnumButtonFormMethodValues.set(this, "formmethod", newValue)}

    var formNovalidate : Boolean
        get()  = attributeBooleanTicker.get(this, "formnovalidate")
        set(newValue) {attributeBooleanTicker.set(this, "formnovalidate", newValue)}

    var formTarget : String
        get()  = attributeStringString.get(this, "formtarget")
        set(newValue) {attributeStringString.set(this, "formtarget", newValue)}

    var name : String
        get()  = attributeStringString.get(this, "name")
        set(newValue) {attributeStringString.set(this, "name", newValue)}

    var value : String
        get()  = attributeStringString.get(this, "value")
        set(newValue) {attributeStringString.set(this, "value", newValue)}

    var type : ButtonType
        get()  = attributeButtonTypeEnumButtonTypeValues.get(this, "type")
        set(newValue) {attributeButtonTypeEnumButtonTypeValues.set(this, "type", newValue)}


}

