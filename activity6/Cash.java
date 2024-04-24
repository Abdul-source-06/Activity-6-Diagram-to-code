package activity6;

public class Cash extends Payment{

	private float cashTendered;
	
	public Cash(float cashTendered, float amount) {
		super(amount);
		this.cashTendered=cashTendered;
	}
	
}
