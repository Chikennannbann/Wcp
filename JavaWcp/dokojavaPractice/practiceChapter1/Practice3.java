package practiceChapter1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;

public class Practice3 {
	public static void main(String[] args) throws Exception {
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd");
		ArrayList<Book> books = new ArrayList<>();
		
		Book b1 = new Book();
		b1.setTitle("Java入門");
		b1.setPublishDate(f.parse("2011/10/07"));
		b1.setComment("スッキリわかる");
		Book b2 = new Book();
		b2.setTitle("Python入門");
		b2.setPublishDate(f.parse("2019/06/11"));
		b2.setComment("カレーが食べたくなる");
		Book b3 = new Book();
		b3.setTitle("C言語入門");
		b3.setPublishDate(f.parse("2018/06/21"));
		b3.setComment("ポインタも自由自在");
		
		Collections.sort(books, new TitleComparator());
		
		for (Book b : books) {
			System.out.println(b.getTitle() + " " + f.format(b.getPublishDate()) + " " + b.getComment());
		}
	}

}
