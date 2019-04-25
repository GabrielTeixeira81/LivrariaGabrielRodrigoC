package br.com.digitalhouse;

public class Livro {

    private int codigo;
    private String titulo;
    private String autor;
    private int anoLancamento;
    private int codigoISBN;
    private int quantidadeEstoque;
    private double preco;


    public Livro(int codigo, String titulo, String autor, int anoLancamento, int codigoISBN, int quantidadeEstoque, double preco) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.anoLancamento = anoLancamento;
        this.codigoISBN = codigoISBN;
        this.quantidadeEstoque = quantidadeEstoque;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getCodigoISBN() {
        return codigoISBN;
    }

    public void setCodigoISBN(int codigoISBN) {
        this.codigoISBN = codigoISBN;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void retirada() {
    }
}
