/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadepratica;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author 632779
 */
public class AtividadePratica {
    private static Scanner scanner = new Scanner(System.in);
    private static Salao salao1 = new Salao();
    private static Salao salao2 = new Salao();
    private static Salao salao3 = new Salao();
    private static Organizador Carlos = new Organizador();
    private static Organizador Maria = new Organizador();
    private static Organizador Joao = new Organizador();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcao = -1;
        
        do{
            exibirMenu();
            System.out.println("Escolha uma opção //  0 para encerrar! ");
            if (scanner.hasNextInt()){
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            if(opcao == 1){
                cadastraReserva();
            } else if (opcao == 2){
                associarOrganizador();
            } else if (opcao == 3){
                atribuirReserva();
            } else if (opcao == 4){
                exibirReservas();
            } else if (opcao == 5){
                reservasPorSalao();
            } else if (opcao == 6){
                reservaPorStatus();
            } else if (opcao == 7){
                detalhesReserva();
            } else {
                System.out.println("Opcão inválida!");
            }
            }
        }while (opcao != 0);
    }
    private static void exibirMenu(){
        System.out.println("\n--- Menu Festas ---");
        System.out.println("1 -Cadastra reserva ");
        System.out.println("2 -Associar organizador ");
        System.out.println("3 -Atribuir reserva ");
        System.out.println("4 -Exibir reservas ");
        System.out.println("5 -Reservas por salão ");
        System.out.println("6 -Reservas por status ");
        System.out.println("7 -Detalhes reservas ");
        }
    private static void cadastraReserva(){
            
        }
    
    private static void associarOrganizador(){}
    
    private static void atribuirReserva(){}
    
    private static void exibirReservas(){}

    private static void reservasPorSalao(){}
    
    private static void reservaPorStatus(){}
    
    private static void detalhesReserva(){}

    public AtividadePratica() {
        
    }
}
