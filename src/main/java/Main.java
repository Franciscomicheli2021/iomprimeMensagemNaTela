import java.awt.desktop.SystemSleepEvent;

// Programa imprime uma mensagem na tela//
//Autor:Francisco


public class Main {
  public static void main(String[] args) {
    //System.out.println("Hello world!");

    //variaveis do tipo booleano
    boolean media = true;
    boolean frequencia = true;
    boolean aprovado = media && frequencia;
    boolean cafe = false;
    boolean agua = true;
    boolean clienteservido = cafe || agua;

    //Variaveis tipo inteiro
    int idade = 20;

    //Variaveis do tipo real
    double salario = 1000.00;
    float temperatura = 25.8f;

    //Variaveis do tipo texto
    String nome = "Francisco";
    String cpf = "123.456.789-00";
    String aniversario = "10/10/2000";


    // Saída
    // System.out.println("Cliente servido? " + clienteservido+ "\n");
    // System.out.println("Cliente servido? " + clienteservido);
  }
}