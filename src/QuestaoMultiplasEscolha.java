
public class QuestaoMultiplasEscolha extends QuestaSimples {
	private String a;
	private String b;
	private String c;
	private String d;
	public QuestaoMultiplasEscolha(String enunciado, String correto, String a, String b, String c, String d) {
		super(enunciado, correto);
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	public String geta() {
		return a;
	}

	public void seta(String a) {
		this.a = a;
	}

	public String getb() {
		return b;
	}

	public void setb(String b) {
		this.b = b;
	}

	public String getc() {
		return c;
	}

	public void setc(String c) {
		this.c = c;
	}

	public String getd() {
		return d;
	}

	public void setd(String d) {
		this.d = d;
	}

	@Override
	public String toString() {
		return "QuestaoMultiplasEscolha [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", enunciado=" + enunciado
				+ "]";
	}


	
	
	
}
