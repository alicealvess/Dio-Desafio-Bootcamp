import java.time.LocalDate;

public class Mentoria extends Conteudo{
	

	private LocalDate data;
	private String titulo;
	private String descricao;
	
	@Override
	public double calcularxp() {
		return XP_PADRAO + 20d;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Mentoria [data=" + data + ", titulo=" + titulo + ", descricao=" + descricao + "]";
	}
	

	
	
}