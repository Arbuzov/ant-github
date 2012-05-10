package org.apache.ant.github;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GitPulls extends HttpTask {

	private String source="https://api.github.com/repos/";
	
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
        return source+user+"/"+reponame+"/pulls";
    }
	
	public String parseJson(String json) {
        try {
        	JSONArray jsob = new JSONArray(json.toString());
        	System.out.println(((JSONObject)jsob.get(0)).get("patch_url"));
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        //System.out.println(out.toString().replace("}", "}\n").replace("]", "]\n\n").replace(",\"", "\n,\""));
		return "";
	}

}
