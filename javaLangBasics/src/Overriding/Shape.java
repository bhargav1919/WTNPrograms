package Overriding;

class Shap 
{
	void draw() 
	{
		System.out.println("Drawing Shape");
	}
	void erase()
	{
		System.out.println("Erasing Shape");
	}
}



class Circle extends Shape
{
	void draw() 
	{
		System.out.println("Drawing Circle");
	}
	void erase()
	{
		System.out.println("Erasing Circle");
	} 
}

class Triangle extends Shape
{
	void draw() 
	{
		System.out.println("Drawing Triangle");
	}
	void erase()
	{
		System.out.println("Erasing Triangle");
	} 
}

class Square extends Shape
{
	void draw() 
	{
		System.out.println("Drawing Square");
	}
	void erase()
	{
		System.out.println("Erasing Square");
	} 
}

public class Shape {

	public static void main(String[] args) {
		Shape c=new Circle();
		Shape t=new Triangle();
		Shape s=new Square();
		c.draw();
		t.draw();
		s.draw();
		c.erase();
		t.erase();
		s.erase();
	}

	private void erase() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Shape");
	}

	private void draw() {
		// TODO Auto-generated method stub
		System.out.println("Erasing Shape");
	}

}
