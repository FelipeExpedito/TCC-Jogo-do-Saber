
import javax.swing.ImageIcon;

public class carregarLbls {
        
    public int i1 = 0, i2 = 0, i3 = 0;
    public String vet[][] = {{"0","Brasil","Brazil.png","0"},
                      {"1","Estados Unidos da America","EUA.png","0"},
                      {"2","Argentina","Argentina.png","0"},
                      {"3","França","França.png","0"},
                      {"4","Portugal","Portugal.png","0"}};
    
    ImageIcon iconBand;
    public String s = new String();
    
    
    public int Random(){
        double x = 0 + Math.random() * (5-1);
        int rand = (int) x;

    return rand;
        
    }
    
    
    public int Random_2(){
        double x = 0 + Math.random() * (3-1);
        int rand2 = (int) x;
        
    return rand2;
        
    }
    
    public ImageIcon loadIMG(int n){
                
        iconBand = new ImageIcon(getClass().getResource(vet[n][2]));
        vet[n][3] = "1";
        
        return iconBand;
    }
    
    
    
    public String preencherLbl(int n, String txt1, String txt2){
          
        i1 = n;
        i2 = Random();
        i3 = Random();
        
        do{
            s = vet[i1][2];
        }while(Integer.parseInt(vet[i1][3]) == 0);
        return "0";
    }
       
}
    

