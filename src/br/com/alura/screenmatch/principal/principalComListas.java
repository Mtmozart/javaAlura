package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class principalComListas {
    public static void main(String[] args) {


        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Serie lost = new Serie("Lost", 2000);

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(10);
        var filmeDoPaulo = new Filme("Vingadores ultimato", 2018);
        filmeDoPaulo.avalia(7);
        List<Titulo> listaDeAssistidos= new LinkedList<>();
        listaDeAssistidos.add(filmeDoPaulo);
        listaDeAssistidos.add(meuFilme);
        listaDeAssistidos.add(outroFilme);
        listaDeAssistidos.add(lost);

        for (Titulo t : listaDeAssistidos){
            System.out.println(t.getNome());
            if (t instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscarArtistas = new ArrayList<>();

        buscarArtistas.add("Adam Sendler");
        buscarArtistas.add("Paulo");
        buscarArtistas.add("Jaqueline");
        Collections.sort(buscarArtistas);
        System.out.println(buscarArtistas);
        System.out.println("------Ordenados--------");
        Collections.sort(listaDeAssistidos);

        for (Titulo t : listaDeAssistidos){
                System.out.println(t.getNome());
          }
        System.out.println("------Ordenados por ano mais comparator--------");
        listaDeAssistidos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(listaDeAssistidos);
    }


}
