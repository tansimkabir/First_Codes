
public class Excercise2 {

	public static void main(String[] args) {
		
		int x = 100, y = 204, c = -204;
		double z = -23.1;
		boolean a = true;
		boolean b = false;

		if(x<y)
			System.out.println(a);
		else 	
			System.out.println(b);

		if (x>z && a == b )
			System.out.println(a);
		else
			System.out.println(b);

		if (2*c > y)
			System.out.println(a);
		else 
			System.out.println(b);

		//if (x == b)
			//System.out.println(a);
		//else 
			System.out.println(b);

		if (c != y || c == y)
			System.out.println(a);
		else 
			System.out.println(b);
			
		//if (z != y && c == a)
			//System.out.println(a);
		//else 
			System.out.println(b);

		//if (y >= y && a+3 != 2)
			//System.out.println(a);
		//else
			System.out.println(b);
				
		int num;
		
		num = (c!= y || c == y) ? c:y;
		System.out.println(num);
			
			
	}
}
