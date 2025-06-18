package trabalhoFinal;

public class VetorFilme {
    private Filme[] vetFilme;
    private int qtdFilme;

    public VetorFilme(int tamanho) {
        this.vetFilme = new Filme[tamanho];
        this.qtdFilme = 0;
    }

    public Filme getVetFilme(int posicao) {
        return this.vetFilme[posicao];
    }

    public int getQtdFilme() {
        return qtdFilme;
    }

    public String toString() {
        if (this.qtdFilme == 0) {
            return "Nenhum filme cadastrado.";
        }
        String rst = "";
        for (int i = 0; i < this.qtdFilme; i++) {
            rst += (i + 1) + " - " + this.vetFilme[i].toString() + "\n";
        }
        return rst;
    }

    public boolean insereFilme(Filme novoFilme) {
        if (this.qtdFilme == this.vetFilme.length) {
            return false;
        } else {
            this.vetFilme[this.qtdFilme] = novoFilme;
            this.qtdFilme++;
            return true;
        }
    }

    public int totalPorGenero(char genero) {
        int cont = 0;
        for (int i = 0; i < this.qtdFilme; i++) {
            if (Character.toUpperCase(this.vetFilme[i].getGenero()) == Character.toUpperCase(genero)) {
                cont++;
            }
        }
        return cont;
    }

    public boolean excluirFilmePorTitulo(String titulo) {
        for (int i = 0; i < this.qtdFilme; i++) {
            if (this.vetFilme[i].getTitulo().equalsIgnoreCase(titulo)) {
                for (int j = i; j < this.qtdFilme - 1; j++) {
                    this.vetFilme[j] = this.vetFilme[j + 1];
                }
                this.vetFilme[this.qtdFilme - 1] = null;
                this.qtdFilme--;
                return true;
            }
        }
        return false;
    }
}
