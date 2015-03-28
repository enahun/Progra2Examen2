
public class MedioDeTransporte {
	
	int cantidad_pasajeros;
	double velocidad_maxima;
	int cantidad_llantas;
	
	MedioDeTransporte(int cantidad_pasajeros, double velocida_maxima)
	{
		this.cantidad_pasajeros=cantidad_pasajeros;
		this.velocidad_maxima=velocida_maxima;
		this.cantidad_llantas=cantidad_llantas;
	}

	public int getCantidadPasajeros() {
		return cantidad_pasajeros;
	}

	public void setCantidadPasajeros() {
		this.cantidad_pasajeros = cantidad_pasajeros;
	}

	public double getVelocidadMaxima() {
		return velocidad_maxima;
	}

	public void setVelocidadMaxima() {
		this.velocidad_maxima = velocidad_maxima;
	}
	void setCantidadDeLLantas()
	{
		this.cantidad_llantas=cantidad_llantas;
	}
	 int getCantidadDeLLantas()
	{
		cantidad_llantas=0;
		return cantidad_llantas;
	}

	
	
}
