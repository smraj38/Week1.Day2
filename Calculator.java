package WEEK1.DAY2;

public class Calculator {
	
	public int add(int x, int y, int z) {
		int c=x+y+z;
		return c;
	}
	
	public int sub(int x, int y) {
		int c=x-y;
		return c;
		
	}
	public double mul(double x, double y) {
	double c=x*y;
	return  c;
	}

	public float div(float x, float y) {
		float c=x*y;
		return  c;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator cobj = new Calculator();
		
		int r = cobj.add(1, 2, 3);
		System.out.println("addition of x,y,z is" + r);
		
		int r1 = cobj.sub(10, 5);
		System.out.println("Difference of x,y is" + r1);
		
		double r2 = cobj.mul(10.56d, 3.45678d);
		System.out.println("Multiply of x,y is" + r2);
		

		float r3 = cobj.div(10.5f, 3.14f);
		System.out.println("Divisible of x,y is" + r3);
		
		
	}

}
