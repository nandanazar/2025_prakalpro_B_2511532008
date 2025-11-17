package Pekan7_2511532008;

public class Akun {
	
	private String email;
	private String password;
	private String username;
	private int pin;
	
	public void setemail(String email) {
		this.email = email;
	}
	public void setpassword (String password) {
		this.password = password;
	}
	public void setusername (String username) {
		this.username = username;
	}
	public void setpin (int pin) {
		this.pin = pin;
	}
	public String getemail () {
		return email;
	}
	public String getpassword () {
		return password;
	}
	public String getusername () {
		return username;
	}
	
	public int getpin () {
		return pin;
	}
	
	public boolean isEmailValid() {
	return email.indexOf("@") !=-1 && email.indexOf(".") !=1;
	}
	public boolean isPasswordValid() {
		return password.length() >= 8;
	}

} 

	


