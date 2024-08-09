public class Bug3 {
    public static void main(String[] args) {
        String str = "Hello";
        int index = 10;

        if (index >= 0 && index < str.length()) {
            char ch = str.charAt(index);
            System.out.println("Character at index " + index + ": " + ch);
        } else {
            System.out.println("Index out of bounds: " + index);
        }
    }
}
