package com.testapp.action.product;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

//@ResultPath("/content/product")
//here no need namespace because of folder structure
@Action("/getDetails")
// note that location got no / in front
@Result(name="success", location="namespace.jsp")
public class ProductDetailsAction {

	public String execute() {
		System.out.println("execute of product called");
		return "success";

	}

}
