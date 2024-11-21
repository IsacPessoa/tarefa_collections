package br.com.ilima;

import java.util.*;

public class ListaNomes {

    public static void main(String[] args) {
        listaNomes();
        listaMascFem();
    }

    private static void listaNomes() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os nomes para adicionar a lista separados por , : ");
        String resposta = sc.nextLine();

        Set<String> names = new TreeSet<>();

        for(String name : resposta.split(",")) {
            names.add(name.trim());
        }

        for (String name : names) {
            System.out.println(name);
        }

    }

    private static void listaMascFem() {
        Scanner sc = new Scanner(System.in);

        Map<String, String> listM = new TreeMap<>();
        Map<String, String> listF = new TreeMap<>();

        System.out.println("Digite os nomes para adicionar a lista separados por , : ");
        System.out.println( "modelo (nome - sexo, nome - sexo)");
        String resposta = sc.nextLine();

        String[] inputs = resposta.split(",");

        for(String input : inputs) {
            String[] keyValue = input.split("-");

            if (keyValue.length == 2) {
                String key = keyValue[0].trim();
                String value = keyValue[1].trim();

                if (value.equalsIgnoreCase("M")) {
                    listM.put(key, value);
                } else if (value.equalsIgnoreCase("F")) {
                    listF.put(key, value);
                }
            }
        }

        System.out.println("******** Lista Masculino *******");
        listM.forEach((key, value) -> System.out.println(key + " - " + value));

        System.out.println("******** Lista Feminino *******");
        listF.forEach((key, value) -> System.out.println(key + " - " + value));

    }

}
