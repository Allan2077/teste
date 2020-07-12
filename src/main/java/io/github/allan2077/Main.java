package io.github.allan2077;


import java.util.Arrays;
import java.util.List;

class Batata
{
    int valor;
    Batata(int valor){
        this.valor = valor;
    }
}

public class Main {

    public static void main(String args[]){
        List<Batata> batatats = Arrays.asList(new Batata(1), new Batata(2));
        for(Batata b : batatats){
            System.out.println(b.valor);
            String a = "";
        }
    }
}

