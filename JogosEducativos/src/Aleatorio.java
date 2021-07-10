

import java.util.Random;

public class Aleatorio {
public static int alt = 0;

	public int Aleatorio(int alet) {
		
		//instância um objeto da classe Random usando o construtor padrão
		Random gerador = new Random();
		alt = gerador.nextInt(alet);
	 	
	    return alt;
	    
	}
        
        public int[] AleatorioSub(){
            		
                //preencher opcoes
		
		int i = 0;
		int j = 0;
		int sv = 0;
		int opt = 0;
		int vet[] = new int[3];

		for(i=0;i<3;i++){

			sv = 0;
			do {
				sv = 1;
				opt = Aleatorio(3)+1;
				for(j=0;j<3;j++){
					if(opt == vet[j]){
						sv = 0;
					}
					
				}
				if(sv==1){
					vet[i] = opt;
					
				}
				
			}while (sv != 1);
				
		}
		
        return vet;
        }
        
        public int[] buscaSub(int pri) {
            
            int i; //contador vet_sec
            int w = 4; //contador
            int k = 9; //alet
            int aleat = 0;
            int vet_ord[] = {1,2,3,4,5,6,7,8,9,10};
            int vet_sec[] = new int [w+1];
                        
            vet_sec[Aleatorio(w)] = pri;
            
            for(i=0;i<w+1;i++){
                
                if (vet_sec[i] == 0){
                    
                    do{
                        
                        aleat = Aleatorio(k);
                        
                    } while(vet_ord[aleat] == 0 || vet_ord[aleat] == pri);
                    
                    vet_sec[i] = vet_ord[aleat];
                    vet_ord[aleat] = 0;
                    System.out.println(vet_sec[i]);
                    
                }
                
            }           

        return vet_sec;}
}
