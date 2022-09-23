package matriculas;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	private static final int EXIT = 0;
	private static final int MATRICULAR = 1;
	private static final int MOSTRARMATRICULASALUMNO= 2;
	
	private static GestorAlumno gestorAlumno = new GestorAlumno();
	private static GestorAsignatura gestorAsignatura = new GestorAsignatura();
	private static GestorMatricula gestorMatricula = new GestorMatricula();
	
	private static ArrayList<Alumno> listadoAlumnos = new ArrayList<Alumno>();
	private static ArrayList<Asignatura> listadoAsignaturas = new ArrayList<Asignatura>();
	private static ArrayList<Matricula> listadoMatriculas = new ArrayList<Matricula>();
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner teclado = new Scanner(System.in);
		int option = 0;
		
		initData();
		showInfo();
		showMenu();
		
		
		option = teclado.nextInt();
		
		
		while (option != EXIT) {
			
			switch(option) {
				case EXIT:
					break;
				
				case MATRICULAR:
					
					int numeroAlumno;
					int numeroAsignatura;
					
					System.out.println("Introducir numero del alumno: ");
					numeroAlumno = teclado.nextInt();
					
					System.out.println("Introducir numero de la asignatura: ");
					numeroAsignatura = teclado.nextInt();
					
					matricular(numeroAlumno, numeroAsignatura);
					
					break;

				case MOSTRARMATRICULASALUMNO:
					
					int numeroAlumnoSeleccionado;
										
					System.out.println("Introducir numero del alumno: ");
					numeroAlumnoSeleccionado = teclado.nextInt();
					
										
					mostrarMatriculasAlumno(numeroAlumnoSeleccionado);
					
					System.out.println("");
					System.out.println("");
					System.out.println("Pulse una tecla para continuar");
					teclado.nextLine();
					
					break;
			
			}
			
			// Nueva pantalla
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("============================");
			System.out.println("");
			System.out.println("");
			
			showInfo();
			showMenu();
			option = teclado.nextInt();
			
		}
	}
	
	public static void initData() {
		
		// Agregando alumnos
		Alumno alumno1 = new Alumno("Jose Luis Fernandez");
		Alumno alumno2 = new Alumno("Alberto Sanchez");
		Alumno alumno3 = new Alumno("Sara Pascual");
		
		gestorAlumno.add(alumno1);
		gestorAlumno.add(alumno2);
		gestorAlumno.add(alumno3);
				
		
		// Agregando las asignaturas
		Asignatura asignatura1 = new Asignatura("Lengua");
		Asignatura asignatura2 = new Asignatura("Matematicas");
		Asignatura asignatura3 = new Asignatura("Ingles");

		gestorAsignatura.add(asignatura1);
		gestorAsignatura.add(asignatura2);
		gestorAsignatura.add(asignatura3);
		
		
		// Recuperando la informacion de los alumnos
		listadoAlumnos = gestorAlumno.getAllList();
				
		// Recuperando la informacion de las asignaturas
		listadoAsignaturas = gestorAsignatura.getAllList();
				
		
	}
	
	public static void showInfo() {
		
		System.out.println("");
		System.out.println("");
		System.out.println("Alumnos");
		System.out.println("===========");
		System.out.println("");
		
				
		for (int i=0; i < listadoAlumnos.size(); i++) {
			System.out.println( i + " - " + listadoAlumnos.get(i).getNombre());
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("Asignaturas");
		System.out.println("===========");
		System.out.println("");
		
						
		for (int i=0; i < listadoAsignaturas.size(); i++) {
			System.out.println( i + " - " + listadoAsignaturas.get(i).getName());
		}
	}
	
	
	public static void showMenu() {
		
		System.out.println("");
		System.out.println("Menu de opciones");
		System.out.println("================");
		System.out.println(MATRICULAR + " - Matricular alumno");
		System.out.println(MOSTRARMATRICULASALUMNO  + " - Mostrar matriculas alumno");
		System.out.println(EXIT  + " - Salir");
		System.out.println("");
		System.out.println("Introducir numero de la opcion: ");
	}
	
	public static void matricular(int numeroAlumno, int numeroAsignatura) {
		
		Alumno alumno = gestorAlumno.getAllList().get(numeroAlumno);
		Asignatura asignatura = gestorAsignatura.getAllList().get(numeroAsignatura);
		Matricula matricula = new Matricula(alumno, asignatura);
		
		gestorMatricula.add(matricula);
		
	}
	
	public static void mostrarMatriculasAlumno(int numeroAlumno) {
		
		Alumno alumnoSeleccionado = gestorAlumno.getAllList().get(numeroAlumno); 
		
		System.out.println("Alumno: " + alumnoSeleccionado.getNombre());
		System.out.println("Asignaturas: ");
		
		// Buscando las matriculas del alumno especificado
		for (int i = 0; i < gestorMatricula.getAllList().size(); i++) {
			
			Matricula matricula = gestorMatricula.getAllList().get(i);
			
			if (matricula.getAlumno().getNombre().equals(alumnoSeleccionado.getNombre())) {
				System.out.println(matricula.getAsignatura().getName());
			}
		}
		
		
	}

}
