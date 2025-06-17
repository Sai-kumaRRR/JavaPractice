package ex09_If_elseconditions;

public class Break {
    public static void main(String[] args) {
        char code = 'A';
        switch(code ){

            case 'A':
                System.out.println("A Grade");
                break;
            case 'B':
                System.out.println("B Grade");
                break;
            case 'C':
                System.out.println("C Grade");
                break;
            default:
                System.out.println("Invalid Grade");

        }
    }
}
