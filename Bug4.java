public class Bug4{
public static void main(String[]args){
String str = "Hello Hello";
String newStr = str.replace("Hello", "Hi"); // Replaces all occurrences
// Only Replace "Hi" With First Occurence of Hello
String newstr = str.replaceFirst("Hello","hi");
System.out.println(newstr);
}
}
