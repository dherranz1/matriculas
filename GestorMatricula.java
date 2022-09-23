package matriculas;

import java.util.ArrayList;

public class GestorMatricula extends Gestor{
	
	public void add(Matricula matricula) {
		super.datos.addMatricula(matricula);
	}
	
	public ArrayList<Matricula> getAllList() {
		return super.datos.getListMatricula();
	}

}
