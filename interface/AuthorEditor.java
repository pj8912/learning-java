class User{
	private String uname;
	public void setName(String name){ this.uname = name;}
	public String getName(){ return this.uname;}
}


interface Author{
	public void setAuthor(String[] arr);
	public String[] getAuthor();
}

interface Editor{
	public void setEditor(String[] arr);
	public String[] getEditor();
}


public class AuthorEditor extends User implements Author, Editor{
	private String[] author;
	private String[] editor;

	public void setAuthor(String[] arr){ this.author = arr;}
	public String[] getAuthor(){ return this.author;} 
	    
	public void setEditor(String[] arr){this.editor = arr;}
	public String[] getEditor(){ return this.editor;}



	public static String[] array_merge(String[] ar1, String[] ar2){

                        String[] merged = new String[ar1.length+ar2.length];
                        int index =0;

                        for(int i=0; i < ar1.length; i++){
                                merged[index++] = ar1[i];
                        }

                        for(int i=0; i < ar2.length; i++){

                                merged[index++]  = ar2[i];
                        }

                        return merged;


                }




	public static void main(String[] args){
	
		AuthorEditor user1 = new AuthorEditor();
		user1.setName("john doe");
		String username = user1.getName();

		String[] sets1 = {"write text,", "add punctuation,"};
		String[] sets2 = {"edit text,", "edit punctuation"};
		user1.setAuthor(sets1);
		user1.setEditor(sets2);



		String[] p = array_merge(user1.getAuthor() , user1.getEditor());
		System.out.println(username + " has the following privileges: ");
		for(int i=0; i < p.length; i++){
			System.out.println(p[i]);
		}




	}
}

