
public class Chapter07 {
	public static void main(String[] args) {
		int distance = 7;
		if (distance <= 5) {
			System.out.println(distance + "とても近いです");
		} else if (distance <= 10) {
			System.out.println(distance + "近いです");
		} else if (distance <= 15) {
			System.out.println(distance + "遠いです");
		} else {
			System.out.println(distance + "とても遠いです");
		}
		
		String color = "yellow";
		switch (color) {
		case "red":
			System.out.println("赤信号です");
			break;
		case "yellow":
			System.out.println("黄信号です");
			break;
		case "blue":
			System.out.println("青信号です");
			break;
		default:
			System.out.println("信号の色ではありません");
		}
		
		// Chapter07 2回目
		int distance1 = 30;
		if (distance1 <= 5) {
			System.out.println("とても近いです");
		} else if (distance1 <= 10) {
			System.out.println("近いです");
		} else if (distance1 <= 15) {
			System.out.println("遠いです");
		} else {
			System.out.println("とても遠いです");
		}
		
		String color1 = "red";
		switch (color1) {
		case "red":
			System.out.println("赤信号です");
			break;
		case "yellow":
			System.out.println("黄信号です");
			break;
		case "blue":
			System.out.println("青信号です");
			break;
		default:
			System.out.println("信号の色ではありません");
		}
	}
	

}
