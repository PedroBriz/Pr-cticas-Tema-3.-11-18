package Práctica13;

import java.util.Scanner;

public class Práctica13 {

	public static void main(String[] args) {
		int i = 0, aux;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Responda a las siguientes cuestiones con 1 si es afirmativo o 0 si es negativo");
		System.out.println("¿Ha comprado lotería?");
		aux = entrada.nextInt();

		if (aux == 1) {
			i++;
			System.out.println("¿Ha comprado más de un décimo?");
			aux = entrada.nextInt();
			if (aux == 1) {
				i += 2;
				System.out.println("¿Ha comprado en más de una administración?");
				aux = entrada.nextInt();
				if (aux == 1) {
					i += 2;
					System.out.println("¿En alguna de esas administraciones ha tocado algun premio?");
					aux = entrada.nextInt();
					if (aux == 1) {
						i += 2;
						System.out.println("¿Compro loteria el año pasado?");
						aux = entrada.nextInt();
						if (aux == 1) {
							i += 2;
						}
					} else {
						System.out.println("¿Compro loteria el año pasado?");
						aux = entrada.nextInt();
					}
				} else {
					System.out.println("¿En alguna de esas administraciones ha tocado algun premio?");
					aux = entrada.nextInt();
					if (aux == 1) {
						i += 2;
						System.out.println("¿Compro loteria el año pasado?");
						aux = entrada.nextInt();
					} else {
						System.out.println("¿Compro loteria el año pasado?");
						aux = entrada.nextInt();
						if (aux == 1) {
							i += 2;
						} else {
							i++;
						}
					}
				}
			} else {
				System.out.println("¿Ha tocado algún premio en esa administración?");
				aux = entrada.nextInt();
				if (aux == 1) {
					i++;
					System.out.println("¿Compro lotería el año pasado?");
					aux = entrada.nextInt();
					if (aux == 1) {
						i++;
					}
				} else {
					System.out.println("¿Compro lotería el año pasado?");
					aux = entrada.nextInt();
					if (aux == 1) {
						i++;
					}
				}
			}
		} else {
			System.out.println("No hay posibilidades de ganar la loteria si no se compra.");
		}
		
		entrada.close();
		System.out.println("Los puntos obtenidos son " + i);
		if (i>5) {
			System.out.println("Las probabilidades de ganar la lotería son altas");
		}
		if (i<4) {
			System.out.println("Las probabilidades de ganar la lotería son bajas");
		}
		if(i>3 && i<6) {
			System.out.println("Las probabilidades de ganar la lotería son medias");
		}
	}

}


