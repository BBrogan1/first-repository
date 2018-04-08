// for project - menu choice will invoke another class
import java.util.Scanner;

public class Index{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Select an option (1-10):");
    System.out.println();
    System.out.println("1. Break");
    System.out.println("2. Switch");
    System.out.println("3. Methods");
    System.out.println("4. ReturnMethods");
    System.out.println("5. Shadow");
    System.out.println("6. Overloading");
    System.out.println("7. Reverse");
    System.out.println("8. FirstArray");
    System.out.println("9. SecondArray");
    System.out.println("10. SearchStudent");
    System.out.println("11. EnhancedFor"); 
    System.out.println("12. TryCatch");
    System.out.println("13. Convert");
    System.out.println("14. Exit");

    System.out.println();

    System.out.print("Choice: ");
    int choice = input.nextInt();
    System.out.println();

    switch(choice){
      case 1:
        System.out.println("Break lab");
        Break_Ex2.main(null); //static method call, no instance required.
        break;
      case 2:
        System.out.println("Switch lab");
        System.out.println();
        FirstSwitch.main(null);
        break;
      case 3:
		System.out.println("Methods");
		System.out.println();
		Methods.main(null);
        break;
      case 4:
		System.out.println("ReturnMethods");
		System.out.println();
		ReturnMethods.main(null);
        break;
      case 5:
		System.out.println("Shadow");
		System.out.println();
		Shadow.main(null);
        break;
      case 6:
		System.out.println("Overloading");
		System.out.println();
		Arithmetic.main(null);
        break;
      case 7:
		System.out.println("ReverseDigits");
		System.out.println();
		Reverse.main(null);
        break;
      case 8:
		System.out.println("FirstArray");
		System.out.println();
		FirstArray.main(null);
        break;
      case 9:
		System.out.println("SecondArray");
		System.out.println();
		SecondArray.main(null);
        break;
      case 10:
		System.out.println("SearchStudent");
		System.out.println();
		SearchStudent.main(null);
        break;
      case 11:
		System.out.println("EnhancedFor");
		System.out.println();
		EnhancedFor.main(null);
        break;
      case 12:
		System.out.println("TryCatch");
		System.out.println();
		TryCatch.main(null);
        break;
      case 13:
		System.out.println("Convert");
		System.out.println();
		Convert.main(null);
        break;
      case 14:
        System.out.println("Exiting....");
        break;
      default:
        System.out.println("Invalid choice");
        break;
    }
    System.out.println();

  }
}
