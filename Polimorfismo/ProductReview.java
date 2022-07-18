//jean carlos canova gondorek
import java.util.Date;
import java.util.Scanner;
public class ProductReview extends Post implements Evaluable {

	public String brand;

	public int stars;

	/**
	 * @see Evaluable#evaluate(int)
	 */
	public void evaluate(int value) {

	}
		@Override
		public void show() {
			System.out.println("Titulo: " + title);
			System.out.println("Data: " + date);
			System.out.println("Conteudo: " + content);
			System.out.println("Likes: " + likes);
			System.out.println("Dislikes: " + dislikes);
			System.out.println("Marca: " + brand);
			System.out.println("Estrelas de avaliacao: " + stars);

		}

	}
