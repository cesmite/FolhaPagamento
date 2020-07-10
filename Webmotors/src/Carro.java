
public class Carro {
	private int codigo;
	private String marca;
	private int ano;
	private String modelo;
	private int cor;
	private int km;
	private boolean automatico;
	private float preco;
	
	
	public Carro(int codigo, String marca, String modelo, int ano, String cor, int km, boolean aut, float preco) {
		
	}
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getCor() {
		return cor;
	}
	public void setCor(int cor) {
		this.cor = cor;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	public boolean isAutomatico() {
		return automatico;
	}
	public void setAutomatico(boolean automatico) {
		this.automatico = automatico;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	//modificador tipo_retorno nome (listParametros)

