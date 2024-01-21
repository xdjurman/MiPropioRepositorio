package unidad4;

public class Act2Herencia extends Act1Herencia {
	private Meridiano meridiano;

	public Act2Herencia(int hora, int minutos, Meridiano meridiano) {
		super(hora, minutos);
		this.meridiano = meridiano;
	}

	public Meridiano getMeridiano() {
		return meridiano;
	}

	public void setMeridiano(Meridiano meridiano) {
		this.meridiano = meridiano;
	}

	@Override
	public void setHora(int hora) {
		if(hora>0 && hora<13) {
			this.hora=hora;
		}
	}
	
	public void cambiarMeridiano() {
		if(this.meridiano==Meridiano.AM) {
			this.meridiano=Meridiano.PM;
		}else {
			this.meridiano=Meridiano.AM;
		}
	}
	
	@Override
	public void inc() {
		if(this.minutos<59) {
			this.minutos++;
		}else {
			this.minutos=0;
			this.hora++;
			if(hora==13) {
				hora=1;
				cambiarMeridiano();
			}
		}
	}

	@Override
	public String toString() {
		return "Hora12 [" + super.toString() + ", "+meridiano +"]";
	}
	
	
	
}
