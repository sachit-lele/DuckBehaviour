//Create a main file for user to select which type of duck they want to create
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What type of duck do you want to create?");
        System.out.println("1. Rubber Duck");
        System.out.println("2. Mallard Duck");
        System.out.println("3. Decoy Duck");
        System.out.println("4. Redhead Duck");
        System.out.println("5. Exit");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                Duck rubberDuck = new RubberDuck();
                rubberDuck.displayName();
                rubberDuck.Float();
                rubberDuck.notFly();
                rubberDuck.squeak();
                break;
            case 2:
                Duck mallardDuck = new MallardDuck();
                mallardDuck.displayName();
                mallardDuck.fly();
                mallardDuck.swim();
                mallardDuck.quack();
                break;
            case 3:
                Duck decoyDuck = new DecoyDuck();
                decoyDuck.displayName();
                decoyDuck.notFly();
                decoyDuck.sink();
                decoyDuck.Mutequack();
                break;
            case 4:
                Duck redheadDuck = new RedHeadDuck();
                redheadDuck.displayName();
                redheadDuck.fly();
                redheadDuck.swim();
                redheadDuck.quack();
                break;
            case 5:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
