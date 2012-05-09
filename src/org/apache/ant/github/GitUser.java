package org.apache.ant.github;

public class GitUser extends HttpTask {

	private String source="https://api.github.com/user";
	
	@Override
	protected String getRequestMethod() {
		return "GET";
	}
	
	@Override
    public String getURL() {
        return source;
    }

}
