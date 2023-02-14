//package test1;
//
//public class HourlyEmployee extends Employees
//{
//	public HourlyEmployee(String name, float rate, float hours)
//	{
//		super(name,rate,hours);
//	}
//	
//	@Override
//	public float getPay()
//	{
//		float paying = 0;
//		if(hours > 40) 
//		{
//			paying = (float) ((40 * rate) + ((hours - 40) * (rate * 1.5)));
//		}
//		else
//		{
//			paying = rate * hours;
//		}
//		return paying;
//		
//	}
//}
