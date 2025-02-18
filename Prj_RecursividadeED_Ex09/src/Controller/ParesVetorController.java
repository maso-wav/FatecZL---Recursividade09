package Controller;

public class ParesVetorController {
    
    public ParesVetorController(){
        
        super();        
    }
    
    public int paresVetor(int[] vetor, int tamanho){
        
        if(tamanho == 0){
            
            return 0;
            
        } else if(vetor[tamanho] %2 == 0){
            
            return 1 + paresVetor(vetor, (tamanho - 1));
            
        } else {
            
            return 0 + paresVetor(vetor, (tamanho - 1));
        }
    }
}
