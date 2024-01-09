package Principal;

public class Cine {
	private final boolean[][] asientos;
	private static final boolean LIBRE = false;
	private static final boolean OCUPADO = true;

	public Cine(int filas, int columnas) {
		asientos = new boolean[filas][columnas];
	}

	public void mostrar_Asientos() {
		for (int i = 0; i < asientos.length; i++) {
			for (int j = 0; j < asientos[i].length; j++) {
				System.out.print(asientos[i][j] == OCUPADO ? "O " : "L ");
			}
			System.out.println();
		}
	}

	public boolean reservar_Asiento(int fila, int columna) {
		if (fila >= 1 && fila <= asientos.length && columna >= 1 && columna <= asientos[0].length) {
			if (asientos[fila - 1][columna - 1] == LIBRE) {
				asientos[fila - 1][columna - 1] = OCUPADO;
				return true;
			} else {
				System.out.println("Lo lamento, el asiento ya está ocupado.");
			}
		} else {
			System.out.println("Entrada inválida. Por favor, introduce una fila y una columna válida.");
		}
		return false;
	}

}
