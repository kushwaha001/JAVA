package DESIGNER;

public class ShapeFactory {
    public static Shape getShape(String msg)
    {
     Shape s=null;
     if (msg==null){
         return null;
     }
     if (msg.equalsIgnoreCase("square")){
         s=new Square();
     }
     if (msg.equalsIgnoreCase("circle")){
         s=new Circle();
     }
        if (msg.equalsIgnoreCase("rectangle")){
            s=new Rectangle();
        }
        return s;
    }
}
