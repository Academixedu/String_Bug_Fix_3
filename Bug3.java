public class Bug3{
public static void main(String[]args)
{
    String str = "Hello";
     // Index out of bounds
    int index=10;
    
    // Prepare a Condition to Check the Index of a String only upto it's Last Index and Should not Exceed it
    if (index >= 0 && index < str.length()) 
    {
        char ch = str.charAt(index);
        System.out.println("Index character " + ch);
        
    } else{
        System.out.println("Index out of bounds: " + index);
    }
}
    
}




