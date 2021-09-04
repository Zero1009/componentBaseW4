
/**
 * componentBaseW4
 */
import java.util.Scanner;

public class componentBaseW4 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String score = "";
        Person1 obj1 = new Person1();
        Person2 obj2 = new Person2();
        Boss obj = new Boss();

        obj.register(obj1);
        obj.register(obj2);
        while (true) {
            System.out.print("Enter Score ");
            score = sc.nextLine();
            if(score.equals("")) break;

            obj.setSomeData(score);
        }

    }
}