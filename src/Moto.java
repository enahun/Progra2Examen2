
public class Moto extends MedioDeTransporte{
	
	Moto(int cantidad_pasajeros, double velocidad_maxima)
	{
		super(cantidad_pasajeros,velocidad_maxima);
		
	}
	@Override
	 int getCantidadDeLLantas() 
	{
		cantidad_llantas=2;
		return cantidad_llantas;
	}

}
