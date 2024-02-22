class Square extends Shape{
    private float length; 
    private float width; 
    
    public Square(){
        
    };
    
    
    public Square(float l){
        this.length = l;
    };
    
    // To read the shape information from users
    public void readShape(){
       
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
   
}