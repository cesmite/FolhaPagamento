
public class Agencia {
	public static void mains(String args[]) {
		Carro c1, c2;
		
		c1 = new Carro();
		c1.setCodigo(1234);
		c1.setMarca("Vokis");
		c1.setModelo();
		c1.setCor("Azul");
		c1.setAutomatico(true);
		c1.setAno(1965);
		c1.setKm(435000);
		c1.setPreco(25000);
		
		c2 = new Carro();
		c2.setCodigo(4321);
		c2.setMarca("Fiat");
		c2.setModelo("Marea");
		c2.setCor("Verde");
		c2.setAutomatico(true);
		c2.setKm(80000);
		c2.setAno(1990);
		c2.setPreco(25000);
		
		System.out.println(c1..getCodigo() + " "+c1.getMarca()+" " );
		
		
	})
}
