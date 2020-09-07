package fiado;

public class Consumidor {
	
	private String nome;
	private int[] fiados;
	private int posicao = 0;
	private String telefone;
	
	public Consumidor(String nome, String telefone) {
		this.nome = nome;
		this.fiados = new int[10];
		this.telefone = telefone;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getTelefone () {
		return this.telefone;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void registrarFiado(int valor) {
		this.fiados[posicao] = valor;
		posicao++;
	}
	
	public int getFiado () {
		int total = 0;
		for (int fiado : fiados) {
			total += fiado;
		}
		return total;
	}
}
