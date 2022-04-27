package com.applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet2 extends Applet
{
	Button b1,b2;
    TextField t;
    public void init()
    {
   	 add(b1=new Button("Click"));
   	 add(t=new TextField(15));
   	 add(b2=new Button("Clear"));
   	 B b = new B();
   	 b.takeRef(this);
   	 b1.addActionListener(new C(this));
   	 C c = new C(this);
   	 b2.addActionListener(new C(this));
    }
}

class B implements ActionListener
{
	Applet2 a;
	public void takeRef(Applet2 a)
	{
		this.a=a;
	}
	
	public void actionPerformed(ActionEvent arg0)
	{
//		Applet2 a = new Applet2();
		a.t.setText("Hii DBOSS");
	}
}

class C implements ActionListener
{
	Applet2 a;
	public C(Applet2 a)
	{
		this.a=a;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		a.t.setText("Hello DBOSS");
	}
}