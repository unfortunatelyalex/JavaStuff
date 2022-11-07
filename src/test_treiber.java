/**
 *
 * In diesem Programm sind testtreiber für die unten stehenden
 * Methoden definiert.
 */

public class test_treiber  {
  
  // globale Variable
  static int k = 1;
  
  public static void main(String[] args) {
  
    boolean testfall;
    
  // Testfälle für die Methode arithmetic
    
  /*
   * Zu testen: public static int arithmetic(int a, int b, String operation) 
   * 
   * Testfunktion: 
   *    boolean test_arithmetic(int a, int b, String operation, int erwartet)
   *
   * 
  */
  test_arithmetic (8,2,'+',10); 
  test_arithmetic (8,2,'-',6); 
  test_arithmetic (8,2,'*',16);
  test_arithmetic (8,2,'/',4);
    
  test_arithmetic (5,2,'+',7); 
  test_arithmetic (5,2,'-',3); 
  test_arithmetic (5,2,'*',10);
  test_arithmetic (5,2,'/',2.5);

  System.out.println(addieren(5,6));
    
    
  /*
     Deine Aufgabe: 
     Schreibe nach dem obigen Vorbild Testteiber für die Methoden
     - addieren
     - pruefeKontostand
     - max
     - min
    
  */
    
      /*
   * Zu testen: public static int addieren (int a, int b){ 
   * 
   * Testfunktion: 
   *    boolean test_addieren(int a, int b, int erwartet)
   *
   * 
  */
    
    

    
  } // end of main
  

  /**
   * Testtreiber für die Methode test_addieren
   */ 
  boolean test_addieren(int a, int b, int erwartet){
    
   // Hier dein Quellcode
    
    
    
     return false;
  }
  
  /**
   * Der Methode addieren werden zwei int-Werte übergeben. 
   * Die Summe der beiden wird zurück gegeben.
   *
   * @param int a: 1. Wert
   * @param int b: 2. Wert                     
   * @return Summe als Rückgabewert
   */   
  public static int addieren (int a, int b){
   return a-b;
  }
  
    /**
   * Die Methode pruefeKontostand erhält einen Kontostand und Kosten als 
   * Eingabeparameter. Die Methode überprüft, ob der Kontostand für die Kosten
   * ausreicht. 
   * Wenn ja, gibt sie true zurück.
   * Wenn nicht, gibt sie false zurück.
   *
   * @param double kontostand
   * @param double kosten                     
   * @return boolean true: Konto gedeckt  false: Konto nicht gedeckt
   */ 
  public static boolean pruefeKontostand (double kontostand, double kosten){
     if (kontostand > kosten)
        return true;
     else
        return false;
  }
  
  /**
   * Die Methode max bekommt 3 int Werte übergeben. 
   * Der Rückgabewert enthält das Maximum der drei Werte.
   *
   * @param int a: 1. Wert
   * @param int b: 2. Wert  
   * @param int b: 3. Wert                   
   * @return Maximum als Rückgabewert
   */ 
  public static int max(int a, int b, int c){
    int maxValue;
    if (a>=b){
      if(a>=c){ 
        maxValue = a;
      }else{
        maxValue = c;
      } 
    }else{
      if(b>=c){ 
        maxValue = b;
      }else{
        maxValue = c;
      }       
    }
  
    return maxValue;
  }
  
    /**
   * Die Methode min bekommt 3 int Werte übergeben. 
   * Der Rückgabewert enthält das Minimum der drei Werte.
   *
   * @param int a: 1. Wert
   * @param int b: 2. Wert  
   * @param int b: 3. Wert                   
   * @return Maximum als Rückgabewert
   */ 
  public static int min(int a, int b, int c){
    int minValue;
    if (a<b){
      if(a<c){ 
        minValue = b;
      }else{
        minValue = c;
      } 
    }else{
      if(b>c){ 
        minValue = a;
      }else{
        minValue = b;
      }       
    }
  
    return minValue;
  }
  
  
    /**
   * Testtreiber für die Methode arithmetic
   * - ruft die Methode arithmetic auf
   * - Erwartete Ausgabe und reale Ausgabe der Methode werden überprüft und verglichen
   */  
  public static boolean test_arithmetic (int  a, int b, char operation, double erwartet){
    boolean returnValue;
    // Überschrift Testfall
    System.out.println("Testfall Nr. " + k);
    k = k + 1;
    
    double output =  arithmetic(a,b,operation);
    
    // Testdaten:   
    System.out.println("Eingabe: a = " + a + ", b = " + b + ", operation = " + operation);
    System.out.println("Erwartete Ausgabe: " + erwartet);
    System.out.println("Reale Ausgabe: " + output);
    // Auswertung
    if( output == erwartet ){
       System.out.println("Test OK");
      System.out.println("");
       return true;
    }
    else{
      System.out.println("Test nicht OK");
      System.out.println("");
      return false;                             
    }

    
  }// end of test_arithmetic
  
  /**
   * Die Methode arithmetic gibt aus drei eingelesenen Parametern 
   * die Addition, Subtraktion, Multiplikation oder Division zurück.
   *
   * @param int a: 1. Wert
   * @param int b: 2. Wert
   * @param char operation: Rechenoperation ( +  -  *   / ), die 
   *                        durchgeführt werden soll                        
   * @return Rückgabewert der Rechnung als double-Wert
   */ 
  public static double arithmetic(int a, int b, char operation){
   double returnWert;
   try{ 
     switch (operation){
       case '+': 
          returnWert = a + b;
          break;
       case '-': 
          returnWert = a - b;
          break;
       case '*': 
          returnWert = a * b;
          break;  
       case '/': 
          returnWert = a / b;
          break;     
       default:
          returnWert = 0;    
     } // end of switch
   }catch(ArithmeticException e){
        System.out.println("Fehler");
        returnWert = 0;
   }//try/catch
   
    return returnWert;
    
  }

}