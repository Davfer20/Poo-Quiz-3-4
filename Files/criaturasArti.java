package Files;

import java.util.ArrayList;

public class criaturasArti extends superHero{
	

	private ArrayList<String> caracteristicas;
	private ArrayList<String> hablidades;

		//Las carcateristicas pueden venir por parametro o ya definidas
	public criaturasArti(String pName, String pApodo, ArrayList<String> pCaracteristicas,ArrayList<String> pHablidades) {
		super(pName, pApodo);
		this.caracteristicas = pCaracteristicas;
		this.hablidades = pHablidades;
		
	}

}
