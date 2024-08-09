 public class Bug3 {
    public static void main(String[] args) {
        String str = "hello";
        int index = 10; 

        if (index >= 0 && index < str.length()) {
            char ch = str.charAt(index);
            System.out.println(ch);
        } else {
            System.out.println("Index " + index + " is out of bounds for the string length " + str.length());
        }
    }
}
