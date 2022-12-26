package Logical;

import java.util.regex.Pattern;

public class ValidPas {
		public static void main(String[] args) {
			String s = "hkvkhkvFGTROLWahytfv0hjlqATSsukyf";
			Boolean b = Pattern.matches("((?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{10,})", s);
			System.out.println(b);
		}

	}


