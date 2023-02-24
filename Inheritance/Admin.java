class User{

	private String uname;
	public void setName(String name){ this.uname = name;}
	public String getName(){ return this.uname;}

}

public class Admin extends User{

	public String role(){ return "Admin";}

	public String hello(){
		return "Hello "+ this.role() +", "+this.getName();
	}

	public static void main(String[] args){
		Admin ad = new Admin();
		ad.setName("john doe");
		System.out.println(ad.hello());
	}

}

