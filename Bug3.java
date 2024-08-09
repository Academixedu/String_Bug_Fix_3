public class Bug3{
public static void main(String[]args)
{
    String str = "Hello";
    char ch = str.charAt(10); // Index out of bounds
    // Prepare a Condition to Check the Index of a String only upto it's Last Index and Should not Exceed it
    char ch = str.charAt(index);
    System.out.println("charcter at index "+index+ " is " +ch);
}
}
