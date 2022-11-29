/* This simple program is my  solution to a sololearn community challenge. The program rearranges letters in a word similarly to a FIFO order. Switching the word's first letter to last and creating new words  in an ArrayList until the occurrence of the original word.

 challenge link : https://www.sololearn.com/learn/9885/?ref=app 

 */
import java.util.*;

public class TextRotate {

	public static String newStr, oldStr, word;
	public static char firstChar;
	public static int len, i;

//The ArrayList function
	public static ArrayList initialize(String str){

		ArrayList < String > strList = new ArrayList < String > ();

		len = str.length();
		oldStr = str;

		for (i = 0; i < len; ++i){

			firstChar = str.charAt(0); // gets the first letter of the  word
			newStr = str.substring(1)+firstChar; // switches the first letter to the last
			str = newStr;
			strList.add(str);

			if (i == len){
				strList.add(oldStr);

			}
		}

		return strList;

	}

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word, please 😉");
		word = input.nextLine();


		if (word.isEmpty()){
			System.out.println("Please enter a word");

		} else {

// calling the ArrayList function above
			System.out.println(initialize(word));

		}
	}
}
