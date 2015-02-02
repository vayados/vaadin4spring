/*
 * Copyright 2015 The original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.vaadin.spring.touchkit.annotation;

import org.vaadin.spring.annotation.VaadinComponent;
import org.vaadin.spring.annotation.VaadinUIScope;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * The TouchKit counterpart to {@link org.vaadin.spring.annotation.VaadinUI}. Use it like this:
 * <pre>
 *     &#64;VaadinUI
 *     public class MyRootTouchKitUI extends UI {
 *         // ...
 *     }
 *     </pre>
 * Or like this, if you want to map your UI to another URL (for example if you are having multiple UI subclasses in your application):
 * <pre>
 *     &#64;VaadinUI(path = "/myPath")
 *     public class MyTouchKitUI extends UI {
 *         // ...
 *     }
 *     </pre>
 * The annotated UI will automatically be placed in the {@link org.vaadin.spring.annotation.VaadinUIScope}, so there is no need to add that annotation explicitly.
 *
 * @author Petter Holmström (petter@vaadin.com)
 * @see org.vaadin.spring.annotation.VaadinUI
 */
@Target({java.lang.annotation.ElementType.TYPE})
@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@Documented
@VaadinComponent
@VaadinUIScope
public @interface TouchKitUI {

    /**
     * The path to which the UI will be bound. For example, a value of {@code "/myUI"} would be mapped to
     * {@code "/myContextPath/myTouchKitServletPath/myUI"}. An empty string (the default) will map the UI to the root of the servlet.
     * Within a web application, there must not be multiple UI sub classes with the same path.
     */
    String path() default "";

}
