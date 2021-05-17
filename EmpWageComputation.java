package empWageComputation;

public class EmpWageComputationUC8 {

	public static final	int IS_PART_TIME=2;
	public static final int IS_FULL_TIME=1;
	

static void calculateTotalwage(String company, int EMP_RATE_PER_HOUR, int NUM_OF_WORKING_DAYS, 
		int MAX_HRS_IN_MONTH) {
	
	     int partTimeEmpHr=4;
	    int fullTimeEmpHrs = 8;
    	int empWage=0;
        int totalMonthlyWage=0;
	    int totalWorkingHrs=0;
	    int totalWorkingDays=0;
	   
    	while (totalWorkingDays < NUM_OF_WORKING_DAYS && totalWorkingHrs < MAX_HRS_IN_MONTH) {
        		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        			switch (empCheck) {

            			case 0:
                				System.out.println("Employee is absent");
                				break;

            			case 1:
                				System.out.println("Employee is Present");
                				empWage = Math.multiplyExact(fullTimeEmpHrs, EMP_RATE_PER_HOUR);
                				System.out.println("Employee Daily  Wage is :" + empWage);
                				totalWorkingHrs = totalWorkingHrs + 8;
                				totalWorkingDays = totalWorkingDays++;
                				break;
            			case 2:
                				System.out.println("Employee is Present but Half-Time");
                   			empWage = Math.multiplyExact(partTimeEmpHr, EMP_RATE_PER_HOUR);
    				        System.out.println("Employee's Part-Time Wage is :" + empWage);
                				totalWorkingHrs = totalWorkingHrs + 4;
                				totalWorkingDays = totalWorkingDays++;
                				break;
        				}
        				totalMonthlyWage = totalMonthlyWage + empWage;
    			}
    
    			System.out.println("Company name: "+company);
    			System.out.println("Employee Monthly Wage is :" + totalMonthlyWage);
    
			}

			public static void main(String [] args) {
   			System.out.println("Welcome To Employee wage Computation Program");
		calculateTotalwage("Flipcart", 20, 25, 100);
		calculateTotalwage("Bigbasket", 30, 15, 50);
	}

}

