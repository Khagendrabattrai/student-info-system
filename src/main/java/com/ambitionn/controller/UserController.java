package com.ambitionn.controller;

import java.util.Scanner;

import com.ambition.domain.User;
import com.ambition.service.UserService;
import com.ambition.service.UserServiceImpl;

public class UserController {
	private UserService userService;

	public UserController() {
		userService=new UserServiceImpl();
	}

	public void saveStudentInfo(Scanner input) {

		System.out.println("Enter name:");
		String name = input.next();
		System.out.println("Enter grade:");
		int grade = input.nextInt();
		System.out.println("Enter roll-no:");
		int rollNo = input.nextInt();
		System.out.println("Enter email: ");
		String email = input.next();
		System.out.println("Enter password:");
		String password = input.next();
		System.out.println("Enter address:");
		String address = input.next();
		User user = new User();
		user.setName(name);
		user.setGrade(grade);
		user.setRollNo(rollNo);
		user.setEmail(email);
		user.setPassword(password);
		user.setAddress(address);

		userService.saveStudentInfo(user);
	}

}
