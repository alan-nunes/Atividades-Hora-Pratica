package br.com.alura.desafios.desafio35;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Horario {
    public static void main(String[] args) {
        LocalTime Hhoje = LocalTime.now();
        System.out.println(Hhoje);

        LocalDateTime hDHoje = LocalDateTime.now();
        System.out.println(hDHoje);

        //Formatar Data
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        System.out.println(hDHoje.format(formatador));

    }
}

//Mês completo	    MMMM	Setembro
//Mês abreviado	    MMM	    Set.
//Mês numérico	    MM	    09