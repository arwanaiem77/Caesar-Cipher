package TestEncy;

import java.util.Scanner;

public class ShiftCipher {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("enter the plainText :");
		String p=input.next();
		System.out.println("enter the key");
		int key=input.nextInt();
		int arr[]=new int[p.length()];
		for(int i=0;i<p.length();i++) {
			arr[i]=p.charAt(i)-97;
		}
		for(int i=0;i<arr.length;i++) {
			arr[i]=(arr[i]+key)%26;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print((char)(arr[i]+97));
		}
		
		System.out.println();
		

		for(int i=0;i<arr.length;i++) {
			arr[i]=(arr[i]-key+26)%26;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print((char)(arr[i]+97));
		}

	}

}
