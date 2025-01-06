import java.util.Scanner;

public class Markvalidate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the mark: ");
        int mark = scanner.nextInt();
        
       
        assert mark >= 0 && mark <= 100 : "Invalid Mark";
        
        System.out.println("Mark is Validated");
    }
}
