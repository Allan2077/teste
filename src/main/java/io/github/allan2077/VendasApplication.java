package io.github.allan2077;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class VendasApplication {

    @GetMapping("/hello")
    public String helloworld() {
    Carro carro = new Carro("", 1);

       return "";
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}

class Generica<T>{

    final T valor;

    Generica(T valor){
        this.valor = valor;
    }
}


abstract class Ser implements SerI{
    abstract void viver();
    abstract void andar();
}

class Humano extends Ser{
    @Override
    void viver() {
        System.out.printf("Doni %d", 1);
    }

    @Override
    void andar() {

    }

    @Override
    public void correr() {
        System.out.println("CorrerI");
    }

    @Override
    public void teste() {

    }
}

interface SerI extends B
{
    void correr();
}

interface B{
    void teste();
}

class Protegida{
 protected void teste(){

 }
}

class Protegida2 extends Protegida{
    void teste2(){
        super.teste();
    }
}

