package com.sj.beans;

public class HelloBean {
String msg;

public String getMsg() {
	return msg;
}

public void setMsg(String msg) {
	this.msg = msg;
}

public void sayHello() {
	System.out.println("Hello"+msg);
}
}
