
import java.util.Scanner;	

public class cryptoWork{

	//Makes the string into an array
	static String[] stringToArray(String str){
		String[] arr = new String[str.length()];
		for(int i = 0; i < str.length(); i++){
			arr[i] = String.valueOf(str.charAt(i));
		}
		return arr;
	}

	//This function makes the blank string
	static String[] blankString(int length){
		String blank[] = new String[length];
		for (int i = 0; i < length; i++){
			blank[i] = "_";
		}
		return blank;
	}

	//This function prints the arrays
	static void print(String[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]);
		}
		System.out.println();

	}


	//This function fills the black string with the new letters
	static void fillIn(String[] code, String L, String[] blank, String l){
		for (int i = 0; i < blank.length; i++){
			if(code[i].equals(L)){
				blank[i] = l;
			}
		}
	
	}
	//This function removes a new letter from the solution string
	static void remove(String[] blank, String bl){
		for (int i = 0; i < blank.length; i++){
			if (blank[i].equals(bl)){
				blank[i] = "_";
			}
		}
	}	

	//This is my makeshift scanner function:
	static String scanningTool(){
		Scanner newSc = new Scanner(System.in);
		return newSc.nextLine();
	}
	
	public static void main(String []args){
		//Creates the scanner:
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the string that's being decrypted:");
		String ms = sc.nextLine();
		String [] blank = blankString(ms.length());
		String [] code = stringToArray(ms);
		boolean check = true;

		while(check){
			System.out.println("What do you wanna do?");
			System.out.println("1. Change a letter");
			System.out.println("2. Remove a letter");
			System.out.println("3. Clear array");
			System.out.println("4. Stop this");
			int ans = sc.nextInt();
			
			if (ans == 1){
				System.out.println("Code Letter:");
				String codeLetter = scanningTool();
	
				System.out.println("New Letter: ");
				String newLetter = scanningTool();



				fillIn(code, codeLetter, blank, newLetter);
			}

			if (ans == 2){
				System.out.println("What letter are we removing from the answer?");
				String L = scanningTool();
				
				remove(blank, L);

			}
			
			if (ans == 3){
				blank = blankString(ms.length());
			}			

			if (ans == 4){
				check = false;
			}


			else{
				System.out.println("Please type it again!");
			}
			print(code);
			System.out.println();
			print(blank);	

			for(int i = 0; i < 10; i++){
				System.out.println();
			}		

	
		}		
	}

}	
