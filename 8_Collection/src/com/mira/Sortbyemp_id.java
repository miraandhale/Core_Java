package com.mira;

import java.util.Comparator;

public class Sortbyemp_id implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1=(Employee) o1;
		Employee e2=(Employee) o2;
		
		if(e1.emp_id==e2.emp_id)
		{
			return 0;
			
		}
		else if(e1.emp_id>e2.emp_id)
		{
			return 1;
		}
		
		else
			{
           return -1;
		}
		
	}

}
