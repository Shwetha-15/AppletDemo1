package com.applet;

class Aa
{
	
}

class Ab
{
	int i;
    String name;
    static int j;
	public Ab() 
	{
		
	}
	public Ab(int i, String name) 
	{
		this.i = i;
		this.name = name;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
public class EqualsDemo 
{
    public static void main(String[] args) 
    {
		Aa a=new Aa();
		Aa a1=a;
		Aa a2=new Aa();
		
		/*if(a == a1)
            System.out.println("Equal");
		else
			System.out.println("Not Equal");*/
		
		if(a == a2)
            System.out.println("Equal");
		else
			System.out.println("Not Equal");	
	}
}
