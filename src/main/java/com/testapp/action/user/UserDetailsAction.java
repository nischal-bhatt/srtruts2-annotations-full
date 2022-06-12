package com.testapp.action.user;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

//@ResultPath("/content/user")
@Action("/getDetails")
@Result(name="success", location="namespace.jsp")
public class UserDetailsAction {

	public String execute() {
		System.out.println("execute  method of user called");
		return "success";

	}

}
