import java.io.*;
import java.util.Scanner;

class Reverse {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		System.out.print("Masukkan Tulisan : ");
                String str= sc.nextLine(), nstr="";
		char ch;
		
	System.out.print("Original word: ");
	System.out.println(str); //Example word
		
	for (int i=0; i<str.length(); i++)
	{
		ch= str.charAt(i); //extracts each character
		nstr= ch+nstr; //adds each character in front of the existing string
	}
	System.out.println("Reversed word: "+ nstr);
	}
}


