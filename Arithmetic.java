public class Arithmetic{
  public static void main(String[] args){
	  Arithmetic arithmetic=new Arithmetic();
	  System.out.println("2 + 3 = "+arithmetic.addNumbers(2,3));
	  System.out.println("2 + 3 + 5= "+arithmetic.addNumbers(2,3,5));
	  Index.main(null);
  }

  public int addNumbers(int x, int y){
	  return x + y;
  }

  public int addNumbers(int x, int y, int z){
	  return x + y + z;
  }

}