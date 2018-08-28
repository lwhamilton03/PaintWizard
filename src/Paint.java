
public class Paint {

	
	
	private String name; 
	private int amount;
	private int coverage; 
	private double price;

		public String getName() 
		{
		return name;
		}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getCoverage() {
		return coverage;
	}
	

	public void setCoverage(int coverage) {
		this.coverage = coverage;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

		 
		
		
		
		
		public Paint(String name, int amount, int coverage, double price)
		{
			this.name = name;
			this.amount = amount;
			this.coverage = coverage; 
			this.price = price; 
		}
		
}
