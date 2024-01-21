package unidad4;
/**
 * Act1herencia representa las horas(de 0 a 23) y minutos que tiene el dia, para que devuelva la representación de un reloj
 * @author Diego Jurado
 */
public class Act1Herencia {
	protected int hora;
	protected int minutos;
/**
 * Crea un día recibiendo las horas y los minutos
 * @param hora hora del dia
 * @param minutos minutos del dia
 */
	public Act1Herencia(int hora, int minutos) {
		super();
		setHora(hora);
		setMinutos(minutos);
	}
	/**
	 * Devuelve las horas
	 * @return return de hora
	 */
	public int getHora() {
		return hora;
	}

	/**
	 * Configura el reloj para que muestre de 0 a 23 horas
	 * @param hora
	 */
	public void setHora(int hora) {
		if (hora >= 0 && hora < 24) {
			this.hora = hora;
		}
	}
	/**
	 * Devuelve los minutos
	 * @return return de minutos
	 */
	public int getMinutos() {
		return minutos;
	}
	
	/**
	 * Configura el reloj para que muestre de 0 a 50 minutos
	 * @param minutos 
	 */
	public void setMinutos(int minutos) {
		if (minutos >= 0 && minutos < 60) {
			this.minutos = minutos;
		}
	}
	/**
	 * Configura el reloj para que si sobre pasa los 59 minutos añade una hora al reloj
	 */
	public void inc() {
		if(this.minutos<59) {
			this.minutos++;
		}else {
			this.minutos=0;
			this.hora++;
			if(hora==24) {
				hora=0;
			}
		}
	}

	@Override
	public String toString() {
		String res="";
		if(hora<10) {
			res="0";
		}
		res=res+hora+":";
		if(minutos<10) {
			res+="0";
		}
		res+=minutos;
		return res;
	}

	
}

