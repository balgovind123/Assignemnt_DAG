package aasigment2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CountSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Scanner s = new Scanner(System.in);
			System.out.println("enter file location");
			File f = new File(s.nextLine());
			BufferedReader b = new BufferedReader(new FileReader(f));
			String readLine = "";
			

			System.out.println("Input the word that has to be searched");
			String word = s.nextLine();
			String str = "";
			int occurance = 0;
			boolean flag = false;
			java.util.List<Integer> res = new ArrayList<>();
			int countline = -1;
			while ((readLine = b.readLine()) != null) {
				countline++;
				String[] arr = readLine.split(" ");
				for (int i = 0; i < arr.length; i++) {
					for (char c : arr[i].toCharArray()) {
						str += c;
						if (str.length() == word.length()) {
							if (str.equals(word)) {
								occurance++;
								flag = true;
								res.add(countline);
							}
							str = str.substring(1);
						}
					}
				}

			}
			if (flag) {
				System.out.println(res);
			}

			if (occurance > 0)
				System.out.println("the string is present and the count of the given string is : " + occurance);
			else
				System.out.println("The string is not present");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
