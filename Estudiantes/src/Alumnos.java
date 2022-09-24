
public class Alumnos {
	 private String nombre;
	 private long cedula;
	 private double calificacion;
 

	 public Alumnos(String name,long cedula2, double calificacion2) {	  
		 this.nombre = name;
	     this.cedula = cedula2;
	     this.calificacion = calificacion2;
	 }
	 
	 public String getNombre() {
		return nombre;
	 }
	
	 public void setNombre(String nombre) {
		this.nombre = nombre;
	 }
	
	 public long getCedula() {
		return cedula;
	 }
	
	 public void setCedula(long cedula) {
		this.cedula = cedula;
	 }
	
	 public double getCalificacion() {
		return calificacion;
	 }
	
	 public void setCalificacion(float calificacion) {
		this.calificacion = calificacion;
	 }
}