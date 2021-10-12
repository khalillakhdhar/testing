package testing;

import java.util.Arrays;
import java.util.List;

public class VerifTest {
	List<Integer> shorrtmonth=Arrays.asList(4,6,9,11);
public boolean verifJour(int j)
{
return j>0 && j<=31;	
}
public boolean verifMois(int m)
{
return m>0 && m<=12;	
}
public boolean evaluation(int j,int m)
{
	if(verifJour(j)&&verifMois(m))
	{
	if(shorrtmonth.contains(m))
	{
		if(j<31)
			return true;
		else return false;
	}
	else if(m==2)
	{
		if(j<=29)
			return true;
		else 
			return false;
	}
	else 
		return true;
	}
	else 
		return false;
}
public boolean verifTeste(String tst)
{
if(tst.equals("teste+")||(tst.equals("teste-")))
{
return true;
}
else return false;
}
}
