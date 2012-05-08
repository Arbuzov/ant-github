package org.apache.ant.github;

public class GitComment extends HttpTask {

	private String source="https://api.github.com/";
	
	@Override
	protected String getRequestMethod() {
		// TODO Auto-generated method stub
		return "GET";
	}

}
