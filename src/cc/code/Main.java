package cc.code;

import java.util.ArrayList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector v = new Vector();
        ReportDePessoas r = new ReportDePessoas();
        Pessoa p = new Pessoa();
        p.name = "Fulano";
        p.cpf = "0033435457";
        ArrayList<String> pessoaTelefonesFixos = new ArrayList<String>();
        pessoaTelefonesFixos.add("8765343");
        p.telefonesCelulares = pessoaTelefonesFixos;
        v.add(p);

        r.print_e_vai(v);
    }
}
