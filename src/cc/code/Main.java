package cc.code;

import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector v = new Vector();
        ReportDePessoas r = new ReportDePessoas();
        Pessoa p = new Pessoa();
        Scanner ler = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("1- Cadastrar");
            System.out.println("2- Exibir Dados");
            System.out.println("0- Sair");

            opcao = ler.nextInt();
            switch (opcao) {
                case 1:
                    p.cadastrarPessoa();
                    v.add(p);
                    break;
                case 2:
                    if (v.isEmpty()) {
                        System.out.println("Lista vazia");
                    } else {
                        r.print_e_vai(v);
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("ERROR");
            }
        } while (opcao != 0);
    }
}
