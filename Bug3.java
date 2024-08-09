public class Bug3{
public static void main(String[]args){
String str = "Hello";
// char ch = str.charAt(10); // Index out of bounds
int index=10;
// Prepare a Condition to Check the Index of a String only upto it's Last Index and Should not Exceed it
if(index>str.length()-1){
System.out.println("index out of range");
}
}
}
