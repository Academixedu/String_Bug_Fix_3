public class Bug2 {
  public static void main(String[] args) {
      String str = "";
      if (str == null) {
          System.out.println("String is null");
      } else if (str.isEmpty()) {
          System.out.println("String is empty");
      }
  }
}
