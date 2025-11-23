
public class Excercise3 {

	public static void main(String[] args)
	{

		int a = 100;
		double b = 2.3;
		double c = -52.2;
		boolean d = true;
		String e = "I am";
		String f = " a student";
		int g = 0;
		char h = '!';

		final double pi = 3.142;
		final String name = "Kabir";

		long x;
		double y;
		String z;

		System.out.println(y = a + b); 

		//1) System.out.println(y = a + d); (Invalid because int can not be added to boolean)  

		System.out.println(z = e + f);

		//System.out.println(y = bc); (Invalid because no sign (multiplication)  has not been assigned)

		//System.out.println(pi = 22/7); (Invalid because pi is a double and constant) 

		//System.out.println(z = name / g); (Invalid because String can not be divided by int)

		//System.out.println(z = c / g); (Invalid because String can not result in int)

		System.out.println(x = 10);

		x = (long) Math.pow(x, 3);
		System.out.println(x);

		System.out.println(z = name + " is" + f + h);

		//System.out.println(y = (name + 10)/(name + h)); (Invalid because string cannot be divided)

		//System.out.println(x = (a + b)/(d + c)); (Invalid because boolean cannot be added to double)


		System.out.println(y = 100.3);									

		System.out.println(y = (y / (a + b)));

		x = (long) Math.pow(x, 2);
		y = (long) Math.pow(y, 2);
		//z = (long) Math.pow(z, 2); (String cannot be long)
		//System.out.println(x = y + z);

		//System.out.println(name = "Is " + f - h); ( "-" is i=undefined for String and Char)

		double j = pi + 1;
		double k = pi + 2;
		double l = pi + 3;
		
		System.out.println(y =(j / k) / l );
		
		System.out.println(y = ((pi + 1) / (pi + 2)) / (pi + 3));
		
		System.out.println(y = -2);
		
		y = (double) Math.pow(y, 2);
		y = (double) Math.pow(y/b, 1/3);
		
		double m = y / y;
		
		System.out.println(y = m);
		
		System.out.println(y = b/g);
		
		System.out.println(z = y + name);
		
		System.out.println(z = name);
		
		System.out.println(z = b/g +z);
		
		System.out.println(y = -2.3);
		
		k = (double) Math.pow(y, 2);
		System.out.println(y = a*k + b*y + c);
		
		
		//System.out.println(y = a*y + b*y + c);
		
		//p = (double) Math.pow(b -c , c - d); (Invalid since boolean cannot be subtracted
		
		
		
		
		
	}






}


