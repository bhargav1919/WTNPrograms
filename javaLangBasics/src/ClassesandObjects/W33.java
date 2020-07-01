package ClassesandObjects;
public class W33 
{ 
    double width, height, depth; 
    W33(double w, double h, double d) 
    { 
        width = w; 
        height = h; 
        depth = d; 
    } 
    double volume() 
    { 
        return width * height * depth; 
    } 
    public static void main(String args[]) 
    { 
        W33 s = new W33(10, 20, 15); 
        double vol; 
        vol = s.volume(); 
        System.out.println(" Volume of the box is " + vol); 
    } 
}
