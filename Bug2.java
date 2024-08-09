public class Bug2{
  public static void main(String[]args){
  String str = "";
  if (str.equals(null)) {
      System.out.println("String is null");
  if (str == null) {
      System.out.println("string is null");
  }}
  else if (str.isEmpty()){
    System.out.println("String is empty");
  
  }
    }}