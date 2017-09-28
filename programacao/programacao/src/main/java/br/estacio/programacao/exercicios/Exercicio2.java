/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.programacao.exercicios;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Exercicio2 extends javax.swing.JFrame {

    /**
     * Creates new form Exercicio2
     */
    public Exercicio2() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        btnCalculaPeso = new javax.swing.JButton();
        pnlPlanetas = new javax.swing.JPanel();
        rbMercurio = new javax.swing.JRadioButton();
        rbVenus = new javax.swing.JRadioButton();
        rbJupiter = new javax.swing.JRadioButton();
        rbMarte = new javax.swing.JRadioButton();
        rbSaturno = new javax.swing.JRadioButton();
        rbUrano = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Peso na Terra (kg):");

        txtPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesoKeyTyped(evt);
            }
        });

        btnCalculaPeso.setText("Calcular Peso");
        btnCalculaPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculaPesoActionPerformed(evt);
            }
        });

        pnlPlanetas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selecione um Planeta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        pnlPlanetas.setToolTipText("");

        rbMercurio.setSelected(true);
        rbMercurio.setText("Mercúrio");
        rbMercurio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMercurioActionPerformed(evt);
            }
        });

        rbVenus.setText("Vênus");
        rbVenus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbVenusActionPerformed(evt);
            }
        });

        rbJupiter.setText("Júpiter");
        rbJupiter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbJupiterActionPerformed(evt);
            }
        });

        rbMarte.setText("Marte");
        rbMarte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMarteActionPerformed(evt);
            }
        });

        rbSaturno.setText("Saturno");
        rbSaturno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSaturnoActionPerformed(evt);
            }
        });

        rbUrano.setText("Urano");
        rbUrano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbUranoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPlanetasLayout = new javax.swing.GroupLayout(pnlPlanetas);
        pnlPlanetas.setLayout(pnlPlanetasLayout);
        pnlPlanetasLayout.setHorizontalGroup(
            pnlPlanetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPlanetasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPlanetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbMercurio)
                    .addComponent(rbVenus))
                .addGap(18, 18, 18)
                .addGroup(pnlPlanetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbMarte)
                    .addComponent(rbJupiter))
                .addGap(18, 18, 18)
                .addGroup(pnlPlanetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbUrano)
                    .addComponent(rbSaturno))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPlanetasLayout.setVerticalGroup(
            pnlPlanetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPlanetasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPlanetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPlanetasLayout.createSequentialGroup()
                        .addGroup(pnlPlanetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbMarte)
                            .addComponent(rbSaturno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlPlanetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbJupiter)
                            .addComponent(rbUrano)))
                    .addGroup(pnlPlanetasLayout.createSequentialGroup()
                        .addComponent(rbMercurio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbVenus)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rbMercurio.getAccessibleContext().setAccessibleParent(pnlPlanetas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlPlanetas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPeso))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCalculaPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalculaPeso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlPlanetas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbMercurioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMercurioActionPerformed
        rbJupiter.setSelected(false);
        rbMarte.setSelected(false);
        rbSaturno.setSelected(false);
        rbUrano.setSelected(false);
        rbVenus.setSelected(false);
    }//GEN-LAST:event_rbMercurioActionPerformed

    private void rbVenusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbVenusActionPerformed
        rbJupiter.setSelected(false);
        rbMarte.setSelected(false);
        rbSaturno.setSelected(false);
        rbUrano.setSelected(false);
        rbMercurio.setSelected(false);
    }//GEN-LAST:event_rbVenusActionPerformed

    private void rbMarteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMarteActionPerformed
        rbJupiter.setSelected(false);
        rbMercurio.setSelected(false);
        rbSaturno.setSelected(false);
        rbUrano.setSelected(false);
        rbVenus.setSelected(false);
    }//GEN-LAST:event_rbMarteActionPerformed

    private void rbJupiterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbJupiterActionPerformed
        rbMercurio.setSelected(false);
        rbMarte.setSelected(false);
        rbSaturno.setSelected(false);
        rbUrano.setSelected(false);
        rbVenus.setSelected(false);
    }//GEN-LAST:event_rbJupiterActionPerformed

    private void rbSaturnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSaturnoActionPerformed
        rbJupiter.setSelected(false);
        rbMarte.setSelected(false);
        rbMercurio.setSelected(false);
        rbUrano.setSelected(false);
        rbVenus.setSelected(false);
    }//GEN-LAST:event_rbSaturnoActionPerformed

    private void rbUranoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbUranoActionPerformed
        rbJupiter.setSelected(false);
        rbMarte.setSelected(false);
        rbSaturno.setSelected(false);
        rbMercurio.setSelected(false);
        rbVenus.setSelected(false);
    }//GEN-LAST:event_rbUranoActionPerformed

    private void btnCalculaPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculaPesoActionPerformed
        DecimalFormat df = new DecimalFormat("###,##0.00");
        double pesoPlaneta = 0;
        if (txtPeso.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Favor informar o peso!!");
        } else {
            double peso = Double.parseDouble(txtPeso.getText());
            if (rbJupiter.isSelected()) {
                pesoPlaneta = peso * 2.64;
                JOptionPane.showMessageDialog(this, "O seu Peso em Júpiter é: "
                        + df.format(pesoPlaneta) + " kg");
            } else if (rbMercurio.isSelected()) {
                pesoPlaneta = peso * 0.37;
                JOptionPane.showMessageDialog(this, "O seu Peso em Mercúrio é: "
                        + df.format(pesoPlaneta) + " kg");
            } else if (rbMarte.isSelected()) {
                pesoPlaneta = peso * 0.38;
                JOptionPane.showMessageDialog(this, "O seu Peso em Marte é: "
                        + df.format(pesoPlaneta) + " kg");
            } else if (rbSaturno.isSelected()) {
                pesoPlaneta = peso * 1.15;
                JOptionPane.showMessageDialog(this, "O seu peso em Saturno é: "
                        + df.format(pesoPlaneta) + " kg");
            } else if (rbVenus.isSelected()) {
                pesoPlaneta = peso * 0.88;
                JOptionPane.showMessageDialog(this, "O seu peso em Vênus é: "
                        + df.format(pesoPlaneta) + " kg");
            } else if (rbUrano.isSelected()){
                pesoPlaneta = peso * 1.17;
                JOptionPane.showMessageDialog(this, "O seu peso em Urano é: "
                        + df.format(pesoPlaneta) + " kg");
            }else{
                JOptionPane.showMessageDialog(this,"Você não selecionou nenhum planeta!");
            }
        }
    }//GEN-LAST:event_btnCalculaPesoActionPerformed

    private void txtPesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesoKeyTyped
        String caracteres = "0987654321.";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPesoKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
 /* try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Exercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exercicio2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculaPeso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pnlPlanetas;
    private javax.swing.JRadioButton rbJupiter;
    private javax.swing.JRadioButton rbMarte;
    private javax.swing.JRadioButton rbMercurio;
    private javax.swing.JRadioButton rbSaturno;
    private javax.swing.JRadioButton rbUrano;
    private javax.swing.JRadioButton rbVenus;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}