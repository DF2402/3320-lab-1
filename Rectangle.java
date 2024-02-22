class Rectangle extends Shape{
    private float length; 
    private float width; 
    
    public Rectangle(){
        
    };
    
    
    public Rectangle(float l, float w){
        this.length = l;
        this.width = w;
    };
    
    // To read the shape information from users
    public void readShape(){
       
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
   
}