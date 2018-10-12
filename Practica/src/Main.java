//Main.java
public class Main{
	public static void main(String[] args){
		Estudiante[] estudiantes = {
			new Estudiante("Juan", 24),
			new Estudiante("Erica", 20),
			new Estudiante("Emilio", 23),
			new Estudiante("Karina", 21),
			new Estudiante("Eduardo", 24),
			new Estudiante("Tomas", 25),
		};
		//Total de estudiantes
		System.out.println("Total de estudiantes: " + estudiantes.length);
		//Edad Mínima
		System.out.println("La Edad Mínima de los Estudiantes es: " + EdadMinima(estudiantes));
		//Edad Máxima
		System.out.println("La Edad Máxima de los Estudiantes es: " + EdadMaxima(estudiantes));
		//Edad Promedio
		System.out.println("La Edad Promedio de los Estudiantes es: " + EdadProm(estudiantes));
		impEstud(estudiantes);
		
	}
	
	public static int EdadMaxima(Estudiante[] arr) {
		int edadMax = 0;
		for (Estudiante i: arr) {
			if (i.getEdad() > edadMax) edadMax = i.getEdad();
		}
		
		return edadMax;
	}
	
	public static int EdadMinima(Estudiante[] arr) {
		int edadMin = arr[0].getEdad();
		for (Estudiante i: arr) {
			if (i.getEdad() < edadMin) edadMin = i.getEdad();
		}
		
		return edadMin;
	}
	
	public static int EdadProm(Estudiante[] arr) {
		int edadProm = 0;
		for (Estudiante i: arr) {
			edadProm += i.getEdad();
		}
		edadProm = Math.round(edadProm/ arr.length);
		return edadProm;
	}
	
	public static void impEstud(Estudiante[] arr) {
		int n = 0;
		for (Estudiante i: arr) {
			n += 1;
			System.out.println(n + "- " + i.getNombre());
		}
	}
}