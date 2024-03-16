
import java.util.Scanner;

class Circle extends Shape implements Drawable{
    private float radius ; 
    
    public Circle(){
        this(0);
    };
    
    
    public Circle(float r){
        this.radius = r;
    };
    
    // To read the shape information from users
    public void readShape(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the radius: ");
        float input = scanner.nextFloat();
        this.radius = input;
        scanner.close();
   };
   
   // To compute the shape’s area
   public void computeArea(){
       this.area = (float) Math.PI * this.radius * this.radius ;
   };
   
   // To computer the shape’s perimeter
   public void computePerimeter(){
       this.perimeter = (float) Math.PI * 2 * this.radius;
   };
   
   // To display the area and perimeter of the shape
   public void displayShape(){
       System.out.println(" Area of circle = "+this.area);
       System.out.println(" Perimeter of circle = "+this.perimeter);
   };
   
   public void draw() {
        float x = 100;
        float y = 100;
        Canvas canvas = Canvas.getCanvas();
        java.awt.Shape circle = new java.awt.geom.Ellipse2D.Float(x - radius, y - radius, radius*2, radius*2);
        Object referenceObject = this;
        canvas.draw(referenceObject, "blue", circle);
    }
    
}