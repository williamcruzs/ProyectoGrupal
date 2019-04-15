/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import com.sun.prism.paint.Color;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;



public final class Jugadorvrscomputadora extends javax.swing.JFrame {

    BufferedReader recibir = new BufferedReader(new InputStreamReader(System.in));
    int n = 0;
    private String turno = "X";
    String mensajeConfirmacion = null;
    String matriz[][] = new String[3][3];
    int contador = 0;
    int j = 0;
    int i = 0;
    String prueba;

    public Jugadorvrscomputadora() {
        initComponents();
        setSize(1000, 650);
        transparencia();
        //seleccionxo();
        setLocationRelativeTo(null);
        for (int k = 0; k < matriz.length; k++) {
            for (int l = 0; l < matriz.length; l++) {
                matriz[k][l] = "";
            }
        }
    }

    private void seleccionxo() {
        if (turno.equals("X")) {
            turno = "0";
        } else {
            turno = "X";
        }
    }
    public void transparencia() {
        jButton1.setOpaque(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setBorderPainted(false);
        jButton2.setOpaque(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setBorderPainted(false);
        jButton3.setOpaque(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setBorderPainted(false);
        jButton4.setOpaque(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setBorderPainted(false);
        jButton5.setOpaque(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setBorderPainted(false);
        jButton6.setOpaque(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setBorderPainted(false);
        jButton7.setOpaque(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setBorderPainted(false);
        jButton8.setOpaque(false);
        jButton8.setContentAreaFilled(false);
        jButton8.setBorderPainted(false);
        jButton9.setOpaque(false);
        jButton9.setContentAreaFilled(false);
        jButton9.setBorderPainted(false);

    }
private  void ganadorx() {

        JOptionPane.showMessageDialog(null, "El ganador es: X", "FELICIDADES", JOptionPane.INFORMATION_MESSAGE);
    }
    private void ganadorO() {

        JOptionPane.showMessageDialog(null, "El ganador es: O", "FELICIDADES", JOptionPane.INFORMATION_MESSAGE);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton10 = new javax.swing.JButton();
        Salir = new javax.swing.JToggleButton();
        Reinicio = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton10.setText("jButton10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 0, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Salir.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, 190, 60));

        Reinicio.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Reinicio.setText("Reiniciar");
        Reinicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReinicioActionPerformed(evt);
            }
        });
        getContentPane().add(Reinicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, 190, 60));

        jButton1.setFont(new java.awt.Font("Arial", 1, 72)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 100, 100));

        jButton2.setFont(new java.awt.Font("Arial", 1, 72)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 100, 100));

        jButton3.setFont(new java.awt.Font("Arial", 1, 72)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 100, 100));

        jButton5.setFont(new java.awt.Font("Arial", 1, 72)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 100, 100));

        jButton6.setFont(new java.awt.Font("Arial", 1, 72)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 100, 100));

        jButton4.setFont(new java.awt.Font("Arial", 1, 72)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 100, 100));

        jButton7.setFont(new java.awt.Font("Arial", 1, 72)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 100, 100));

        jButton8.setFont(new java.awt.Font("Arial", 1, 72)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 100, 100));

        jButton9.setFont(new java.awt.Font("Arial", 1, 78)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 100, 100));

        jButton11.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jButton11.setText("Regresar");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 420, 190, 60));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private void determinarGanado(){
        String uno =jButton1.getText();
        String dos =jButton2.getText();
        String tres =jButton3.getText();
        String cuatro =jButton4.getText();
        String cinco =jButton5.getText();
        String seis=jButton6.getText();
        String siete=jButton7.getText();
        String ocho=jButton8.getText();
        String nueve=jButton9.getText();
       if(uno.equals("X")&& dos.equals("X")&& tres.equals("X") ){
        ganadorx();
        return;
        } else if(cuatro.equals("X")&& cinco.equals("X")&& seis.equals("X")){
          ganadorx();
           return;
        } else if(siete.equals("X")&&ocho.equals("X")&& nueve.equals("X")){
           ganadorx();
           return;
        } else if(uno.equals("X")&&cuatro.equals("X")&& siete.equals("X")) {
           ganadorx();
          return;
        } else if (dos.equals("X")&&cinco.equals("X")&&ocho.equals("X")){
          ganadorx();  
          return;
        }else if(tres.equals("X")&& seis.equals("X")&& nueve.equals("X")){
         ganadorx(); 
          return;
        } else if(uno.equals("X")&&cinco.equals("X")&& nueve.equals("X")){
            ganadorx();
          return;
        }else if(tres.equals("X") && cinco.equals("X") && siete.equals("X")){
            ganadorx(); 
          return;
        } //Evaluacion para 0
        else if(uno.equals("0")&& dos.equals("0")&& tres.equals("0") ){
             ganadorO();
          return;
        } else if(cuatro.equals("0")&&(cinco.equals("0") && seis.equals("0"))){
          ganadorO();
          return;
        } else if(siete.equals("0")&&(ocho.equals("0")&& nueve.equals("0"))){
         ganadorO();
         return;
        } else if(uno.equals("0")&&(cuatro.equals("0")&&(siete.equals("0")))) {
          ganadorO();
         return;
        } else if (dos.equals("0")&&(cinco.equals("0")&&(ocho.equals("0")))){
         ganadorO();
        return;
        }else if(tres.equals("0")&&(seis.equals("0")&&nueve.equals("0"))){
         ganadorO();
        return;
        }else if(uno.equals("0")&&cinco.equals("0")&& nueve.equals("0")){
        ganadorO();
        return;
        }else if(tres.equals("0") && cinco.equals("0") && siete.equals("0")){
        ganadorO();
         return;
        } 
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton1.setText(turno);
        matriz[0][0]="X";
        logicaz.procesarInfo(n, 0, 0, matriz, mensajeConfirmacion);
        dibujar();
        if (mensajeConfirmacion != null) {
            JOptionPane.showMessageDialog(null, mensajeConfirmacion);

        }
        determinarGanado();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jButton6.setText(turno);
        matriz[1][2]="X";
        logicaz.procesarInfo(n, 1, 2, matriz, mensajeConfirmacion);
        dibujar();
        if (mensajeConfirmacion != null) {
            JOptionPane.showMessageDialog(null, mensajeConfirmacion);

        }
        
        determinarGanado();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jButton7.setText(turno);
        matriz[2][0]="X";
        logicaz.procesarInfo(n, 2, 0, matriz, mensajeConfirmacion);
        dibujar();
        if (mensajeConfirmacion != null) {
            JOptionPane.showMessageDialog(null, mensajeConfirmacion);

        }
determinarGanado();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton2.setText(turno);
        matriz[0][1]="X";
       dibujar();
        logicaz.procesarInfo(n, 0, 1, matriz, mensajeConfirmacion);
        if (mensajeConfirmacion != null) {
            JOptionPane.showMessageDialog(null, mensajeConfirmacion);

        }
       determinarGanado();
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
jButton3.setText(turno);
matriz[0][2]="X";
        logicaz.procesarInfo(n,0, 2, matriz, mensajeConfirmacion);
        dibujar();
        if (mensajeConfirmacion != null) {
            JOptionPane.showMessageDialog(null, mensajeConfirmacion);

        }
       determinarGanado();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jButton4.setText(turno);
        matriz[1][0]="X";
        logicaz.procesarInfo(n, 1, 0, matriz, mensajeConfirmacion);
        dibujar();
        if (mensajeConfirmacion != null) {
            JOptionPane.showMessageDialog(null, mensajeConfirmacion);

        }
        determinarGanado();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton5.setText(turno);
        matriz[1][1]="X";
        logicaz.procesarInfo(n, 1, 1, matriz, mensajeConfirmacion);
                dibujar();
        if (mensajeConfirmacion != null) {
            JOptionPane.showMessageDialog(null, mensajeConfirmacion);

        }
determinarGanado();
    }//GEN-LAST:event_jButton5ActionPerformed

    public void dibujar() {
        for (int k = 0; k < matriz.length; k++) {
            for (int l = 0; l < matriz.length; l++) {
                String valor = matriz[k][l];
                if (k == 0 && l == 0) {
                    jButton1.setText(valor);
                     if (valor.equals("X")) {
            jButton1.setForeground(java.awt.Color.GREEN);
           } else {jButton1.setForeground(java.awt.Color.MAGENTA); }
                }
                if (k == 0 && l == 1) {
                    jButton2.setText(valor);
                    if(valor.equals("X")){
                        jButton2.setForeground(java.awt.Color.GREEN);
                    } else{
                       jButton2.setForeground(java.awt.Color.MAGENTA); 
                    }
                }
                if (k == 0 && l == 2) {
                    jButton3.setText(valor);
                            if(valor.equals("X")){
                        jButton3.setForeground(java.awt.Color.GREEN);
                    } else{
                       jButton3.setForeground(java.awt.Color.MAGENTA); 
                    }
                }
                if (k == 1 && l == 0) {
                    jButton4.setText(valor);
                          if(valor.equals("X")){
                        jButton4.setForeground(java.awt.Color.GREEN);
                    } else{
                       jButton4.setForeground(java.awt.Color.MAGENTA); 
                    } 
                }
                if (k == 1 && l == 1) {
                    jButton5.setText(valor);
                       if(valor.equals("X")){
                        jButton5.setForeground(java.awt.Color.GREEN);
                    } else{
                       jButton5.setForeground(java.awt.Color.MAGENTA); 
                    } 
                }
                if (k == 1 && l == 2) {
                    jButton6.setText(valor);
                     if(valor.equals("X")){
                        jButton6.setForeground(java.awt.Color.GREEN);
                    } else{
                       jButton6.setForeground(java.awt.Color.MAGENTA); 
                    } 
                }
                if (k == 2 && l == 0) {
                    jButton7.setText(valor);
                    if(valor.equals("X")){
                        jButton7.setForeground(java.awt.Color.GREEN);
                    } else{
                       jButton7.setForeground(java.awt.Color.MAGENTA); 
                    } 
                }
                if (k == 2 && l == 1) {
                    jButton8.setText(valor);
                    if(valor.equals("X")){
                        jButton8.setForeground(java.awt.Color.GREEN);
                    } else{
                       jButton8.setForeground(java.awt.Color.MAGENTA); 
                    } 
                }
                if (k == 2 && l == 2) {
                    jButton9.setText(valor);
                     if(valor.equals("X")){
                        jButton9.setForeground(java.awt.Color.GREEN);
                    } else{
                       jButton9.setForeground(java.awt.Color.MAGENTA); 
                    } 
                }
            }
        }
    }

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jButton8.setText(turno);
        matriz[2][1]="X";
        logicaz.procesarInfo(n, 2, 1, matriz, mensajeConfirmacion);
        dibujar();
        if (mensajeConfirmacion != null) {
            JOptionPane.showMessageDialog(null, mensajeConfirmacion);

        }
        determinarGanado();
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jButton9.setText(turno);
        matriz[2][2]="X";
        logicaz.procesarInfo(n, 2, 2, matriz, mensajeConfirmacion);
        dibujar();
        if (mensajeConfirmacion != null) {
            JOptionPane.showMessageDialog(null, mensajeConfirmacion);

        }
       determinarGanado();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_SalirActionPerformed

    private void ReinicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReinicioActionPerformed
        boolean hola = true;

        for (int k = 0; k < matriz.length; k++) {
            for (int l = 0; l < matriz.length; l++) {
                matriz[k][l] = "";
            }
        }
        System.out.println("");
        dibujar();
    }//GEN-LAST:event_ReinicioActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
       PantallaInicio regresar =new PantallaInicio();
       regresar.setVisible(true);
       this.dispose();
     
    }//GEN-LAST:event_jButton11ActionPerformed

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
            java.util.logging.Logger.getLogger(Jugadorvrscomputadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jugadorvrscomputadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jugadorvrscomputadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jugadorvrscomputadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Jugadorvrscomputadora().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Reinicio;
    private javax.swing.JToggleButton Salir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
