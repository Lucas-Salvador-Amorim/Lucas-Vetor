//importa o pacote Scanner para nosso projeto.
import java.util.Scanner;

//Declara uma classe publica chamada vetor 2 e inicia o corpo da classe
public class Vetor2 {
    
    //Metodo principal do nosso projeto.
    public static void main(String[] args){
        
        //Instanciar e criar um objeto Scanner. para receber dados dos usarios via teclado.
        Scanner ler = new Scanner(System.in);
        
        //lendo um valor inteiro.
        int n = 3;
        
        //Criando um vetor funcionario
        String funcionario[]=new String[n];


        //Estrutura de repetição para nome de funcionario para cada um dos valores do vetor.
        // o metodo .length retorna o tamanho otal do vetor.
        for (int index = 0; index < funcionario.length; index++) {
                System.out.println("Digite o nome do funcionario: " );
                //adicionar os nomes que foram digitados pelo usuario no vetor.
                funcionario[index]=ler.next();
        }

        for (int index = 0; index < funcionario.length; index++) {
            System.out.println("Os funcionarios são " + funcionario[index]);
        }
        ler.close();
    }
}
