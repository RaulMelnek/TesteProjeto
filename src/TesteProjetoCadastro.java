import java.util.Scanner;

public class TesteProjetoCadastro {
    public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            System.out.println("Cadastro de Clientes");
            
                    System.out.println("Nome completo: ");
                String nome =sc.nextLine();
                    System.out.println("Email: ");
                String email =sc.nextLine();
                    System.out.println("Telefone: ");
                String telefone =sc.nextLine();
                    System.out.println("Endereço e número: ");
                String endereco =sc.nextLine();
                
            System.out.println("Confirme os dados abaixo:");
            System.out.println("Nome: " + nome);
            System.out.println("Email: " + email);
            System.out.println("Telefone: " + telefone);
            System.out.println("Endereço: " + endereco);

            System.out.println("Deseja confirmar os dados? (S/N)");
            String confirmar = sc.nextLine();
            if (confirmar.equalsIgnoreCase("S")) {
                System.out.println("Cadastro realizado com sucesso!");
            }
            sc.close();
    }
}
