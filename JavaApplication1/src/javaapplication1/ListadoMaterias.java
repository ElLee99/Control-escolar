
package javaapplication1;
import javax.swing.*;
public class ListadoMaterias extends javax.swing.JFrame {
    
    public String areaMa;
    public String gradoMa;
    public String materiaMa;
    public int noMateriaMa;
    public int noBorrado=99;
    
    public static String impresion ="";
    public static String impresion1 ="";
    public static String impresion2 ="";
    public static String impresion3 ="";
    public static String impresion4 ="";
    public static String impresion5 ="";
    public static String impresion6 ="";
    public static String impresion7 ="";
    public static String impresion8 ="";
    public static String impresion9 ="";
    public static String impresion10 ="";
   
    
    void rellenar (String a, String b, String c, int d){
        areaMa = a;
        gradoMa = c;
        materiaMa = b;
        noMateriaMa = d;
    }
    
    String getAreaM (){
        return areaMa;
    }
    
    String getGradoMa (){
        return gradoMa;
    }
    
    String getMateriaMa (){
        return materiaMa;
    }
    
    int getNoMateriaMa(){
        return noMateriaMa;
    }
    
    String impri(String a, String b, String c, int d){
        
        String numMat= Integer.toString(d);
        return "Area: " + a + "\nGrado: " + b + "\nMateria: " + c + "\nNo. de Materia: " + numMat + "\n\n";
    }
    
    
    /**
     * Creates new form ListadoMaterias
     */
    
    public ListadoMaterias() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("Nuevo Materia");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Modificar Materia");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Dar de Baja");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("LISTA DE MATERIAS");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/Materias25.jpg"))); // NOI18N

        jButton4.setText("Actualizar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

            RegistroMaterias registra = new RegistroMaterias ();
            registra.setBounds(0, 0, 442, 435);
            registra.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      String noMat;
      int noMatInt = 0;
      
      try{
      noMat = JOptionPane.showInputDialog(this, "Cual es el número de matería que desea Modificar");
      noMatInt = Integer.parseInt (noMat);
      
      }catch (NumberFormatException error){
          JOptionPane.showMessageDialog(this, "El caracter que elegiste, no es valido\nIngrese un numero del 1 al 10 y vuelva a intentarlo");
          
      }finally{
      }

        if (noMatInt == 1){
            ListadoMaterias mat1 = new ListadoMaterias();
        }
        
        if (noMatInt == 2){
            ListadoMaterias mat2 = new ListadoMaterias();
        }
        
        if (noMatInt == 3){
            ListadoMaterias mat3 = new ListadoMaterias();
        }
        
        if (noMatInt == 4){
            ListadoMaterias mat4 = new ListadoMaterias();
        }
        
        if (noMatInt == 5){
            ListadoMaterias mat5 = new ListadoMaterias();
        }
        
        if (noMatInt == 6){
            ListadoMaterias mat6 = new ListadoMaterias();
        }
        
        if (noMatInt == 7){
            ListadoMaterias mat7 = new ListadoMaterias();
        }
        
        if (noMatInt == 8){
            ListadoMaterias mat8 = new ListadoMaterias();
        }
        
        if (noMatInt == 9){
            ListadoMaterias mat9 = new ListadoMaterias();
        }
        
        if (noMatInt == 10){
            ListadoMaterias mat10 = new ListadoMaterias();
        }
        
        if (noMatInt >= 1 && noMatInt <= 10){
        RegistroMaterias modifica = new RegistroMaterias ();
        modifica.setBounds(0, 0, 442, 435);
        modifica.setVisible(true);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      String noMat;
      int noMatInt = 0;
      
      try{
      noMat = JOptionPane.showInputDialog(this, "Cual es el número de matería que desea Eliminar");
      noMatInt = Integer.parseInt (noMat);
      
      }catch (NumberFormatException error){
          JOptionPane.showMessageDialog(this, "El caracter que elegiste, no es valido\nIngrese un numero del 1 al 10 y vuelva a intentarlo");
          
      }finally{
      }
      
      noBorrado = noMatInt;
       
       if (noMatInt == 1){
           ListadoMaterias mat1 = new ListadoMaterias();
           impresion1="";
           impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
        }
       
       if (noMatInt == 2){
           ListadoMaterias mat2 = new ListadoMaterias();
           impresion2="";
           impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
       }
       
       if (noMatInt == 3){
           ListadoMaterias mat3 = new ListadoMaterias();
           impresion3="";
           impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
       }
       
       if (noMatInt == 4){
           ListadoMaterias mat4 = new ListadoMaterias();
           impresion4="";
           impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
       }
       
       if (noMatInt == 5){
           ListadoMaterias mat5 = new ListadoMaterias();
           impresion5="";
           impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
       }
       
       if (noMatInt == 6){
           ListadoMaterias mat6 = new ListadoMaterias();
           impresion6="";
           impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
       }
       
       if (noMatInt == 7){
           ListadoMaterias mat7 = new ListadoMaterias();
           impresion7="";
           impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
       }
       
       if (noMatInt == 8){
           ListadoMaterias mat8 = new ListadoMaterias();
           impresion8="";
           impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
       }
       
       if (noMatInt == 9){
           ListadoMaterias mat9 = new ListadoMaterias();
           impresion9="";
           impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
       }
       
       if (noMatInt == 10){
           ListadoMaterias mat10 = new ListadoMaterias();
           impresion10="";
           impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
       }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        RegistroMaterias ventanaAnt2 = new RegistroMaterias ();
        jTextArea1.setText("");
        
        if (noBorrado == ventanaAnt2.noMateriaM ){
            jTextArea1.setText(impresion);
        }
        
        else{
            
        if (ventanaAnt2.noMateriaM == 10){
            ListadoMaterias mat10 = new ListadoMaterias();
            mat10.rellenar(ventanaAnt2.areaM, ventanaAnt2.materiaM, ventanaAnt2.gradoM, ventanaAnt2.noMateriaM);
            impresion10 = mat10.impri(mat10.getAreaM(), mat10.getGradoMa(), mat10.getMateriaMa(), mat10.getNoMateriaMa());
            impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
            jTextArea1.setText(impresion);
        }
        
        if (ventanaAnt2.noMateriaM == 9){
            ListadoMaterias mat9 = new ListadoMaterias();
            mat9.rellenar(ventanaAnt2.areaM, ventanaAnt2.materiaM, ventanaAnt2.gradoM, ventanaAnt2.noMateriaM);
            impresion9 = mat9.impri(mat9.getAreaM(), mat9.getGradoMa(), mat9.getMateriaMa(), mat9.getNoMateriaMa());
            impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
            jTextArea1.setText(impresion);
        }
        
        if (ventanaAnt2.noMateriaM == 8){
            ListadoMaterias mat8 = new ListadoMaterias();
            mat8.rellenar(ventanaAnt2.areaM, ventanaAnt2.materiaM, ventanaAnt2.gradoM, ventanaAnt2.noMateriaM);
            impresion8 = mat8.impri(mat8.getAreaM(), mat8.getGradoMa(), mat8.getMateriaMa(), mat8.getNoMateriaMa());
            impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
            jTextArea1.setText(impresion);
        }
        
        if (ventanaAnt2.noMateriaM == 7){
            ListadoMaterias mat7 = new ListadoMaterias();
            mat7.rellenar(ventanaAnt2.areaM, ventanaAnt2.materiaM, ventanaAnt2.gradoM, ventanaAnt2.noMateriaM);
            impresion7 = mat7.impri(mat7.getAreaM(), mat7.getGradoMa(), mat7.getMateriaMa(), mat7.getNoMateriaMa());
            impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
            jTextArea1.setText(impresion);
        }
        
        if (ventanaAnt2.noMateriaM == 6){
            ListadoMaterias mat6 = new ListadoMaterias();
            mat6.rellenar(ventanaAnt2.areaM, ventanaAnt2.materiaM, ventanaAnt2.gradoM, ventanaAnt2.noMateriaM);
            impresion6 = mat6.impri(mat6.getAreaM(), mat6.getGradoMa(), mat6.getMateriaMa(), mat6.getNoMateriaMa());
            impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
            jTextArea1.setText(impresion);
        }
        
        if (ventanaAnt2.noMateriaM == 5){
            ListadoMaterias mat5 = new ListadoMaterias();
            mat5.rellenar(ventanaAnt2.areaM, ventanaAnt2.materiaM, ventanaAnt2.gradoM, ventanaAnt2.noMateriaM);
            impresion5 = mat5.impri(mat5.getAreaM(), mat5.getGradoMa(), mat5.getMateriaMa(), mat5.getNoMateriaMa());
            impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
            jTextArea1.setText(impresion);
        }
        
        if (ventanaAnt2.noMateriaM == 4){
            ListadoMaterias mat4 = new ListadoMaterias();
            mat4.rellenar(ventanaAnt2.areaM, ventanaAnt2.materiaM, ventanaAnt2.gradoM, ventanaAnt2.noMateriaM);
            impresion4 = mat4.impri(mat4.getAreaM(), mat4.getGradoMa(), mat4.getMateriaMa(), mat4.getNoMateriaMa());
            impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
            jTextArea1.setText(impresion);
        }
        
        if (ventanaAnt2.noMateriaM == 3){
            ListadoMaterias mat3 = new ListadoMaterias();
            mat3.rellenar(ventanaAnt2.areaM, ventanaAnt2.materiaM, ventanaAnt2.gradoM, ventanaAnt2.noMateriaM);
            impresion3 = mat3.impri(mat3.getAreaM(), mat3.getGradoMa(), mat3.getMateriaMa(), mat3.getNoMateriaMa());
            impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
            jTextArea1.setText(impresion);
        }
        
        if (ventanaAnt2.noMateriaM == 2){
            ListadoMaterias mat2 = new ListadoMaterias();
            mat2.rellenar(ventanaAnt2.areaM, ventanaAnt2.materiaM, ventanaAnt2.gradoM, ventanaAnt2.noMateriaM);
            impresion2 = mat2.impri(mat2.getAreaM(), mat2.getGradoMa(), mat2.getMateriaMa(), mat2.getNoMateriaMa());
            impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
            jTextArea1.setText(impresion);   
        }
        
        if (ventanaAnt2.noMateriaM == 1){
            ListadoMaterias mat1 = new ListadoMaterias();
            mat1.rellenar(ventanaAnt2.areaM, ventanaAnt2.materiaM, ventanaAnt2.gradoM, ventanaAnt2.noMateriaM);
            impresion1 = mat1.impri(mat1.getAreaM(), mat1.getGradoMa(), mat1.getMateriaMa(), mat1.getNoMateriaMa());
            impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
            jTextArea1.setText(impresion);
        }
        
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(ListadoMaterias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListadoMaterias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListadoMaterias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListadoMaterias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListadoMaterias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
