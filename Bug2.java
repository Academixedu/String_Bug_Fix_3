public class Bug2{
public static void main(String[]args){
String str = "";
if (str.equals(null)) {
    System.out.println("String is null");
    // Fix Bug In Logic
}
else if(str.isEmpty())
{
  System.out.println("Strings is empty");
}
}
}
  
