
import java.util.ArrayList;

public class Picture{
    private ArrayList<Shape> shapes = new ArrayList<>();
    
    void addShape(Shape s) {
        shapes.add(s);
    }
    void computeShape() {
        for ( Shape shape : shapes ){
            shape.computeArea();
            shape.computePerimeter();
        }
    }
    
    public void listAllShapeTypes(){
        for ( Shape shape : shapes ){
            shape.displayShape();
        }
    }
    
    public void listSingleShapeType(String className){
        for ( Shape shape : shapes ){
            String thisClassName = shape.getClass().getSimpleName();
            if (thisClassName.equals(className)) shape.displayShape();
        }
    }

}