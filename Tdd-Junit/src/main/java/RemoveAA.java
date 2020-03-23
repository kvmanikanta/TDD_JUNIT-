
public class RemoveAA {
	String ans="";
public String Remove(String s)
{   
	int len=s.length();
	if(len>=2)
	{
		char firstcharacter=s.charAt(0);
		char secondcharacter=s.charAt(1);
		if(firstcharacter=='A' && secondcharacter=='A' && len==2)
		{
			ans=ans+"NULL";
		}
		else if(firstcharacter=='A' && secondcharacter=='A')
		{
			ans=ans+s.substring(2,len);
		}
		else if(firstcharacter=='A' )
		{
			ans=ans+s.substring(1,len);
		}
		else if( secondcharacter=='A')
		{
			ans=ans+firstcharacter+s.substring(2,len);
		}
		else
		{
			ans=ans+s;
		}
	}
	
	
	
	
	return ans;
}
}
