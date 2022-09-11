public class EmpWageBuilderUC7 {
 

    public static void main( String[] args ){
		int empRatePH = 20;
    	int empHrs = 0;
    	int empWage = 0;
    	int totalempWage = 0;
		int totalHrs = 0;
		int day = 1;
    	while(day <= 20 && totalHrs<=100) {
		day++;
    	int empcheck = (int) Math.floor(Math.random() * 10)% 3;
    	switch (empcheck) {
    	case 1:
    		empHrs = 4;
    		break;
    	case 2:
    		empHrs = 8;
    		break;
    	default:
    		empHrs = 0;
    	}
    	totalHrs = totalHrs+empHrs;
    	
    	empWage = empHrs*empRatePH;
    	totalempWage += empWage;
   
    	System.out.println("Employee Wage:" + empWage);
    }
    System.out.println("Toatl Employee Wage: "+ totalempWage);
          

      
    }
}
