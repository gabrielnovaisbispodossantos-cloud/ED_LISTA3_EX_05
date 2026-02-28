package controller;

public class metodos {
 public metodos () {
	 super();
 }
 public int fibonacci(int n){
     // Condição de parada:
     // posição 1 ou 2 retorna 1
       if(n == 1 || n == 2){
       return 1;
       }
 
     // Relação de chamada:
     // termo atual = termo anterior + termo anterior do anterior
      return fibonacci(n - 1) + fibonacci(n - 2);
}
}