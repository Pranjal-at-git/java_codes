package p2;

public class ArmstrongNumber {
	public void isArmStrongFor3Digit(int number)
	{
		int original_nam=number,result=0,remainder=0;
		while(number>0)
		{
			remainder=number%10;
			result+=Math.pow(remainder,3);
			number=number/10;
		}
		if(original_nam == result)
		{
			System.out.println(result+" is an ARMStrong number");
		}else
		{
			System.out.println("the number is not a prime number");
		}
	}
	public static void main(String[] args) {
		ArmstrongNumber aobj=new ArmstrongNumber();
		aobj.isArmStrongFor3Digit(371);
	}

}
