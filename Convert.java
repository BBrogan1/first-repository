import java.util.Scanner;

public class Convert{
public static void main(String[] args){

	Scanner input = new Scanner( System.in );

	double convert;
	int selection;
	double temp;
	double converts;

do{
	System.out.println( "Enter 1 for Fahrenheit to Celsius equivalent " );
	System.out.println( "Enter 2 for Celsius to Fahrenheit equivalent" );
	System.out.println( "3 to Exit\n " );
	System.out.print( "Selection: " );
	selection = input.nextInt();

switch ( selection ){
	case 1:
	System.out.println("Enter temperature: " );
	temp = input.nextInt();
	convert = celsius( temp );
	System.out.printf("%f degrees F = %f degrees C\n",temp,convert );
	break;

	case 2:
	System.out.println("Enter temperature: " );
	temp = input.nextInt();
	converts = fahrenheit( temp );
	System.out.printf("%f degrees C = %f degrees F\n", temp, converts );
	break;

	case 3:
	break;
}
	Index.main(null);
}
}