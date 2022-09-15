package lista03;

public class Questao13 {
	
	public static void descriptografar(String[] array) {
		for (int i = 0; i < array.length; i++) {
			switch(array[i]) {
			case "%":
				array[i] = "a";
				break;
			case "*":
				array[i] = "b";
				break;
			case "(":
				array[i] = "c";
				break;
			case "-":
				array[i] = "d";
				break;
			case "+":
				array[i] = "e";
				break;
			case "@":
				array[i] = "f";
				break;
			case "#":
				array[i] = "g";
				break;
			case "1":
				array[i] = "h";
				break;
			case "2":
				array[i] = "i";
				break;
			case "3":
				array[i] = "k";
				break;
			case "4":
				array[i] = "l";
				break;
			case "5":
				array[i] = "m";
				break;
			case "6":
				array[i] = "n";
				break;
			case "7":
				array[i] = "o";
				break;
			case "8":
				array[i] = "p";
				break;
			case "9":
				array[i] = "q";
				break;
			case "{":
				array[i] = "r";
				break;
			case "}":
				array[i] = "s";
				break;
			case "!":
				array[i] = "t";
				break;
			case "&":
				array[i] = "u";
				break;
			case "$":
				array[i] = "v";
				break;
			case "?":
				array[i] = "x";
				break;
			case ":":
				array[i] = "z";
				break;
			default:
				array[i] = "";
			}
		}
		
		System.out.println("Após descriptografar:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void main(String[] args) {
         String[] array = {"*", "7", "5", "-", "2", "%", "5", "&", "6", "-", "7"};
         
         descriptografar(array);

	}

}
