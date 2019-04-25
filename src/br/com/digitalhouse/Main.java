package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Livraria livraria = new Livraria();

        Livro Anatomia = new Livro(0,"Anatomia","Arthur",2011,
                12345,10,367.60);
        Livro Desenho = new Livro(1,"Desenhos","João",2010,
                67890,20,378.60);
        Livro Matematica = new Livro(2,"Matematica","Roberto",2009,
                14680,9,344.60);

        try {

            List<Livro> livros = new ArrayList<>();
            livros.add(Anatomia);
            livros.add(Desenho);
            livros.add(Matematica);

            int numero = livraria.cadastrarColecao(livros);

            System.out.println(livros.get(4));

        } catch (Exception e){

            System.out.println("Livro não encontrado");
        }


        livraria.mostrarLivro();

        livraria.livrosVendido();

        livraria.mostrarLivro();

    }

}
