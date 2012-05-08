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

import org.apache.tools.ant.BuildException;

import java.net.URLConnection;

/**
 * this interface is for use by classes which authenticate connections.
 *
 * @created 20 March 2001
 */

public interface HttpAuthenticationStrategy {
    /**
     * property used in the request. {@value}
     */
    String AUTH_PROPERTY = "Authorization";


    /**
     * Sets the AuthenticationHeader.
     *
     * @param requestConnection  The current request
     * @param responseConnection any previous request, which can contain a
     *                           challenge for the next round. Will often be
     *                           null
     * @param user               the current user name
     * @param password           the current password
     */
    public void setAuthenticationHeader(URLConnection requestConnection,
                                        URLConnection responseConnection,
                                        String user, String password)
            throws BuildException;


}

