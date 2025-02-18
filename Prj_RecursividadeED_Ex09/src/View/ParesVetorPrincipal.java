package View;

import Controller.ParesVetorController;

public class ParesVetorPrincipal {
    
    public static void main (String args[]){
        
        ParesVetorController pvc = new ParesVetorController();
        
        int[] vet = {3, 5, 7, 14, 18};
        int tamanho = vet.length;
        int quantidade = pvc.paresVetor(vet, tamanho - 1);
        
        System.out.println("O VETOR POSSUI " + quantidade + " NÚMEROS PARES.");
        
    }
    
}
