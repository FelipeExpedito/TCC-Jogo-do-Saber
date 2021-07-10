import java.awt.Component;
import java.awt.Cursor;
import java.awt.Point;
import static java.lang.Thread.sleep;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felipeec
 */
public class TelaLigueOsPares1 extends javax.swing.JFrame {
    boolean mousePress = false;
    boolean mousePress1 = false;
    boolean mousePress2 = false;
    public String txt1, txt2, txt3; 
    String vet[][] = {{"0","Brasil","Brazil.png","0"},
                      {"1","Estados Unidos","EUA.png","0"},
                      {"2","Argentina","Argentina.png","0"},
                      {"3","França","França.png","0"},
                      {"4","Portugal","Portugal.png","0"}};    
    carregarLbls loadLbl = new carregarLbls();
    int z = loadLbl.Random();
    ImageIcon bandeira = loadLbl.loadIMG(z);
    
    public TelaLigueOsPares1() {
        initComponents();
        setSize(1024,768);
        new Mover().start();
        lblBandeira.setIcon(loadLbl.loadIMG(z));     
        
        txt3 = vet[z][1];

            int band = 0;
            int band1 = 0;
            int band2 = 0;
            double x = 0 + Math.random() * (4-1);
            band = (int) x;
            while (band == z){
                double x1 = 0 + Math.random() * (4-1);
                band = (int) x1;
            }
            while (band1 == z || band1 == band){
                double x2 = 0 + Math.random() * (4-1);
                band1 = (int) x2;
            }
            txt2 = vet[band][1];
            txt1 = vet[band1][1];
        String vet2[] = {txt1,txt2,txt3};
        int j;
        int k = 0;
        int l = 0;
        double j1 = 0 + Math.random() * (3-1);
        j = (int) j1;
        if (j == 0){
            k = (int) j+1;
            l = (int) j+2;
        }if (j == 1){
            k = (int) j+1;
            l = (int) j-1;
        }if (j == 2){
            k = (int) j-1;
            l = (int) j-2;
        }
        lbl01.setText(vet2[j]);
        lbl02.setText(vet2[k]);
        lbl03.setText(vet2[l]);
    }            

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblVerificar = new javax.swing.JLabel();
        lbl01 = new javax.swing.JLabel();
        lbl02 = new javax.swing.JLabel();
        lbl03 = new javax.swing.JLabel();
        lblBandeira = new javax.swing.JLabel();
        lblBotão = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblSair = new javax.swing.JLabel();
        lblFunSair = new javax.swing.JLabel();
        lblSaber = new javax.swing.JLabel();
        lblFundoCores = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 255));
        setBounds(new java.awt.Rectangle(50, 150, 0, 0));
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        lblVerificar.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        lblVerificar.setForeground(new java.awt.Color(51, 255, 51));
        lblVerificar.setText("Verificar Resposta");
        lblVerificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVerificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVerificarMouseClicked(evt);
            }
        });
        getContentPane().add(lblVerificar);
        lblVerificar.setBounds(760, 470, 260, 40);

        lbl01.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        lbl01.setForeground(new java.awt.Color(255, 255, 255));
        lbl01.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl01.setText("Brasil");
        lbl01.setToolTipText("");
        lbl01.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl01.setName("Brasil"); // NOI18N
        lbl01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl01MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lbl01MouseReleased(evt);
            }
        });
        getContentPane().add(lbl01);
        lbl01.setBounds(10, 210, 430, 40);

        lbl02.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        lbl02.setForeground(new java.awt.Color(255, 255, 255));
        lbl02.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl02.setText("Espanha");
        lbl02.setToolTipText("");
        lbl02.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl02.setName("Espanha"); // NOI18N
        lbl02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl02MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lbl02MouseReleased(evt);
            }
        });
        getContentPane().add(lbl02);
        lbl02.setBounds(10, 360, 430, 40);

        lbl03.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        lbl03.setForeground(new java.awt.Color(255, 255, 255));
        lbl03.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl03.setText("Inglaterra");
        lbl03.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl03.setName("Inglaterra"); // NOI18N
        lbl03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl03MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lbl03MouseReleased(evt);
            }
        });
        getContentPane().add(lbl03);
        lbl03.setBounds(10, 510, 430, 40);

        lblBandeira.setName("OI"); // NOI18N
        getContentPane().add(lblBandeira);
        lblBandeira.setBounds(550, 20, 440, 290);

        lblBotão.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Moldura.png"))); // NOI18N
        getContentPane().add(lblBotão);
        lblBotão.setBounds(740, 410, 460, 150);

        lblNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Moldura.png"))); // NOI18N
        getContentPane().add(lblNome);
        lblNome.setBounds(540, 260, 460, 150);

        lblSair.setFont(new java.awt.Font("Showcard Gothic", 0, 30)); // NOI18N
        lblSair.setForeground(new java.awt.Color(51, 255, 0));
        lblSair.setText("Voltar ao Menu principal");
        lblSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSairMouseClicked(evt);
            }
        });
        getContentPane().add(lblSair);
        lblSair.setBounds(590, 710, 420, 45);

        lblFunSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Moldura.png"))); // NOI18N
        getContentPane().add(lblFunSair);
        lblFunSair.setBounds(570, 690, 450, 70);

        lblSaber.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N
        getContentPane().add(lblSaber);
        lblSaber.setBounds(10, 10, 160, 170);

        lblFundoCores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Fundo Bandeiras.jpg"))); // NOI18N
        getContentPane().add(lblFundoCores);
        lblFundoCores.setBounds(0, 0, 1020, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        TelaJogos tl = new TelaJogos();
        tl.setVisible(true);
    }//GEN-LAST:event_formWindowClosing
   
    //lblBandeira.setIcon(iconBand);
    
    private void lblVerificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVerificarMouseClicked
        System.out.println(Integer.toString(loadLbl.Random()));
        System.out.println(Integer.toString(loadLbl.Random_2()));
        if (Integer.parseInt(vet[loadLbl.Random_2()][3]) == 1){
              
          }
          lblBandeira.setIcon(loadLbl.loadIMG(loadLbl.Random()));   
    }//GEN-LAST:event_lblVerificarMouseClicked
    
    
    public class Mover extends Thread{
        public void run(){
            while(true){
                try{sleep(10);}catch(Exception erro){}
                if (mousePress){
                Point ponto = getMousePosition();
                lbl01.setBounds(ponto.x-215, ponto.y-40, 430, 40);             
                }
                if (mousePress1){
                Point ponto = getMousePosition();
                lbl02.setBounds(ponto.x-215, ponto.y-40, 430, 40);
                }
                if (mousePress2){
                Point ponto = getMousePosition();
                lbl03.setBounds(ponto.x-215, ponto.y-40, 430, 40);
                }
                
                
                
            }
        }
    }
    
    private void lbl01MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl01MousePressed
        mousePress = true;
        lbl01.setCursor(new Cursor(Cursor.MOVE_CURSOR));
    }//GEN-LAST:event_lbl01MousePressed

    private void lbl01MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl01MouseReleased
        mousePress = false;
        if(acertou(lbl01,lblNome)){
            lbl02.setLocation(10, 360);
            lbl03.setLocation(10, 510);
            lbl01.setLocation(540,320);
            lblBandeira.setName(lbl01.getText());
        }else{
            lbl01.setLocation(10, 210);
            lblBandeira.setName("OI");
        }
        lbl01.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lbl01MouseReleased

    private void lbl02MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl02MousePressed
        mousePress1 = true;
        lbl02.setCursor(new Cursor(Cursor.MOVE_CURSOR));
    }//GEN-LAST:event_lbl02MousePressed

    private void lbl02MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl02MouseReleased
        mousePress1 = false;
        if(acertou(lbl02,lblNome)){
            lbl03.setLocation(10, 510);
            lbl01.setLocation(10, 210);
            lbl02.setLocation(540,320);
            lblBandeira.setName(lbl02.getText());
        }else{
            lbl02.setLocation(10, 360);
            lblBandeira.setName("OI");   
        }
        lbl02.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lbl02MouseReleased

    private void lbl03MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl03MousePressed
        mousePress2 = true;
        lbl03.setCursor(new Cursor(Cursor.MOVE_CURSOR));
    }//GEN-LAST:event_lbl03MousePressed

    private void lbl03MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl03MouseReleased
        mousePress2 = false;
        if(acertou(lbl03,lblNome)){
            lbl01.setLocation(10, 210); 
            lbl02.setLocation(10, 360);
            lbl03.setLocation(540,320);
            lblBandeira.setName(lbl03.getText());
        }else{
            lbl03.setLocation(10, 510);
            lblBandeira.setName("OI");
        }
        lbl03.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lbl03MouseReleased

    private void lblSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseClicked
        TelaEscolha JogoEscolha = new TelaEscolha();
        JogoEscolha.setLocationRelativeTo(null);
	JogoEscolha.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblSairMouseClicked
 
    public boolean acertou(Component a,Component b){            
                int aX = a.getX();
		int aY = a.getY();
		int ladoDireitoA = aX+a.getWidth()/2;
		int ladoEsquerdoA= aX;
		int ladoBaixoA= aY+a.getHeight()/2;
		int ladoCimaA= aY;
		
		int bX = b.getX();
		int bY = b.getY();
		int ladoDireitoB = bX+b.getWidth()/2;
		int ladoEsquerdoB= bX;
		int ladoBaixoB= bY+b.getHeight()/2;
		int ladoCimaB= bY;
		
		boolean acertou = false;
		
		boolean cDireita=false;
		boolean cCima=false;
		boolean cBaixo=false;
		boolean cEsquerda=false;
                	
		if(ladoDireitoA>=ladoEsquerdoB) {
			cDireita=true;
		}
		if(ladoCimaA<=ladoBaixoB) {
			cCima=true;
		}
		if(ladoBaixoA>=ladoCimaB) {
			cBaixo=true;
		}
		if(ladoEsquerdoA<=ladoDireitoB) {
			cEsquerda=true;
		}
		
		if(cDireita && cEsquerda && cBaixo && cCima) {
			acertou = true;
		}
			
		return acertou;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLigueOsPares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLigueOsPares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLigueOsPares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLigueOsPares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLigueOsPares().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl01;
    private javax.swing.JLabel lbl02;
    private javax.swing.JLabel lbl03;
    private javax.swing.JLabel lblBandeira;
    private javax.swing.JLabel lblBotão;
    private javax.swing.JLabel lblFunSair;
    private javax.swing.JLabel lblFundoCores;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSaber;
    private javax.swing.JLabel lblSair;
    private javax.swing.JLabel lblVerificar;
    // End of variables declaration//GEN-END:variables
}
