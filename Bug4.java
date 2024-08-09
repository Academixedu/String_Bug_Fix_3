public class Bug4 {
    public static void main(String[] args) {
        String str = "Hello Hello";
        String newStr = str.replaceFirst("Hello", "Hi"); // Replaces only the first occurrence

        System.out.println("Original String: " + str);
        System.out.println("Modified String: " + newStr);
    }
}
