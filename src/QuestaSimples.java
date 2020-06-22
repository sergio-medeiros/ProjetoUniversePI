
public class QuestaSimples {
	protected String enunciado;
	protected String correto;
	public QuestaSimples(String enunciado, String correto) {
		super();
		this.enunciado = enunciado;
		this.correto = correto;
	}
	public String getEnunciado() {
		return enunciado;
	}
	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}
	public String getcorreto() {
		return correto;
	}
	public void setcorreto(String correto) {
		this.correto = correto;
	}
	
	public String aplicarQuestao(String questao) {
		return enunciado;
	}
	public boolean corrigir(String resposta) {
		return resposta.equals(correto);
	}
	@Override
	public String toString() {
		return enunciado;
	}
	
}
