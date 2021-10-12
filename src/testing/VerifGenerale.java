package testing;

public class VerifGenerale {
public boolean verifString(String ch)
{
	return !ch.isEmpty();
	/*
	 * if(!ch.isEmpty)
	 * return true
	 * else
	 * return false;
	 */
	}
public void conversible(String a)
{
	try
	{
		Double.parseDouble(a);
	}
	catch(NumberFormatException ex)
	{
		System.out.println(ex);
	}
}
	public boolean positif(int w)
	{
		return w>0;
	}
}


