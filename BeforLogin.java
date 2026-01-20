package com.kash.ui;

import java.util.Scanner;

public class BeforLogin {
	private Integer choice;
	private UserAccount useraccount;
	private Scanner scanner=new Scanner(System.in);
	
	public void showWelcomMessage()
	{
		System.out.println("Welcom to kash");
	}
	public void showMenu()
	{
		System.out.println("1.Sign up\n2.Login\n3.Exit");
	}
	public void readChoice()
	{
		System.out.println("enter your choice");
		this.choice=scanner.nextInt();
	}
	public void operations() {
		switch (this.choice) {
		case 2:
			break;
		case 3:
			System.out.println("see you agin");
			System.exit(0);
		}
	}
public void showLogin() {
	System.out.println("enter user name & PIN");
	userAccount=new UserAccount(null,scanner.next(),scanner.nextInt());
}

}
