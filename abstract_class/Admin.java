abstract class User{
	public abstract String role();
}



public class Admin extends User{
	public String role(){ return "Admin";}

	public static void main(String[] args){
		Admin a = new Admin();
		System.out.println(a.role());
	}
}
		
		

