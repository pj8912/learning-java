class Setget{
	
	private String uname;
	public void setName(String name){ this.uname = name;}
	public String getName(){ return this.uname;}
	public static void main(String[] args){
	
		//create object
		Setget sg = new Setget();
		// setname
		sg.setName("JohnDoe");
		//print getname
		System.out.println(sg.getName());

	}
}	
