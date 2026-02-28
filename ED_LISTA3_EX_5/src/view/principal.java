package view;
import controller.metodos;
import javax.swing.*;
public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição que deseja:"));

    if(posicao <= 20){
	  metodos c = new metodos();
	  System.out.println(c.fibonacci(posicao));
	}
    else {
    	System.out.println("posição invalida");
    }
 }
}
