import java.util.*;
public class pruefeKontostand  {
  
  
  public static void main(String[] args) {
  
	try (Scanner eingabe = new Scanner(System.in)) {
		double kontostand, abbuchungsbetrag;
		
		 System.out.print("Kontostand: ");
		 kontostand = eingabe.nextDouble();
		 System.out.print("Betrag, der abgebucht werden soll: ");
		 abbuchungsbetrag = eingabe.nextDouble();
		
		 if (kontostand > abbuchungsbetrag){
		    System.out.println("Der Betrag von " + abbuchungsbetrag + " Euro wurde abgebucht.");
		    kontostand = kontostand -   abbuchungsbetrag;
		    System.out.println("Der neue Kontostand betraegt " + kontostand + " Euro." );
		  }
		 else if (abbuchungsbetrag == kontostand) {
			 kontostand = abbuchungsbetrag - kontostand;
			 System.out.println("Der neue Kontostand betraegt " + kontostand + "Euro");
		 }
		 else
		    System.out.println("Konto nicht gedeckt");
	}
   }
  }