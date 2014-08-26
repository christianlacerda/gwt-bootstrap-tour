package com.github.gwtbootstraptour.client;

/*
 * #%L
 * GwtBootstrapTour
 * %%
 * Copyright (C) 2013 - 2014 Tap2Ask
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
import com.github.gwtbootstraptour.client.functions.Function;

/**
 * Created by christian on 19/08/14.
 */
public class Step extends JavaScriptObject {

    protected Step() {
    }

    public static native Step create()/*-{
        return {};
    }-*/;


    public final native void setPath(String path)/*-{
        this.path = path;
    }-*/;

    public final native String getPath()/*-{
        return this.path;
    }-*/;

    public final void setElement(Element element) {
        setElement(element.cast());
    }

    private final native void setElement(JavaScriptObject element)/*-{
        this.element = element;
    }-*/;

    public final Element getElement(){
        return getElementJso().cast();
    }

    private final native JavaScriptObject getElementJso()/*-{
        return this.element;
    }-*/;

    public final void setPlacement(Placement placement) {
        setPlacement(placement.getValue());
    }

    private final native void setPlacement(String placement)/*-{
        this.placement = placement;
    }-*/;

    public final Placement getPlacement(){
        return Placement.valueOf(getPlacementJso());
    }

    private final native String getPlacementJso()/*-{
        return this.placement;
    }-*/;

    public final native void setTitle(String title)/*-{
        this.title = title;
    }-*/;

    public final native String getTitle()/*-{
        return this.title;
    }-*/;

    public final native void setContent(String content)/*-{
        this.content = content;
    }-*/;

    public final native String getContent()/*-{
        return this.content;
    }-*/;

    public final native void setNext(int next)/*-{
        this.next = next;
    }-*/;

    public final native int getNext()/*-{
        return this.next;
    }-*/;

    public final native void setPrev(int prev)/*-{
        this.prev = prev;
    }-*/;

    public final native int getPrev()/*-{
        return this.prev;
    }-*/;

    public final native void setAnimation(boolean animation)/*-{
        this.animation = animation;
    }-*/;

    public final native boolean getAnimation()/*-{
        return this.animation;
    }-*/;

    public final void setContainer(Element container) {
       setContainer(container.cast());
    }

    private final native void setContainer(JavaScriptObject container)/*-{
        this.container = container;
    }-*/;

    public final Element getContainer() {
        return getContainerJso().cast();
    }

    private final native JavaScriptObject getContainerJso()/*-{
        return this.container;
    }-*/;

    public final native void setBackdrop(boolean backdrop)/*-{
        this.backdrop = backdrop;
    }-*/;

    public final native boolean getBakcdrop()/*-{
        return this.backdrop;
    }-*/;

    public final native void setRedirect(boolean redirect)/*-{
        this.redirect = redirect;
    }-*/;

    public final native boolean getRedirect()/*-{
        return this.redirect;
    }-*/;

    public final native void setReflex(boolean reflex)/*-{
        this.reflex = reflex;
    }-*/;

    public final native boolean getReflex()/*-{
        return this.reflex;
    }-*/;

    public final native void setOrphan(boolean orphan)/*-{
        this.orphan = orphan;
    }-*/;

    public final native boolean getOrphan()/*-{
        return this.orphan;
    }-*/;

    public final native void setTemplate(String template)/*-{
        this.template = template;
    }-*/;

    public final native String getTemplate()/*-{
        return this.template;
    }-*/;

    public final native void onShow(Function callback)/*-{
        this.onShow = $entry(function(tour) {
            callback.@com.github.gwtbootstraptour.client.functions.Function::execute(Lcom/tap2ask/web/gwt/bootstraptour/client/Tour;)(tour);
        });
    }-*/;

    public final native void onShown(Function callback)/*-{
        this.onShown = $entry(function(tour) {
            callback.@com.github.gwtbootstraptour.client.functions.Function::execute(Lcom/tap2ask/web/gwt/bootstraptour/client/Tour;)(tour);
        });
    }-*/;

    public final native void onHide(Function callback)/*-{
        this.onHide = $entry(function(tour) {
            callback.@com.github.gwtbootstraptour.client.functions.Function::execute(Lcom/tap2ask/web/gwt/bootstraptour/client/Tour;)(tour);
        });
    }-*/;

    public final native void onHidden(Function callback)/*-{
        this.onHidden = $entry(function(tour) {
            callback.@com.github.gwtbootstraptour.client.functions.Function::execute(Lcom/tap2ask/web/gwt/bootstraptour/client/Tour;)(tour);
        });
    }-*/;

    public final native void onNext(Function callback)/*-{
        this.onNext = $entry(function(tour) {
            callback.@com.github.gwtbootstraptour.client.functions.Function::execute(Lcom/tap2ask/web/gwt/bootstraptour/client/Tour;)(tour);
        });
    }-*/;

    public final native void onPrev(Function callback)/*-{
        this.onPrev = $entry(function(tour) {
            callback.@com.github.gwtbootstraptour.client.functions.Function::execute(Lcom/tap2ask/web/gwt/bootstraptour/client/Tour;)(tour);
        });
    }-*/;

    public final native void onPause(com.github.gwtbootstraptour.client.functions.duration.Function callback)/*-{
        this.onPause = $entry(function(tour, duration) {
            callback.@com.github.gwtbootstraptour.client.functions.duration.Function::execute(Lcom/tap2ask/web/gwt/bootstraptour/client/Tour;I)(tour, duration);
        });
    }-*/;

    public final native void onResume(com.github.gwtbootstraptour.client.functions.duration.Function callback)/*-{
        this.onResume = $entry(function(tour, duration) {
            callback.@com.github.gwtbootstraptour.client.functions.duration.Function::execute(Lcom/tap2ask/web/gwt/bootstraptour/client/Tour;I)(tour, duration);
        });
    }-*/;
}
