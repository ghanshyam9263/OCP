package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
	private String name;
	private int age;
	public Student(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void show() {
		System.out.println(name+" "+age);
	}
	@Override
	public int compareTo(Student o) {
		//return this.age-o.age; //Increasing
		//return o.age-this.age; //Decreasing
		
		return this.name.compareTo(o.name);
	}	
}


public class ComparableEX {
   public static void main(String[] args) {
	   Student s1 = new Student("Ram",12);
		Student s2 = new Student("Mohan",10);
		Student s3 = new Student("Sohan",15);
		Student s4 = new Student("Rohan",11);
		
		List<Student> a=new ArrayList<>();
		a.add(s1);a.add(s2);a.add(s3);a.add(s4);
		
		Collections.sort(a);
		//Error: if Student is not subclass of Comparable Interface
		for(Student s:a)
			s.show();
		
		Student[] arr={s1,s2,s3,s4};
		
		Arrays.sort(arr);
		//ClassCastException: if Student is not subclass of Comparable Interface
		for(Student s:arr)
			s.show();
	}
}

