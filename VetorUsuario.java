package trabalhoFinal;

public class VetorUsuario {
	private Usuario[] vetUsuario;
    private int qtdUsuario;

    public VetorUsuario(int tamanho) {
        this.vetUsuario = new Usuario[tamanho];
        this.qtdUsuario = 0;
    }

    public Usuario getvetUsuario(int posicao) {
        return this.vetUsuario[posicao];
    }

    public int getqtdUsuario() {
        return qtdUsuario;
    }

    public String toString() {
        if (this.qtdUsuario == 0) {
            return "Nenhum usuário cadastrado.";
        }
        String rst = "";
        for (int i = 0; i < this.qtdUsuario; i++) {
            rst += (i + 1) + " - " + this.vetUsuario[i].toString() + "\n";
        }
        return rst;
    }

    public boolean insereUsuario(Usuario novoUsuario) {
        if (this.qtdUsuario == this.vetUsuario.length) {
            return false;
        } else {
            this.vetUsuario[this.qtdUsuario] = novoUsuario;
            this.qtdUsuario++;
            return true;
        }
    }

}
