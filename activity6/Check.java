package activity6;

public class Check extends Payment{

	private String name; 
	private String bankID;
	
	public Check(String name, String bankID, float amount) {
		super(amount);
		this.name=name;
		this.bankID=bankID;
		
	}
	
	public void authorized() {
		
	}

}
