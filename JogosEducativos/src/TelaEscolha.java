
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;
        

public class TelaEscolha extends javax.swing.JFrame {

    /**
     * Creates new form TelaJogos
     */
    public TelaEscolha() {
        initComponents();
        setSize(1024,768);
        
        
    }
    
    public void playSound(String soundName)
 {
   try 
   {
    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile( ));
    Clip clip = AudioSystem.getClip( );
    clip.open(audioInputStream);
    clip.start( );
   }
   catch(Exception ex)
   {
     System.out.println("Error with playing sound.");
     ex.printStackTrace( );
   }
 }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSair = new javax.swing.JLabel();
        lblSaber = new javax.swing.JLabel();
        lblSons = new javax.swing.JLabel();
        lblAnimais = new javax.swing.JLabel();
        lblCores = new javax.swing.JLabel();
        lblIngles = new javax.swing.JLabel();
        lblBandeira = new javax.swing.JLabel();
        lblContar = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogos Educativos");
        setBounds(new java.awt.Rectangle(50, 50, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName(""); // NOI18N
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        lblSair.setFont(new java.awt.Font("Showcard Gothic", 0, 30)); // NOI18N
        lblSair.setForeground(new java.awt.Color(51, 255, 0));
        lblSair.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Botao sair-iloveimg-resized.png"))); // NOI18N
        lblSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSairMouseClicked(evt);
            }
        });
        getContentPane().add(lblSair);
        lblSair.setBounds(810, 690, 230, 80);

        lblSaber.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N
        getContentPane().add(lblSaber);
        lblSaber.setBounds(10, 10, 160, 170);

        lblSons.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSons.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSonsMouseClicked(evt);
            }
        });
        getContentPane().add(lblSons);
        lblSons.setBounds(550, 60, 240, 180);

        lblAnimais.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAnimais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAnimaisMouseClicked(evt);
            }
        });
        getContentPane().add(lblAnimais);
        lblAnimais.setBounds(230, 310, 240, 180);

        lblCores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCoresMouseClicked(evt);
            }
        });
        getContentPane().add(lblCores);
        lblCores.setBounds(560, 320, 230, 170);

        lblIngles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblIngles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInglesMouseClicked(evt);
            }
        });
        getContentPane().add(lblIngles);
        lblIngles.setBounds(230, 580, 240, 170);

        lblBandeira.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBandeira.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBandeiraMouseClicked(evt);
            }
        });
        getContentPane().add(lblBandeira);
        lblBandeira.setBounds(560, 580, 230, 170);

        lblContar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblContar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblContarMouseClicked(evt);
            }
        });
        getContentPane().add(lblContar);
        lblContar.setBounds(230, 60, 240, 180);

        lblFundo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Menu Principal.png"))); // NOI18N
        lblFundo.setText("Aprendendo a Contar");
        lblFundo.setToolTipText("");
        lblFundo.setMaximumSize(new java.awt.Dimension(1024, 768));
        lblFundo.setMinimumSize(new java.awt.Dimension(1024, 768));
        lblFundo.setName(""); // NOI18N
        lblFundo.setPreferredSize(new java.awt.Dimension(1024, 768));
        getContentPane().add(lblFundo);
        lblFundo.setBounds(0, 0, 1020, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowClosing

    private void lblSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblSairMouseClicked

    private void lblContarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblContarMouseClicked
        TelaJogos TelaJogos = new TelaJogos();
        TelaContagemPT contagem = new TelaContagemPT();
        contagem.setLocationRelativeTo(null);
        contagem.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblContarMouseClicked

    private void lblSonsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSonsMouseClicked
        TelaAnimais tel = new TelaAnimais();
                tel.setLocationRelativeTo(null);
                tel.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_lblSonsMouseClicked

    private void lblAnimaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAnimaisMouseClicked
         TelaPercepcao JogoPercepcao = new TelaPercepcao();
	JogoPercepcao.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblAnimaisMouseClicked

    private void lblCoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCoresMouseClicked
        TelaLigueOsPares_1 pares = new TelaLigueOsPares_1();
        pares.setLocationRelativeTo(null);
        pares.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblCoresMouseClicked

    private void lblInglesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInglesMouseClicked
        TelaJogos TelaJogos = new TelaJogos();
        TelaContagemUSA contagemeua = new TelaContagemUSA();
        contagemeua.setLocationRelativeTo(null);
        contagemeua.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblInglesMouseClicked

    private void lblBandeiraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBandeiraMouseClicked
        TelaLigueOsPares bandeiras = new TelaLigueOsPares();
        bandeiras.setLocationRelativeTo(null);
        bandeiras.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblBandeiraMouseClicked
    
    
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
            java.util.logging.Logger.getLogger(TelaJogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaJogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaJogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaJogos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaEscolha centro = new TelaEscolha();
                centro.setLocationRelativeTo(null);
                centro.setVisible(true);
                //new TelaJogos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAnimais;
    private javax.swing.JLabel lblBandeira;
    private javax.swing.JLabel lblContar;
    private javax.swing.JLabel lblCores;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblIngles;
    private javax.swing.JLabel lblSaber;
    private javax.swing.JLabel lblSair;
    private javax.swing.JLabel lblSons;
    // End of variables declaration//GEN-END:variables
}
