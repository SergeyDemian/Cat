package main.java;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import maIHelloWorldL;

@ManagedBean(name="helloWorld", eager = true)
public class HelloWorld implements Serializable {
	
	@EJB
	private IHelloWorldL hello;
	
	private static final long serialVersionUID = 1L;
	
	public String str = "hello.outString()";

	public HelloWorld() {
		System.out.println("Привет");
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
}
