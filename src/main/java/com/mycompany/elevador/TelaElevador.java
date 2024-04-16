/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.elevador;

/**
 *
 * @author 824143545
 */
public class TelaElevador extends javax.swing.JFrame {
    private Elevador elevador;

    /**
     * Creates new form ElevadorTela
     */
    public TelaElevador() {
        elevador = new Elevador();
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

        elevadorSubirBotao = new javax.swing.JButton();
        elevadorDescerBotao = new javax.swing.JButton();
        subirPessoaBotao = new javax.swing.JButton();
        descerPessoaBotao = new javax.swing.JButton();
        entrarGenteBotao = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        qtdPessoasDentro = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sentidoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        elevadorSubirBotao.setText("Subir");
        elevadorSubirBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elevadorSubirBotaoActionPerformed(evt);
            }
        });

        elevadorDescerBotao.setText("Descer");
        elevadorDescerBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elevadorDescerBotaoActionPerformed(evt);
            }
        });

        subirPessoaBotao.setText("Subir Pessoa");
        subirPessoaBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subirPessoaBotaoActionPerformed(evt);
            }
        });

        descerPessoaBotao.setText("Descer Pessoa");

        entrarGenteBotao.setText("EntrarGente...");

        jLabel1.setText("Quantidade de Pessoas:");

        qtdPessoasDentro.setText("0");

        jLabel2.setText("Sentido do Elevador:");

        sentidoLabel.setText("subindo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(elevadorSubirBotao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(elevadorDescerBotao)
                        .addGap(155, 155, 155))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(entrarGenteBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(subirPessoaBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(descerPessoaBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sentidoLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(qtdPessoasDentro)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(qtdPessoasDentro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sentidoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elevadorDescerBotao)
                    .addComponent(elevadorSubirBotao))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entrarGenteBotao)
                    .addComponent(subirPessoaBotao)
                    .addComponent(descerPessoaBotao))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subirPessoaBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subirPessoaBotaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subirPessoaBotaoActionPerformed

    private void elevadorSubirBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elevadorSubirBotaoActionPerformed
        elevador.sobe();
        sentidoLabel.setText("subindo");
    }//GEN-LAST:event_elevadorSubirBotaoActionPerformed

    private void elevadorDescerBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elevadorDescerBotaoActionPerformed
        elevador.desce();
        sentidoLabel.setText("descendo");
    }//GEN-LAST:event_elevadorDescerBotaoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaElevador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaElevador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaElevador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaElevador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaElevador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton descerPessoaBotao;
    private javax.swing.JButton elevadorDescerBotao;
    private javax.swing.JButton elevadorSubirBotao;
    private javax.swing.JButton entrarGenteBotao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel qtdPessoasDentro;
    private javax.swing.JLabel sentidoLabel;
    private javax.swing.JButton subirPessoaBotao;
    // End of variables declaration//GEN-END:variables
}