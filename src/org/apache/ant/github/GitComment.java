package org.apache.ant.github;

public class GitComment extends HttpTask {

	private String source="https://api.github.com/";
	
	private String comment="";
	
	public void setComment(String comment) {
		this.comment = comment;
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
