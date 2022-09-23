package matriculas;

public class Matricula {

	private Alumno alumno;
	private Asignatura asignatura;
	
	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Asignatura getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}

	
	
	public Matricula(Alumno alumno, Asignatura asignatura) {
		this.alumno = alumno;
		this.asignatura = asignatura;
	}
	
	
	
}
