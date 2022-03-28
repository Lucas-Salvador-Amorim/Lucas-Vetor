public class Vetor1{

    public static void main(String[] args) 
    {
    

        String produto [] = new String[10];

        produto[0]= "Amendoin";
        produto[1]= "Cana de açucar";
        produto[2]= "Soja";
        produto[3]= "Café";
        produto[4]= "Carne";
        produto[5]= "Oriza satiya"; //arroz
        produto[6]= "trigo";
        produto[7]= "gasolina";
        produto[8]= "milho";
        produto[9]= "algodão";

        int estoque[]=new int[10];

        estoque[0]= 100;
        estoque[1]= 5000;
        estoque[2]= 60;
        estoque[3]= 20;
        estoque[4]= 15;
        estoque[5]= 60;
        estoque[6]= 100;
        estoque[7]= 7;
        estoque[8]= 60;
        estoque[9]= 100;


        for (int index = 0; index < estoque.length; index++) {
            System.out.println("O produto " + produto[index] + " tem " + estoque[index] + " unidades em estoque");
        }
    

    
    }


}