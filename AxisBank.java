package assignments.week3.day1;

public class AxisBank extends BankInfo {
	
	@Override
	public void deposit() {
		
		System.out.println("Child Deposit is : 800");
	}

	public static void main(String[] args) {
		
		AxisBank Ab = new AxisBank();
		Ab.saving();
		Ab.deposit();
		Ab.fixed();

	}

}
