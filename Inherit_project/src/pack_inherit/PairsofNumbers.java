package pack_inherit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PairsofNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> s=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
        	s.add(sc.nextInt());
        }
        List<Integer> max=new ArrayList<>();
        int m=s.get(0);
        max.add(s.get(0));
        for(int i=0;i<n-1;i++)
        {
            if(m>s.get(i+1))
            {
               max.add(s.get(i+1));
               m=s.get(i+1);
            }
            else{
                max.add(m);
            }
        }
        int count=0;
        for(int i=0;i<n-1;i++)
        {
        	if(max.get(i+1)<max.get(i))
        	{
        		count++;
        	}
        }
        System.out.println(count);
        
	}
	}
