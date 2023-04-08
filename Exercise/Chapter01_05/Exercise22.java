package Exercise.Chapter01_05;

public class Exercise22 
{
	public static void main(String[] args)
	{
		double distance = 40e12;
		double speed = 300000*3.154e7;
		
		double time = distance / speed;		
		
		System.out.printf("빛의 속도로 프록시마 센타우리 별까지 걸리는 시간은 %.17f광년이다.", time);
	}
}
