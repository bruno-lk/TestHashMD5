package com.test.hash;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String user,pass,conc,md5;
		Scanner scan;
		
		scan = new Scanner (System.in);
		System.out.print("Usuario: ");
		user = scan.nextLine();
		
		System.out.print("Senha: ");
		pass = scan.nextLine();
		scan.close();
		
		conc=user.concat(pass);
		System.out.println("Concatenaçao das strings: "+conc);
		md5=Hash.hash(conc);
		System.out.println("MD5: "+md5);
		
	}
}
