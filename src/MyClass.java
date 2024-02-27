import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {

        //1. Store your names in 3 different variables and print your whole name
//        System.out.println("Enter your first, second and last name one after the other: ");
//        Scanner scan = new Scanner(System.in);
//
//        String firstName = scan.nextLine();
//        String secondName = scan.nextLine();
//        String lastName = scan.nextLine();
//
//        System.out.println(firstName + " " + secondName + " " + lastName);

        //2. Print the perimeter of a triangle by given sides. Use formula to calculate it.
//        System.out.println("Enter the length for every side of a triangle:");
//        Scanner scan = new Scanner(System.in);
//
//        short sideA = Short.parseShort(scan.nextLine());
//        short sideB = Short.parseShort(scan.nextLine());
//        short sideC = Short.parseShort(scan.nextLine());
//
//        if((sideA + sideB) > sideC && (sideA + sideC) > sideB && (sideB + sideC) > sideA){
//            short trianglePerimeter = (short) (sideA + sideB + sideC);
//            System.out.println("The perimeter of triangle is: " + trianglePerimeter);
//        }
//        else System.out.println("That's not a triangle! Enter valid side lengths.");

        //3. Print the area of a triangle by given sides. Use formula to calculate it.
//        System.out.println("Enter side length and height of a triangle:");
//        Scanner scan = new Scanner(System.in);
//
//        short sideA = Short.parseShort(scan.nextLine());
//        short height = Short.parseShort(scan.nextLine());
//
//        short triangleArea = (short) (sideA * height / 2);
//        System.out.println("The area of triangle is: " + triangleArea);

        //4. Print pine tree using asterisks in the console.
//        System.out.println("     *    ");
//        System.out.println("    ***    ");
//        System.out.println("   *****   ");
//        System.out.println("  *******  ");
//        System.out.println(" ********* ");
//        System.out.println("***********");

        //6. Write a simple program, without checks to print the result of quadratic equation.
          Scanner input = new Scanner(System.in);

          System.out.print("Input a: ");
          double a = input.nextDouble();
          System.out.print("Input b: ");
          double b = input.nextDouble();
          System.out.print("Input c: ");
          double c = input.nextDouble();

          double result = b * b - 4.0 * a * c;

          double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
          double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
          System.out.println("The roots are " + r1 + " and " + r2);

    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main(String[] args) {
//        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
//    }
//}