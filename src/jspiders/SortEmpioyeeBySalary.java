package jspiders;

import java.util.Comparator;

public class SortEmpioyeeBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee x, Employee y) {
		// TODO Auto-generated method stub
		Double i=x.getSalary();
		Double j=y.getSalary();
		return i.compareTo(j);
	}

}
// if return type of getsalary() is non-primitive Double use
//return x.getSalary().compareTo(y.getsalary));
//x->object to be inserted & y-> already existing object