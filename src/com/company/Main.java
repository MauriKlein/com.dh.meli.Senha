package com.company;

import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        //Criando um setup de testes
        //este padrão determina que serão aceitos todos os digitos e todos os caracteres.
        Pattern senhaFracaPattern = Pattern.compile("\\w{8}");
        Pattern senhaMediaPattern = Pattern.compile("\\w{10}");
        Pattern senhaFortePattern = Pattern.compile("\\w{12}");

        SenhaFraca senhaFraca = new SenhaFraca(senhaFracaPattern);
        senhaFraca.setValue("mauri1234");

        SenhaMedia senhaMedia = new SenhaMedia(senhaMediaPattern);
        senhaMedia.setValue("mauridhml1234");

        SenhaForte senhaForte = new SenhaForte(senhaFortePattern);
        senhaForte.setValue("mauridhmercadolivre");
    }
}
