import java.util.Scanner;

public class EX09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Senha: ");
        String senha = input.nextLine();
        String confirmacaoSenha;

        do {
            System.out.print("Confirme a senha: ");
            confirmacaoSenha = input.nextLine();

            if (confirmacaoSenha.equals(senha)) {
                System.out.println("Senha valida");
            }else {
                System.out.println("Senha invalida, tente novamente");
            }
        } while (!confirmacaoSenha.equals(senha));

        input.close();
    }
}
