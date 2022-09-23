package matriculas;

import java.util.ArrayList;

public class Datos {
	
	ArrayList<Alumno> listAlumnos = new ArrayList<Alumno>();
	ArrayList<Asignatura> listAsignaturas = new ArrayList<Asignatura>();
	ArrayList<Matricula> listMatriculas = new ArrayList<Matricula>();
	
	public void addAlumno(Alumno alumno) {
		this.listAlumnos.add(alumno);
	}
	public void addAsignatura(Asignatura asignatura) {
		this.listAsignaturas.add(asignatura);
	}
	public void addMatricula(Matricula matricula) {
		this.listMatriculas.add(matricula);
	}
	
	public ArrayList<Alumno> getListAlumnos() {
		return this.listAlumnos;
	}
	public ArrayList<Asignatura> getListAsignaturas() {
		return this.listAsignaturas;
	}
	public ArrayList<Matricula> getListMatricula() {
		return this.listMatriculas;
	}
	
	

}
