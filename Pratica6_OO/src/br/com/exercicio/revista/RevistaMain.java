package br.com.exercicio.revista;

import javax.swing.*;
import java.util.ArrayList;

public class RevistaMain {
    public static void main(String[] args) {

        //variaveis da edicao
        int numero, volume, tiragem;
        String dataEdicao;

        //variaveis da revista
        String tituloRevista, peridodicidade;
        long issn;

        //variaveis artigo
        String titulo, resumo, autores;

        ArrayList<Artigo> artigos = new ArrayList<>();

        tituloRevista = JOptionPane.showInputDialog("Digite o nome da Revista: ");
        issn = Long.parseLong(JOptionPane.showInputDialog("Digite o ISSN: "));
        peridodicidade = JOptionPane.showInputDialog("Digite a periodicidade: ");

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da edição : "));
        volume = Integer.parseInt(JOptionPane.showInputDialog("Digite o volume da edição : "));
        tiragem = Integer.parseInt(JOptionPane.showInputDialog("Digite a tiragem da edição : "));
        dataEdicao = JOptionPane.showInputDialog("Digite a data da edição: ");

        Edicao ed1 = new Edicao(numero,volume,tiragem,dataEdicao);
        RevistaCientifica revista1 = new RevistaCientifica(tituloRevista,issn,peridodicidade,ed1);


       for(int i=0; i<10;i++) {
           titulo = JOptionPane.showInputDialog("Digite o título do Artigo: ");
           resumo = JOptionPane.showInputDialog("Digite o resumo do Artigo: ");
           autores = JOptionPane.showInputDialog("Digite os autores do Artigo: ");
           artigos.add(new Artigo(titulo, resumo, autores));
           ed1.adicionaArtigo(artigos.get(i));
       }
    }
}
