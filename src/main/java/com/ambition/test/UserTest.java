package com.ambition.test;

import java.util.Scanner;

import com.ambitionn.controller.UserController;

public class UserTest {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Enter db operation:");
		String option=input.next();
		UserController controller=new  UserController();
		
		 switch(option){
			case "save":
			controller.saveStudentInfo(input);
				break;
		}

	}

}
