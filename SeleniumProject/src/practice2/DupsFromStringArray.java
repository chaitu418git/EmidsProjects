package practice2;

import java.util.HashSet;

public class DupsFromStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] strarray= {"java", "C", "C++", "Sql","java"};
boolean flag=false;
for(int i=0;i<strarray.length;i++)
{
	for(int j=i+1;j<strarray.length;j++)
	{
	if(strarray[i]==strarray[j])
	{
		System.out.println(strarray[i]);
		flag=true;
	}
	}
}
if(flag==false)
{
	System.out.println("no duplicates");
}
//Approach 2
HashSet<String> hs=new HashSet<String>();
for(String l:strarray)
{
	if(hs.add(l)==false)
	{
		System.out.println(l);
		flag=true;
	}
	//System.out.println(hs.add(l));
}
	}

}
