
public class Chapter06 {
	public static void main(String[] args) {
		int val = 2 + 5;
		System.out.println(val);
		
		val++;
		// この場合は前置インクリメントでも同じ
		System.out.println(val);
		
		val *= 5;
		System.out.println(val);
		
		boolean bool = (val == 50);
		System.out.println(bool);
		
		bool = (val < 50) && (val % 10 == 0);
		System.out.println(bool);
		
		
		// Chapter06 2回目
		int val1 = 2 + 5;
		System.out.println(val1);
		
		val1++;
		System.out.println(val1);
		
		val1 *= 5;
		System.out.println(val1);
		
		boolean bool1 = (val1 == 50);
		System.out.println(bool1);
		
		bool1 = (val1 < 50 && val % 10 == 0);
		System.out.println(bool1);
		
		
	}
	
}
