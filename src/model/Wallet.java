package model;

public class Wallet {

       public static final int capadicadMaxima = 1000000;

       private int saldo;
       private boolean tieneLimite;

       public Wallet () {
           super();
           saldo = 0;
           tieneLimite = true;
       }

        public String saveMoney(int valor) {}