
public class Polymorphism extends Method2Method{
public void show()
{
	super.show();
System.out.println("default show");	
}
public void show(int i)
{
	//this.show();
	System.out.println("The value of i is"+i);
}
public static void main(String args[])
{

	Polymorphism p=new Polymorphism();
	p.show();
	p.show(10);
	
	}

}
