package Collection;

public class PersonDetails {
	private String name;
	private String accountNo;
	private int pinnNumber;

	public PersonDetails(String name, String accountNo, int pinnNumber) {
		super();
		this.name = name;
		this.accountNo = accountNo;
		this.pinnNumber = pinnNumber;
	}

	public int getPinnNumber() {
		return pinnNumber;
	}

	public void setPinnNumber(int pinnNumber) {
		this.pinnNumber = pinnNumber;
	}

	public String getName() {
		return name;
	}

	public String getAccountNo() {
		return accountNo;
	}

}
