package com.company;

import java.util.regex.Pattern;

public abstract class Senha {
    public String senha;
    public Pattern padrao;

    public Senha(Pattern padrao) {
        this.padrao = padrao;
    }

    public void setValue(String senha) {
            if (padrao.matcher(senha).find()) {
                this.senha = senha;
                System.out.println("A senha foi aceita");
            } else {
                System.out.println("A senha é considerada fora dos padrões");
            }

    }
}
