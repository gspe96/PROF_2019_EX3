package es.upm.grise.profundizacion2019.ex3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time {
	
	// 6 Creado constructor para valor por omision
	public Time() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		 this.dep = LocalDateTime.now();
	}
	
	// 2 Variable para inyeccion de dependencia
	LocalDateTime dep;
	
	// 3 Metodo getter para variable
	public LocalDateTime getTime() {
		return this.dep;
	}
	
	// 4 Metodo setter para variable
	public void setTime(String str) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		this.dep = LocalDateTime.parse(str, formatter);
	}
	
	// 1 Quitado static
	public String getFutureTime(long seconds) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		// 5 Se obtiene el tiempo
		LocalDateTime time = getTime();
		time = time.plusSeconds(seconds);
		return formatter.format(time);	
	}

}