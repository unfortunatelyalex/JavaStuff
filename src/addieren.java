import java.util.Scanner;
public class addieren {
  
  public static void main(String[] args) {
    
    try (Scanner eingabe = new Scanner(System.in)) {
		int a = 0;
		int b = 0;
		int summe = 0;
   
		
		System.out.print("1. Zahl: ");
		a = eingabe.nextInt();
		System.out.print("2. Zahl: ");
		b = eingabe.nextInt();
		
		summe = a + b;
		
		System.out.println("Die Summe von " + a + " und " + b + " ist "  + summe);
	}
    
  }

}