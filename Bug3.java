public class Bug3{
public static void main(String[]args){
String str = "Hello";
int a=10;
if(a>=0 && a<=str.length()){
char ch = str.charAt(10); // Index out of bounds
// Prepare a Condition to Check the Index of a String only upto it's Last Index and Should not Exceed it
    System.out.println("ch");
}
else
{
    System.out.println("Index of out bounds");
}
}
}
