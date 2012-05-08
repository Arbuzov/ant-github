package org.apache.ant.github;

public class GitUser extends HttpTask {

	private String source="https://api.github.com/user";
	@Override
	protected String getRequestMethod() {
		// TODO Auto-generated method stub
		return "GET";
	}

}
