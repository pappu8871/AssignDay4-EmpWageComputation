package empWageComputation;

public class EmpWageComputationUC1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int IS_FULL_TIME = 1;
		//Compitation
		double empCheck = Math.floor(Math.random() * 10) % 2;
		
		if (empCheck == IS_FULL_TIME) {
			System.out.println("Employee is present");
		} else {
			System.out.println("Employee is absent");
	}
}
}
