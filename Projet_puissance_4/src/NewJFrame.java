//----------------------------------Import--------------------------------------//

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javafx.scene.layout.Border;

//---------------------------------NEWJFrame------------------------------------//

public class NewJFrame extends javax.swing.JFrame{
		protected byte[][] grille;
		public NewJFrame() {
        initComponents();
		}

//---------------------------Initialisation Composents---------------------------//		
		
    private void initComponents() {
    	
    	jFrame1 = new javax.swing.JFrame();
    	jLabel2 = new javax.swing.JLabel();
    	jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        
//---------------------------Initialisation bouton 1---------------------------//
    	
    	jButton1 = new javax.swing.JButton();
    	jButton1.setForeground(new java.awt.Color(51, 51, 255));
        jButton1.setText("Quitter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jButton1KeyReleased(evt);
            }
        });

//---------------------------Initialisation bouton 2---------------------------//    	
        
        jButton2.setText("Facile");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
                JFrame fenetre = new JFrame();
                fenetre.setSize(900, 800);
                JPanel pan = new JPanel (new GridLayout (6,7));
                javax.swing.border.Border blackline = BorderFactory.createLineBorder(Color.black,1); 
                for(int i = 0; i<42;i++){
                   JPanel ptest = new JPanel();
                   ptest.setBorder(blackline);
                   pan.add(ptest);
                }
                pan.setBorder(blackline);
                fenetre.add(pan);
                fenetre.setVisible(true);
                jButton7 = new javax.swing.JButton();
                jButton7.setForeground(new java.awt.Color(0, 0, 255));
                jButton7.setText("Retour");
            }
        });

//---------------------------Initialisation bouton 3---------------------------//   	
    	
        jButton3 = new javax.swing.JButton();
        jButton3.setForeground(new java.awt.Color(0, 0, 255));
        jButton3.setText("Jouer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jButton3KeyReleased(evt);
            }
        });

//---------------------------Initialisation bouton 4---------------------------//       
        
        jButton4.setText("Moyen");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
                JFrame fenetre = new JFrame();
                fenetre.setSize(900, 800);
                JPanel pan = new JPanel (new GridLayout (6,7));
                javax.swing.border.Border blackline = BorderFactory.createLineBorder(Color.black,1); 
                for(int i = 0; i<42;i++){
                   JPanel ptest = new JPanel();
                   ptest.setBorder(blackline);
                   pan.add(ptest);
                }
                pan.setBorder(blackline);
                fenetre.add(pan);
                fenetre.setVisible(true);
            }
        });   
        
//---------------------------Initialisation bouton 5---------------------------//
        
        jButton5.setText("Difficile");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
                JFrame fenetre = new JFrame();
                fenetre.setSize(900, 800);
                JPanel pan = new JPanel (new GridLayout (6,7));
                javax.swing.border.Border blackline = BorderFactory.createLineBorder(Color.black,1); 
                for(int i = 0; i<42;i++){
                   JPanel ptest = new JPanel();
                   ptest.setBorder(blackline);
                   pan.add(ptest);
                }
                pan.setBorder(blackline);
                fenetre.add(pan);
                fenetre.setVisible(true);
            }
        });      
        
//---------------------------Initialisation bouton 6---------------------------//   
        
        jButton6.setText("Retour");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });      
        
//---------------------------Initialisation Panneau---------------------------//       
        
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PUISSANCE 4");
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Puissance 4");
        setBackground(new java.awt.Color(255, 255, 102));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel2.setText("Choix du niveau");
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jFrame1.setTitle("Puissance 4");
        
//------------------Initialisation Interface Choix niveau---------------------//
       
        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                .addGap(125,125,125)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton6)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 45, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel2)
                .addGap(80, 80, 80)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(115, 115, 115))
        );
        pack();

//----------------------Initialisation Interface Fenetre principale-----------------------//        
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
        );
        pack();

    }

//---------------------------------Actions----------------------------------------//   
    
//-------------------------Action bouton 1 (Quitter)------------------------------//    
    private void jButton1KeyReleased(java.awt.event.KeyEvent evt) {}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
      if(evt.getSource()==jButton1){
      this.setVisible(false);
      this.dispose();
      }
    }
    
//--------------------------Action bouton 2 (Facile)------------------------------//
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
    } 
    
//--------------------------Action bouton 3 (Jouer)-------------------------------//   
    
    private void jButton3KeyReleased(java.awt.event.KeyEvent evt) {} 
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(evt.getSource()==jButton3){
       jFrame1.setVisible(true);
       jFrame1.setSize(600, 600);
        }
    }

//--------------------------Action bouton 4 (Moyen)-------------------------------//    
                                           
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {} 
 
//--------------------------Action bouton 5 (Difficile)---------------------------//  
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
    	if(evt.getSource()==jButton5){
 	        }
 }
      
//--------------------------Action bouton 6 (Retour)------------------------------//
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
    	if(evt.getSource()==jButton6){
    	       this.setVisible(true);
    	       jFrame1.setVisible(false);
    	        }
    }
           
//-------------------------------Variables----------------------------------------//
    
    private javax.swing.JButton jButton1; //Quitter
    private javax.swing.JButton jButton2; //Facile
    private javax.swing.JButton jButton3; //Jouer
    private javax.swing.JButton jButton4; //Moyen
    private javax.swing.JButton jButton5; //Difficile
    private javax.swing.JButton jButton6; //Retour
    private javax.swing.JButton jButton7;
    private javax.swing.JFrame jFrame1;	  //Fenetre choix niveau	
    private javax.swing.JLabel jLabel1;   //Label fenetre menu
    private javax.swing.JLabel jLabel2;   //Label fenetre niveau
    
}
