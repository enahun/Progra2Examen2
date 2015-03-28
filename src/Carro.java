
public class Carro extends MedioDeTransporte {

	Carro(int cantidad_pasajeros, double velocidad_maxima) 
	{
		super(cantidad_pasajeros, velocidad_maxima);
		
	}
	@Override
	public int getCantidadDeLLantas() 
	{
		cantidad_llantas=4;
		return cantidad_llantas;
	}
	

}
