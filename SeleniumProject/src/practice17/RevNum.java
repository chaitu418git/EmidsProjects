package practice17;

public class RevNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=545;
int checknum=545;
int revnum=0;
while(num>0)
{
	revnum=(revnum*10)+(num%10);
	num=num/10;
}
System.out.println(revnum);
if(checknum==revnum)
{
	System.out.println("num is palindrome");
}
	}

}
