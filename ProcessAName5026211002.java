import java.util.Scanner;

public class ProcessAName5026211002 {
	
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);	
	System.out.println("Type your name: ");
	String name = input.nextLine();
	int space = name.indexOf(' ');
        char first_alphabet = name.charAt(0);
        String lastName = name.substring(space+1); 
	System.out.println("Your name is:"+lastName+ ","+first_alphabet+".");

        }
      
}