public class Bug4{
public static void main(String[]args){
String str = "Hello Hello";
String newStr = str.replaceFirst("Hello", "Hi"); // Replaces all occurrences
// Only Replace "Hi" With First Occurence of Hello
System.out.println(newStr);
}
}



    