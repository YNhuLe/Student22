
package student22;
import java.util.Scanner;
public class Student22 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        love();
        printWord(scan);
        print();
        printAgain();
        hate();
    }
    
  //this is the hate method///////////////////////////////////////////////////////////////////////////////////  
      public static void hate(){
        System.out.println("There are many changes");
        
        
        }
    //another method
    public static void printAgain(){
char[] list = new char[5];
        list[0] = 't';
        list[1] = 'e';
        list[2] = 'r';
          list[2] = 's';
          list[2] = 'p';
        for( int i =0; i<list.length; i++){
System.out.println(list[i] + " ");
            
        }
            
        
    }
    
    
    ///THere are many things different between  these two files
    //method for print and show array
    public static void love(){
        char[] myWord = new char[4];
        myWord[0]= 'l';
        myWord[1]= 'o';
        myWord[2]= 'v';
        myWord[3]= 'e';
        for ( int i =0; i<myWord.length; i++){
         System.out.print(myWord[i] + " ");
            
        }
        
        System.out.println("\nThis is the backward");
        for( int i =myWord.length-1 ; i>=0 ; i--){
            System.out.print(myWord[i] +" ");
    }
        
        public static void print(){
        System.out.println("There are many changes");
        
        
        }
    }
    //ask users for the word then print it forward and backward
    public static void printWord(Scanner scan){
        System.out.print("\nPLease enter the word!");
        String word= scan.nextLine();
        
        char[] myLetter = new char[word.length()];
        
        for( int i =0; i<myLetter.length; i++){
        myLetter[i] =word.charAt(i);
        System.out.print(myLetter[i] + " ");
        
        }
        System.out.println();
       //showing the word backward
       for( int i =myLetter.length-1; i>=0; i--){
        myLetter[i]=word.charAt(i);
        System.out.print(myLetter[i] + " ");
           
       }
    }
}
