package org.lessons.java.security;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PasswordGenerator {

	public static void main(String[] args) {
		Scanner infoScanner = new Scanner(System.in);
		PasswordGenerator x = new PasswordGenerator();
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

		Password yourPw = x.new Password(nome, cognome, colore, data);
		String Pw = yourPw.generatePassword();
		System.out.println("la password generata è " + Pw);

	}

	public class Password {

		String name;
		String surname;
		String color;
		int date;

		public Password(String name, String surname, String color, String date) {
			this.name = name;
			this.surname = surname;
			this.color = color;
			this.date = this.findSum(date);
		}

		/*
		 * private LocalDate format(String date) { DateTimeFormatter formatter =
		 * DateTimeFormatter.ofPattern("dd/MM/yyyy"); LocalDate parsedDate =
		 * LocalDate.parse(date, formatter); return parsedDate; }
		 */

		static int findSum(String str) {
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

		public String generatePassword() {

			String password = this.name + "-" + this.surname + "-" + this.color + "-" + this.date;
			return password;

		}

	}

}