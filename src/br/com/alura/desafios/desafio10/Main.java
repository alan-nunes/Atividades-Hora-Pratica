package br.com.alura.desafios.desafio10;

public class Main {
    public static void main(String[] args) {
        //Cachorro cachorro = new Cachorro();
        Animal animal = new Cachorro();

        if (animal instanceof Cachorro){
            Cachorro cachorro = (Cachorro) animal;
            // Agora você pode usar o objeto 'cachorro' como um Cachorro.
        } else{
            System.out.println("O objeto não é um Cachorro");
        }
    }

}
