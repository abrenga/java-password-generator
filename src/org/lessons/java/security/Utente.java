package org.lessons.java.security;
/*creata la classe Utente avrà un costruttore che si occuerà di ricevere 
 * in entrata i dati che andranno poi passati quando verrà creata l'istanza*/
public class Utente {

	String name;
	String surname;
	String color;
	int date;

	public Utente(String name, String surname, String color, String date) {
		this.name = name;
		this.surname = surname;
		this.color = color;
		this.date = this.sommaDataDiNascita(date);
		/*semplicemente ho passato come membro la funzione sommaDataDiNascita a cui ho passato
		  come parametro "data" (tutti questi parametri verranno poi passati al momento della creazione dell'istanza nel Main.
		 */
	}

	/*
  questa funzione  esegue le operazioni sulla data procedenso alla somma,. come? trattando la stringa passata come parametro(poi sarà la data) come un array
	 */

	 int sommaDataDiNascita(String str) {
		String tempString = "";
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch))
				tempString += ch;

			{
				sum += Integer.parseInt(tempString);
				tempString = "0";
			}
		}
		return sum + Integer.parseInt(tempString);
	}
	 
	 
	 


}

