package string;

public class Double_and_triple_spaces {

	public static void main(String[] args) {
		String name ="Rameshwar is  good   boy";
	    System.out.println(name.indexOf("  "));	//if double space is not present in String then it print -1; 
        System.out.println(name.indexOf("   ")); //if triple space is not present in given string then it print -1;
				
	}
	

}
