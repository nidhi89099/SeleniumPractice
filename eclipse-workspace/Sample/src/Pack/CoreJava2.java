package Pack;

import java.util.ArrayList;
import java.util.List;

public class CoreJava2 {

	public static void main(String[] args) {
		// For loop with IF Else condition
		
		int[] a= {1,9,8,12,44,8,3};
		
		for(int i=0;i<a.length;i++)
			if(a[i]%2==0)
		{
			System.out.println(a[i]);
			//break;							//to break the loop
	}
			else
			{
				System.out.println(a[i]+"number is odd");
			}
		
		//ArrayList is a class
		//ArrayList <String>p=new ArrayList <String>();  //memory is allocated when we add the element no need of pre-defined memory
		List <String>p=new ArrayList <String>();  //memory is allocated when we add the element no need of pre-defined memory

		p.add("nidhi");
		p.add("gupta");
		p.add("learning");
		p.add("java");
		System.out.println(p.get(3));
		for(int i=0;i<p.size();i++)
		{
			System.out.println(p.get(i));
		}
		
		System.out.println("*********");
		//Enhanced for loop
		for(String val:p)
		{
			System.out.println(val);
		}
		
		//Item is present in Array list
			System.out.println(p.contains("java"));	
		
			
		
		
			}
}
