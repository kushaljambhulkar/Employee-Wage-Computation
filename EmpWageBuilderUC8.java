import java.util.*;
	import java.lang.*;
class Company{
	String compName;
	int wagePerHour;
	int workDaysPM;
	int workHrsPM;
	Company(String name, int wage, int wgdayspm, int wghrspm){
		this.compName = name;
		this.wagePerHour=wage;
		this.workDaysPM=wgdayspm;
		this.workHrsPM=wghrspm;
	}
	
}
	public class EmpWage {
		 static final int Fulltime=1;
		 static final int  Parttime=2;
		 Company comp;
		EmpWage(Company A){
			this.comp = A;
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter name of company");
			String companyName = sc.nextLine();
			System.out.println("Enter the wage per hour of company");
			int wph = sc.nextInt();
			System.out.println("Enter the number of work days per month of company");
			int workdaysPM = sc.nextInt();
			System.out.println("Enter monthly work hours of company");
			int workhoursPM = sc.nextInt();
			
			Company comp1 = new Company(companyName, wph, workdaysPM , workhoursPM);
			EmpWage emp = new EmpWage(comp1);             // creating object variable of class EmpWage 
			emp.compute();                        //calling method compute
		}
		public void compute(){
			System.out.println("Welcome to EMPLOYEE WAGE COMPUTAION PROGRAM");
			int TotalMonthlySalary = 0;
			int TotalWorkingHour = 0;
			int day = 0;
			int DayHour=0;
			int WagePerHour=0;
			while(TotalWorkingHour!=this.comp.workHrsPM && day != this.comp.workDaysPM )
			{
				day++;
				int Random = (int)Math.floor(Math.random()*10) % 3; //creating three random numbers 
				int salary = 0;
				switch (Random)   // checking presence with the help of switch case
				{	
				case Fulltime:
					DayHour = 8;
					WagePerHour = this.comp.wagePerHour;
					System.out.print("Employee is full time and ");
					break;
				case Parttime:
					DayHour = 4;
					WagePerHour = this.comp.wagePerHour;
					System.out.print("Employee is part time and ");
					break;

				default :
					DayHour=0;
					System.out.print("Employee is absent and ");
				} 
				salary+= WagePerHour*DayHour;
				System.out.println("his day "+day+" income is Rs."+ salary);
				TotalWorkingHour+= DayHour;
				TotalMonthlySalary+= salary;

			}
			System.out.println("======================****************=======================");
			System.out.println("Employee Company is: "+this.comp.compName);
			System.out.println("Employee's final working hour is  "+TotalWorkingHour); //printing the total working hour

			System.out.println("Employee's monthly salary is Rs. "+TotalMonthlySalary);// printing the total salary
		}
    }