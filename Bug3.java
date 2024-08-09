public class bug3 {
    public static void main(String[] args) {
        String str = "Hello";
        int index = 10;

        if (index >= 0 && index < str.length()) {
            char ch = str.charAt(index);
            System.out.println("Character at index " + index + " is: " + ch);
        } else {
            System.out.println("Index " + index + " is out of bounds.");
        }
    }
}
