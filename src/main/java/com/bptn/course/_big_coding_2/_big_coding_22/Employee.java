package com.bptn.course._big_coding_2._big_coding_22;

class Employee {
	   // Instance variable to store salary
	    private int salary;
	   
	   // Instance variable to store hours per day worked by employee
	  // ?  private int hoursPerDay;   

	   // Constructor to set instance variables(salary and hoursPerDay) value 
	    public Employee(int salary, int hoursPerDay) {
	        setSalary(salary);         // Calls the setSalary method to check and set salary
	        setHoursPerDay(hoursPerDay); // Calls the setHoursPerDay method to check and set hours
	    }   

	   // Set method to update salary
	    public void setSalary(int salary) {
	        if (salary < 500) {
	            this.salary = salary + 10;  // Increase salary by 10 if less than 500
	        } else {
	            this.salary = salary;       // Keep salary unchanged if it's 500 or more
	        }
	    }   

	   // Set method to update hoursPerDay
	    public void setHoursPerDay(int hoursPerDay) {
	        // ? this.hoursPerDay = hoursPerDay;
	        if (hoursPerDay > 6) {
	            this.salary += 5;  // Increase salary by 5 if employee works more than 6 hours per day
	        }
	    }   

	   // Get method to return salary
	    public int getSalary() {
	        return salary;
	    }
	   
	}

