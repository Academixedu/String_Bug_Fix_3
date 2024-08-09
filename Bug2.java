 public class Bug2 {
    public static void main(String[] args) {
        String str = "";
        
        // Check if str is null
        if (str == null) {
            System.out.println("String is null");
        } else if (str.equals("")) {
            System.out.println("String is empty");
        }
    }
}
