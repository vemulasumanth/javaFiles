package pack_inherit;
import java.util.Scanner;
public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    try
    {
    System.out.println(x/y);
    sc.close();
    }
    catch(Exception e)
    {
    	e.printStackTrace();
    }
	}

}
