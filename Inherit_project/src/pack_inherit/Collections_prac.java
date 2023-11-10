package pack_inherit;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.ListIterator;
public class Collections_prac {

public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc=new Scanner(System.in);
		Collections_prac d=new Collections_prac();
		ArrayList<String> c=new ArrayList<>();
		for(int i=0;i<3;i++)
		{
			c.add(sc.nextLine());
		}
		d.display(c);
		
}
	void display(ArrayList<String> b)
	{
		ListIterator<String> s=b.listIterator();
		while(s.hasNext())
		{
			System.out.println(s.next());
		}
	}
}

