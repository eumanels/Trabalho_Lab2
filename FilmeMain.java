package trabalhoFinal;

import java.util.Scanner;

public class FilmeMain {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        VetorFilme locadora = new VetorFilme(50); 
        char opcao;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Cadastrar filme");
            System.out.println("2. Mostrar todos os filmes");
            System.out.println("3. Pesquisar filmes por gênero");
            System.out.println("4. Excluir filme pelo título");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scan.next().charAt(0);
            scan.nextLine(); 

            switch (opcao) {
                case '1':
                    cadastrarFilme(locadora);
                    break;
                case '2':
                    System.out.println("\n===== RESULTADO =====");
                    System.out.println(locadora.toString());
                    System.out.println("======================");
                    break;
                case '3':
                    System.out.println("\n===== RESULTADO =====");
                    consultarPorGenero(locadora);
                    System.out.println("======================");
                    break;
                case '4':
                    System.out.println("\n===== RESULTADO =====");
                    excluirFilme(locadora);
                    System.out.println("======================");
                    break;
                case '5':
                    System.out.println("Encerrando programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != '5');
    }

    static void cadastrarFilme(VetorFilme vetFilm) {
        System.out.print("Digite o código do filme: ");
        int cod = scan.nextInt();
        scan.nextLine();

        System.out.print("Digite o título do filme: ");
        String titulo = scan.nextLine();

        System.out.print("Digite o gênero (A – Ação, T – Terror, D – Drama): ");
        char genero = scan.next().toUpperCase().charAt(0);
        
        System.out.print("Digite a classificação");
        int classificacao = scan.nextInt();
        
        System.out.print("Digite a situação (Disponível ou não)");
        String situacao = scan.next();

        Filme filme = new Filme(cod, titulo, genero, classificacao, situacao);
        if (vetFilm.insereFilme(filme)) {
            System.out.println("Filme cadastrado com sucesso :)");
        } else {
            System.out.println("Arquivo de filmes cheio :(");
        }
    }

    static void consultarPorGenero(VetorFilme vetFilm) {
        System.out.print("Digite o gênero (A – Ação, T – Terror, D – Drama): ");
        char genero = scan.next().toUpperCase().charAt(0);
        int total = vetFilm.totalPorGenero(genero);
        System.out.println("Total de filmes do gênero '" + genero + "': " + total);

        for (int i = 0; i < vetFilm.getQtdFilme(); i++) {
            Filme f = vetFilm.getVetFilme(i);
            if (Character.toUpperCase(f.getGenero()) == genero) {
                System.out.println(f.toString());
                System.out.println("--------------------");
            }
        }
    }

    static void excluirFilme(VetorFilme vetFilm) {
        System.out.print("Digite o título do filme a excluir: ");
        String titulo = scan.nextLine();
        if (vetFilm.excluirFilmePorTitulo(titulo)) {
            System.out.println("Filme removido com sucesso.");
        } else {
            System.out.println("Filme não encontrado.");
        }
    }
}
