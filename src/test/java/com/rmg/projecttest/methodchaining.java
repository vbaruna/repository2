package com.rmg.projecttest;

public class methodchaining {
	
	methodchaining a() {System.out.println("a");  return this;}
	methodchaining b() {System.out.println("b");  return this;}
	methodchaining c() {System.out.println("c");  return this;}


	public static void main(String[] args) {
		
		new methodchaining().a().b().c().a().c().b();
		
		new Manage().manage().window().maximize();
	}
}

class Manage{
	Window manage()
	{
		return new Window();
		
	}
}
class Window{
	Window window() {
		return this;
	}
	void maximize() {
		System.out.println("screen maximized");
	}
}

