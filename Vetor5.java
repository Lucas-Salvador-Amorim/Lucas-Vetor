import java.util.Scanner;
public class Vetor5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int codigo[]=new int[5];
        String nome[]=new String[5];
        double preço[]=new double[5];

        for (int i = 0; i < preço.length; i++) {
            System.out.println("Digite o codigo do produto: ");
            codigo[i]=sc.nextInt();
            System.out.println("Digite o nome do produto: ");
            nome[i]=sc.next();
            System.out.println("Digite o preço do produto: ");
            preço[i]=sc.nextDouble();
        }
        for (int i = 0; i < preço.length; i++) {
            System.out.println("Codigo: " +codigo[i]);
            System.out.println("nome: " +nome[i]);
            if(preço[i] >120){ 
            System.out.println("preço: " +(preço[i]+20));
        }
            else{
                System.out.println("Preço: " + preço[i]);
            }
            sc.close();
        }
    }
}
