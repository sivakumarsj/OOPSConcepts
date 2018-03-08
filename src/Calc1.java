
public class Calc1 implements Calc,Scientificcal{
	public void add()
	{
		System.out.println("add value");
	}
	public void sub()
	{
		System.out.println("sub value");
	}
	public void mul()
	{
		System.out.println("mul value");
	}
	public void sin()
	{
		System.out.println("sin value");
	}
	public void cos()
	{
		System.out.println("cos value");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc1 c1=new Calc1();
		c1.add();
		c1.sub();
		c1.mul();
		c1.sin();
		c1.cos();
		

	}

}
