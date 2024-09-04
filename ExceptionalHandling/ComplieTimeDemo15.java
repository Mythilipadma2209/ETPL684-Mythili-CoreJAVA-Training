package com.evergent.CoreJAVA.ExceptionalHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ComplieTimeDemo15 {
	public static void main(String[] args) {
		try {
			File file = new File("c:/mydata/myinfo.txt");
			Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
