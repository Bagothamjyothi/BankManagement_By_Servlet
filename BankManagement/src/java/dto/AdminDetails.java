package dto.org;

public class AdminDetails 
{
    private  String name;
    private long accountnumber;
    private String branch;
    private long phonenumber;
    private String email;
    private String password;
    private String gender;
    private double amount;
    
	public AdminDetails()
	{
	
	}

	public AdminDetails(String name, long accountnumber, String branch, long phonenumber, String email,
			String password, String gender,double amount) {
		super();
		this.name = name;
		this.accountnumber = accountnumber;
		this.branch = branch;
		this.phonenumber = phonenumber;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.amount=amount;
	}

	public String getCustomername() {
		return name;
	}

	public void setCustomername(String customername) {
		this.name = customername;
	}

	public long getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(long accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getAmount() {
		return amount;
	}
    public void setAmount(double amount)
    {
    	this.amount=amount;
    }
	@Override
	public String toString() {
		return "AdminDetails [customername=" + name + ", accountnumber=" + accountnumber + ", branch=" + branch
				+ ", phonenumber=" + phonenumber + ", email=" + email + ", password=" + password + ", gender=" + gender
				+ ",amount="+amount+"]";
	}
   
	
 
}
