package jspiders;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.List;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Employee e1= new Employee("Abhi",2500);
          Employee e2=new Employee("avi",300000);
          Employee e3=new Employee("jeeva",40000);
          
          Map<String, Employee> map=new LinkedHashMap<String, Employee>();
          //Adding 3 Entries
           map.put(e1.getName(),e1);
           map.put(e2 .getName(),e2);
           map.put(e3.getName(), e3);
           
           
           //converting Map into a set of keys 
           Set<String> keys=map.keySet(); //"abhi","avi","jeeva"
           
           //created an instance of ArrayList
           List<Employee>   list = new ArrayList(); 
           
           //Adding values(employee objects)from map into ArrayList
           for(String key:keys) {
        	   list.add(map.get(key));//Employee obj=map.get(key);//list.add(obj);
           }
           
           //Treaversing employee objects from Arraylist
           for(Employee emp:list) {
        	   System.out.println(emp);
        	   
        	   Scanner scan=new Scanner(System.in);
        	   while(true) {
        		   {
        			   System.out.println("1:Sort By Name\n2:Sort By Salary\n3:Exit");
        			   System.out.println("Enter Choice");
        			   int choice=scan.nextInt();
        			   switch(choice) {
        			   case 1:
        				   Collections.sort(list,new SortEmployeebyName()); 
        				   for(Employee e:list) 
        				   {
        					   System.out.println(e);
        					   
        				   }
        				   
        			   case 2:
        				   Collections.sort(list,new SortEmpioyeeBySalary()); 
        				   for(Employee e:list) 
        				   {
        					   System.out.println(e);
        				   }
        					   break;
        			   case 3:System.out.println("thank you");
        			            System.exit(0);
        			            
        			            default:
        			            	try 
        			            		
        			            	{
        			            		throw new  InvalidchoiceException("Invalid choice");
        			            	}
        			            	catch(Exception e) {
        			            		System.out.println(e.getMessage());
        			            		
        			            	}
        			            	
        					   
      
        				   }
        			   }
        		   }
        	   }
	}
           
}

