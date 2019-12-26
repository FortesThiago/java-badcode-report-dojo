package cc.code;

import java.util.ArrayList;
import java.util.List;

public class Validation {

    protected List<String> validaPessoa(Pessoa pessoa) {
        List<String> constraints = new ArrayList<String>();
        if (pessoa != null && pessoa.cpf != null && pessoa.name != null && pessoa.telefonesFixos != null) {
            for (String telefone : pessoa.telefonesFixos) {
                if (telefone != null && telefone.isEmpty()) {
                    constraints.add("Erro - Telefone inválido");
                    return constraints;
                } else {
                    if (telefone.length() < 7) {
                        constraints.add("Erro - Telefone inválido");
                        {
                            return constraints;
                        }
                    } else {
                        constraints.add("Erro - Telefone inválido");
                    }
                }
            }
        }
        return constraints;
    }
}