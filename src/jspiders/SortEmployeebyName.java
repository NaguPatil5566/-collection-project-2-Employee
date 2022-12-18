package jspiders;

import java.util.Comparator;



public class SortEmployeebyName  implements Comparator<Employee>{

	@Override
	public int compare(Employee x, Employee y) {
		// TODO Auto-generated method stub
		return x.getName().compareTo(y.getName());
	}
}

