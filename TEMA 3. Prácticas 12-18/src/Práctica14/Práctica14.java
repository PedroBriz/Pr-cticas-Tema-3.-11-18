package Práctica14;

import java.util.Scanner;

public class Práctica14 {

	public static void main(String[] args) {
		
		int dia;
		int mes;
		int año;
		
		Scanner imput = new Scanner(System.in);
		System.out.println("Escriba el día seleccionado");
		dia=imput.nextInt();
		System.out.println("Escriba el mes seleccionado");
		mes=imput.nextInt();
		System.out.println("Escriba el año seleccionado");
		año=imput.nextInt();
		imput.close();
		
		if(mes==12) {
			if(dia==31) {
				año++;
				dia=1;
				mes=1;
			}
			else {
				dia++;
			}
			if(dia>31) {
				System.out.println("La fecha es invalida");
			}
			else {
				System.out.println("La fecha seleccionada es "+ dia+ "/" + mes +"/"+ año);
			}
		}
			
		if(mes==2) {
			if(dia==28) {
			dia=1;
			mes++;
			}
		
			else if (dia!=28) {
			dia++;
			System.out.println("La fecha seleccionada es "+ dia+ "/" + mes +"/"+ año);
		}
			if(dia>28) {
				System.out.println("La fecha es inválida");
			}
			
	}
		
		if(mes==1 ||mes==3|| mes==5||mes==7||mes==8||mes==10) {
			if(dia==31) {
			dia=1;
			mes++;	
			}
		else {
			dia++;
		}
			if (dia>31) {
				System.out.println("La fecha es inválida");
			}
			else {
				System.out.println("hola");
			}
		}
		
		if(mes==4 ||mes==6|| mes==9||mes==11) {
			if (dia==30) {
			dia=1;
			mes++;
			}
		
		else {
			dia++;
		}
			if(dia>30) {
				System.out.println("La fecha es inváida");
			}
			else {
				System.out.println("La fecha seleccionada es "+ dia+ "/" + mes +"/"+ año);
			}
		}
		
		
	}

}
