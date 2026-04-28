package sistemacinema;

import java.util.Scanner;

public class SistemaCinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   
        int[][] sala = new int[6][8]; 
        int opcao = 0;
       
        while (opcao != 5) {
        System.out.println("\n1-Reservar 2-Cancelar 3-Mapa 4-Status 5-Sair");
        System.out.print("Escolha uma opcao: ");
         opcao = sc.nextInt();
          
         switch (opcao) {
          case 1 ->                     {
        System.out.print("Fileira (1-6): ");
         int f = sc.nextInt();
        System.out.print("Assento (1-8): ");
         int a = sc.nextInt();
         if (f >= 1 && f <= 6 && a >= 1 && a <= 8) {
         if (sala[f-1][a-1] == 0) {
          sala[f-1][a-1] = 1;
        System.out.println("Reservado com sucesso!");
          } else {
        System.out.println("Erro: Assento ocupado!");
                            }
        } else {
        System.out.println("Erro: Fileira ou assento invalido!");
                        }                          }
                case 2 ->                     {
         System.out.print("Fileira (1-6): ");
          int f = sc.nextInt();
        System.out.print("Assento (1-8): ");
          int a = sc.nextInt();
          if (f >= 1 && f <= 6 && a >= 1 && a <= 8) {
          if (sala[f-1][a-1] == 1) {
         sala[f-1][a-1] = 0;
        System.out.println("Reserva cancelada!");
           } else {
        System.out.println("Erro: Assento ja esta livre!");
                            }
        } else {
        System.out.println("Erro: Invalido!");
            }                          }
         case 3 -> {
         for (int i = 0; i < 6; i++) {
        System.out.print("Fileira " + (i + 1) + ": ");
        for (int j = 0; j < 8; j++) {
        System.out.print(sala[i][j] + " ");
           }
        System.out.println();
          }
                }
        case 4 -> {
         int ocupados = 0;
         for (int i = 0; i < 6; i++) {
        for (int j = 0; j < 8; j++) {
         if (sala[i][j] == 1) {
         ocupados = ocupados + 1;
         }
         }
       }   int livres = 48 - ocupados;
       double perc = (ocupados * 100.0) / 48; 
       System.out.println("Assentos Livres: " + livres);
       System.out.println("Assentos Ocupados: " + ocupados);
       System.out.println("Ocupacao: " + perc + "-");
                }
                case 5 -> System.out.println("Encerrando sistema...");
                default -> System.out.println("Opcao incorreta!");
            }
        }
    }
}