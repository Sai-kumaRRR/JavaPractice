package ex07_Functions;

public class UserDefined {
    public static void main(String[] args) {
//step  - 2 {JVM will call}
        main();
        greet();
    }


      // Step - 1 Defined/decration
    static void main() {
        System.out.println("User Defined");
    }


    // with out parameter without return type.
    // no argument no return type.
    static void greet() {
        System.out.println("Hello");
    }

}
