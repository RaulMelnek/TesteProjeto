package Cadastro;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TesteCadastro {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String fileName = "usuarios_salvos.txt";
        try (FileWriter writer = new FileWriter(fileName, true)) {
            while (true) {
                System.out.println("Cadastro de Clientes");
                
                // Dados pessoais
                System.out.println("Nome completo: ");
                String nome = sc.nextLine();
                System.out.println("Email: ");
                String email = sc.nextLine();
                System.out.println("Telefone: ");
                String telefone = sc.nextLine();
                System.out.println("Endereço e número: ");
                String endereco = sc.nextLine();

                // Confirma
                System.out.println("Confirme os dados abaixo:");
                System.out.println("Nome: " + nome + "\n" + "Email: " + email + "\n" 
                + "Telefone: " + telefone + "\n" + "Endereço: " + endereco);

                System.out.println("Deseja confirmar os dados? (S/N)");
                String confirmar = sc.nextLine();
                if (confirmar.equalsIgnoreCase("S")) {
                    writer.write("Nome: " + nome + "\nEmail: " + email + "\nTelefone: " +
                    telefone + "\nEndereço: " + endereco +"\n");
                    System.out.println("Cadastro realizado com sucesso!");
                } else {
                    System.out.println("Cadastro cancelado.");
                }

                System.out.println("Deseja continuar? (S/N)");
                String continuar = sc.nextLine();
                if (!continuar.equalsIgnoreCase("S")) {
                    break;
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao salvar o arquivo: " + e.getMessage());
        }

        sc.close();
    }
}