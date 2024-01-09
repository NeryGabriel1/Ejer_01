package Principal;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Cine cine = new Cine(10, 10);
		Scanner scanner = new Scanner(System.in);
		boolean reservarAsientos = true;
		cine.mostrar_Asientos();

		while (reservarAsientos) {
			System.out.println("\nIntroduce la fila y la columna del asiento que quieres reservar:");
			int fila = scanner.nextInt();
			int columna = scanner.nextInt();
			if (cine.reservar_Asiento(fila, columna)) {
				cine.mostrar_Asientos();
				System.out.println("Deseas reservar más asientos (sí or no): ");
				String opcion = scanner.next();
				reservarAsientos = opcion.equalsIgnoreCase("sí");
			}
			;
		}
		System.out.println("¡Que difrutes de la pelicula!");
		scanner.close();

	}

}


