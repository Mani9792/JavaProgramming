package interviewPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class G_RemoveArrayDuplicates {

	public static void main(String[] args) {
		
		int arr[] = {2,2,2,3,3,4,4,5,6,7,8,9,9,9,0,0};
		
		ArrayList al3 = new ArrayList(arr.length);
		
		for(int i : arr)
		{
			al3.add(i);
		}
		
		System.out.println(al3);
		
		Set s = new LinkedHashSet(al3);
		
		al3.clear();
		
		al3.addAll(s);
		
		System.out.println("Array w/o duplicates : "+al3);
		
	}

}
