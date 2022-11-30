package com.codingdojo.project.practice;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningApplication.class, args);
		
		int num;
		Scanner se = new Scanner(System.in);
		System.out.println("Enter number: ");
		num = se.nextInt();
		System.out.println("The number is " + num);
	}

}
