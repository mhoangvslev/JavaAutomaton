/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaautomata;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaautomata.automata.Automata;
import javaautomata.lexical.LexicalAnalyser;
import javaautomata.lexical.exceptions.LexemeParsingException;
import javaautomata.lexical.lexeme.Lexeme;
import javax.swing.JFileChooser;

/**
 *
 * @author minhhoangdang
 */
public class JavaAutomataApp extends javax.swing.JFrame {

    private Automata mAutomate;
    private LexicalAnalyser mAnalyser;
    private String mScript = "";

    /**
     * Creates new form JavaAutomataApp
     */
    public JavaAutomataApp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        gClientCmd = new javax.swing.JPanel();
        inCliCmd = new javax.swing.JTextField();
        jLabelCmd = new javax.swing.JLabel();
        AppResponsePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Output = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        gComposition = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_Composition = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        gMetadata = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea_MetaData = new javax.swing.JTextArea();
        bHelp = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        miFromFile = new javax.swing.JMenuItem();
        miFromScratch = new javax.swing.JMenuItem();
        miGraphviz = new javax.swing.JMenu();
        miExportGraphviz = new javax.swing.JMenuItem();
        miExportImage = new javax.swing.JMenuItem();
        miExportDescr = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("JavaAutomata");

        inCliCmd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inCliCmdKeyPressed(evt);
            }
        });

        jLabelCmd.setText("Client Commands:");

        jTextArea_Output.setEditable(false);
        jTextArea_Output.setColumns(20);
        jTextArea_Output.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Output);

        jLabel2.setText("Output:");

        javax.swing.GroupLayout AppResponsePanelLayout = new javax.swing.GroupLayout(AppResponsePanel);
        AppResponsePanel.setLayout(AppResponsePanelLayout);
        AppResponsePanelLayout.setHorizontalGroup(
            AppResponsePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AppResponsePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AppResponsePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        AppResponsePanelLayout.setVerticalGroup(
            AppResponsePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AppResponsePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout gClientCmdLayout = new javax.swing.GroupLayout(gClientCmd);
        gClientCmd.setLayout(gClientCmdLayout);
        gClientCmdLayout.setHorizontalGroup(
            gClientCmdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gClientCmdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gClientCmdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCmd)
                    .addComponent(inCliCmd, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(AppResponsePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        gClientCmdLayout.setVerticalGroup(
            gClientCmdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gClientCmdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCmd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inCliCmd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AppResponsePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextArea_Composition.setEditable(false);
        jTextArea_Composition.setColumns(20);
        jTextArea_Composition.setRows(5);
        jScrollPane2.setViewportView(jTextArea_Composition);

        jLabel3.setText("Composition: ");

        javax.swing.GroupLayout gCompositionLayout = new javax.swing.GroupLayout(gComposition);
        gComposition.setLayout(gCompositionLayout);
        gCompositionLayout.setHorizontalGroup(
            gCompositionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gCompositionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gCompositionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gCompositionLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE))
                .addContainerGap())
        );
        gCompositionLayout.setVerticalGroup(
            gCompositionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gCompositionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel4.setText("Metadata:");

        jTextArea_MetaData.setEditable(false);
        jTextArea_MetaData.setColumns(20);
        jTextArea_MetaData.setRows(5);
        jScrollPane3.setViewportView(jTextArea_MetaData);

        javax.swing.GroupLayout gMetadataLayout = new javax.swing.GroupLayout(gMetadata);
        gMetadata.setLayout(gMetadataLayout);
        gMetadataLayout.setHorizontalGroup(
            gMetadataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gMetadataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gMetadataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gMetadataLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        gMetadataLayout.setVerticalGroup(
            gMetadataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gMetadataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addContainerGap())
        );

        bHelp.setText("Help");
        bHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHelpActionPerformed(evt);
            }
        });

        jMenu5.setText("File");

        miFromFile.setText("From File...");
        miFromFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFromFileActionPerformed(evt);
            }
        });
        jMenu5.add(miFromFile);

        miFromScratch.setText("From Scratch...");
        miFromScratch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFromScratchActionPerformed(evt);
            }
        });
        jMenu5.add(miFromScratch);

        jMenuBar2.add(jMenu5);

        miGraphviz.setText("Edit");

        miExportGraphviz.setText("Export to Graphviz (.dot)");
        miExportGraphviz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miExportGraphvizActionPerformed(evt);
            }
        });
        miGraphviz.add(miExportGraphviz);

        miExportImage.setText("Export to Image (.png)");
        miExportImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miExportImageActionPerformed(evt);
            }
        });
        miGraphviz.add(miExportImage);

        miExportDescr.setText("Export to Description (.descr)");
        miExportDescr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miExportDescrActionPerformed(evt);
            }
        });
        miGraphviz.add(miExportDescr);

        jMenuBar2.add(miGraphviz);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(157, 157, 157)
                        .addComponent(bHelp))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(gClientCmd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gComposition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gMetadata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bHelp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(gComposition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(gMetadata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(gClientCmd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miExportGraphvizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miExportGraphvizActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("."));
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int sig = chooser.showSaveDialog(this);
        if (sig == JFileChooser.APPROVE_OPTION) {
            try {
                File file = chooser.getSelectedFile();
                this.mAutomate.toDot(file.getAbsolutePath());
            } catch (NumberFormatException ex) {
                Logger.getLogger(JavaAutomataApp.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(JavaAutomataApp.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {

        }
    }//GEN-LAST:event_miExportGraphvizActionPerformed

    private void miExportImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miExportImageActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("."));
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int sig = chooser.showSaveDialog(this);
        if (sig == JFileChooser.APPROVE_OPTION) {
            try {
                File file = chooser.getSelectedFile();
                this.mAutomate.toPng(file.getAbsolutePath());
            } catch (NumberFormatException | IOException ex) {
                Logger.getLogger(JavaAutomataApp.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {

        }
    }//GEN-LAST:event_miExportImageActionPerformed

    private void miFromFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miFromFileActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("."));
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        int sig = chooser.showOpenDialog(this);
        if (sig == JFileChooser.APPROVE_OPTION) {
            try {
                File file = chooser.getSelectedFile();
                this.mAutomate = new Automata(file.getAbsolutePath());
                this.mAnalyser = new LexicalAnalyser(this.mAutomate);
                this.mAnalyser.checkSemantic();
                this.mAutomate.getGraph().buildGraph();

                this.updateAutomate();

                this.jTextArea_Output.setText(this.mAutomate.getGraph().getLog());
                this.mAutomate.getGraph().clearLog();

            } catch (LexemeParsingException | NumberFormatException ex) {
                Logger.getLogger(JavaAutomataApp.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {

        }
    }//GEN-LAST:event_miFromFileActionPerformed

    private void miExportDescrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miExportDescrActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("."));
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int sig = chooser.showSaveDialog(this);
        if (sig == JFileChooser.APPROVE_OPTION) {
            try {
                File file = chooser.getSelectedFile();
                this.mAutomate.toDescr(file.getAbsolutePath());
            } catch (NumberFormatException | IOException ex) {
                Logger.getLogger(JavaAutomataApp.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {

        }
    }//GEN-LAST:event_miExportDescrActionPerformed

    private void miFromScratchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miFromScratchActionPerformed
        // TODO add your handling code here:
        this.mAutomate = new Automata();
        this.mAnalyser = new LexicalAnalyser(this.mAutomate);
        this.updateAutomate();
    }//GEN-LAST:event_miFromScratchActionPerformed

    private void inCliCmdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inCliCmdKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 10) {
            String cmd = this.inCliCmd.getText();
            if (!cmd.equals("")) {

                if (cmd.contains("clear")) {
                    this.mScript = "";
                    this.jTextArea_Output.setText("");

                } else {
                    for (char c : cmd.toCharArray()) {
                        String vocab = (String) this.mAutomate.getMetadata().get("vocab_entree");
                        if (!vocab.contains("" + c)) {
                            this.jTextArea_Output.setText(this.jTextArea_Output.getText() + "invalid sequence! Use the provided input vocabulary!\r\n");
                            return;
                        }
                    }
                    mScript += cmd + "\r\n";
                    this.jTextArea_Output.setText(this.jTextArea_Output.getText() + cmd + "\r\n");

                }
            } else {
                this.mAutomate.getGraph().translateFromScript(mScript);
                this.jTextArea_Output.setText(this.mAutomate.getGraph().getLog());
            }

            this.inCliCmd.setText("");
        }
    }//GEN-LAST:event_inCliCmdKeyPressed

    private void bHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHelpActionPerformed
        // TODO add your handling code here:
        this.mScript = "";
        this.jTextArea_Output.setText(""
                + "---------- HELP ----------\r\n"
                + "cmd: sequence + Enter \r\n"
                + "type 'clear' to reset script\r\n");
    }//GEN-LAST:event_bHelpActionPerformed

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
            java.util.logging.Logger.getLogger(JavaAutomataApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JavaAutomataApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JavaAutomataApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JavaAutomataApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JavaAutomataApp().setVisible(true);
            }
        });
    }

    public void updateAutomate() {

        if (this.mAutomate == null) {
            return;
        }

        if (this.mAutomate.getComposition().size() < 1 || this.mAutomate.getMetadata().size() < 1) {
            this.jTextArea_Composition.setText("");
            this.jTextArea_MetaData.setText("");
            return;
        }

        String composition = "";
        String ref = "CMVOEIFT";
        for (Character c : ref.toCharArray()) {
            if (this.mAutomate.getComposition().get(c) != null) {
                for (Lexeme l : this.mAutomate.getComposition().get(c)) {
                    composition += l.toString() + "\r\n";
                }
            }
        }
        this.jTextArea_Composition.setText(composition);

        String metadata = "";
        for (String attr : this.mAutomate.getMetadata().keySet()) {
            metadata += attr + ": " + this.mAutomate.getMetadata().get(attr) + "\r\n";
        }
        this.jTextArea_MetaData.setText(metadata);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AppResponsePanel;
    private javax.swing.JButton bHelp;
    private javax.swing.JPanel gClientCmd;
    private javax.swing.JPanel gComposition;
    private javax.swing.JPanel gMetadata;
    private javax.swing.JTextField inCliCmd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelCmd;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea_Composition;
    private javax.swing.JTextArea jTextArea_MetaData;
    private javax.swing.JTextArea jTextArea_Output;
    private javax.swing.JMenuItem miExportDescr;
    private javax.swing.JMenuItem miExportGraphviz;
    private javax.swing.JMenuItem miExportImage;
    private javax.swing.JMenuItem miFromFile;
    private javax.swing.JMenuItem miFromScratch;
    private javax.swing.JMenu miGraphviz;
    // End of variables declaration//GEN-END:variables
}
