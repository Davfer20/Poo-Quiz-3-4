package Files;

public class superHero implements poderPropio, poderObjeto, tecnologia {
	private String name;
	private String apodo;
	
	
	public superHero (String pName, String pApodo)
	{
		this.name = pName;
		this.apodo = pApodo;
	}
	
	public String identification()
	{
		return "Nombre: "+name+"\nApodo: "+apodo;
	}

	@Override
	public String podeSuperHeroe(String poder) {
		// TODO Auto-generated method stub
		return "El tipo de poder es:" +poder;
	}}
