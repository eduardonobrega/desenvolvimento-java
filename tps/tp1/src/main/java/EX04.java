import java.time.LocalDate;
import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate dataAtual = LocalDate.now();

        int diaAtual = dataAtual.getDayOfMonth();
        int mesAtual = dataAtual.getMonthValue();
        int anoAtual = dataAtual.getYear();

        System.out.println("Informe sua dada de nascimento: ");
        System.out.print("Dia: ");
        int diaNascimento =  sc.nextInt();

        System.out.print("Mes: ");
        int mesNascimento = sc.nextInt();

        System.out.print("Ano: ");
        int anoNascimento = sc.nextInt();
        int diasVividos;
        if (anoNascimento == anoAtual) {
            diasVividos = diaDoAno(diaAtual, mesAtual, anoAtual) - diaDoAno(diaNascimento, mesNascimento, anoNascimento);
        }else {

            int quantidadeDiasAnoAtual = diaDoAno(diaAtual, mesAtual, anoAtual);
            int quantidadeDiasAnosInteiros = anosEmDias(anoNascimento + 1, anoAtual - 1);

            diasVividos = quantidadeDiasAnoAtual + quantidadeDiasAnoNascimento(diaNascimento, mesNascimento, anoNascimento) + quantidadeDiasAnosInteiros;
        }


        System.out.println("Dias Vividos: " + diasVividos);
        sc.close();
    }

    static int quantidadeDiasAnoNascimento(int dia, int mes, int ano) {
        if (bissexto(ano)) {
            return 366 - diaDoAno(dia, mes, ano);
        }
        return 365 - diaDoAno(dia, mes, ano);
    }

    static int anosEmDias(int anoInicial, int anoFinal) {
        int dias = 0;
        for  (int i = anoInicial; i <= anoFinal; i++) {
            if (bissexto(i)) {
                dias += 366;
            }else {
                dias += 365;
            }
        }
        return dias;
    }

    static boolean bissexto(int ano) {
        return ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0);
    }

    static int diaDoAno(int dia, int mes, int ano) {
        int[] diasMeses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int diasPassados = dia;

        // -2 pois o array começa no índice zero e não vamos contar o mês atual, pois já pegamos os dias em dia
        if (mes != 1) {
            for (int i = mes - 2; i >= 0; i--) {
                diasPassados += diasMeses[i];
            }
        }

        if (bissexto(ano) && mes > 2) {
            diasPassados += 1;
        }

        return  diasPassados;
    }
}
