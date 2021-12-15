package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeroProgramaJava {
    public static void main(String[] args) {
        // deseo crear mi Clase Gato aquí
        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro = new Livro("el problema de mi vida es Raúl", 300);
        System.out.println(livro);

//        int num1 = 10;
//        int num2 = 3;
//        System.out.println("Hola mis Carnales: esto da = " + (num1+num2));
    }
}

class Livro {
    private String nome;
    private Integer numPaginas;

    // construtor
    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}
