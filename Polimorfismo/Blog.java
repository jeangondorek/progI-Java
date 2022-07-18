//jean carlos canova gondorek
import java.util.Date;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
public class Blog {

	public Post[] posts;

	public void showAll() {
		Post posts = new Post();
		posts.show();
	}

	public void readData() {
		Scanner scanner = new Scanner(System.in);
		int opt;
		int x=0;
		x++;
		Post post = new Post();
		News news = new News();
		ProductReview product = new ProductReview();

		System.out.println("Digite o titulo do post: ");
		post.title = scanner.nextLine();
		try {
      Scanner s = new Scanner(System.in);
      System.out.println("Digite uma data: ");
			String dataRecebida = s.nextLine();
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			Date dt = df.parse(dataRecebida);
			post.date = dt;
  	}
		catch (Exception ex) {
      ex.printStackTrace();
    }
		System.out.println("Conteudo da postagem.");
		post.content = scanner.nextLine();
		int likedis=2;
		System.out.println("Para curtir digite 1, para descurtir 0.");
		likedis = scanner.nextInt();
		if (likedis == 1){
			post.like();
		}
		else if(likedis==0){
			post.dislike();
		}
		else{
			System.out.println("Nenhuma ação realizada.");
		}
	}

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int opt=1;
		while(opt!=0){
		System.out.println("\n\n\n\n\t\tMENU\t\t");
		System.out.println("\tDigite 1 para ler novo post.");
		System.out.println("\tDigite 2 mostrar todos os posts.");
		System.out.println("\tDigite 3 para noticia.");
		System.out.println("\tDigite 4 para review de produtos.");
		System.out.println("\tDigite 0 para sair.");
		System.out.println("\t");
		opt = scanner.nextInt();
		System.out.println("\n\n\n\n");
			switch(opt){
				case 1:{
					Blog blog = new Blog();
					blog.readData();
					break;
				}
				case 2:{
					Blog blog = new Blog();
					blog.showAll();
					break;
				}
				case 3:{
					Blog blog = new Blog();
					blog.readData();
					News news = new News();
					System.out.println("Fonte da noticia.");
					news.source = scanner.next();
					news.show();
					break;
				}
				case 4:{
					Blog blog = new Blog();
					blog.readData();
					ProductReview product = new ProductReview();
					System.out.println("Marca do produto.");
					product.brand = scanner.next();
					System.out.println("Estrelas do produto.");
					product.stars = scanner.nextInt();
					product.show();
					break;
				}
				case 0:{
					System.out.println("SAINDO");
					break;
				}
				default:{
					System.out.println("ERRO!");
					break;
				}
			}
			}
		}

}
