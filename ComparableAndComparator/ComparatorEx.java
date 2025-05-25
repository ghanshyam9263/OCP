package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Stu{
	String name;
	int age;
	public Stu(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void show() {
		System.out.println(name+" "+age);
	}
}

//Comparator for sorting by age
class SortByAge implements Comparator<Stu> {
	@Override
	public int compare(Stu s1, Stu s2) {
		return s1.age - s2.age; 
	}
}

//Comparator for sorting by age
class SortByName implements Comparator<Stu> {
	@Override
	public int compare(Stu s1, Stu s2) {
		return s1.name.compareTo(s2.name); 
	}
}




public class ComparatorEx {
   public static void main(String[] args) {
	   Stu s1 = new Stu("Ram",12);
		Stu s2 = new Stu("Mohan",10);
		Stu s3 = new Stu("Sohan",15);
		Stu s4 = new Stu("Rohan",11);
		
		List<Stu> a=new ArrayList<>();
		a.add(s1);a.add(s2);a.add(s3);a.add(s4);
		
		
//		Collections.sort(a,new SortByAge());
		Collections.sort(a,new SortByName());
		//Error: if SortByAge is not subclass of Comparator Interface
		for(Stu s:a)
			s.show();
		
		Stu[] arr={s1,s2,s3,s4};
		
//		Arrays.sort(arr,new SortByAge());
		Arrays.sort(arr,new SortByName());
		//ClassCastException: if SortByAge is not subclass of Comparator Interface
		for(Stu s:arr)
			s.show();
	}
}

