package lista03;

public class Questao12 {
	
	public static void criptografar(String[] array) {
		
		for (int i = 0; i < array.length; i++) {
			switch(array[i]) {
			case "a":
				array[i] = "%";
				break;
			case "b":
				array[i] = "*";
				break;
			case "c":
				array[i] = "(";
				break;
			case "d":
				array[i] = "-";
				break;
			case "e":
				array[i] = "+";
				break;
			case "f":
				array[i] = "@";
				break;
			case "g":
				array[i] = "#";
				break;
			case "h":
				array[i] = "1";
				break;
			case "i":
				array[i] = "2";
				break;
			case "j":
				array[i] = "3";
				break;
			case "l":
				array[i] = "4";
				break;
			case "m":
				array[i] = "5";
				break;
			case "n":
				array[i] = "6";
				break;
			case "o":
				array[i] = "7";
				break;
			case "p":
				array[i] = "8";
				break;
			case "q":
				array[i] = "9";
				break;
			case "r":
				array[i] = "{";
				break;
			case "s":
				array[i] = "}";
				break;
			case "t":
				array[i] = "!";
				break;
			case "u":
				array[i] = "&";
				break;
			case "v":
				array[i] = "$";
				break;
			case "x":
				array[i] = "?";
				break;
			case "z":
				array[i] = ":";
				break;
			default:
				array[i] = "";
			
			}
			System.out.print(array[i]);
		}
	}

	public static void main(String[] args) {
         String[] array = {"b", "o", "m","d", "i", "a", "m", "u", "n", "d", "o"};
         
         criptografar(array);

	}

}
