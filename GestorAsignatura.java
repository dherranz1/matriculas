package matriculas;

import java.util.ArrayList;

public class GestorAsignatura extends Gestor{

	public void add(Asignatura asignatura) {
		super.datos.addAsignatura(asignatura);
	}
	
	public ArrayList<Asignatura> getAllList() {
		return super.datos.getListAsignaturas();
	}

}
