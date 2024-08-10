public class Bug3{
public static void main(String[]args){
String str = "Hello";
// char ch = str.charAt(10); // Index out of bounds
// Prepare a Condition to Check the Index of a String only upto it's Last Index and Should not Exceed it
for(int i=0;i<str.length();i++){
char ch = str.charAt(i);
System.out.println(ch);
}
}
}