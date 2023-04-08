package Chapter10;

public class TryCatchRuntimeExceptionExample {
	public static void main(String[] args) {		
		String data1;
		String data2;		
		try {
			data1 = args[0];
			data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);		
			int result = value1 + value2;
			System.out.println(result);
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("변환 불가");
		} catch (Exception e) {
			e.printStackTrace();			
		} finally {
			System.out.println("다시 실행");
		}		
	}
}
