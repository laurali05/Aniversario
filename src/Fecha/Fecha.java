package Fecha;

import java.time.LocalDate;

public class Fecha {
	private LocalDate aniversario;
	private LocalDate hoy;

	public Fecha (int año, int mes, int dia) {
		this.aniversario = LocalDate.of(año, mes, dia);
		this.hoy = LocalDate.now();
	}

	public int diasEntreFechas(){
		int dias = -1;
		if((aniversario.getYear() == hoy.getYear()) && (aniversario.getDayOfYear() == hoy.getDayOfYear())){
			dias = 0;
		} else if ((aniversario.getYear() == hoy.getYear()) && (aniversario.getDayOfYear() != hoy.getDayOfYear())){
			if(hoy.getDayOfYear() > aniversario.getDayOfYear()){
				dias = hoy.getDayOfYear() - aniversario.getDayOfYear();
			} else {
				dias = -1;
				System.err.println("Error, el aniversario aún no ha tenido lugar");
			}
		} else if ((aniversario.getYear() != hoy.getYear())){
			dias = (aniversario.lengthOfYear() - aniversario.getDayOfYear()) + hoy.getDayOfYear();
		}
		return dias;
	}
}

