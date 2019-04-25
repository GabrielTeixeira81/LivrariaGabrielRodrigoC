package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Livraria {

    private List cadastrarLivro = new ArrayList();

    public void cadastrarLivro(Livro livros) {

        Livro Portugues = new Livro(3, "Portugues", "Gabriel", 2008, 13579,
                6, 120.00);

    }

    private Map<Integer, List<Livro>> cadastrarColecao = new HashMap<>();
    private int contador;



    public Integer cadastrarColecao(List<Livro> colecoes) {
        contador++;

        cadastrarColecao.put(contador, colecoes);

        for (Livro livro : colecoes) {
            System.out.println("Livro cadastrado com sucesso! Codigo:" + livro.getCodigo() + "Titulo:" + livro.getTitulo()
                    + "Autor:" + livro.getAutor() + "Ano de Lançamento:" + livro.getAnoLancamento() + "Codigo ISBN:" + livro.getCodigoISBN()
                    + "Quantidade de Estoque:" + livro.getQuantidadeEstoque() + "Preco:" + livro.getPreco());
        }
        return contador;

    }

    public void mostrarLivro() {
        for (Integer numero : cadastrarColecao.keySet()) {
            List<Livro> colecoes = cadastrarColecao.get(numero);

            System.out.println("\n Na livraria possui:" + numero + "possui está quantidade armazenada");


            for (Livro livro : colecoes) {
                System.out.println("Codigo:" + livro.getCodigo() + "Titulo:" + livro.getTitulo()
                        + "Autor:" + livro.getAutor() + "Ano de Lançamento:" + livro.getAnoLancamento() + "Codigo ISBN:" + livro.getCodigoISBN()
                        + "Quantidade de Estoque:" + livro.getQuantidadeEstoque() + "Preco:" + livro.getPreco());
            }
        }

    }

    public void mostrarLivro(Integer numero) {
        List<Livro> colecoes = cadastrarColecao.get(numero);

        System.out.println("\n Na livraria possui:" + numero + "possui está quantidade armazenada: \n");

        for (Livro livro : colecoes) {
            System.out.println("Codigo:" + livro.getCodigo() + "Titulo:" + livro.getTitulo()
                    + "Autor:" + livro.getAutor() + "Ano de Lançamento:" + livro.getAnoLancamento() + "Codigo ISBN:" + livro.getCodigoISBN()
                    + "Quantidade de Estoque:" + livro.getQuantidadeEstoque() + "Preco:" + livro.getPreco());
        }
    }

    public List<Livro> livrosVendido(Integer numero) {
        List<Livro> colecoes = cadastrarColecao.get(numero);
        for (Livro livro : colecoes) {
            livro.retirada();
        }
        cadastrarColecao.remove(numero);
        return colecoes;
    }

    public void livrosVendido() {
    }
}

