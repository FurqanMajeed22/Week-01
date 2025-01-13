import java.util.Scanner;
public class SubstringComparison{
    // Method to create a substring using charAt()
    public static String formsubchar(String str, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i < end; i++) {
            substring.append(str.charAt(i));
        }
        return substring.toString();
    }
	    public static boolean compareStringsCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
 System.out.println("Enter the String");
 String str1=sc.next();
 System.out.println("Enter the startindex");
 int startindex=sc.nextInt();
 System.out.println("Enter the endindex");
 int endindex=sc.nextInt();
 String substringusinghchar=formsubchar(str1,startindex,endindex);
 String substringusingbuiltin=str1.substring(startindex,endindex);
   boolean areEqual = compareStringsCharAt(substringusinghchar,substringusingbuiltin );
        // Display the results
     System.out.println("Substring using charAt(): " + substringusinghchar);
     System.out.println("Substring using built-in method: " + substringusingbuiltin);
     System.out.println("Are both substrings equal? " + areEqual);


}
}