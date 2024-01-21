package unidad2;

import java.util.Scanner;

public class B4ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		float alturaMedia=0;
		float alturaMaxima=-1;
		float alturaMinima=999;
		float diametroMaximo=-1;
		float diametroMinimo=999;
		float mediaEdad=0;
		boolean mas30cm=false;
		float totalArbol=0;
		float alturaArbol;
		float diametroArbol;
		int edadTotal=0;
		int edadArbol=0;
		System.out.println("Introduce un número de arboles");
		int numeroArboles=sc.nextInt();
		
		for (int i=0;i<numeroArboles;i++) {
			
			System.out.println("Introduce el tipo de arbol, A o B");
			char letraArbol=sc.next().charAt(0);
			
			if(letraArbol=='A'||letraArbol=='a') {
				System.out.println("Introduce el diametro del árbol");
				diametroArbol=sc.nextFloat();
				System.out.println("Introduce la altura del árbol");
				alturaArbol=sc.nextFloat();
			} else {
				System.out.println("Introduce el diametro del árbol");
				diametroArbol=sc.nextFloat();
				System.out.println("Introduce la altura del árbol");
				alturaArbol=sc.nextFloat();
				System.out.println("Introduce la edad del árbol");
				edadArbol=sc.nextInt();
				}
			totalArbol= alturaArbol + totalArbol;
			
			if (alturaArbol>alturaMaxima) {
				alturaMaxima=alturaArbol;
			}
			
			if(alturaArbol<alturaMinima){
				alturaMinima=alturaArbol;
			}
			
			if (diametroArbol>diametroMaximo) {
				diametroMaximo=diametroArbol;
			}	
			
			if(diametroArbol<diametroMinimo){
				diametroMinimo=diametroArbol;
			}
			
			edadTotal=edadTotal+edadArbol;
			
			if (alturaArbol>30) {
				mas30cm=true;
			}
			
			
		}
		alturaMedia=totalArbol/numeroArboles;
		System.out.println("La altura media de los árboles es: "+alturaMedia);
		System.out.println("La altura máxima de los árboles es: "+alturaMaxima);
		System.out.println("La altura mínima de los árboles es: "+alturaMinima);
		System.out.println("El diametro máximo es: "+diametroMaximo);
		System.out.println("El diametro mínimo es :"+diametroMinimo);
		mediaEdad=edadTotal/numeroArboles;
		System.out.println("La media de edad de los arboles tipo B es: "+mediaEdad);
		
		if (mas30cm) {
			System.out.println("Exísten árboles de más de 30 m");
		}
		
		sc.close();

	}

}
