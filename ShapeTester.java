
import java.util.Scanner;

public class ShapeTester{
    
    static boolean menu(){
        boolean exitFlag = false;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("*************************************");
        System.out.println("* Please choose one the followings: *");
        System.out.println("* Press 'c' - Circle                *");
        System.out.println("* Press 's' - Square                *");
        System.out.println("* Press 'r' - Rectangle             *");
        System.out.println("* Press 'x' - EXIT                  *");
        System.out.println("*************************************");
        
        String input = scanner.next();
        
        switch (input) {
            case "c":
                Circle test_circle = new Circle();
                test_circle.readShape();
                test_circle.computeArea();
                test_circle.computePerimeter();
                test_circle.displayShape();
                test_circle.draw();
                break;
            case "s":
                Square test_square = new Square();
                test_square.readShape();
                test_square.computeArea();
                test_square.computePerimeter();
                test_square.displayShape();
                test_square.draw();
                break;
            case "r":
                Rectangle test_rectangle = new Rectangle();
                test_rectangle.readShape();
                test_rectangle.computeArea();
                test_rectangle.computePerimeter();
                test_rectangle.displayShape();
                test_rectangle.draw();
                break;
            case "x":
                exitFlag  = true;
                break;
            default:
                System.out.println("Invalid command! ");
                break;
        }
        
        scanner.close();
        return exitFlag;
    }
    
    public static void main (String [] args){
        boolean exitFlag = false;
        while (!exitFlag) {
            exitFlag = menu();
        }
    }
    
}