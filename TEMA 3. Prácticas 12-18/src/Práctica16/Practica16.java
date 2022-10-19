package Práctica16;
import java.util.Scanner;
public class Practica16 {

	public static void main(String[] args) {
		

				Scanner input = new Scanner(System.in);
				
				int contador=0;
				int capacidad=9999;
				
				int[] Numeros = new int[capacidad];
				
				for(int i=0;i<Numeros.length;i++) {
			
					System.out.println((i+1)+" Digite el caracter");
					int a;
					a = input.nextInt(); //5
					// if (a==0)
			        Numeros[i] =a; //5
					int aux = Numeros[i];  // aux =5
				  if(aux==i) {
					System.out.println("Hola");
					
				}
				
				}
				
				
				System.out.println("Programa finalizado"); 

	}

}
