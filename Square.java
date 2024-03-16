
import java.util.Scanner;

class Square extends Shape implements Drawable{
    private float length; 
    
    public Square(){
        this(0);
    };
    
    
    public Square(float l){
        this.length = l;
    };
    
    // To read the shape information from users
    public void readShape(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the length: ");
        float input = scanner.nextFloat();
        this.length = input;
        scanner.close();
   };
   
   // To compute the shape’s area
   public void computeArea(){
       this.area = this.length * this.length ;
   };
   
   // To computer the shape’s perimeter
   public void computePerimeter(){
       this.perimeter = 4 * this.length ;
   };
   
   // To display the area and perimeter of the shape
   public void displayShape(){
       System.out.println(" Area of square = "+this.area);
       System.out.println(" Perimeter of square = "+this.perimeter);
   };
   
   public void draw(){
        float x = 100;
        float y = 100;
        Canvas canvas = Canvas.getCanvas();
        java.awt.Shape rectangle = new java.awt.geom.Rectangle2D.Float(x, y, length, length);
        Object referenceObject = this;
        canvas.draw(referenceObject, "green", rectangle);
   }
}