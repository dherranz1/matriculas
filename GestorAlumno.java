package matriculas;

import java.util.ArrayList;

public class GestorAlumno extends Gestor{

	public void add(Alumno alumno) {
		super.datos.addAlumno(alumno);
	}

	
	public ArrayList<Alumno> getAllList() {
		return super.datos.getListAlumnos();
	}

}
