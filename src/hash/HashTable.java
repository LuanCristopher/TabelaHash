package hash;


import java.util.LinkedList;

public class HashTable {
    private LinkedList<String>[] tabela;
    private int tamanho;

    public HashTable(int m) {
        this.tamanho = m;
        this.tabela = new LinkedList[m];
        for (int i = 0; i < m; i++) {
            tabela[i] = new LinkedList<>();
        }
    }

    // Tornando o método hash público
    public int hash(String str) {
        return Math.abs(str.hashCode() % tamanho);
    }

    public void insere(String str) {
        int index = hash(str);
        tabela[index].add(str);
    }

    public boolean busca(String str) {
        int index = hash(str);
        return tabela[index].contains(str);
    }

    public void remove(String str) {
        int index = hash(str);
        tabela[index].remove(str);
    }

    // Método adicionado para acessar a tabela
    public LinkedList<String>[] getTabela() {
        return tabela;
    }

    public void imprimirTabela() {
        System.out.println("Tabela Hash:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(i + ": ");
            for (String elemento : tabela[i]) {
                System.out.print(elemento + " -> ");
            }
            System.out.println();
        }
    }
   }