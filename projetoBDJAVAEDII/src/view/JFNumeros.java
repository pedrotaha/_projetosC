/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import data.NumerosData;
import data.UsuarioData;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.NumerosModel;
import model.UsuarioModel;

/**
 *
 * @author Pedro
 */
public class JFNumeros extends javax.swing.JFrame {

    ArrayList<NumerosModel> numeros;
    ArrayList<UsuarioModel> letras;
    NumerosData DAO;
    UsuarioData DAOU;
    int aux, i, j, tamanho, tamanhoS;
    String auxS;
    float auxF;

    /**
     * Creates new form numerosData
     */
    public JFNumeros() {
        initComponents();
        jtbNumeros.setVisible(true);
        jtbUser.setVisible(false);
        jScrollPane1.setVisible(true);
        jScrollPane2.setVisible(false);
        aux = 0;
        auxS = new String();
        auxF = 0;
        i = 0;
        j = 0;
        numeros = new ArrayList<>();
        letras = new ArrayList<>();
        DAO = new NumerosData();
        DAOU = new UsuarioData();
        try {
            numeros = DAO.pesquisar();
            tamanho = numeros.size();
            letras = DAOU.pesquisar();
            tamanhoS = letras.size();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao acessar o banco: " + ex.getMessage(), "Pesquisar", JOptionPane.ERROR_MESSAGE);
        }
        mostrar();
        mostrarUsuario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtbNumeros = new javax.swing.JTable();
        jcbColunas = new javax.swing.JComboBox<>();
        jbBubble = new javax.swing.JButton();
        jbInsert = new javax.swing.JButton();
        jbSelection = new javax.swing.JButton();
        jbQuick = new javax.swing.JButton();
        jbMerge = new javax.swing.JButton();
        jbRandom = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbUser = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(950, 637));
        setPreferredSize(new java.awt.Dimension(950, 637));
        getContentPane().setLayout(null);

        jtbNumeros.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jtbNumeros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numeros"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtbNumeros);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(330, 90, 535, 440);

        jcbColunas.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jcbColunas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Números", "Nome", "Salário" }));
        jcbColunas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbColunasActionPerformed(evt);
            }
        });
        getContentPane().add(jcbColunas);
        jcbColunas.setBounds(154, 45, 160, 35);

        jbBubble.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jbBubble.setText("Bubble");
        jbBubble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBubbleActionPerformed(evt);
            }
        });
        getContentPane().add(jbBubble);
        jbBubble.setBounds(31, 111, 136, 53);

        jbInsert.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jbInsert.setText("Insert");
        jbInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInsertActionPerformed(evt);
            }
        });
        getContentPane().add(jbInsert);
        jbInsert.setBounds(31, 182, 136, 53);

        jbSelection.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jbSelection.setText("Selection");
        jbSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSelectionActionPerformed(evt);
            }
        });
        getContentPane().add(jbSelection);
        jbSelection.setBounds(31, 253, 136, 53);

        jbQuick.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jbQuick.setText("Quick");
        jbQuick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbQuickActionPerformed(evt);
            }
        });
        getContentPane().add(jbQuick);
        jbQuick.setBounds(31, 324, 136, 53);

        jbMerge.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jbMerge.setText("Merge");
        jbMerge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMergeActionPerformed(evt);
            }
        });
        getContentPane().add(jbMerge);
        jbMerge.setBounds(31, 404, 136, 53);

        jbRandom.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jbRandom.setText("Random");
        jbRandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRandomActionPerformed(evt);
            }
        });
        getContentPane().add(jbRandom);
        jbRandom.setBounds(119, 499, 136, 53);

        jtbUser.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jtbUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Salario", "Numero"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtbUser);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(330, 90, 530, 440);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbBubbleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBubbleActionPerformed
        if (jcbColunas.getSelectedIndex() == 0) {
            long startTime = System.nanoTime();
            bubbleSort();
            long stopTime = System.nanoTime();
            System.out.println(stopTime - startTime);
            atualizarVetorBanco();
            mostrar();
        } else {
            if (jcbColunas.getSelectedIndex() == 1) {
                bubbleString();
                mostrarUsuario();
            } else {
                if (jcbColunas.getSelectedIndex() == 2) {
                    bubbleSalario();
                    mostrarUsuario();
                }
            }
        }
    }//GEN-LAST:event_jbBubbleActionPerformed

    private void jbInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInsertActionPerformed
        if (jcbColunas.getSelectedIndex() == 0) {
            long startTime = System.nanoTime();
            insertionSort();
            long stopTime = System.nanoTime();
            System.out.println(stopTime - startTime);
            atualizarVetorBanco();
            mostrar();
        } else {
            if (jcbColunas.getSelectedIndex() == 1) {
                insertionString();
                mostrarUsuario();
            } else {
                if (jcbColunas.getSelectedIndex() == 2) {
                    insertionSalario();
                    mostrarUsuario();
                }
            }
        }
    }//GEN-LAST:event_jbInsertActionPerformed

    private void jbSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSelectionActionPerformed
        if (jcbColunas.getSelectedIndex() == 0) {
            long startTime = System.nanoTime();
            selectionSort();
            long stopTime = System.nanoTime();
            System.out.println(stopTime - startTime);
            atualizarVetorBanco();
            mostrar();
        } else {
            if (jcbColunas.getSelectedIndex() == 1) {
                selectionString();
                mostrarUsuario();
            } else {
                if (jcbColunas.getSelectedIndex() == 2) {
                    selectionSalario();
                    mostrarUsuario();
                }
            }
        }
    }//GEN-LAST:event_jbSelectionActionPerformed

    private void jbQuickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbQuickActionPerformed
        if (jcbColunas.getSelectedIndex() == 0) {
            long startTime = System.nanoTime();
            quicksort(0, numeros.size() - 1);
            long stopTime = System.nanoTime();
            System.out.println(stopTime - startTime);
            atualizarVetorBanco();
            mostrar();
        } else {
            if (jcbColunas.getSelectedIndex() == 1) {
                quickString(0, letras.size() - 1);

            } else {
                if (jcbColunas.getSelectedIndex() == 2) {
                    quickSalario(0, letras.size() - 1);
                }
            }
            atualizarUsuarioBanco();
            mostrarUsuario();
        }
    }//GEN-LAST:event_jbQuickActionPerformed

    private void jbMergeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMergeActionPerformed
        if (jcbColunas.getSelectedIndex() == 0) {
            long startTime = System.nanoTime();
            merge(0, numeros.size() - 1);
            long stopTime = System.nanoTime();
            System.out.println(stopTime - startTime);
            atualizarVetorBanco();
            mostrar();
        } else {
            if (jcbColunas.getSelectedIndex() == 1) {
                mergeString(0, letras.size() - 1);
            } else {
                if (jcbColunas.getSelectedIndex() == 2) {
                    mergeSalario(0, letras.size() - 1);
                }
            }
            atualizarUsuarioBanco();
            mostrarUsuario();
        }
    }//GEN-LAST:event_jbMergeActionPerformed

    private void jbRandomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRandomActionPerformed
        if (jcbColunas.getSelectedIndex() == 0) {
            try {
                DAO.randomizando();
                mostrar();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
            }
        } else {
            try {
                DAOU.randomizando();
                mostrarUsuario();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_jbRandomActionPerformed

    private void jcbColunasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbColunasActionPerformed
        if (jcbColunas.getSelectedIndex() == 0) {
            jtbNumeros.setVisible(true);
            jtbUser.setVisible(false);
            jScrollPane1.setVisible(true);
            jScrollPane2.setVisible(false);
        } else {
            jtbNumeros.setVisible(false);
            jtbUser.setVisible(true);
            jScrollPane1.setVisible(false);
            jScrollPane2.setVisible(true);
        }
    }//GEN-LAST:event_jcbColunasActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFNumeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFNumeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFNumeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFNumeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFNumeros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbBubble;
    private javax.swing.JButton jbInsert;
    private javax.swing.JButton jbMerge;
    private javax.swing.JButton jbQuick;
    private javax.swing.JButton jbRandom;
    private javax.swing.JButton jbSelection;
    private javax.swing.JComboBox<String> jcbColunas;
    private javax.swing.JTable jtbNumeros;
    private javax.swing.JTable jtbUser;
    // End of variables declaration//GEN-END:variables
    void bubbleSort() {
        for (i = 0; i < tamanho; i++) {
            for (j = 0; j < (tamanho - 1); j++) {//if(vetor[j].compareTo(vetor[ j+1 ])>0)
                if (numeros.get(j).getVetor() > numeros.get(j + 1).getVetor()) {
                    aux = numeros.get(j).getVetor();
                    numeros.get(j).setVetor(numeros.get(j + 1).getVetor());
                    numeros.get(j + 1).setVetor(aux);
                }
            }
        }
        //atualizarVetorBanco();
    }

    void bubbleString() {
        for (i = 0; i < tamanhoS; i++) {
            for (j = 0; j < (tamanhoS - 1); j++) {
                if (letras.get(j).getNome().compareTo(letras.get(j + 1).getNome()) > 0) {
                    auxS = letras.get(j).getNome();
                    letras.get(j).setNome(letras.get(j + 1).getNome());
                    letras.get(j + 1).setNome(auxS);
                }
            }
        }
        atualizarUsuarioBanco();
    }

    void bubbleSalario() {
        for (i = 0; i < tamanhoS; i++) {
            for (j = 0; j < (tamanhoS - 1); j++) {
                if (letras.get(j).getSalario() > letras.get(j + 1).getSalario()) {
                    auxF = letras.get(j).getSalario();
                    letras.get(j).setSalario(letras.get(j + 1).getSalario());
                    letras.get(j + 1).setSalario(auxF);
                }
            }
        }
        atualizarUsuarioBanco();
    }

    void insertionSort() {
        for (i = 1; i < tamanho; i++) {
            aux = numeros.get(i).getVetor();
            j = i - 1;
            while (j >= 0 && numeros.get(j).getVetor() > aux) {
                numeros.get(j + 1).setVetor(numeros.get(j).getVetor());
                j--;
            }
            numeros.get(j + 1).setVetor(aux);
        }
        //atualizarVetorBanco();
    }

    void insertionString() {
        for (i = 1; i < tamanhoS; i++) {
            auxS = letras.get(i).getNome();
            j = i - 1;
            while (j >= 0 && letras.get(j).getNome().compareTo(auxS) > 0) {
                letras.get(j + 1).setNome(letras.get(j).getNome());
                j--;
            }
            letras.get(j + 1).setNome(auxS);
        }
        atualizarUsuarioBanco();
    }

    void insertionSalario() {
        for (i = 1; i < tamanhoS; i++) {
            auxF = letras.get(i).getSalario();
            j = i - 1;
            while (j >= 0 && letras.get(j).getSalario() > auxF) {
                letras.get(j + 1).setSalario(letras.get(j).getSalario());
                j--;
            }
            letras.get(j + 1).setSalario(auxF);
        }
        atualizarUsuarioBanco();
    }

    void selectionSort() {
        int min;
        for (i = 0; i < (tamanho - 1); i++) {
            min = i;
            for (j = i + 1; j < tamanho; j++) {
                if (numeros.get(j).getVetor() < numeros.get(min).getVetor()) {
                    min = j;
                }
            }
            if (i != min) {
                aux = numeros.get(i).getVetor();
                numeros.get(i).setVetor(numeros.get(min).getVetor());
                numeros.get(min).setVetor(aux);
            }
        }
        //atualizarVetorBanco();
    }

    void selectionString() {
        int min;
        for (i = 0; i < (tamanhoS - 1); i++) {
            min = i;
            for (j = i + 1; j < tamanhoS; j++) {
                if (letras.get(j).getNome().compareTo(letras.get(min).getNome()) < 0) {
                    min = j;
                }
            }
            if (i != min) {
                auxS = letras.get(i).getNome();
                letras.get(i).setNome(letras.get(min).getNome());
                letras.get(min).setNome(auxS);
            }
        }
        atualizarUsuarioBanco();
    }

    void selectionSalario() {
        int min;
        for (i = 0; i < (tamanhoS - 1); i++) {
            min = i;
            for (j = i + 1; j < tamanhoS; j++) {
                if (letras.get(j).getSalario() < letras.get(min).getSalario()) {
                    min = j;
                }
            }
            if (i != min) {
                auxF = letras.get(i).getSalario();
                letras.get(i).setSalario(letras.get(min).getSalario());
                letras.get(min).setSalario(auxF);
            }
        }
        atualizarUsuarioBanco();
    }

    void quicksort(int p, int r) {
        int q;
        if (p < r) {
            q = particao(p, r);
            quicksort(p, q);
            quicksort(q + 1, r);
        }
    }

    void quickString(int p, int r) {
        int q;
        if (p < r) {
            q = particaoString(p, r);
            quickString(p, q);
            quickString(q + 1, r);
        }
    }

    void quickSalario(int p, int r) {
        int q;
        if (p < r) {
            q = particaoSalario(p, r);
            quickSalario(p, q);
            quickSalario(q + 1, r);
        }
    }

    void merge(int inicio, int fim) {
        int meio;
        if (inicio < fim) {
            meio = (inicio + fim) / 2;
            merge(inicio, meio);
            merge(meio + 1, fim);
            intercala(inicio, fim, meio);
        }
    }

    void mergeString(int inicio, int fim) {
        int meio;
        if (inicio < fim) {
            meio = (inicio + fim) / 2;
            mergeString(inicio, meio);
            mergeString(meio + 1, fim);
            intercalaString(inicio, fim, meio);
        }
    }

    void mergeSalario(int inicio, int fim) {
        int meio;
        if (inicio < fim) {
            meio = (inicio + fim) / 2;
            mergeSalario(inicio, meio);
            mergeSalario(meio + 1, fim);
            intercalaSalario(inicio, fim, meio);
        }
    }

    void troca(int i, int j) {//QuickSort
        aux = numeros.get(i).getVetor();
        numeros.get(i).setVetor(numeros.get(j).getVetor());
        numeros.get(j).setVetor(aux);
    }

    void trocaString(int i, int j) {
        auxS = letras.get(i).getNome();
        letras.get(i).setNome(letras.get(j).getNome());
        letras.get(j).setNome(auxS);
    }

    void trocaSalario(int i, int j) {
        auxF = letras.get(i).getSalario();
        letras.get(i).setSalario(letras.get(j).getSalario());
        letras.get(j).setSalario(auxF);
    }

    int particao(int p, int r) {//QuickSort
        int pivo;
        pivo = numeros.get((p + r) / 2).getVetor();
        i = p - 1;
        j = r + 1;
        while (i < j) {
            do {
                j--;
            } while (numeros.get(j).getVetor() > pivo);
            do {
                i++;
            } while (numeros.get(i).getVetor() < pivo);
            if (i < j) {
                troca(i, j);
            }
        }
        return j;
    }

    int particaoString(int p, int r) {//QuickSort
        String pivo;
        pivo = letras.get((p + r) / 2).getNome();
        i = p - 1;
        j = r + 1;
        while (i < j) {
            do {
                j--;
            } while (letras.get(j).getNome().compareTo(pivo) > 0);
            do {
                i++;
            } while (letras.get(i).getNome().compareTo(pivo) < 0);
            if (i < j) {
                trocaString(i, j);
            }
        }
        return j;
    }

    int particaoSalario(int p, int r) {//QuickSort
        float pivo;
        pivo = letras.get((p + r) / 2).getSalario();
        i = p - 1;
        j = r + 1;
        while (i < j) {
            do {
                j--;
            } while (letras.get(j).getSalario() > pivo);
            do {
                i++;
            } while (letras.get(i).getSalario() < pivo);
            if (i < j) {
                trocaSalario(i, j);
            }
        }
        return j;
    }

    void intercala(int inicio, int fim, int meio) {//MergeSort
        int poslivre, inicio_vetor1, inicio_vetor2;
        int vetAux[] = new int[numeros.size()];
        inicio_vetor1 = inicio;
        inicio_vetor2 = meio + 1;
        poslivre = inicio;

        while (inicio_vetor1 <= meio && inicio_vetor2 <= fim) {
            if (numeros.get(inicio_vetor1).getVetor() <= numeros.get(inicio_vetor2).getVetor()) {
                vetAux[poslivre] = numeros.get(inicio_vetor1).getVetor();
                inicio_vetor1 = inicio_vetor1 + 1;
            } else {
                vetAux[poslivre] = numeros.get(inicio_vetor2).getVetor();
                inicio_vetor2 = inicio_vetor2 + 1;
            }
            poslivre = poslivre + 1;
        }

        for (i = inicio_vetor1; i <= meio; i++) {
            vetAux[poslivre] = numeros.get(i).getVetor();
            poslivre = poslivre + 1;
        }

        for (i = inicio_vetor2; i <= fim; i++) {
            vetAux[poslivre] = numeros.get(i).getVetor();
            poslivre = poslivre + 1;
        }

        for (i = inicio; i <= fim; i++) {
            numeros.get(i).setVetor(vetAux[i]);
        }
    }

    void intercalaString(int inicio, int fim, int meio) {//MergeSort
        int poslivre, inicio_vetor1, inicio_vetor2;
        String[] vetAux = new String[letras.size()];
        inicio_vetor1 = inicio;
        inicio_vetor2 = meio + 1;
        poslivre = inicio;

        while (inicio_vetor1 <= meio && inicio_vetor2 <= fim) {
            if (letras.get(inicio_vetor1).getNome().compareTo(letras.get(inicio_vetor2).getNome()) <= 0) {
                vetAux[poslivre] = letras.get(inicio_vetor1).getNome();
                inicio_vetor1 = inicio_vetor1 + 1;
            } else {
                vetAux[poslivre] = letras.get(inicio_vetor2).getNome();
                inicio_vetor2 = inicio_vetor2 + 1;
            }
            poslivre = poslivre + 1;
        }

        for (i = inicio_vetor1; i <= meio; i++) {
            vetAux[poslivre] = letras.get(i).getNome();
            poslivre = poslivre + 1;
        }

        for (i = inicio_vetor2; i <= fim; i++) {
            vetAux[poslivre] = letras.get(i).getNome();
            poslivre = poslivre + 1;
        }

        for (i = inicio; i <= fim; i++) {
            letras.get(i).setNome(vetAux[i]);
        }
    }

    void intercalaSalario(int inicio, int fim, int meio) {//MergeSort
        int poslivre, inicio_vetor1, inicio_vetor2;
        float[] vetAux = new float[letras.size()];
        inicio_vetor1 = inicio;
        inicio_vetor2 = meio + 1;
        poslivre = inicio;

        while (inicio_vetor1 <= meio && inicio_vetor2 <= fim) {
            if (letras.get(inicio_vetor1).getSalario() <= letras.get(inicio_vetor2).getSalario()) {
                vetAux[poslivre] = letras.get(inicio_vetor1).getSalario();
                inicio_vetor1 = inicio_vetor1 + 1;
            } else {
                vetAux[poslivre] = letras.get(inicio_vetor2).getSalario();
                inicio_vetor2 = inicio_vetor2 + 1;
            }
            poslivre = poslivre + 1;
        }

        for (i = inicio_vetor1; i <= meio; i++) {
            vetAux[poslivre] = letras.get(i).getSalario();
            poslivre = poslivre + 1;
        }

        for (i = inicio_vetor2; i <= fim; i++) {
            vetAux[poslivre] = letras.get(i).getSalario();
            poslivre = poslivre + 1;
        }

        for (i = inicio; i <= fim; i++) {
            letras.get(i).setSalario(vetAux[i]);
        }
    }

    void atualizarVetorBanco() {
        for (i = 0; i < tamanho; i++) {
            try {
                DAO.editar(numeros, i);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Erro atualizar os valores: " + ex.getMessage(), "Atualizar", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    void atualizarUsuarioBanco() {
        for (i = 0; i < tamanhoS; i++) {
            try {
                DAOU.editar(letras, i);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Erro atualizar os valores: " + ex.getMessage(), "Atualizar", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    void mostrar() {
        try {
            NumerosData DAO = new NumerosData();
            numeros = DAO.pesquisar();
            DefaultTableModel mp = (DefaultTableModel) jtbNumeros.getModel();
            mp.setNumRows(0);
            for (i = 0; i < tamanho; i++) {
                mp.addRow(new String[]{"" + numeros.get(i).getVetor()});
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao acessar o banco: " + ex.getMessage(), "Pesquisar", JOptionPane.ERROR_MESSAGE);
        }
    }

    void mostrarUsuario() {
        try {
            UsuarioData DAO = new UsuarioData();
            letras = DAO.pesquisar();
            DefaultTableModel mp = (DefaultTableModel) jtbUser.getModel();
            mp.setNumRows(0);
            for (i = 0; i < tamanhoS; i++) {
                mp.addRow(new String[]{"" + letras.get(i).getNome(), "" + letras.get(i).getSalario(), "" + letras.get(i).getNumero()});
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao acessar o banco: " + ex.getMessage(), "Pesquisar", JOptionPane.ERROR_MESSAGE);
        }
    }
}
