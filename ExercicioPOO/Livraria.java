package ExercicioPOO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Livraria {
    static Integer contId = 0;

    public static void main(String[] args) {
        List<AlbumDeMusica> listaAlbunsDeMusica = new ArrayList();
        List<Brinquedo> listaBrinquedos = new ArrayList();
        List<Filme> listaFilmes = new ArrayList();
        List<Jogo> listaJogos = new ArrayList();
        List<Livro> listaLivros = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        Double dinheiroEmCaixaDaEmpresa = 1000.0;


        int opcaoMenu;
        do {
            System.out.println();
            System.out.println("|-------------------------|");
            System.out.println("|  Bem vindos a Livraria  |");
            System.out.println("|-------------------------|");
            System.out.println("Escolha uma opção do menu: ");
            System.out.println("01 - Cadastrar produto");
            System.out.println("02 - Editar produto cadastrado");
            System.out.println("03 - Visualizar produtos");
            System.out.println("04 - Visualizar listagem completa de produtos em estoque (geral)");
            System.out.println("05 - Visualizar listagem de produtos em estoque (por categoria)");
            System.out.println("06 - Venda");
            System.out.println("07 - Saldo em Caixa");
            System.out.println("08 - Sair");
            System.out.println("Digite a opção:");
            opcaoMenu = scanner.nextInt();
            int opcaoCategoria;
            Iterator ContAux01;
            AlbumDeMusica AuxMusica;
            Brinquedo AuxBrinquedo;
            Filme AuxFilme;
            Jogo AuxJogo;
            Livro AuxLivro;
            switch (opcaoMenu) {
                case 1:
                    System.out.println("Qual produto deseja cadastrar?");
                    System.out.println("1 - Livro");
                    System.out.println("2 - Jogos");
                    System.out.println("3 - Filme");
                    System.out.println("4 - Albuns De Musica");
                    System.out.println("5 - Brinquedos");
                    System.out.println("Digite a opção:");
                    opcaoCategoria = scanner.nextInt();
                    switch (opcaoCategoria) {
                        case 1:
                            AuxLivro = new Livro();
                            AuxLivro.setId(contId + 1);
                            contId = contId + 1;
                            System.out.println("Qual o nome do livro?");
                            scanner.nextLine();
                            AuxLivro.setNome(scanner.nextLine());
                            System.out.println("Qual o preço do livro?");
                            AuxLivro.setPreco(scanner.nextDouble());
                            System.out.println("Qual o genero do livro?");
                            scanner.nextLine();
                            AuxLivro.setGenero(scanner.nextLine());
                            System.out.println("Nome do autor?");
                            AuxLivro.setEscritor(scanner.nextLine());
                            System.out.println("Qual a editora?");
                            AuxLivro.setEditora(scanner.nextLine());
                            listaLivros.add(AuxLivro);
                            System.out.println("PRODUTO CADASTRADO!!!");
                            System.out.println();
                            continue;
                        case 2:
                            AuxJogo = new Jogo();
                            AuxJogo.setId(contId + 1);
                            contId = contId + 1;
                            System.out.println("Nome do jogo?");
                            scanner.nextLine();
                            AuxJogo.setNome(scanner.nextLine());
                            System.out.println("Preço?");
                            AuxJogo.setPreco(scanner.nextDouble());
                            System.out.println("Qual o estudio?");
                            scanner.nextLine();
                            AuxJogo.setEstudio(scanner.nextLine());
                            System.out.println("Qual a distribudora?");
                            AuxJogo.setDistribuidora(scanner.nextLine());
                            System.out.println("Qual o genero?");
                            AuxJogo.setGenero(scanner.nextLine());
                            listaJogos.add(AuxJogo);
                            System.out.println("PRODUTO CADASTRADO!!!");
                            System.out.println();
                            continue;
                        case 3:
                            Filme filme = new Filme();
                            filme.setId(contId + 1);
                            contId = contId + 1;
                            System.out.println("Nome do filme?");
                            scanner.nextLine();
                            filme.setNome(scanner.nextLine());
                            System.out.println("Preço?");
                            filme.setPreco(scanner.nextDouble());
                            System.out.println("Estudio do filme?");
                            scanner.nextLine();
                            filme.setEstudio(scanner.nextLine());
                            System.out.println("Nome do diretor?");
                            filme.setDiretor(scanner.nextLine());
                            System.out.println("Qual o genero?");
                            filme.setGenero(scanner.nextLine());
                            System.out.println("Produtor do filme?");
                            filme.setProdutor(scanner.nextLine());
                            listaFilmes.add(filme);
                            System.out.println("PRODUTO CADASTRADO!!!");
                            System.out.println();
                            continue;

                        case 4:
                            AlbumDeMusica musica = new AlbumDeMusica();
                            musica.setId(contId + 1);
                            contId = contId + 1;
                            System.out.println("Nome da banda ou cantor?");
                            scanner.nextLine();
                            musica.setMusicosBanda(scanner.nextLine());
                            System.out.println("O nome do Album?");
                            musica.setNome(scanner.nextLine());
                            System.out.println("Qual o preço?");
                            musica.setPreco(scanner.nextDouble());
                            System.out.println("Qual o genero musical?");
                            scanner.nextLine();
                            musica.setGenero(scanner.nextLine());
                            System.out.println("Qual o selo da música?");
                            musica.setSelo(scanner.nextLine());
                            listaAlbunsDeMusica.add(musica);
                            System.out.println("PRODUTO CADASTRADO!!!");
                            System.out.println();
                            continue;
                        case 5:
                            Brinquedo brinquedo = new Brinquedo();
                            brinquedo.setId(contId + 1);
                            contId = contId + 1;
                            System.out.println("Nome do brinquedo?");
                            scanner.nextLine();
                            brinquedo.setNome(scanner.nextLine());
                            System.out.println("Preço?");
                            brinquedo.setPreco(scanner.nextDouble());
                            System.out.println("Tipo?");
                            scanner.nextLine();
                            brinquedo.setTipo(scanner.nextLine());
                            listaBrinquedos.add(brinquedo);
                            System.out.println("PRODUTO CADASTRADO!!!");
                            System.out.println();
                            continue;

                        default:
                            System.out.println("Operação Inválida!");
                            continue;
                    }
                case 2:
                    System.out.println("Qual produto deseja editar?");
                    System.out.println("1 - Livro");
                    System.out.println("2 - Jogos");
                    System.out.println("3 - Filme");
                    System.out.println("4 - Albuns De Musica");
                    System.out.println("5 - Brinquedos");
                    System.out.println("Digite a opção:");
                    opcaoCategoria = scanner.nextInt();
                    String nomeProdutoAlterar;
                    Double valorAtualizado;
                    Iterator ContAux00;
                    switch (opcaoCategoria) {
                        case 1:
                            System.out.println("Lista de Albuns de Música disponíveis em estoque");
                            ContAux00 = listaAlbunsDeMusica.iterator();


                            while (ContAux00.hasNext()) {
                                AuxMusica = (AlbumDeMusica) ContAux00.next();
                                System.out.println("Id: " + AuxMusica.getId());
                                System.out.println("Nome: " + AuxMusica.getNome());
                                System.out.println("Preço: " + AuxMusica.getPreco());
                                System.out.println("Músicos da Banda: " + AuxMusica.getMusicosBanda());
                                System.out.println("Gênero: " + AuxMusica.getGenero());
                                System.out.println("Selo: " + AuxMusica.getSelo());
                                System.out.println();
                            }

                            System.out.println("Digite o nome do Álbum de Músicas que deseja alterar dados:");
                            scanner.nextLine();
                            nomeProdutoAlterar = scanner.nextLine();
                            System.out.println("Digite o valor preço que substituirá o atual:");
                            valorAtualizado = scanner.nextDouble();
                            ContAux00 = listaAlbunsDeMusica.iterator();

                            while (ContAux00.hasNext()) {
                                AuxMusica = (AlbumDeMusica) ContAux00.next();
                                if (nomeProdutoAlterar.equals(AuxMusica.getNome())) {
                                    AuxMusica.setPreco(valorAtualizado);
                                    System.out.println(AuxMusica.getPreco());
                                }
                            }

                            System.out.println("Reimpressão de Lista de Álbum de Música em estoque");
                            ContAux00 = listaAlbunsDeMusica.iterator();

                            while (ContAux00.hasNext()) {
                                AuxMusica = (AlbumDeMusica) ContAux00.next();
                                System.out.println("Id: " + AuxMusica.getId());
                                System.out.println("Nome: " + AuxMusica.getNome());
                                System.out.println("Preço: " + AuxMusica.getPreco());
                                System.out.println("Músicos da Banda: " + AuxMusica.getMusicosBanda());
                                System.out.println("Gênero: " + AuxMusica.getGenero());
                                System.out.println("Selo: " + AuxMusica.getSelo());
                                System.out.println();
                            }

                            System.out.println("Dado do Produto alterado com sucesso!");
                            continue;
                        case 2:
                            System.out.println("Lista de Brinquedos disponíveis em estoque");
                            ContAux00 = listaBrinquedos.iterator();


                            while (ContAux00.hasNext()) {
                                AuxBrinquedo = (Brinquedo) ContAux00.next();
                                System.out.println("Id: " + AuxBrinquedo.getId());
                                System.out.println("Nome: " + AuxBrinquedo.getNome());
                                System.out.println("Preço: " + AuxBrinquedo.getPreco());
                                System.out.println("Tipo: " + AuxBrinquedo.getTipo());
                                System.out.println();
                            }

                            System.out.println("Digite o nome do Brinquedo que deseja alterar dados:");
                            scanner.nextLine();
                            nomeProdutoAlterar = scanner.nextLine();
                            System.out.println("Digite o valor preço que substituirá o atual:");
                            valorAtualizado = scanner.nextDouble();
                            ContAux00 = listaBrinquedos.iterator();

                            while (ContAux00.hasNext()) {
                                AuxBrinquedo = (Brinquedo) ContAux00.next();
                                if (nomeProdutoAlterar.equals(AuxBrinquedo.getNome())) {
                                    AuxBrinquedo.setPreco(valorAtualizado);
                                    System.out.println(AuxBrinquedo.getPreco());
                                }
                            }

                            System.out.println("Reimpressão de Lista de Brinquedos em estoque");
                            ContAux00 = listaBrinquedos.iterator();

                            while (ContAux00.hasNext()) {
                                AuxBrinquedo = (Brinquedo) ContAux00.next();
                                System.out.println("Id: " + AuxBrinquedo.getId());
                                System.out.println("Nome: " + AuxBrinquedo.getNome());
                                System.out.println("Preço: " + AuxBrinquedo.getPreco());
                                System.out.println("Tipo: " + AuxBrinquedo.getTipo());
                                System.out.println();
                            }

                            System.out.println("Dado do Produto alterado com sucesso!");
                            continue;
                        case 3:
                            System.out.println("Lista de Filmes disponíveis em estoque");
                            ContAux00 = listaFilmes.iterator();


                            while (ContAux00.hasNext()) {
                                AuxFilme = (Filme) ContAux00.next();
                                System.out.println("Id: " + AuxFilme.getId());
                                System.out.println("Nome: " + AuxFilme.getNome());
                                System.out.println("Preço: " + AuxFilme.getPreco());
                                System.out.println("Estudio: " + AuxFilme.getEstudio());
                                System.out.println("Diretor: " + AuxFilme.getDiretor());
                                System.out.println("Gênero: " + AuxFilme.getGenero());
                                System.out.println("Produtor: " + AuxFilme.getProdutor());
                                System.out.println();
                            }

                            System.out.println("Digite o nome do Filme que deseja alterar dados:");
                            scanner.nextLine();
                            nomeProdutoAlterar = scanner.nextLine();
                            System.out.println("Digite o valor preço que substituirá o atual:");
                            valorAtualizado = scanner.nextDouble();
                            ContAux00 = listaFilmes.iterator();

                            while (ContAux00.hasNext()) {
                                AuxFilme = (Filme) ContAux00.next();
                                if (nomeProdutoAlterar.equals(AuxFilme.getNome())) {
                                    AuxFilme.setPreco(valorAtualizado);
                                    System.out.println(AuxFilme.getPreco());
                                }
                            }

                            System.out.println("Reimpressão de Lista de Filmes em estoque");
                            ContAux00 = listaFilmes.iterator();

                            while (ContAux00.hasNext()) {
                                AuxFilme = (Filme) ContAux00.next();
                                System.out.println("Id: " + AuxFilme.getId());
                                System.out.println("Nome: " + AuxFilme.getNome());
                                System.out.println("Preço: " + AuxFilme.getPreco());
                                System.out.println("Estudio: " + AuxFilme.getEstudio());
                                System.out.println("Diretor: " + AuxFilme.getDiretor());
                                System.out.println("Gênero: " + AuxFilme.getGenero());
                                System.out.println("Produtor: " + AuxFilme.getProdutor());
                                System.out.println();
                            }

                            System.out.println("Dado do Produto alterado com sucesso!");
                            continue;
                        case 4:
                            System.out.println("Lista de Jogos disponíveis em estoque");
                            ContAux00 = listaJogos.iterator();

                            while (ContAux00.hasNext()) {
                                AuxJogo = (Jogo) ContAux00.next();
                                System.out.println("Id: " + AuxJogo.getId());
                                System.out.println("Nome: " + AuxJogo.getNome());
                                System.out.println("Preço: " + AuxJogo.getPreco());
                                System.out.println("Distribuidora: " + AuxJogo.getDistribuidora());
                                System.out.println("Gênero: " + AuxJogo.getGenero());
                                System.out.println("Estudio: " + AuxJogo.getEstudio());
                                System.out.println();
                            }

                            System.out.println("Digite o nome do Jogo que deseja alterar dados:");
                            scanner.nextLine();
                            nomeProdutoAlterar = scanner.nextLine();
                            System.out.println("Digite o valor preço que substituirá o atual:");
                            valorAtualizado = scanner.nextDouble();
                            ContAux00 = listaJogos.iterator();

                            while (ContAux00.hasNext()) {
                                AuxJogo = (Jogo) ContAux00.next();
                                if (nomeProdutoAlterar.equals(AuxJogo.getNome())) {
                                    AuxJogo.setPreco(valorAtualizado);
                                    System.out.println(AuxJogo.getPreco());
                                }
                            }

                            System.out.println("Reimpressão de Lista de Jogos em estoque");
                            ContAux00 = listaJogos.iterator();

                            while (ContAux00.hasNext()) {
                                AuxJogo = (Jogo) ContAux00.next();
                                System.out.println("Id: " + AuxJogo.getId());
                                System.out.println("Nome: " + AuxJogo.getNome());
                                System.out.println("Preço: " + AuxJogo.getPreco());
                                System.out.println("Distribuidora: " + AuxJogo.getDistribuidora());
                                System.out.println("Gênero: " + AuxJogo.getGenero());
                                System.out.println("Estudio: " + AuxJogo.getEstudio());
                                System.out.println();
                            }

                            System.out.println("Dado do Produto alterado com sucesso!");
                            continue;
                        case 5:
                            System.out.println("Lista de Livros disponíveis em estoque");
                            ContAux00 = listaLivros.iterator();


                            while (ContAux00.hasNext()) {
                                AuxLivro = (Livro) ContAux00.next();
                                System.out.println("Id: " + AuxLivro.getId());
                                System.out.println("Nome: " + AuxLivro.getNome());
                                System.out.println("Preço: " + AuxLivro.getPreco());
                                System.out.println("Gênero: " + AuxLivro.getGenero());
                                System.out.println("Escritor: " + AuxLivro.getEscritor());
                                System.out.println("Editora: " + AuxLivro.getEditora());
                                System.out.println();
                            }

                            System.out.println("Digite o nome do Livro que deseja alterar dados:");
                            scanner.nextLine();
                            nomeProdutoAlterar = scanner.nextLine();
                            System.out.println("Digite o valor preço que substituirá o atual:");
                            valorAtualizado = scanner.nextDouble();
                            ContAux00 = listaLivros.iterator();

                            while (ContAux00.hasNext()) {
                                AuxLivro = (Livro) ContAux00.next();
                                if (nomeProdutoAlterar.equals(AuxLivro.getNome())) {
                                    AuxLivro.setPreco(valorAtualizado);
                                    System.out.println(AuxLivro.getPreco());
                                }
                            }

                            System.out.println("Reimpressão de Lista de Livros em estoque");
                            ContAux00 = listaLivros.iterator();

                            while (ContAux00.hasNext()) {
                                AuxLivro = (Livro) ContAux00.next();
                                System.out.println("Id: " + AuxLivro.getId());
                                System.out.println("Nome: " + AuxLivro.getNome());
                                System.out.println("Preço: " + AuxLivro.getPreco());
                                System.out.println("Gênero: " + AuxLivro.getGenero());
                                System.out.println("Escritor: " + AuxLivro.getEscritor());
                                System.out.println("Editora: " + AuxLivro.getEditora());
                                System.out.println();
                            }

                            System.out.println("Dado do Produto alterado com sucesso!");
                            continue;
                        default:
                            System.out.println("Operação Inválida!");
                            continue;
                    }
                case 3:
                    System.out.println("Qual categoria de produto deseja visualizar os itens?");
                    System.out.println("1 - Livro");
                    System.out.println("2 - Jogos");
                    System.out.println("3 - Filme");
                    System.out.println("4 - Albuns De Musica");
                    System.out.println("5 - Brinquedos");
                    System.out.println("Digite a opção:");
                    opcaoCategoria = scanner.nextInt();
                    switch (opcaoCategoria) {
                        case 1:
                            System.out.println("Lista de Livros");
                            ContAux01 = listaLivros.iterator();

                            while (true) {
                                if (!ContAux01.hasNext()) {
                                    continue;
                                }

                                AuxLivro = (Livro) ContAux01.next();
                                System.out.println("Id: " + AuxLivro.getId());
                                System.out.println("Nome: " + AuxLivro.getNome());
                                System.out.println("Preço: " + AuxLivro.getPreco());
                                System.out.println("Gênero: " + AuxLivro.getGenero());
                                System.out.println("Escritor: " + AuxLivro.getEscritor());
                                System.out.println("Editora: " + AuxLivro.getEditora());
                                System.out.println();
                            }
                        case 2:
                            System.out.println("Lista de Jogos");
                            ContAux01 = listaJogos.iterator();

                            while (true) {
                                if (!ContAux01.hasNext()) {
                                    continue;
                                }

                                AuxJogo = (Jogo) ContAux01.next();
                                System.out.println("Id: " + AuxJogo.getId());
                                System.out.println("Nome: " + AuxJogo.getNome());
                                System.out.println("Preço: " + AuxJogo.getPreco());
                                System.out.println("Distribuidora: " + AuxJogo.getDistribuidora());
                                System.out.println("Gênero: " + AuxJogo.getGenero());
                                System.out.println("Estudio: " + AuxJogo.getEstudio());
                                System.out.println();
                            }
                        case 3:
                            System.out.println("Lista de Filmes");
                            ContAux01 = listaFilmes.iterator();

                            while (true) {
                                if (!ContAux01.hasNext()) {
                                    continue;
                                }

                                AuxFilme = (Filme) ContAux01.next();
                                System.out.println("Id: " + AuxFilme.getId());
                                System.out.println("Nome: " + AuxFilme.getNome());
                                System.out.println("Preço: " + AuxFilme.getPreco());
                                System.out.println("Estudio: " + AuxFilme.getEstudio());
                                System.out.println("Diretor: " + AuxFilme.getDiretor());
                                System.out.println("Gênero: " + AuxFilme.getGenero());
                                System.out.println("Produtor: " + AuxFilme.getProdutor());
                                System.out.println();
                            }
                        case 4:
                            System.out.println("Lista de Albuns de Música");
                            ContAux01 = listaAlbunsDeMusica.iterator();

                            while (true) {
                                if (!ContAux01.hasNext()) {
                                    continue;
                                }

                                AuxMusica = (AlbumDeMusica) ContAux01.next();
                                System.out.println("Id: " + AuxMusica.getId());
                                System.out.println("Nome: " + AuxMusica.getNome());
                                System.out.println("Preço: " + AuxMusica.getPreco());
                                System.out.println("Músicos da Banda: " + AuxMusica.getMusicosBanda());
                                System.out.println("Gênero: " + AuxMusica.getGenero());
                                System.out.println("Selo: " + AuxMusica.getSelo());
                                System.out.println();
                            }
                        case 5:
                            System.out.println("Lista de Brinquedos");
                            ContAux01 = listaBrinquedos.iterator();

                            while (true) {
                                if (!ContAux01.hasNext()) {
                                    continue;
                                }

                                AuxBrinquedo = (Brinquedo) ContAux01.next();
                                System.out.println("Id: " + AuxBrinquedo.getId());
                                System.out.println("Nome: " + AuxBrinquedo.getNome());
                                System.out.println("Preço: " + AuxBrinquedo.getPreco());
                                System.out.println("Tipo: " + AuxBrinquedo.getTipo());
                                System.out.println();
                            }



                        default:
                            System.out.println("Operação Inválida!");
                            continue;
                    }

                case 4:
                    System.out.println("Lista de produtos em estoque (geral)");
                    ContAux01 = listaAlbunsDeMusica.iterator();

                    while (ContAux01.hasNext()) {
                        AuxMusica = (AlbumDeMusica) ContAux01.next();
                        System.out.println("Id: " + AuxMusica.getId());
                        System.out.println("Nome: " + AuxMusica.getNome());
                        System.out.println("Preço: " + AuxMusica.getPreco());
                        System.out.println("Músicos da Banda: " + AuxMusica.getMusicosBanda());
                        System.out.println("Gênero: " + AuxMusica.getGenero());
                        System.out.println("Selo: " + AuxMusica.getSelo());
                        System.out.println();
                    }

                    ContAux01 = listaBrinquedos.iterator();

                    while (ContAux01.hasNext()) {
                        AuxBrinquedo = (Brinquedo) ContAux01.next();
                        System.out.println("Id: " + AuxBrinquedo.getId());
                        System.out.println("Nome: " + AuxBrinquedo.getNome());
                        System.out.println("Preço: " + AuxBrinquedo.getPreco());
                        System.out.println("Tipo: " + AuxBrinquedo.getTipo());
                        System.out.println();
                    }

                    ContAux01 = listaFilmes.iterator();

                    while (ContAux01.hasNext()) {
                        AuxFilme = (Filme) ContAux01.next();
                        System.out.println("Id: " + AuxFilme.getId());
                        System.out.println("Nome: " + AuxFilme.getNome());
                        System.out.println("Preço: " + AuxFilme.getPreco());
                        System.out.println("Estudio: " + AuxFilme.getEstudio());
                        System.out.println("Diretor: " + AuxFilme.getDiretor());
                        System.out.println("Gênero: " + AuxFilme.getGenero());
                        System.out.println("Produtor: " + AuxFilme.getProdutor());
                        System.out.println();
                    }

                    ContAux01 = listaJogos.iterator();

                    while (ContAux01.hasNext()) {
                        AuxJogo = (Jogo) ContAux01.next();
                        System.out.println("Id: " + AuxJogo.getId());
                        System.out.println("Nome: " + AuxJogo.getNome());
                        System.out.println("Preço: " + AuxJogo.getPreco());
                        System.out.println("Distribuidora: " + AuxJogo.getDistribuidora());
                        System.out.println("Gênero: " + AuxJogo.getGenero());
                        System.out.println("Estudio: " + AuxJogo.getEstudio());
                        System.out.println();
                    }

                    ContAux01 = listaLivros.iterator();

                    while (true) {
                        if (!ContAux01.hasNext()) {
                            continue;
                        }

                        AuxLivro = (Livro) ContAux01.next();
                        System.out.println("Id: " + AuxLivro.getId());
                        System.out.println("Nome: " + AuxLivro.getNome());
                        System.out.println("Preço: " + AuxLivro.getPreco());
                        System.out.println("Gênero: " + AuxLivro.getGenero());
                        System.out.println("Escritor: " + AuxLivro.getEscritor());
                        System.out.println("Editora: " + AuxLivro.getEditora());
                        System.out.println();
                    }
                case 5:
                    System.out.println("-----> Lista completa de produtos em estoque (por categoria) <-----");
                    System.out.println("Lista de Albuns de Música <-----");
                    ContAux01 = listaAlbunsDeMusica.iterator();

                    while (ContAux01.hasNext()) {
                        AuxMusica = (AlbumDeMusica) ContAux01.next();
                        System.out.println("Id: " + AuxMusica.getId());
                        System.out.println("Nome: " + AuxMusica.getNome());
                        System.out.println("Preço: " + AuxMusica.getPreco());
                        System.out.println("Músicos da Banda: " + AuxMusica.getMusicosBanda());
                        System.out.println("Gênero: " + AuxMusica.getGenero());
                        System.out.println("Selo: " + AuxMusica.getSelo());
                        System.out.println();
                    }

                    System.out.println("-----> Lista de Brinquedos <-----");
                    ContAux01 = listaBrinquedos.iterator();

                    while (ContAux01.hasNext()) {
                        AuxBrinquedo = (Brinquedo) ContAux01.next();
                        System.out.println("Id: " + AuxBrinquedo.getId());
                        System.out.println("Nome: " + AuxBrinquedo.getNome());
                        System.out.println("Preço: " + AuxBrinquedo.getPreco());
                        System.out.println("Tipo: " + AuxBrinquedo.getTipo());
                        System.out.println();
                    }

                    System.out.println("-----> Lista de Filmes <-----");
                    ContAux01 = listaFilmes.iterator();

                    while (ContAux01.hasNext()) {
                        AuxFilme = (Filme) ContAux01.next();
                        System.out.println("Id: " + AuxFilme.getId());
                        System.out.println("Nome: " + AuxFilme.getNome());
                        System.out.println("Preço: " + AuxFilme.getPreco());
                        System.out.println("Estudio: " + AuxFilme.getEstudio());
                        System.out.println("Diretor: " + AuxFilme.getDiretor());
                        System.out.println("Gênero: " + AuxFilme.getGenero());
                        System.out.println("Produtor: " + AuxFilme.getProdutor());
                        System.out.println();
                    }

                    System.out.println("-----> Lista de Jogos <-----");
                    ContAux01 = listaJogos.iterator();

                    while (ContAux01.hasNext()) {
                        AuxJogo = (Jogo) ContAux01.next();
                        System.out.println("Id: " + AuxJogo.getId());
                        System.out.println("Nome: " + AuxJogo.getNome());
                        System.out.println("Preço: " + AuxJogo.getPreco());
                        System.out.println("Distribuidora: " + AuxJogo.getDistribuidora());
                        System.out.println("Gênero: " + AuxJogo.getGenero());
                        System.out.println("Estudio: " + AuxJogo.getEstudio());
                        System.out.println();
                    }

                    System.out.println("-----> Lista de Livros <-----");
                    ContAux01 = listaLivros.iterator();

                    while (true) {
                        if (!ContAux01.hasNext()) {
                            continue;
                        }

                        AuxLivro = (Livro) ContAux01.next();
                        System.out.println("Id: " + AuxLivro.getId());
                        System.out.println("Nome: " + AuxLivro.getNome());
                        System.out.println("Preço: " + AuxLivro.getPreco());
                        System.out.println("Gênero: " + AuxLivro.getGenero());
                        System.out.println("Escritor: " + AuxLivro.getEscritor());
                        System.out.println("Editora: " + AuxLivro.getEditora());
                        System.out.println();
                    }
                case 6:
                    System.out.println("Qual categoria de produto deseja visualizar para realizar a compra?");
                    System.out.println("1 - Albuns De Musica");
                    System.out.println("2 - Brinquedos");
                    System.out.println("3 - Filme");
                    System.out.println("4 - Jogo");
                    System.out.println("5 - Livro");
                    System.out.println("Digite a opção:");
                    opcaoCategoria = scanner.nextInt();
                    String nomeProdutoCompra;
                    Iterator var14;
                    switch (opcaoCategoria) {
                        case 1:
                            System.out.println("Lista de Albuns de Música disponíveis em estoque");
                            var14 = listaAlbunsDeMusica.iterator();


                            while (var14.hasNext()) {
                                AuxMusica = (AlbumDeMusica) var14.next();
                                System.out.println("Id: " + AuxMusica.getId());
                                System.out.println("Nome: " + AuxMusica.getNome());
                                System.out.println("Preço: " + AuxMusica.getPreco());
                                System.out.println("Músicos da Banda: " + AuxMusica.getMusicosBanda());
                                System.out.println("Gênero: " + AuxMusica.getGenero());
                                System.out.println("Selo: " + AuxMusica.getSelo());
                                System.out.println();
                            }

                            System.out.println("Digite o nome do Álbum de Músicas que deseja comprar:");
                            scanner.nextLine();
                            nomeProdutoCompra = scanner.nextLine();
                            var14 = listaAlbunsDeMusica.iterator();

                            while (var14.hasNext()) {
                                AuxMusica = (AlbumDeMusica) var14.next();
                                if (nomeProdutoCompra.equals(AuxMusica.getNome())) {
                                    listaAlbunsDeMusica.remove(AuxMusica);
                                    dinheiroEmCaixaDaEmpresa = dinheiroEmCaixaDaEmpresa + AuxMusica.getPreco();
                                }
                            }

                            System.out.println("Compra realizada com sucesso!");
                            System.out.println("Dinheiro em caixa atualizado " + dinheiroEmCaixaDaEmpresa);
                            System.out.println("Reimpressão de Lista de Álbum de Música em estoque");
                            var14 = listaAlbunsDeMusica.iterator();

                            while (true) {
                                if (!var14.hasNext()) {
                                    continue;
                                }

                                AuxMusica = (AlbumDeMusica) var14.next();
                                System.out.println("Id: " + AuxMusica.getId());
                                System.out.println("Nome: " + AuxMusica.getNome());
                                System.out.println("Preço: " + AuxMusica.getPreco());
                                System.out.println("Músicos da Banda: " + AuxMusica.getMusicosBanda());
                                System.out.println("Gênero: " + AuxMusica.getGenero());
                                System.out.println("Selo: " + AuxMusica.getSelo());
                                System.out.println();
                            }
                        case 2:
                            System.out.println("Lista de Brinquedos disponíveis em estoque");
                            var14 = listaBrinquedos.iterator();


                            while (var14.hasNext()) {
                                AuxBrinquedo = (Brinquedo) var14.next();
                                System.out.println("Id: " + AuxBrinquedo.getId());
                                System.out.println("Nome: " + AuxBrinquedo.getNome());
                                System.out.println("Preço: " + AuxBrinquedo.getPreco());
                                System.out.println("Tipo: " + AuxBrinquedo.getTipo());
                                System.out.println();
                            }

                            System.out.println("Digite o nome do brinquedo que deseja comprar:");
                            scanner.nextLine();
                            nomeProdutoCompra = scanner.nextLine();
                            var14 = listaBrinquedos.iterator();

                            while (var14.hasNext()) {
                                AuxBrinquedo = (Brinquedo) var14.next();
                                if (nomeProdutoCompra.equals(AuxBrinquedo.getNome())) {
                                    listaBrinquedos.remove(AuxBrinquedo);
                                    dinheiroEmCaixaDaEmpresa = dinheiroEmCaixaDaEmpresa + AuxBrinquedo.getPreco();
                                }
                            }

                            System.out.println("Compra realizada com sucesso!");
                            System.out.println("Dinheiro em caixa atualizado " + dinheiroEmCaixaDaEmpresa);
                            System.out.println("Reimpressão de Lista de Brinquedos em estoque");
                            var14 = listaBrinquedos.iterator();

                            while (true) {
                                if (!var14.hasNext()) {
                                    continue;
                                }

                                AuxBrinquedo = (Brinquedo) var14.next();
                                System.out.println("Id: " + AuxBrinquedo.getId());
                                System.out.println("Nome: " + AuxBrinquedo.getNome());
                                System.out.println("Preço: " + AuxBrinquedo.getPreco());
                                System.out.println("Tipo: " + AuxBrinquedo.getTipo());
                                System.out.println();
                            }
                        case 3:
                            System.out.println("Lista de Filmes disponíveis em estoque");
                            var14 = listaFilmes.iterator();


                            while (var14.hasNext()) {
                                AuxFilme = (Filme) var14.next();
                                System.out.println("Id: " + AuxFilme.getId());
                                System.out.println("Nome: " + AuxFilme.getNome());
                                System.out.println("Preço: " + AuxFilme.getPreco());
                                System.out.println("Estudio: " + AuxFilme.getEstudio());
                                System.out.println("Diretor: " + AuxFilme.getDiretor());
                                System.out.println("Gênero: " + AuxFilme.getGenero());
                                System.out.println("Produtor: " + AuxFilme.getProdutor());
                                System.out.println();
                            }

                            System.out.println("Digite o nome do filme que deseja comprar:");
                            scanner.nextLine();
                            nomeProdutoCompra = scanner.nextLine();
                            var14 = listaFilmes.iterator();

                            while (var14.hasNext()) {
                                AuxFilme = (Filme) var14.next();
                                if (nomeProdutoCompra.equals(AuxFilme.getNome())) {
                                    listaFilmes.remove(AuxFilme);
                                    dinheiroEmCaixaDaEmpresa = dinheiroEmCaixaDaEmpresa + AuxFilme.getPreco();
                                }
                            }

                            System.out.println("Compra realizada com sucesso!");
                            System.out.println("Dinheiro em caixa atualizado " + dinheiroEmCaixaDaEmpresa);
                            System.out.println("Reimpressão de Lista de Filmes em estoque");
                            var14 = listaFilmes.iterator();

                            while (true) {
                                if (!var14.hasNext()) {
                                    continue;
                                }

                                AuxFilme = (Filme) var14.next();
                                System.out.println("Id: " + AuxFilme.getId());
                                System.out.println("Nome: " + AuxFilme.getNome());
                                System.out.println("Preço: " + AuxFilme.getPreco());
                                System.out.println("Estudio: " + AuxFilme.getEstudio());
                                System.out.println("Diretor: " + AuxFilme.getDiretor());
                                System.out.println("Gênero: " + AuxFilme.getGenero());
                                System.out.println("Produtor: " + AuxFilme.getProdutor());
                                System.out.println();
                            }
                        case 4:
                            System.out.println("Lista de Jogos disponíveis em estoque");
                            var14 = listaJogos.iterator();


                            while (var14.hasNext()) {
                                AuxJogo = (Jogo) var14.next();
                                System.out.println("Id: " + AuxJogo.getId());
                                System.out.println("Nome: " + AuxJogo.getNome());
                                System.out.println("Preço: " + AuxJogo.getPreco());
                                System.out.println("Distribuidora: " + AuxJogo.getDistribuidora());
                                System.out.println("Gênero: " + AuxJogo.getGenero());
                                System.out.println("Estudio: " + AuxJogo.getEstudio());
                                System.out.println();
                            }

                            System.out.println("Digite o nome do jogo que deseja comprar:");
                            scanner.nextLine();
                            nomeProdutoCompra = scanner.nextLine();
                            var14 = listaJogos.iterator();

                            while (var14.hasNext()) {
                                AuxJogo = (Jogo) var14.next();
                                if (nomeProdutoCompra.equals(AuxJogo.getNome())) {
                                    listaJogos.remove(AuxJogo);
                                    dinheiroEmCaixaDaEmpresa = dinheiroEmCaixaDaEmpresa + AuxJogo.getPreco();
                                }
                            }

                            System.out.println("Compra realizada com sucesso!");
                            System.out.println("Dinheiro em caixa atualizado " + dinheiroEmCaixaDaEmpresa);
                            System.out.println("Reimpressão de Lista de Filmes em estoque");
                            var14 = listaJogos.iterator();

                            while (true) {
                                if (!var14.hasNext()) {
                                    continue;
                                }

                                AuxJogo = (Jogo) var14.next();
                                System.out.println("Id: " + AuxJogo.getId());
                                System.out.println("Nome: " + AuxJogo.getNome());
                                System.out.println("Preço: " + AuxJogo.getPreco());
                                System.out.println("Distribuidora: " + AuxJogo.getDistribuidora());
                                System.out.println("Gênero: " + AuxJogo.getGenero());
                                System.out.println("Estudio: " + AuxJogo.getEstudio());
                                System.out.println();
                            }
                        case 5:
                            System.out.println("Lista de Livro disponíveis em estoque");
                            var14 = listaLivros.iterator();


                            while (var14.hasNext()) {
                                AuxLivro = (Livro) var14.next();
                                System.out.println("Id: " + AuxLivro.getId());
                                System.out.println("Nome: " + AuxLivro.getNome());
                                System.out.println("Preço: " + AuxLivro.getPreco());
                                System.out.println("Gênero: " + AuxLivro.getGenero());
                                System.out.println("Escritor: " + AuxLivro.getEscritor());
                                System.out.println("Editora: " + AuxLivro.getEditora());
                                System.out.println();
                            }

                            System.out.println("Digite o nome do livro que deseja comprar:");
                            scanner.nextLine();
                            nomeProdutoCompra = scanner.nextLine();
                            var14 = listaLivros.iterator();

                            while (var14.hasNext()) {
                                AuxLivro = (Livro) var14.next();
                                if (nomeProdutoCompra.equals(AuxLivro.getNome())) {
                                    listaLivros.remove(AuxLivro);
                                    dinheiroEmCaixaDaEmpresa = dinheiroEmCaixaDaEmpresa + AuxLivro.getPreco();
                                }
                            }

                            System.out.println("Compra realizada com sucesso!");
                            System.out.println("Dinheiro em caixa atualizado " + dinheiroEmCaixaDaEmpresa);
                            System.out.println("Reimpressão de Lista de Filmes em estoque");
                            var14 = listaLivros.iterator();

                            while (true) {
                                if (!var14.hasNext()) {
                                    continue;
                                }

                                AuxLivro = (Livro) var14.next();
                                System.out.println("Id: " + AuxLivro.getId());
                                System.out.println("Nome: " + AuxLivro.getNome());
                                System.out.println("Preço: " + AuxLivro.getPreco());
                                System.out.println("Gênero: " + AuxLivro.getGenero());
                                System.out.println("Escritor: " + AuxLivro.getEscritor());
                                System.out.println("Editora: " + AuxLivro.getEditora());
                                System.out.println();
                            }
                        default:
                            System.out.println("Operação Inválida!");
                            continue;
                    }
                case 7:
                    System.out.println("Dinheiro em caixa atualizado " + dinheiroEmCaixaDaEmpresa);
                    break;
                default:
                    System.out.println("Operação Inválida");

            }
        }while (opcaoMenu != 8 && opcaoMenu <= 7) ;

        System.out.println("Finalizado!");
    }
}