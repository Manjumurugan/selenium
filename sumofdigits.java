package Week1.day1;

public class sumofdigits {

	public static void main(String[] args) {
		int x=123567;
		int sum=0,d;
		while(x>0)
		{
			d=x%10;
				sum=sum+d;
			x=x/10;
		}
System.out.println(sum);
	}

}
