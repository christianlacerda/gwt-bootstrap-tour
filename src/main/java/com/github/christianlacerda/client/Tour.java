package com.github.christianlacerda.client;

/*
 * #%L
 * GwtBootstrapTour
 * %%
 * Copyright (C) 2013 - 2014 Christian Lacerda
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

/**
 * Created by christian on 19/08/14.
 */
public class Tour extends JavaScriptObject {


    protected Tour() {
    }

    public static native Tour create()/*-{
        return new $wnd.Tour();
    }-*/;

    public static native Tour create(String nextLabel, String prevLabel, String endTourLabel, String pauseLabel, String resumeLabel)/*-{
        return new $wnd.Tour({
                template : "<div class='popover'> <div class='arrow'></div> <h3 class='popover-title'></h3> <div class='popover-content'></div> <div class='popover-navigation'> <div class='btn-group'> <button class='btn btn-sm btn-default' data-role='prev'>&laquo; " + prevLabel + "</button> <button class='btn btn-sm btn-default' data-role='next'>" + nextLabel + " &raquo;</button> <button class='btn btn-sm btn-default' data-role='pause-resume' data-pause-text='" + pauseLabel + "' data-resume-text='" + resumeLabel + "'>" + pauseLabel + "</button> </div> <button class='btn btn-sm btn-default' data-role='end'>" + endTourLabel + "</button> </div> </div>"
            }
        );
    }-*/;

    public final native void addStep(Step step) /*-{
        this.addStep(step);
    }-*/;

    public final native void addSteps(Step...steps) /*-{
        this.addSteps(steps);
    }-*/;

    public final native void init() /*-{
        this.init();
    }-*/;

    public final native void start() /*-{
        this.start();
    }-*/;

    public final native void start(boolean force) /*-{
        this.start(force);
    }-*/;

    public final native void restart() /*-{
        this.restart();
    }-*/;

    public final native void end() /*-{
        this.end();
    }-*/;

    public final native void next() /*-{
        this.next();
    }-*/;

    public final native void prev() /*-{
        this.prev();
    }-*/;

    public final native void gotTo(int i) /*-{
        this.goTo(i);
    }-*/;

    public final native void pause() /*-{
        this.pause();
    }-*/;

    public final native void resume() /*-{
        this.resume();
    }-*/;

    public final native boolean ended() /*-{
        return this.ended();
    }-*/;

    public final native Step getStep(int i) /*-{
        return this.getStep(i);
    }-*/;

    public final native int getCurrentStep() /*-{
        return this.getCurrentStep();
    }-*/;

    public final native int setCurrentStep(int i) /*-{
        this.setCurrentStep(i);
    }-*/;

    public final native void setName(String name)/*-{
        this._options.name = name;
    }-*/;

    public final native String getName()/*-{
        return this._options.name;
    }-*/;

    public final void setContainer(Element container) {
        setContainer(container.cast());
    }

    private final native void setContainer(JavaScriptObject container)/*-{
        this._options.container = container;
    }-*/;

    public final Element getContainer(){
        return getContainerJso().cast();
    }

    private final native JavaScriptObject getContainerJso()/*-{
        return this._options.container;
    }-*/;

    public final native void setKeyboard(boolean keyboard)/*-{
        this._options.keyboard = keyboard;
    }-*/;

    public final native boolean getKeyboard()/*-{
        return this._options.keyboard;
    }-*/;

    public final native void setDebug(boolean debug)/*-{
        this._options.debug = debug;
    }-*/;

    public final native boolean getDebug()/*-{
        return this._options.debug;
    }-*/;

    public final native void setBackdrop(boolean backdrop)/*-{
        this._options.backdrop = backdrop;
    }-*/;

    public final native boolean getBakcdrop()/*-{
        return this._options.backdrop;
    }-*/;

    public final native void setRedirect(boolean redirect)/*-{
        this._options.redirect = redirect;
    }-*/;

    public final native boolean getRedirect()/*-{
        return this._options.redirect;
    }-*/;

    public final native void setOrphan(boolean orphan)/*-{
        this._options.orphan = orphan;
    }-*/;

    public final native boolean getOrphan()/*-{
        return this._options.orphan;
    }-*/;

    public final native void setDuration(boolean duration)/*-{
        this._options.duration = duration;
    }-*/;

    public final native boolean getDuration()/*-{
        return this._options.duration;
    }-*/;

    public final native void setBasePath(String basePath)/*-{
        this._options.basePath = basePath;
    }-*/;

    public final native String getBasePath()/*-{
        return this._options.basePath;
    }-*/;

    public final native void setTemplate(String template)/*-{
        this._options.template = template;
    }-*/;

    public final native String getTemplate()/*-{
        return this._options.template;
    }-*/;

    public final native void afterGetState(com.github.christianlacerda.client.functions.map.Function callback)/*-{
        this._options.afterGetState = $entry(function (key, value) {
            callback.@com.github.christianlacerda.client.functions.map.Function::execute(Ljava/lang/String;Ljava/lang/String;)(key, value);
        });
    }-*/;

    public final native void afterSetState(com.github.christianlacerda.client.functions.map.Function callback)/*-{
        this._options.afterSetState = $entry(function (key, value) {
            callback.@com.github.christianlacerda.client.functions.map.Function::execute(Ljava/lang/String;Ljava/lang/String;)(key, value);
        });
    }-*/;

    public final native void afterRemoveState(com.github.christianlacerda.client.functions.map.Function callback)/*-{
        this._options.afterRemoveState = $entry(function (key, value) {
            callback.@com.github.christianlacerda.client.functions.map.Function::execute(Ljava/lang/String;Ljava/lang/String;)(key, value);
        });
    }-*/;

    public final native void onStart(com.github.christianlacerda.client.functions.Function callback)/*-{
        this._options.onStart = $entry(function (tour) {
            callback.@com.github.christianlacerda.client.functions.Function::execute(Lcom/github/christianlacerda/client/Tour;)(tour);
        });
    }-*/;

    public final native void onEnd(com.github.christianlacerda.client.functions.Function callback)/*-{
        this._options.onEnd = $entry(function (tour) {
            callback.@com.github.christianlacerda.client.functions.Function::execute(Lcom/github/christianlacerda/client/Tour;)(tour);
        });
    }-*/;

    public final native void onShow(com.github.christianlacerda.client.functions.Function callback)/*-{
        this._options.onShow = $entry(function (tour) {
            callback.@com.github.christianlacerda.client.functions.Function::execute(Lcom/github/christianlacerda/client/Tour;)(tour);
        });
    }-*/;

    public final native void onShown(com.github.christianlacerda.client.functions.Function callback)/*-{
        this._options.onShown = $entry(function (tour) {
            callback.@com.github.christianlacerda.client.functions.Function::execute(Lcom/github/christianlacerda/client/Tour;)(tour);
        });
    }-*/;

    public final native void onHide(com.github.christianlacerda.client.functions.Function callback)/*-{
        this._options.onHide = $entry(function (tour) {
            callback.@com.github.christianlacerda.client.functions.Function::execute(Lcom/github/christianlacerda/client/Tour;)(tour);
        });
    }-*/;

    public final native void onHidden(com.github.christianlacerda.client.functions.Function callback)/*-{
        this._options.onHidden = $entry(function (tour) {
            callback.@com.github.christianlacerda.client.functions.Function::execute(Lcom/github/christianlacerda/client/Tour;)(tour);
        });
    }-*/;

    public final native void onNext(com.github.christianlacerda.client.functions.Function callback)/*-{
        this._options.onNext = $entry(function (tour) {
            callback.@com.github.christianlacerda.client.functions.Function::execute(Lcom/github/christianlacerda/client/Tour;)(tour);
        });
    }-*/;


    public final native void onPrev(com.github.christianlacerda.client.functions.Function callback)/*-{
        this._options.onPrev = $entry(function (tour) {
            callback.@com.github.christianlacerda.client.functions.Function::execute(Lcom/github/christianlacerda/client/Tour;)(tour);
        });
    }-*/;

    public final native void onPause(com.github.christianlacerda.client.functions.duration.Function callback)/*-{
        this._options.onPause = $entry(function (tour, duration) {
            callback.@com.github.christianlacerda.client.functions.duration.Function::execute(Lcom/github/christianlacerda/client/Tour;I)(tour, duration)
        });
    }-*/;

    public final native void onResume(com.github.christianlacerda.client.functions.duration.Function callback)/*-{
        this._options.onResume = $entry(function (tour, duration) {
            callback.@com.github.christianlacerda.client.functions.duration.Function::execute(Lcom/github/christianlacerda/client/Tour;I)(tour, duration);
        });
    }-*/;
}
