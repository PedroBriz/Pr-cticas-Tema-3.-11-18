package Práctica12;

import java.util.Scanner;

public class Práctica12 {

	public static void main(String[] args) {
Integer n1, a = 0;
		
		Scanner imput = new Scanner (System.in);
		System.out.println("Dictamine un número ");
		n1=imput.nextInt();
		imput.close();
		
		if (n1!=0) {
			while (n1!=0) {
				n1 = n1/10;
				a++;
			}
			System.out.println("El número tiene " + a + " cifras");
		}
		
		else {
			System.out.println("El número tiene una cifra");
		}

	}

}
