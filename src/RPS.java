/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WONGHASADORN2
 */
public class RPS extends javax.swing.JFrame {

    /**
     * Creates new form RPS
     */
    int[] score={0,0,0};
    int round =1;
    int hideshow =1;
    public RPS() {
        initComponents();
        winField.setText(Integer.toString(score[0]));
        loseField.setText(Integer.toString(score[1]));
        drawField.setText(Integer.toString(score[2]));
    }
    
//    public static int randCom(int x) {
//        return (int) Math.random()*x;
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        winText = new javax.swing.JLabel();
        winField = new javax.swing.JTextField();
        loseText = new javax.swing.JLabel();
        loseField = new javax.swing.JTextField();
        drawText = new javax.swing.JLabel();
        drawField = new javax.swing.JTextField();
        ResetButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        RockButton = new javax.swing.JButton();
        PaperButton = new javax.swing.JButton();
        ScissorsButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        PlayerText = new javax.swing.JLabel();
        ComputerText = new javax.swing.JLabel();
        PlayerChoose = new javax.swing.JLabel();
        ComputerChoose = new javax.swing.JLabel();
        result = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Log = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        NewGame = new javax.swing.JMenuItem();
        jCheckBoxShowLog = new javax.swing.JCheckBoxMenuItem();
        Quit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rock Paper Scissors by note");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        winText.setText("Win :");

        winField.setEditable(false);
        winField.setText("0");
        winField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                winFieldActionPerformed(evt);
            }
        });

        loseText.setText("Lose :");

        loseField.setEditable(false);
        loseField.setText("0");
        loseField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loseFieldActionPerformed(evt);
            }
        });

        drawText.setText("Draw :");

        drawField.setEditable(false);
        drawField.setText("0");
        drawField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawFieldActionPerformed(evt);
            }
        });

        ResetButton.setText("Reset");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(winText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(winField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loseText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loseField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(drawText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(drawField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(ResetButton)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(winField)
                        .addComponent(loseText)
                        .addComponent(loseField)
                        .addComponent(drawText)
                        .addComponent(drawField)
                        .addComponent(ResetButton))
                    .addComponent(winText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        RockButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rock25.png"))); // NOI18N
        RockButton.setText("Rock");
        RockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RockButtonActionPerformed(evt);
            }
        });

        PaperButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/paper25.png"))); // NOI18N
        PaperButton.setText("Paper");
        PaperButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaperButtonActionPerformed(evt);
            }
        });

        ScissorsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/scissors25.png"))); // NOI18N
        ScissorsButton.setText("Scissors");
        ScissorsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScissorsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PaperButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ScissorsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RockButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PaperButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ScissorsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));

        PlayerText.setText("Player");

        ComputerText.setText("Computer");

        PlayerChoose.setBackground(new java.awt.Color(255, 255, 255));
        PlayerChoose.setText("Player Choose");

        ComputerChoose.setBackground(new java.awt.Color(255, 255, 255));
        ComputerChoose.setText("Player Choose");

        result.setText("result");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(PlayerChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(87, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(PlayerText)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(ComputerText))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(ComputerChoose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PlayerText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PlayerChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(result)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ComputerChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ComputerText)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));

        Log.setEditable(false);
        Log.setColumns(20);
        Log.setRows(5);
        jScrollPane1.setViewportView(Log);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Log of Fight");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 270, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        NewGame.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        NewGame.setText("New Game");
        NewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewGameActionPerformed(evt);
            }
        });
        jMenu1.add(NewGame);

        jCheckBoxShowLog.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jCheckBoxShowLog.setSelected(true);
        jCheckBoxShowLog.setText("Show Log");
        jCheckBoxShowLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxShowLogActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxShowLog);

        Quit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        Quit.setText("Quit");
        Quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitActionPerformed(evt);
            }
        });
        jMenu1.add(Quit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void winFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_winFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_winFieldActionPerformed

    private void loseFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loseFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loseFieldActionPerformed

    private void drawFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drawFieldActionPerformed

    private void RockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RockButtonActionPerformed
        PlayerChoose.setText("ROCK");
        PlayerChoose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rock25.png")));
    int comC = (int) (Math.random()*3);
        if ( comC == 0){
            ComputerChoose.setText("ROCK");
            ComputerChoose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rock25.png")));
            result.setText("DRAW");
            score[2]=score[2]+1;
            Log.append(round+" Player Rock |DRAW| Computer Rock. \n");
            round++;
        }else if(comC == 1){
            ComputerChoose.setText("PAPER");
            ComputerChoose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/paper25.png")));
            result.setText("WIN");
            score[1]=score[1]+1;
            Log.append(round+" Player Rock |WIN| Computer Paper. \n");
            round++;
        }else if(comC == 2){
            ComputerChoose.setText("SCISSORS");
            ComputerChoose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/scissors25.png")));
            result.setText("LOSE");
            score[0]=score[0]+1;
            Log.append(round+" Player Rock |LOSE| Computer Scissors. \n");
            round++;
        }
        updateScore();
                
// TODO add your handling code here:
    }//GEN-LAST:event_RockButtonActionPerformed

    private void PaperButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaperButtonActionPerformed
        PlayerChoose.setText("PAPER");
        PlayerChoose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/paper25.png")));
    int comC = (int) (Math.random()*3);
        if ( comC == 0){
            ComputerChoose.setText("ROCK");
            ComputerChoose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rock25.png")));
            result.setText("WIN");
            score[0]=score[0]+1;
            Log.append(round+" Player Paper |WIN| Computer Rock. \n");
            round++;
        }else if(comC == 1){
            ComputerChoose.setText("PAPER");
            ComputerChoose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/paper25.png")));
            result.setText("DRAW");
            score[2]=score[2]+1;
            Log.append(round+" Player Paper |DRAW| Computer Paper. \n");
            round++;
        }else if(comC == 2){
            ComputerChoose.setText("SCISSORS");
            ComputerChoose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/scissors25.png")));
            result.setText("LOSE");
            score[1]=score[1]+1;
            Log.append(round+" Player Paper |LOSE| Computer Scissors. \n");
            round++;
        }
        updateScore();

// TODO add your handling code here:
    }//GEN-LAST:event_PaperButtonActionPerformed

    private void ScissorsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScissorsButtonActionPerformed
            PlayerChoose.setText("SCISSORS");
            PlayerChoose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/scissors25.png")));
    int comC = (int) (Math.random()*3);
        if ( comC == 0){
            ComputerChoose.setText("ROCK");
            ComputerChoose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rock25.png")));
            result.setText("LOSE");
            score[1]=score[1]+1;
            Log.append(round+" Player Scissors |LOSE| Computer Rock. \n");
            round++;
        }else if(comC == 1){
            ComputerChoose.setText("PAPER");
            ComputerChoose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/paper25.png")));
            result.setText("WIN");
            score[0]=score[0]+1;
            Log.append(round+" Player Scissors |WIN| Computer Paper. \n");
            round++;
        }else if(comC == 2){
            ComputerChoose.setText("SCISSORS");
            ComputerChoose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/scissors25.png")));
            result.setText("DRAW");
            score[2]=score[2]+1;
            Log.append(round+" Player Scissors |DRAW| Computer Scissors. \n");
            round++;
        }
        updateScore();

// TODO add your handling code here:
    }//GEN-LAST:event_ScissorsButtonActionPerformed

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        score[0]=0;
        score[1]=0;
        score[2]=0;
        Log.setText("");
        round =1;
        updateScore();
        // TODO add your handling code here:
    }//GEN-LAST:event_ResetButtonActionPerformed

    private void jCheckBoxShowLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxShowLogActionPerformed
        if(hideshow==1){
        jPanel4.setVisible(false);
        hideshow=2;
        }else {
        jPanel4.setVisible(true);
        hideshow=1;
        }
    }//GEN-LAST:event_jCheckBoxShowLogActionPerformed

    private void NewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewGameActionPerformed
        score[0]=0;
        score[1]=0;
        score[2]=0;
        Log.setText("");
        round =1;
        updateScore();
    }//GEN-LAST:event_NewGameActionPerformed

    private void QuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuitActionPerformed

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
            java.util.logging.Logger.getLogger(RPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RPS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ComputerChoose;
    private javax.swing.JLabel ComputerText;
    private javax.swing.JTextArea Log;
    private javax.swing.JMenuItem NewGame;
    private javax.swing.JButton PaperButton;
    private javax.swing.JLabel PlayerChoose;
    private javax.swing.JLabel PlayerText;
    private javax.swing.JMenuItem Quit;
    private javax.swing.JButton ResetButton;
    private javax.swing.JButton RockButton;
    private javax.swing.JButton ScissorsButton;
    private javax.swing.JTextField drawField;
    private javax.swing.JLabel drawText;
    private javax.swing.JCheckBoxMenuItem jCheckBoxShowLog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField loseField;
    private javax.swing.JLabel loseText;
    private javax.swing.JLabel result;
    private javax.swing.JTextField winField;
    private javax.swing.JLabel winText;
    // End of variables declaration//GEN-END:variables

    private void updateScore() {
        winField.setText(Integer.toString(score[0]));
        loseField.setText(Integer.toString(score[1]));
        drawField.setText(Integer.toString(score[2]));
    }

    
}
