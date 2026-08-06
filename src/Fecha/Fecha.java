package Fecha;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Fecha {
	private LocalDate aniversario;
	private LocalDate hoy;

	public Fecha (int dia, int mes, int año) {
		this.aniversario = LocalDate.of(año, mes, dia);
		this.hoy = LocalDate.now();
	}

	public int diasEntreFechas() {
        // Calcula exactamente la diferencia en días reales entre ambas fechas
        long dias = ChronoUnit.DAYS.between(aniversario, hoy);
        
        // Si hoy es anterior a la fecha del aniversario, devolvemos -1
        if (dias < 0) {
            System.err.println("Error, el aniversario aún no ha tenido lugar");
            return -1;
        }
        
        return (int) dias;
    }
}

