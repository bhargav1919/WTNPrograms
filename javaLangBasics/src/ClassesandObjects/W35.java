package ClassesandObjects;

public class W35 {
	String name;
    double height,weight;
    W35(String s,double w,double h)
    {
        name=s;
        weight=w;
        height=h;
    }
    double BMI()
    {
       
       return ((weight/(height*height)));
    }

  public static void main (String[] args)
 {
  W35 p=new W35("Bhargav",75,1.56);
  System.out.println("The BMI:"+p.BMI());
  
 }

}
