
public class Excercise5 {

	public static void main(String[] args) {

		String month = "";
		int daysinmonth = 0;
		int month_num = 10;

		switch (month_num)
		{
		case 1: 
			month = "January"; 
			daysinmonth = 31;
			break;
		case 2:
			month = "February";
			daysinmonth = 29; //Given that it is 2012...
			break;
		case 3: 
			month = "March";
			daysinmonth = 31;
			break;
		case 4:
			month = "April";
			daysinmonth = 30;
			break;
		case 5:
			month = "May";
			daysinmonth = 31;
			break;
		case 6:
			month = "June";
			daysinmonth = 30;
			break;
		case 7:
			month = "July";
			daysinmonth = 31;
			break;
		case 8:
			month = "August";
			daysinmonth = 31;
			break;
		case 9:
			month = "September";
			daysinmonth = 30;
			break;
		case 10:
			month = "October";
			daysinmonth = 31;
			break;
		case 11:
			month = "November";
			daysinmonth = 30;
			break;
		case 12:
			month = "December";
			daysinmonth = 31;
			break;
		default: 
			daysinmonth = -1;
			month = "(unknown)";
			break;
		}
		System.out.println("Days in month " + month + " = " + daysinmonth);

		
		
		
		
	/*	int month_num = 1;
		int daysinmonth = 0;
				
		switch (month_num)
		{
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
		daysinmonth = 31;
		            	break;
		case 2:
		            	daysinmonth = 29; //Given that it is 2012...
		            	break;     	
		case 4: case 6: case 9: case 11:
		            	daysinmonth = 30;
		            	break;    
		default: 
		daysinmonth = -1;
		break;
*/
	
	}

}


