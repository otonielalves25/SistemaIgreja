/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import dao.MembroDao;
import dao.UsuarioDao;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import modelo.Membro;

/**
 *
 * @author Tony
 */
public class FrmAniversarioConsulta extends javax.swing.JDialog {

    DefaultTableModel tabelaModelo;
    UsuarioDao usuarioDao = new UsuarioDao();
    MembroDao membroDao = new MembroDao();
    SimpleDateFormat sdfDiaMes = new SimpleDateFormat("dd/MM");

    /**
     * Creates new form Frm_UsuarioConsulta
     */
    public FrmAniversarioConsulta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tabelaModelo = (DefaultTableModel) tabelaAniversarios.getModel();
        carregaTabela();
        mostraMesCombo();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollBar1 = new javax.swing.JScrollBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        grelhaPesquisaUsuario = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        lblQuantidade = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaAniversarios = new javax.swing.JTable();
        cboMes = new javax.swing.JComboBox<>();

        jButton1.setText("jButton1");

        grelhaPesquisaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome:", "Cargo Igreja", "Data Congregação", "Dizimista", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grelhaPesquisaUsuario.setRowHeight(18);
        jScrollPane1.setViewportView(grelhaPesquisaUsuario);
        if (grelhaPesquisaUsuario.getColumnModel().getColumnCount() > 0) {
            grelhaPesquisaUsuario.getColumnModel().getColumn(0).setMaxWidth(50);
            grelhaPesquisaUsuario.getColumnModel().getColumn(1).setMinWidth(300);
            grelhaPesquisaUsuario.getColumnModel().getColumn(1).setPreferredWidth(300);
            grelhaPesquisaUsuario.getColumnModel().getColumn(1).setMaxWidth(300);
            grelhaPesquisaUsuario.getColumnModel().getColumn(2).setMinWidth(150);
            grelhaPesquisaUsuario.getColumnModel().getColumn(2).setPreferredWidth(150);
            grelhaPesquisaUsuario.getColumnModel().getColumn(2).setMaxWidth(150);
            grelhaPesquisaUsuario.getColumnModel().getColumn(3).setMinWidth(150);
            grelhaPesquisaUsuario.getColumnModel().getColumn(3).setPreferredWidth(100);
            grelhaPesquisaUsuario.getColumnModel().getColumn(3).setMaxWidth(150);
        }

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("Consulta Aniversariantes");

        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jLabel2.setText("Pesquisa por Nome:");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/clear.png"))); // NOI18N
        jButton2.setText("Limpar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lblQuantidade.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        lblQuantidade.setForeground(new java.awt.Color(102, 0, 0));
        lblQuantidade.setText("0 registros localizados.");

        tabelaAniversarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Data Aniversário", "Congregação", "Cargo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaAniversarios.setRowHeight(20);
        jScrollPane2.setViewportView(tabelaAniversarios);
        if (tabelaAniversarios.getColumnModel().getColumnCount() > 0) {
            tabelaAniversarios.getColumnModel().getColumn(0).setMinWidth(60);
            tabelaAniversarios.getColumnModel().getColumn(0).setPreferredWidth(60);
            tabelaAniversarios.getColumnModel().getColumn(0).setMaxWidth(60);
            tabelaAniversarios.getColumnModel().getColumn(2).setPreferredWidth(100);
            tabelaAniversarios.getColumnModel().getColumn(2).setMaxWidth(100);
            tabelaAniversarios.getColumnModel().getColumn(3).setPreferredWidth(250);
            tabelaAniversarios.getColumnModel().getColumn(3).setMaxWidth(250);
            tabelaAniversarios.getColumnModel().getColumn(4).setPreferredWidth(120);
            tabelaAniversarios.getColumnModel().getColumn(4).setMaxWidth(120);
        }

        cboMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "JANEIRO", "FEVEREIRO", "MARÇO", "ABRIL", "MAIO", "JUNHO", "JULHO", "AGOSTO", "SETEMBRO", "OUTUBRO", "NOVEMBRO", "DEZEMBRO" }));
        cboMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblQuantidade)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboMes, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 894, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblQuantidade)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
        // TODO add your handling code here:
        carregaTabela();
    }//GEN-LAST:event_txtPesquisaKeyReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:

    }//GEN-LAST:event_formWindowOpened

    private void cboMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMesActionPerformed
        // TODO add your handling code here:

        carregaTabela();
    }//GEN-LAST:event_cboMesActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        txtPesquisa.setText("");
        mostraMesCombo();

    }//GEN-LAST:event_jButton2ActionPerformed

    // CARREGA COMBOX
    private void mostraMesCombo() {
        int mes2 = new Date().getMonth();
        cboMes.setSelectedIndex(mes2);
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
            java.util.logging.Logger.getLogger(FrmAniversarioConsulta.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAniversarioConsulta.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAniversarioConsulta.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAniversarioConsulta.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmAniversarioConsulta dialog = new FrmAniversarioConsulta(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });

    }

    //FUNÇÃO QUE CARREAGO OS AS TABELAS
    private void carregaTabela() {

        String indexMes = String.valueOf(cboMes.getSelectedIndex() + 1);
        if (indexMes.length() < 2) {
            indexMes = "0" + indexMes;
        }

        ArrayList<Membro> lista = membroDao.getListagemAniversarantes(txtPesquisa.getText(), indexMes);
        tabelaModelo.setNumRows(0);
        for (Membro m : lista) {

            tabelaModelo.addRow(new Object[]{
                m.getIdMembro(),
                m.getNome(),
                m.getDataNascimentoFormatada(),
                m.getCongregacao().getNomeCongregacao(),
                m.getCargo(),});

        }
        if (tabelaModelo.getRowCount() > 1) {
            lblQuantidade.setText(tabelaModelo.getRowCount() + " Membros fazem aniversário esse mês.");
        } else {
            lblQuantidade.setText(tabelaModelo.getRowCount() + " Membro faz aniversário esse mês.");
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboMes;
    private javax.swing.JTable grelhaPesquisaUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JTable tabelaAniversarios;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables

    //FUNÇÃO PRIVADAS DO MEU FORMULARIO
    private int codigoUsuario;
    private boolean alterar;

    /**
     * @return the codigoUsuario
     */
    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    /**
     * @param codigoUsuario the codigoUsuario to set
     */
    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    /**
     * @return the alterar
     */
    public boolean isAlterar() {
        return alterar;
    }

    /**
     * @param alterar the alterar to set
     */
    public void setAlterar(boolean alterar) {
        this.alterar = alterar;
    }

}
