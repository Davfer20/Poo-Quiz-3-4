package Files;

import java.util.ArrayList;

public class Humanos extends superHero {
	
	private ArrayList<String> caracteristicas;
	private ArrayList<String> hablidades;
	//Las carcateristicas pueden venir por parametro o ya definidas
	public Humanos(String pName, String pApodo, ArrayList<String> pCaracteristicas,ArrayList<String> pHablidades) {
		super(pName, pApodo);
		this.caracteristicas = pCaracteristicas;
		this.hablidades = pHablidades;
		
	}

}
