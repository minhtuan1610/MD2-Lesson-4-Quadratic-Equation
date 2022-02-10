import java.util.Scanner;

public class SolutionEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coefficient a, b, c:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double delta = equation.getDiscriminant();
        if (delta > 0) {
            System.out.println("The equation has two roots:");
            System.out.println("r1: " + equation.getRoot1() + "\t r2: " + equation.getRoot2());
        } else if (delta == 0) {
            System.out.println("The equation has one root: " + (-b / 2 * a));
        } else {
            System.out.println("The equation has no real root.");
        }
    }
}
