
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felipeec
 */
public class TelaAnimais extends javax.swing.JFrame {

    /**
     * Creates new form TelaNumeros
     */
    public TelaAnimais() {
        initComponents();
        setSize(1024,768);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblVaca = new javax.swing.JLabel();
        lblGato = new javax.swing.JLabel();
        lblElefante = new javax.swing.JLabel();
        lblMacaco = new javax.swing.JLabel();
        lblPorco = new javax.swing.JLabel();
        lblCachorro = new javax.swing.JLabel();
        lblBode = new javax.swing.JLabel();
        lblFunSair = new javax.swing.JLabel();
        lblSaber = new javax.swing.JLabel();
        lblFundo_Sons = new javax.swing.JLabel();

        setBounds(new java.awt.Rectangle(50, 50, 0, 0));
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        lblVaca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVaca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVacaMouseClicked(evt);
            }
        });
        getContentPane().add(lblVaca);
        lblVaca.setBounds(40, 510, 130, 120);

        lblGato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGatoMouseClicked(evt);
            }
        });
        getContentPane().add(lblGato);
        lblGato.setBounds(100, 380, 110, 100);

        lblElefante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblElefante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblElefanteMouseClicked(evt);
            }
        });
        getContentPane().add(lblElefante);
        lblElefante.setBounds(250, 260, 130, 100);

        lblMacaco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMacaco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMacacoMouseClicked(evt);
            }
        });
        getContentPane().add(lblMacaco);
        lblMacaco.setBounds(450, 190, 130, 130);

        lblPorco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPorco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPorcoMouseClicked(evt);
            }
        });
        getContentPane().add(lblPorco);
        lblPorco.setBounds(650, 250, 110, 120);

        lblCachorro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCachorro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCachorroMouseClicked(evt);
            }
        });
        getContentPane().add(lblCachorro);
        lblCachorro.setBounds(810, 340, 100, 150);

        lblBode.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBodeMouseClicked(evt);
            }
        });
        getContentPane().add(lblBode);
        lblBode.setBounds(870, 520, 150, 120);

        lblFunSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Botao voltar.png"))); // NOI18N
        lblFunSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblFunSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFunSairMouseClicked(evt);
            }
        });
        getContentPane().add(lblFunSair);
        lblFunSair.setBounds(570, 690, 450, 70);

        lblSaber.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N
        getContentPane().add(lblSaber);
        lblSaber.setBounds(10, 10, 160, 170);

        lblFundo_Sons.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Fundo sons-02.png"))); // NOI18N
        getContentPane().add(lblFundo_Sons);
        lblFundo_Sons.setBounds(0, 0, 1024, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    TocarSom som = new TocarSom();
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       TelaJogos tll = new TelaJogos();
        tll.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void lblVacaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVacaMouseClicked
        som.playSound("Vaca.wav");
    }//GEN-LAST:event_lblVacaMouseClicked

    private void lblGatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGatoMouseClicked
        som.playSound("Gato.wav");
    }//GEN-LAST:event_lblGatoMouseClicked

    private void lblElefanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblElefanteMouseClicked
        som.playSound("Elefante.wav");
    }//GEN-LAST:event_lblElefanteMouseClicked

    private void lblMacacoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMacacoMouseClicked
        som.playSound("Macaco.wav");
    }//GEN-LAST:event_lblMacacoMouseClicked

    private void lblPorcoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPorcoMouseClicked
        som.playSound("Porco.wav");
    }//GEN-LAST:event_lblPorcoMouseClicked

    private void lblCachorroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCachorroMouseClicked
        som.playSound("Cachorro.wav");
    }//GEN-LAST:event_lblCachorroMouseClicked

    private void lblBodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBodeMouseClicked
        som.playSound("Bode.wav");
    }//GEN-LAST:event_lblBodeMouseClicked

    private void lblFunSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFunSairMouseClicked
        TelaEscolha JogoEscolha = new TelaEscolha();
        JogoEscolha.setLocationRelativeTo(null);
	JogoEscolha.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblFunSairMouseClicked
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
            java.util.logging.Logger.getLogger(TelaAnimais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAnimais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAnimais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAnimais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new TelaAnimais().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBode;
    private javax.swing.JLabel lblCachorro;
    private javax.swing.JLabel lblElefante;
    private javax.swing.JLabel lblFunSair;
    private javax.swing.JLabel lblFundo_Sons;
    private javax.swing.JLabel lblGato;
    private javax.swing.JLabel lblMacaco;
    private javax.swing.JLabel lblPorco;
    private javax.swing.JLabel lblSaber;
    private javax.swing.JLabel lblVaca;
    // End of variables declaration//GEN-END:variables
}
