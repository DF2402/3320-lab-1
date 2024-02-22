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
       this.area = (float)  Math.PI * Math.pow(this.radius, 2);
   };
   
   // To computer the shape’s perimeter
   public void computePerimeter(){
       
   };
   
   // To display the area and perimeter of the shape
   public void displayShape(){
       
   };
   
}