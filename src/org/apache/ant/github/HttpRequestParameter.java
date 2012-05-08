/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package org.apache.ant.github;

import org.apache.tools.ant.ProjectComponent;

import java.net.URLEncoder;

/**
 * This class is used to store name-value pairs for request parameters and
 * headers.
 *
 * @created March 17, 2001
 */

public class HttpRequestParameter extends ProjectComponent {

    /**
     * request name.
     */
    private String name;

    /**
     * request value.
     */
    private String value;


    /**
     * Sets the Name of the request.
     *
     * @param name The new Name value
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * What is the request name?
     *
     * @return The Name value
     */
    public String getName() {
        return name;
    }


    /**
     * Sets the Value of the request.
     *
     * @param value The new Value value
     */
    public void setValue(String value) {
        this.value = value;
    }



    /**
     * What is the request value?
     *
     * @return The Value
     */
    public String getValue() {
        return value;
    }


    /**
     * set the inline text, with property expansion.
     *
     * @param text Text to add to the request.
     */
    public void addText(String text) {
        this.value = getProject().replaceProperties(text);
    }


    /**
     * simple stringifier returning name and value encoded for use in HTTP
     * requests Although deprecated, the new version only came with Java1.4.
     *
     * @return a string for informational purposes
     */
    @SuppressWarnings("deprecation")
	public String toString() {
        return URLEncoder.encode(getName()) +
                '=' + URLEncoder.encode(getValue());
    }

}

