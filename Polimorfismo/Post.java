//jean carlos canova gondorek
import java.util.Date;
import java.util.Scanner;
public class Post {

	public String title;

	public Date date;

	public String content;

	public int likes;

	public int dislikes;

	public void show() {
		System.out.println("Titulo: " + title);
		System.out.println("Data: " + date);
		System.out.println("Conteudo: " + content);
		System.out.println("Likes: " + likes);
		System.out.println("Dislikes: " + dislikes);

	}

	public void like() {
		likes=likes+1;
	}

	public void dislike() {
		dislikes=dislikes+1;
	}

}
