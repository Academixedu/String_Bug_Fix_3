public class Bug3 {
    public static void main(String[] args) {
        String str = "Hello";
        // char ch = str.charAt(10); // Index out of bounds
        // Prepare a Condition to Check the Index of a String only upto it's Last Index
        // and Should not Exceed it

        int index = 10;

        if (index < str.length()) {
            char ch = str.charAt(index);
            System.out.println("ch : " + ch);
        } else {
            System.out.println("Array Index Out of Bound Exception");
        }

    }
}
