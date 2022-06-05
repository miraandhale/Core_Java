package com.mira;

class M
{
	private int a=10;
}
class N extends M
{
	 int b=30;
}
class O extends N
{
	private int c=40;
}
public class TesttightlyEncapsualtion {

	public static void main(String[] args) {
		O obj=new O();
		//System.out.println(obj.a);
	}
}
