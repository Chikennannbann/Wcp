package chapter1;

import java.util.Date;
import java.util.Objects;

public class Book implements Comparable<Book>, Cloneable{
	private String title;
	private Date publishDate;
	private String comment;
	
	public int hashCode() {
		return Objects.hash(this.title, this.publishDate, this.comment);
	}
	
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (o == null) {
			return false;
		}
		if (!(o instanceof Book)) {
			return false;
		}
		Book b = (Book)o;
		if (!publishDate.equals(b.publishDate)) {
			return false;
		}
		if (!title.equals(b.title)) {
			return false;
		}
		return true;
	}
	
	public int compareTo(Book o) {
		return this.publishDate.compareTo(o.publishDate);
	}
	
	public Book clone() {
		Book b = new Book();
		b.title = this.title;
		b.publishDate = this.publishDate;
		b.comment = this.comment;
		return b;
	}

}
