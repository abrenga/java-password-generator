package org.lessons.java.security;

import java.util.Scanner;

//Ho creato una classe Main che si occuperà di prendere dall'terminale i dati che mi servono
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		Scanner infoScanner = new Scanner(System.in);
		// DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("generatore di password poco sicure");
		System.out.println("inserisci il tuo nome");
		String nome = infoScanner.nextLine();

		System.out.println("inserisci il tuo cognome");
		String cognome = infoScanner.nextLine();

		System.out.println("inserisci il tuo colore preferito");
		String colore = infoScanner.nextLine();

		System.out.println("inserisci la tua di nascita");
		String data = infoScanner.nextLine();
	/*una volta presi i dati creo l'istanza di un oggetto passando come parametri i dati inseriti, 
	  per passarli al costruttore	che si occup di modellare la classe Utente
	 */
		Utente utenteCorrente = new Utente(nome, cognome, colore, data);
		
//una volta isanziata la classe Utente devo semplicemtne passarla all'istanza PAssworGneretor
		//che avrà invece come costruttore tutti i dati elaborati dalla classe Utente
		PasswordGeneretor yourPw = new PasswordGeneretor(utenteCorrente);
		String Pw = yourPw.generatePassword();
		System.out.println("la password generata è " + Pw);

	}
	
}

	