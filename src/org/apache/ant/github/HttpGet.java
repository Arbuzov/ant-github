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


/**
 * This class implements boring old HTTP1.0 get. It represents a refactoring of
 * Get to HttpTask and then into a specific subclass. because almost everything
 * is done by the parent, this class is almost completely empty
 *
 * @created March 17, 2001
 */

public class HttpGet extends HttpTask {

    /**
     * override of the default; parameters are appended to the URL for a get.
     *
     * @return true always
     */

    protected boolean areParamsAddedToUrl() {
        return true;
    }

    /**
     * this must be overridden by implementations to set the request method to
     * GET, POST, whatever.
     *
     * @return GET, obviously
     */
    public String getRequestMethod() {
        return "GET";
    }

	@Override
	protected String parseJson(String s) {
		// TODO Auto-generated method stub
		return null;
	}
}
