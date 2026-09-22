package ex10;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RegistroCompras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomeArquivo = "src/main/java/ex10/compras.txt";

        System.out.println("--- Cadastro de Compras ---");

        // GRAVANDO NO ARQUIVO
        try (PrintWriter escritor = new PrintWriter(new FileWriter(nomeArquivo))) {

            for (int i = 1; i <= 3; i++) {
                System.out.println("Compra #" + i);

                System.out.print("Produto: ");
                String produto = sc.nextLine();

                System.out.print("Quantidade: ");
                int quantidade = sc.nextInt();

                System.out.print("Preço unitário: R$ ");
                double preco = sc.nextDouble();
                sc.nextLine();

                escritor.printf("Produto: %s | Qtd: %d | Preço Unitário: R$ %.2f%n", produto, quantidade, preco);
            }
            System.out.println("\nDados salvos com sucesso no arquivo 'compras.txt'!");

        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo: " + e.getMessage());
        }

        System.out.println("\n--- Lendo o Arquivo ---");

        // LENDO DO ARQUIVO
        try (Scanner leitorArquivo = new Scanner(new File(nomeArquivo))) {
            while (leitorArquivo.hasNextLine()) {
                String linha = leitorArquivo.nextLine();
                System.out.println(linha);
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        sc.close();
    }
}