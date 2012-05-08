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

import java.net.URLConnection;


/**
 * this class implements basic Authentication, the one that shouldn't be used except over
 * an encrypted link or trusted network.
 *
 * @created 20 March 2001
 */

public class HttpBasicAuth implements HttpAuthenticationStrategy {
    /**
     * string used for basic Authentication {@value}.
     */
    public static final String BASIC_AUTH = "BASIC ";


    /**
     * Sets the AuthenticationHeader attribute of the HttpAuthStrategy object
     *
     * @param requestConnection  The current request
     * @param responseConnection any previous request, which can contain a
     *                           challenge for the next round. Will often be
     *                           null
     * @param username           the current user name
     * @param password           the current password
     */
    public void setAuthenticationHeader(URLConnection requestConnection,
                                        URLConnection responseConnection,
                                        String username, String password) {

        if (username != null) {
            password = username == null ? "" : password;
            String encodeStr = username + ":" + password;
            char[] encodedPass;
            String encodedPassStr;

            Base64Encode encoder = new Base64Encode();
            encodedPass = encoder.encodeBase64(encodeStr.getBytes());
            encodedPassStr = new String(encodedPass);
            String authStr = BASIC_AUTH + encodedPassStr;
            requestConnection.setRequestProperty(AUTH_PROPERTY, authStr);
        }
    }
}

