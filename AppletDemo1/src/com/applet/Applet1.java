package com.applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet1 extends Applet
{
     Button b1,b2;
     TextField t;
     public void init()
     {
    	 add(b1=new Button("Click"));
    	 add(t=new TextField(15));
    	 add(b2=new Button("Clear"));
    	 E e = new E();
    	 e.takeRef(this);
    	 b1.addActionListener(new F(this));
     }
}

class E implements ActionListener
{
	Applet1 a;
	public void takeRef(Applet1 a)
	{
		this.a=a;
	}
	
	public void actionPerformed(ActionEvent arg0)
	{
		a.t.setText("Hii DBOSS");
	}
}

class F implements ActionListener
{
	Applet1 a;
	public F(Applet1 a)
	{
		this.a=a;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		a.t.setText("");
	}
}
