package com.github.gwtbootstraptour.client.bundle;

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

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

/**
 * Created by christian on 19/08/14.
 */
public interface Resources extends ClientBundle {

    static final Resources INSTANCE = GWT.create(Resources.class);

    @Source("jquery-1.11.1.min.js")
    TextResource jQuery();

    @Source("bootstrap-tour-standalone.min.js")
    TextResource bootstrapTour();
}
