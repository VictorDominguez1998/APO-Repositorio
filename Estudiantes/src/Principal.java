import java.util.Scanner;

public class Principal {
	public static void main(String args[]){
		
		
		String nombre;
		long cedula;	
		double calificacion;
		
		Scanner dig = new Scanner(System.in);
		
		Alumnos a[] = new Alumnos[10];

		 
		for(int i=0;i<a.length; i++) {
		
			System.out.println("Ingresa porfavor tu nombre: ");
			nombre = dig.next();

			System.out.println("");
			
			System.out.println("Ingresa porfavor tu cedula: ");
			cedula = dig.nextLong();
			
			System.out.println("");
			
			System.out.println("Ingresa porfavor tu calificación: ");
			calificacion = dig.nextDouble();
			
		
			a[i] = new Alumnos(nombre, cedula, calificacion);
		}
		
		for(Alumnos estudiante:a) {
			System.out.println("Estudiante " + estudiante.getNombre() + " identificado con el numero " + estudiante.getCedula() + " obtuvo una nota de: " + estudiante.getCalificacion());		
		}

		double max = a[0].getCalificacion();

		for(int k = 0; k < a.length; k++) {

			if(a[k].getCalificacion() > max) {
				max = a[k].getCalificacion();

			}
		}
		System.out.println("La nota mayor fue: " + max);

	}
}



