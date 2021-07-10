
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;
        

public class TelaJogos extends javax.swing.JFrame {

    /**
     * Creates new form TelaJogos
     */
    public TelaJogos() {
        initComponents();
        setSize(1018,768);
        
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
        lblIniciar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogos Educativos");
        setBounds(new java.awt.Rectangle(50, 50, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(0, 255, 204));
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
        lblSair.setBounds(420, 500, 180, 71);

        lblIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIniciarMouseClicked(evt);
            }
        });
        getContentPane().add(lblIniciar);
        lblIniciar.setBounds(260, 320, 500, 130);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 160, 170);

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Fundo Inicial.jpg"))); // NOI18N
        lblFundo.setText("Aprendendo a Contar");
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

    private void lblIniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIniciarMouseClicked
        TelaEscolha JogoEscolha = new TelaEscolha();
        JogoEscolha.setLocationRelativeTo(null);
	JogoEscolha.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblIniciarMouseClicked
    
    
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
                TelaJogos tela = new TelaJogos();
                tela.setLocationRelativeTo(null);
                tela.setVisible(true);
                //new TelaJogos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblIniciar;
    private javax.swing.JLabel lblSair;
    // End of variables declaration//GEN-END:variables
}
