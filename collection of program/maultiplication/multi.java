package maultiplication;
import java.util.Scanner;


public class multi {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int num;
		System.out.println("Enter the n");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(int i=1;i<=20;i++) {
			
			 System.out.printf("%d * %d = %d \n", num, i, num * i);
			
		}

	}

}
