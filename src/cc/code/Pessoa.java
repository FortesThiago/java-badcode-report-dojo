package cc.code;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Pessoa {

    public String name;
    public String cpf;
    public Integer age;
    public List<String> telefonesFixos;
    public List<String> telefonesCelulares;

    public Pessoa() {
    }

    public Pessoa(String name, String cpf, Integer age, List<String> telefonesFixos, List<String> telefonesCelulares) {
        this.name = name;
        this.cpf = cpf;
        this.age = age;
        this.telefonesFixos = telefonesFixos;
        this.telefonesCelulares = telefonesCelulares;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getTelefonesFixos() {
        return telefonesFixos;
    }

    public void setTelefonesFixos(List<String> telefonesFixos) {
        this.telefonesFixos = telefonesFixos;
    }

    public List<String> getTelefonesCelulares() {
        return telefonesCelulares;
    }

    public void setTelefonesCelulares(List<String> telefonesCelulares) {
        this.telefonesCelulares = telefonesCelulares;
    }

    public void cadastrarPessoa() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        this.setName(ler.nextLine());
        System.out.println("Digite o cpf");
        this.setCpf(ler.nextLine());
        System.out.println("Digite a sua idade: ");
        this.setAge(ler.nextInt());
        System.out.println("Digite seu numero de telefone fixo");
        this.setTelefonesCelulares(Collections.singletonList(ler.nextLine()));
        System.out.println("Digite o seu numero de celular");
        this.setTelefonesCelulares(Collections.singletonList(ler.nextLine()));

    }
}
