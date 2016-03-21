class FirstChars{

public static void main(String args[])
{
	String teststr="hello";
	//populateMap(charmap);
	firstChars(teststr);
	
}

private static java.util.HashMap<Integer,Boolean> charmap=new java.util.HashMap<Integer,Boolean>();

public static void firstChars(String str)
{
	HashSet<Integer> setchars=new HashSet<Integer>(36);
	str=str.toLowerCase();
	firstChars(str,0,setchars);
}

private static void firstChars(String str, int indx, Set setchars)
{
	char ch=str.charAt(indx);
	if(str==null || str.length()==0|| indx==str.length()-1)
		return ;//setchars.size()==0?"":(setchars.toString().replaceAll(", ","")).replaceAll(" ", "");
	if (!setchars.contains(ch))
		{
		System.out.print(ch);
		setchars.add(ch);
		}
	firstChars(str,indx+1,setchars);
		
		//return setchars.toString().replaceAll(", ","").replaceAll(" ", "").replaceAll("]","");
}

}
