class Circle extends Shape{
    private float radius ; 
    
    public Circle(){
        
    };
    
    
    public Circle(float r){
        this.radius = r;
    };
    
    // To read the shape information from users
    public void readShape(){
       
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
   
}