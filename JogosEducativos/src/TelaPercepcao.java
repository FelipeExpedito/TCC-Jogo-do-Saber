

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.sql.Connection;

import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Cursor;
import javax.swing.SwingConstants;


public class TelaPercepcao extends JFrame {	
	
	
	private final JLabel lblbckground = new JLabel("Jogo de Percepcao");
        
        JLabel lbl_img_main = new JLabel();
        JLabel lbl_img_op1 = new JLabel();
        JLabel lbl_img_op2 = new JLabel();
        JLabel lbl_img_op3 = new JLabel();
	
	public TelaPercepcao() {

		int princ = 0;
                int c;
		Aleatorio alet = new Aleatorio();
		String vet2[][] = {{"0","macaco1.png","macaco2.png"},
				{"1","zebra1.png","zebra2.png"},
				{"2","leao.png","leao2.png"}};
	
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Jogo de Percepcao");
		setSize(700,600);
		setLocation(0,0);
                setUndecorated(true);
                setLocationRelativeTo(null);
		getContentPane().setLayout(null);
                
                int vetor[] = alet.buscaSub(1);
                
                for(c=0;c<5;c++){
                    
                   System.out.println(vetor[c]);
                    
                }
		
		JLabel label = new JLabel();/*("Voltar ao Menu principal");*/
		label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
                            lblSairMouseClicked(arg0);
			}
		});
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setForeground(Color.GREEN);
		label.setFont(new Font("Showcard Gothic", Font.PLAIN, 30));
		label.setBounds(245, 483, 439, 67);
		getContentPane().add(label);
		
		JLabel lbl_voltar = new JLabel();/*("Voltar ao Menu principal")*/
		lbl_voltar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
                            lblSairMouseClicked(e);                            
			}
		});
		lbl_voltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_voltar.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_voltar.setForeground(Color.GREEN);
		lbl_voltar.setFont(new Font("Showcard Gothic", Font.PLAIN, 30));
		lbl_voltar.setIcon(new ImageIcon(TelaPercepcao.class.getResource("/imagens/Botao voltar.png")));
		lbl_voltar.setBounds(228, 474, 446, 76);
		lbl_voltar.setFont(new java.awt.Font("Showcard Gothic", 0, 30)); // NOI18N
		lbl_voltar.setForeground(new java.awt.Color(51, 255, 0));
		//lbl_voltar.setText("Voltar ao Menu principal");
		lbl_voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		getContentPane().add(lbl_voltar);
		
		JLabel lbl_mold_main = new JLabel("New label");
		lbl_mold_main.setIcon(new ImageIcon(TelaPercepcao.class.getResource("/imagens/moldura_boa.fw.png")));
		lbl_mold_main.setBounds(301, 94, 119, 155);
		getContentPane().add(lbl_mold_main);
		
		lbl_img_main.setBounds(317, 106, 91, 131);
		getContentPane().add(lbl_img_main);
		
		JLabel lbl_mold_op3 = new JLabel("New label");
		lbl_mold_op3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		lbl_mold_op3.setIcon(new ImageIcon(TelaPercepcao.class.getResource("/imagens/moldura_boa.fw.png")));
		lbl_mold_op3.setBounds(543, 293, 119, 155);
		getContentPane().add(lbl_mold_op3);
		
		lbl_img_op3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		lbl_img_op3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			
				if(Integer.parseInt(lbl_img_op3.getText()) == Integer.parseInt(lbl_img_main.getText())){
					JOptionPane.showMessageDialog(null, "Acertou!!");
                                        
                                        //Escolha do Animal
                                        /*0 - macaco
                                         * 1 - zebra
                                         * 2 - leao
                                         */
                                       int princ = 0;
                                       int vlr = Integer.parseInt(lbl_img_main.getText());
                                       int x = 1;
                                       do {
                                           princ = alet.Aleatorio(3)+1;
                                           if (princ-1 != vlr){
                                               x = 0;
                                           }
                                       } while (x == 1);
                                        //preencher princ                                        
                                        
                                        lbl_img_main.setIcon(new ImageIcon(TelaPercepcao.class.getResource("/imagens/animais/" + vet2[princ-1][2])));
                                        lbl_img_main.setText(String.valueOf(princ-1));

                                        int vet[] = alet.AleatorioSub();

                                        //caixa 1
                                        lbl_img_op1.setIcon(new ImageIcon(TelaPercepcao.class.getResource("/imagens/animais/" + vet2[vet[0]-1][1])));
                                        lbl_img_op1.setText(String.valueOf(vet[0]-1));
                                        //caixa 2
                                        lbl_img_op2.setIcon(new ImageIcon(TelaPercepcao.class.getResource("/imagens/animais/" + vet2[vet[1]-1][1])));
                                        lbl_img_op2.setText(String.valueOf(vet[1]-1));
                                        //caixa 3
                                        lbl_img_op3.setIcon(new ImageIcon(TelaPercepcao.class.getResource("/imagens/animais/" + vet2[vet[2]-1][1])));
                                        lbl_img_op3.setText(String.valueOf(vet[2]-1));
                                        
				}
				else {JOptionPane.showMessageDialog(null, "Errou!!");}
				
			}
		});
		lbl_img_op3.setBounds(560, 305, 91, 131);
		getContentPane().add(lbl_img_op3);
		
		JLabel lbl_mold_op2 = new JLabel("New label");
		lbl_mold_op2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		lbl_mold_op2.setIcon(new ImageIcon(TelaPercepcao.class.getResource("/imagens/moldura_boa.fw.png")));
		lbl_mold_op2.setBounds(301, 293, 119, 155);
		getContentPane().add(lbl_mold_op2);
		
		lbl_img_op2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		lbl_img_op2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			
				if(Integer.parseInt(lbl_img_op2.getText()) == Integer.parseInt(lbl_img_main.getText())){
					JOptionPane.showMessageDialog(null, "Acertou!!");
                                        
                                        //Escolha do Animal
                                        /*0 - macaco
                                         * 1 - zebra
                                         * 2 - leao
                                         */
                                       int princ = 0;
                                       int vlr = Integer.parseInt(lbl_img_main.getText());
                                       int x = 1;
                                       do {
                                           princ = alet.Aleatorio(3)+1;
                                           if (princ-1 != vlr){
                                               x = 0;
                                           }
                                       } while (x == 1);	
                                        
                                        lbl_img_main.setIcon(new ImageIcon(TelaPercepcao.class.getResource("/imagens/animais/" + vet2[princ-1][2])));
                                        lbl_img_main.setText(String.valueOf(princ-1));

                                        int vet[] = alet.AleatorioSub();

                                        //caixa 1
                                        lbl_img_op1.setIcon(new ImageIcon(TelaPercepcao.class.getResource("/imagens/animais/" + vet2[vet[0]-1][1])));
                                        lbl_img_op1.setText(String.valueOf(vet[0]-1));
                                        //caixa 2
                                        lbl_img_op2.setIcon(new ImageIcon(TelaPercepcao.class.getResource("/imagens/animais/" + vet2[vet[1]-1][1])));
                                        lbl_img_op2.setText(String.valueOf(vet[1]-1));
                                        //caixa 3
                                        lbl_img_op3.setIcon(new ImageIcon(TelaPercepcao.class.getResource("/imagens/animais/" + vet2[vet[2]-1][1])));
                                        lbl_img_op3.setText(String.valueOf(vet[2]-1));
                                        
				}
				else {JOptionPane.showMessageDialog(null, "Errou!!");}
				
			}
		});
		lbl_img_op2.setBounds(317, 305, 91, 131);
		getContentPane().add(lbl_img_op2);
		
		JLabel lbl_mold_op1 = new JLabel("New label");
		lbl_mold_op1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		lbl_mold_op1.setIcon(new ImageIcon(TelaPercepcao.class.getResource("/imagens/moldura_boa.fw.png")));
		lbl_mold_op1.setBounds(50, 293, 119, 155);
		getContentPane().add(lbl_mold_op1);
		
		lbl_img_op1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		lbl_img_op1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			
				if(Integer.parseInt(lbl_img_op1.getText()) == Integer.parseInt(lbl_img_main.getText())){
					JOptionPane.showMessageDialog(null, "Acertou!!");
                                        
                                        //Escolha do Animal
                                        /*0 - macaco
                                         * 1 - zebra
                                         * 2 - leao
                                         */
                                       int princ = 0;
                                       int vlr = Integer.parseInt(lbl_img_main.getText());
                                       int x = 1;
                                       do {
                                           princ = alet.Aleatorio(3)+1;
                                           if (princ-1 != vlr){
                                               x = 0;
                                           }
                                       } while (x == 1);
                                        
                                        lbl_img_main.setIcon(new ImageIcon(TelaPercepcao.class.getResource("/imagens/animais/" + vet2[princ-1][2])));
                                        lbl_img_main.setText(String.valueOf(princ-1));

                                        int vet[] = alet.AleatorioSub();

                                        //caixa 1
                                        lbl_img_op1.setIcon(new ImageIcon(TelaPercepcao.class.getResource("/imagens/animais/" + vet2[vet[0]-1][1])));
                                        lbl_img_op1.setText(String.valueOf(vet[0]-1));
                                        //caixa 2
                                        lbl_img_op2.setIcon(new ImageIcon(TelaPercepcao.class.getResource("/imagens/animais/" + vet2[vet[1]-1][1])));
                                        lbl_img_op2.setText(String.valueOf(vet[1]-1));
                                        //caixa 3
                                        lbl_img_op3.setIcon(new ImageIcon(TelaPercepcao.class.getResource("/imagens/animais/" + vet2[vet[2]-1][1])));
                                        lbl_img_op3.setText(String.valueOf(vet[2]-1));
                                        
				}
				else {JOptionPane.showMessageDialog(null, "Errou!!");}
				
			}
		});
		lbl_img_op1.setBounds(66, 305, 91, 131);
		getContentPane().add(lbl_img_op1);
		lblbckground.setIcon(new ImageIcon(TelaPercepcao.class.getResource("/imagens/fundo.png")));
		lblbckground.setBounds(0, 0, 700, 600);
		getContentPane().add(lblbckground);
		
		
		
                 //Escolha do Animal
                 /*0 - macaco
                 * 1 - zebra
                 * 2 - leao
                 */

                 princ = alet.Aleatorio(3);
                //preencher princ		
                                        
                lbl_img_main.setIcon(new ImageIcon(TelaPercepcao.class.getResource("/imagens/animais/" + vet2[princ][2])));
                lbl_img_main.setText(String.valueOf(princ));
               
                int vet[] = alet.AleatorioSub();
                
		//caixa 1
		lbl_img_op1.setIcon(new ImageIcon(TelaPercepcao.class.getResource("/imagens/animais/" + vet2[vet[0]-1][1])));
		lbl_img_op1.setText(String.valueOf(vet[0]-1));
		//caixa 2
		lbl_img_op2.setIcon(new ImageIcon(TelaPercepcao.class.getResource("/imagens/animais/" + vet2[vet[1]-1][1])));
		lbl_img_op2.setText(String.valueOf(vet[1]-1));
		//caixa 3
		lbl_img_op3.setIcon(new ImageIcon(TelaPercepcao.class.getResource("/imagens/animais/" + vet2[vet[2]-1][1])));
		lbl_img_op3.setText(String.valueOf(vet[2]-1));
		
		
	}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    
    private void lblSairMouseClicked(java.awt.event.MouseEvent evt) {                                        
        TelaEscolha JogoEscolha = new TelaEscolha();
        JogoEscolha.setLocationRelativeTo(null);
	JogoEscolha.setVisible(true);
        this.dispose();
    }          
    
   /* public int aleatorioMain(){
        
        
        
    }*/
}
