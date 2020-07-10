public class SistemaBiblio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Livro l1 = new Livro("Java Para Iniciantes","Prof. Isidro", 2020, "Terror", 1,2,true);
		Livro l2 = new Livro("Java Intermediario  ","Prof. Isidro", 2020, "Auto Ajuda", 1, 3, false);
		System.out.println(l1.exibirInfoDoLivro());
		System.out.println(l2.exibirInfoDoLivro());

	}

}