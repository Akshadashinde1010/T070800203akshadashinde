package primitive;

public class Incermentdecrement {
	public static void main(String[]args)
	{
	int a=10;
	int b=20;
	int x=30;
	System.out.println("before value of a and b:"  + a +" "+b);
	++a;
	int c=(++a)+(--a)-(a)+(--a)+a++;
	System.out.println(c);

}
}
