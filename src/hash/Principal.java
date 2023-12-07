package hash;

public class Principal {

	 public static void main(String[] args) {
	        HashTable hashTable = new HashTable(50); // Utilizando um valor próximo a 20 elementos por posição

	        System.out.println("Caso queira imprimir a tabela e so descomentar a linha com a funcao hashTable.imprimirTabela();");
	        
	        // Antes dos testes
	        //hashTable.imprimirTabela();

	        // Teste buscar um elemento existente que seja o primeiro da lista
	        hashTable.insere("elemento1");
	        System.out.println(hashTable.busca("elemento1")); // Deve imprimir true
	        //hashTable.imprimirTabela();

	        // Teste buscar um elemento existente que seja o último da lista e não seja o primeiro
	        hashTable.insere("elemento2");
	        System.out.println(hashTable.busca("elemento2")); // Deve imprimir true
	        //hashTable.imprimirTabela();
	        
	        // Teste buscar um elemento que nunca foi inserido
	        System.out.println(hashTable.busca("elementoNaoInserido")); // Deve imprimir false
	        //hashTable.imprimirTabela();
	        
	        // Teste buscar um elemento que já foi inserido e removido
	        hashTable.remove("elemento1");
	        System.out.println(hashTable.busca("elemento1")); // Deve imprimir false
	        //hashTable.imprimirTabela();
	        
	        // Teste remover todos os elementos de uma posição da tabela e voltar a inserir elementos novamente
	        int indexToRemove = hashTable.hash("elemento3");
	        hashTable.getTabela()[indexToRemove].clear(); // Remover todos os elementos da posição
	        hashTable.insere("elemento5");

	        // Depois dos testes
	        hashTable.imprimirTabela();
	    }
	}