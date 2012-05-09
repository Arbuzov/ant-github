package org.apache.ant.github;

public class GitPulls extends HttpTask {

	private String source="https://api.github.com/";
	
	private String user;
	
	private String reponame;
	
	public void setUser(String user) {
		this.user = user;
	}

	public void setReponame(String reponame) {
		this.reponame = reponame;
	}

	@Override
	protected String getRequestMethod() {
		// TODO Auto-generated method stub
		return "GET";
	}
	
	@Override
    public String getURL() {
        return source;
    }

}
