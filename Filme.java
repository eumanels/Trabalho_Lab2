package trabalhoFinal;

public class Filme {
    private int codFilme;
    private String titulo;
    private char genero;
    private int classificacao;
    private String situacao;

    public Filme(int cod, String titulo, char genero, int classificacao, String situacao) {
        this.codFilme = cod;
        this.titulo = titulo;
        this.genero = genero;
        this.classificacao = classificacao;
        this.situacao = situacao;
    }

    public int getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public int getCodFilme() {
        return codFilme;
    }

    public void setCodFilme(int codFilme) {
        this.codFilme = codFilme;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String toString() {
        return "Código do filme: " + this.codFilme + "\n" +
               "Título: " + this.titulo + "\n" +
               "Gênero: " + this.genero + "\n" +
               "Classificação:" + this.classificacao + "\n" +
               "Situação: " + this.situacao;
    }
}
