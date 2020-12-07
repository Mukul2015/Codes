package string;
//Q: Write a Java program to create a unique identifier of a given string.
public class String_unique_identifier {
	 public static void main(String[] args)
	    {
	        String str = "Python Exercises.";

	        // Get the hash code for the above string.
	        int hash_code = str.hashCode();

	        // Display the hash code.
	        System.out.println("The hash for " + str +
	            " is " + hash_code);
	    }
}
