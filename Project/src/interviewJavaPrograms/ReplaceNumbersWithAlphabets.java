package interviewJavaPrograms;

import java.util.*;

import java.util.Arrays;

public class ReplaceNumbersWithAlphabets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int size = sc.nextInt();

		String[] number = new String[size];
		//int []num= {1,2,3,4,5};
		String[] alphabets = { "A", "B", "C", "D", "E" };
		//char[]alpha= {'A','B','C','D','E'};
//		for(int i=0;i<num.length;i++)
//		{
//			num[i]=alpha[4];
//		}
//		for(int n:num)
//		{
//			System.out.println(n);
//		}

		System.out.println("Enter the elements");
		for (int i = 0; i < size; i++) {
			number[i] = sc.next();
		}

		for (int i = 0; i < size; i++) {
			int index = Integer.parseInt(number[i]);
			if (index >= 0 && index < alphabets.length) {
				number[i] = alphabets[index-1];

			}

		}
		System.out.println("Modified Array");
		for (int i = 0; i < size; i++) {
			System.out.println(number[i] + " ");
		}
	}
}
