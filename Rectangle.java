
import java.util.Scanner;

class Rectangle extends Shape implements Drawable{
    private float length; 
    private float width; 
    
    public Rectangle() {
        this(0,0);
    };
    
    
    public Rectangle(float l, float w){
        this.length = l;
        this.width = w;
    };
    
    // To read the shape information from users
    public void readShape(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the length: ");
        float input = scanner.nextFloat();
        this.length = input;
        System.out.println("Please input the width: ");
        input = scanner.nextFloat();
        this.width = input;
        scanner.close();
       
   };
   
   // To compute the shape’s area
   public void computeArea(){
       this.area = this.length * this.width ;
   };
   
   // To computer the shape’s perimeter
   public void computePerimeter(){
       this.perimeter = 2 * (this.length + this.width);
   };
   
   // To display the area and perimeter of the shape
   public void displayShape(){
       System.out.println(" Area of rectangle = "+this.area);
       System.out.println(" Perimeter of rectangle = "+this.perimeter);
   };
   
   public void draw() {
        float x = 100;
        float y = 100;
        Canvas canvas = Canvas.getCanvas();
        java.awt.Shape rectangle = new java.awt.geom.Rectangle2D.Float(x, y, length, width);
        Object referenceObject = this;
        canvas.draw(referenceObject, "red", rectangle);
    }
}