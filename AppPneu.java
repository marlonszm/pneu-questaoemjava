import java.util.Scanner;
public class AppPneu {
    public static void main(String[] args) throws Exception {
        //Aplicação ME1 questão 1:  
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o código do pneu: ");
        int idPneu = input.nextInt();
        System.out.print("Informe o modelo do pneu: ");
        input.nextLine();
        String modelo = input.nextLine();
        Pneu pneu = new Pneu(idPneu, modelo, 110, 'N');
        //estado atual do objeto 
        System.out.println("\nId Pneu: "+pneu.getIdPneu());
        System.out.println("Modelo: "+pneu.getModelo());
        System.out.println("Índice de vida: "+pneu.getIndiceDeVida());
        System.out.println("Estado: "+ pneu.getEstado());
        pneu.desgastar(4, 14);
        if(pneu.getIndiceDeVida()<=0){
            System.out.println("==================================================");
            System.out.println("NÃO HÁ DESGASTE DAS 15 À 20, PNEU FORA DE USO!!");
        }
        else{
            System.out.println("\nDESGASTE DAS 4 ÀS 14");
            System.out.println("Estado do pneu: "+pneu.getEstado());
            System.out.println("Horas de uso: "+ pneu.getHorasDeUso());
            System.out.println("Indíce de vida: "+pneu.getIndiceDeVida());
        }
        pneu.desgastar(15, 20);
        if(pneu.getIndiceDeVida()<=0){
            System.out.println("==================================================");
            System.out.println("NÃO HÁ DESGASTE DAS 15 À 20, PNEU FORA DE USO!!");
        }
        else{
            System.out.println("\nDESGASTE DAS 15 ÀS 20");
            System.out.println("Estado do pneu: "+pneu.getEstado());
            System.out.println("Horas de uso: "+ pneu.getHorasDeUso());
            System.out.println("Indíce de vida: "+pneu.getIndiceDeVida());
        }
        pneu.desgastar(21, 23);
        if(pneu.getIndiceDeVida()<=0){
            System.out.println("==================================================");
            System.out.println("NÃO HÁ DESGASTE DAS 21 À 23, PNEU FORA DE USO!!");
        }
        else{
            System.out.println("\nDESGASTE DAS 21 ÀS 23");
            System.out.println("Estado do pneu: "+pneu.getEstado());
            System.out.println("Horas de uso: "+ pneu.getHorasDeUso());
            System.out.println("Indíce de vida: "+pneu.getIndiceDeVida());
        }
        input.close();
    }
}
