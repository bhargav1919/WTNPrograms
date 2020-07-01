package Overriding;

class Fruit
{
	String name, taste;
	double size;
	void eat()
	{
		System.out.println("Name of the fruit is "+name);
		System.out.println("Taste of the fruit is "+taste);
	}
}

class Apple extends Fruit
{
	void eat()
	{
		System.out.println("Name of the fruit is Apple");
		System.out.println("Taste of the fruit is sweet");
	}
}

class Orange extends Fruit
{
	void eat()
	{
		System.out.println("Name of the fruit is Orange");
		System.out.println("Taste of the fruit is sour");
	}
}

public class fruit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple apple=new Apple();
		Orange orange= new Orange();
		apple.eat();
		orange.eat();
	}
	}