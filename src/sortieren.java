public class sortieren {
  
  public static void main(String[] args) {
    int k;
    int[] array= new int [9];
    
    
    for (int i = 0; i<8; i++) { 
      k = i + 1;
      array[i]  = InOut.readInt("Eingabe " + k + ". Wert: " );
    }
    
    
    
    System.out.println("\n\nUnsortiertes Array: ");
    for (int i = 1; i<array.length; i++) {
      System.out.print(array[i] + ", ");
    }
    
    bubblesort(array);
    System.out.println("\n\nArray sortiert von klein nach groß:");
    for (int i = 1; i<array.length; i++) { 
      System.out.print(array[i] + ", ");
    }
    System.out.println("\n\n\n");
  
  }



public static void bubblesort(int[] zusortieren) {
    int temp;
    for(int i=2; i<zusortieren.length; i++) {
      for(int j=1; j<zusortieren.length-i; j++) {
        if(zusortieren[j]>zusortieren[j+1]) {
          temp=zusortieren[j];
          zusortieren[j]=zusortieren[j+1];
          zusortieren[j+1]=temp;
        }
        
      }
    }
  }
  
}
