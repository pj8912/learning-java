class Cons{

	private String uname;
	public Cons(String name){
	
		this.uname = name;
	}
	public String getName(){ return this.uname;}

	public static void main(String[] args){
	
		Cons con = new Cons("JohnDoe");
		System.out.println(con.getName());

	}
}
