
package fridayassignment;
import java.util.*;
public class CountLettersInArray {
	 
	  public static void main(String[] args) {
	   
	    char[] letters = createArray();  
	    System.out.println("The lowercase letters are:");
	    displayArray(letters);
	    int[] counts = countLetters(letters);
	    System.out.println();
	    System.out.println("Frequency of each alphabet :");
	    displayCounts(counts);
	  }

	
	  public static char[] createArray() {
	   
		  Scanner s = new Scanner(System.in);
	      System.out.println("Enter the characters");
	      char[] a = s.next().toCharArray();  
	    return a;
	  }
	
	  public static void displayArray(char[] a) {
		  for (int i = 0; i < a.length; i++) {
		      if ((i + 1) % 20 == 0)
		        System.out.println(a[i]);
		      else
		        System.out.print(a[i]+" ");
		    }
	  }
	 
	  public static int[] countLetters(char[] a) {
	    
	    int[] count = new int[26];

	    for (int i = 0; i < a.length; i++)
	      count[a[i]-'a']++;

	    return count;
	  }

	  public static void displayCounts(int[] count) {
	    for (int i = 0; i < count.length; i++) {
	      if ((i + 1) % 10 == 0)
	        System.out.println("("+count[i]+" : "+(char)(i+'a')+")");
	      else
	        System.out.print("("+count[i]+" : "+(char)(i+'a')+")");
	    }
	  }
	}