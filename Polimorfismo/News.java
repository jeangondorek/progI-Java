//jean carlos canova gondorek
import java.util.Date;
import java.util.Scanner;
public class News extends Post {

	public String source;

	@Override
	public void show() {
		System.out.println("Titulo: " + title);
		System.out.println("Data: " + date);
		System.out.println("Conteudo: " + content);
		System.out.println("Likes: " + likes);
		System.out.println("Dislikes: " + dislikes);
		System.out.println("Fonte: " + source);
	}

}
