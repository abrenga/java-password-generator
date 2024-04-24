package org.lessons.java.security;
/*creata poi una classe che si occuperà solo di generare la pw 
 * all'inizio per istinto avevo passato il parametro direttamente alla funzione generatePassword, poi ho pensato di creare un costruttore anche qui
 * in questo modo quando anrò a creare un istanza passerò l'utente direttamente allistanza*/
public class PasswordGeneretor {
	Utente utente;
	
public PasswordGeneretor(Utente utente) {
	this.utente = utente;
	
}

	public String generatePassword() {

		String password = this.utente.name + "-" + this.utente.surname + "-" + this.utente.color + "-" + this.utente.date;
		return password;

	}
}
