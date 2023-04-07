import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {
//      beveragePreparation();
      preparationDrinkButtons();

    }

    static void beveragePreparation() {
        System.out.print("Select a drink and press the button: ");
        Scanner s = new Scanner(System.in);
        int button = s.nextByte();
        s.close();

        if(button==1) {
            System.out.println("Your espresso is ready!");
        }
        else if(button==2) {
            System.out.println("Your americano is ready!");
        }
        else if(button==3) {
            System.out.println("Your cappuccino is ready!");
        }
        else if(button == 4){
            System.out.println("Ready! Take your water.");
        }
        else {
            System.out.println("No such drink.");
        }
    }

    public static String preparationDrinkButtons(){
        System.out.print("Select a drink and press the button: ");
        Scanner s = new Scanner(System.in);
        String drinkButton = s.nextLine();
        s.close();

                switch (drinkButton) {
                    case "espresso":
                        System.out.println("Your espresso is ready!");
                        break;
                    case "americano":
                        System.out.println("Your americano is ready!");
                        break;
                    case "cappuccino":
                        System.out.println("Your cappuccino is ready!");
                        break;
                    case "water":
                        System.out.println("Ready! Take your water.");
                        break;
                    default:
                        System.out.println("Sorry! No such drink.");
        };
                return drinkButton;
    }
}
