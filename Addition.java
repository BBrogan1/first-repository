import java.util.Scanner;

public class Addition{
     public static void main(String[] args){
	  Scanner input = new Scanner(System.in);
	  int total = 0;
	  System.out.print("Enter numbers (ctrl-z to end):");
	  System.out.println();

	  while(input.hasNext()){
		  total += input.nextInt();
	  }
	  System.out.println("total is:"+total);
  }
}