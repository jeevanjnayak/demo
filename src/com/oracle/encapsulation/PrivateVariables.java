package com.oracle.encapsulation;

public class PrivateVariables {
	private String var1;
	private String var2;
	private String var3;
	
	public PrivateVariables(String var1, String var2, String var3) {
		super();
		this.var1 = var1;
		this.var2 = var2;
		this.var3 = var3;
	}
	
	void method() {
		System.out.println("var1 is "+var1+", var2 is "+var2+ ", var3 is "+var3+".");
		
	}
	
	public String getVar1() {
		return var1;
	}
	public void setVar1(String var1) {
		this.var1 = var1;
	}
	public String getVar2() {
		return var2;
	}
	public void setVar2(String var2) {
		this.var2 = var2;
	}
	public String getVar3() {
		return var3;
	}
	public void setVar3(String var3) {
		this.var3 = var3;
	}
	
	
}
