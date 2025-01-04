package javaproj1;

public class App {
    public static void main(String[] args) {
        
        System.out.println(8 % 3); 
        
        bob();

        String str = "word";
        int lenn = str.length();
        System.out.println(lenn - 1);
        System.err.println(str.substring(lenn - 3));
    }

    public static void bob() {
        
        System.out.println("Hello, World!"); 
    }
}
