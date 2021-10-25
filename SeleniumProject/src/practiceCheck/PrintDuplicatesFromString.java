package practiceCheck;

public class PrintDuplicatesFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ghjklasdfghjklpoi ghj";
		char[] strarr=s.toCharArray();
		int count=0;
		for(int i=0;i<strarr.length;i++)
		{
		count=1;
		for(int j=i+1;j<strarr.length;j++)
		{
			if(strarr[i]==strarr[j] && strarr[i]!=' ')
			{
				count++;
				strarr[j]='0';
			}
		}
		if(count>1 && strarr[i]!='0')
		System.out.println("DUplicates are"+strarr[i]);
		if(count==1 && strarr[i]!='0' && strarr[i]!=' ')
			System.out.println("uniques"+strarr[i]);
		}

	}

}
