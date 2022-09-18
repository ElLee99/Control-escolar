
package javaapplication1;
import javax.swing.event.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt. *;

public class ListadoMaestro extends javax.swing.JFrame {

    public static String noRegisTe = "null";
    public String nombreTe = "null";
    public String domicilioTe = "null";
    public String telefonoTe = "null";
    public String correoTe = "null";
    public int noMaestroTe = 0;
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
    
    
    void rellenar (String a, String b, String c, String d, String e, int f){
        noRegisTe = a;
        nombreTe = c;
        domicilioTe = b;
        telefonoTe = d;
        correoTe = e;
        noMaestroTe = f;
    }
    
    String getnoRegisT (){
        return noRegisTe;
    }
    
    String getNombreT (){
        return nombreTe;
    }
    
    String getDomicilioT (){
        return domicilioTe;
    }
    
    String getTelefonoT (){
        return telefonoTe;
    }
    
    String getCorreoT (){
        return correoTe;
    }
    
    int getNoMaestroT(){
        return noMaestroTe;
    }
    
    String impri(String a, String b, String c, String d, String e,  int f){
        String numMat= Integer.toString(f);
        return "No. de Registro: " + a + "\nNombre: " +  b + "\nDomicilio : " + c + "\nTelefono : " + d + "\nCorreo: "+ e + "\nNo. Maestro: " + numMat + "\n\n";
    }
    
    public ListadoMaestro() {
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
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("Nuevo Maestro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Modificar Maestro");
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
        jLabel3.setText("LISTA DE MAESTROS");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/Teache.jpg"))); // NOI18N

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                RegistroMaestros registra = new RegistroMaestros();
                registra.setBounds(0, 0, 442, 500);
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
            ListadoMaestro mat1 = new ListadoMaestro();
        }
        
        if (noMatInt == 2){
            ListadoMaestro mat2 = new ListadoMaestro();
        }
        
        if (noMatInt == 3){
            ListadoMaestro mat3 = new ListadoMaestro();
        }
        
        if (noMatInt == 4){
            ListadoMaestro mat4 = new ListadoMaestro();
        }
        
        if (noMatInt == 5){
            ListadoMaestro mat5 = new ListadoMaestro();
        }
        
        if (noMatInt == 6){
            ListadoMaestro mat6 = new ListadoMaestro();
        }
        
        if (noMatInt == 7){
            ListadoMaestro mat7 = new ListadoMaestro();
        }
        
        if (noMatInt == 8){
            ListadoMaestro mat8 = new ListadoMaestro();
        }
        
        if (noMatInt == 9){
            ListadoMaestro mat9 = new ListadoMaestro();
        }
        
        if (noMatInt == 10){
            ListadoMaestro mat10 = new ListadoMaestro();
        }
        
        if (noMatInt >= 1 && noMatInt <= 10){
        RegistroMaestros modifica = new RegistroMaestros ();
        modifica.setBounds(0, 0, 442, 500);
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
           ListadoMaestro mat1 = new ListadoMaestro();
           impresion1="";
           impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
        }
       
       if (noMatInt == 2){
           ListadoMaestro mat2 = new ListadoMaestro();
           impresion2="";
           impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
       }
       
       if (noMatInt == 3){
           ListadoMaestro mat3 = new ListadoMaestro();
           impresion3="";
           impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
       }
       
       if (noMatInt == 4){
           ListadoMaestro mat4 = new ListadoMaestro();
           impresion4="";
           impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
       }
       
       if (noMatInt == 5){
           ListadoMaestro mat5 = new ListadoMaestro();
           impresion5="";
           impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
       }
       
       if (noMatInt == 6){
           ListadoMaestro mat6 = new ListadoMaestro();
           impresion6="";
           impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
       }
       
       if (noMatInt == 7){
           ListadoMaestro mat7 = new ListadoMaestro();
           impresion7="";
           impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
       }
       
       if (noMatInt == 8){
           ListadoMaestro mat8 = new ListadoMaestro();
           impresion8="";
           impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
       }
       
       if (noMatInt == 9){
           ListadoMaestro mat9 = new ListadoMaestro();
           impresion9="";
           impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
       }
       
       if (noMatInt == 10){
           ListadoMaestro mat10 = new ListadoMaestro();
           impresion10="";
           impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
       }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        RegistroMaestros ventanaAnt2 = new RegistroMaestros ();
        jTextArea1.setText("");
        
        if (noBorrado == ventanaAnt2.noMaestroT ){
            jTextArea1.setText(impresion);
        }
        
        else{
            if (ventanaAnt2.noMaestroT == 10){
            ListadoMaestro mat10 = new ListadoMaestro();
            mat10.rellenar(ventanaAnt2.noRegisT, ventanaAnt2.nombreT, ventanaAnt2.domicilioT, ventanaAnt2.telefonoT, ventanaAnt2.correoT, ventanaAnt2.noMaestroT);
            impresion10 = mat10.impri(mat10.getnoRegisT(), mat10.getNombreT(), mat10.getDomicilioT(), mat10.getTelefonoT(),mat10.getCorreoT(), mat10.getNoMaestroT());
            impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
            jTextArea1.setText(impresion);   
            }
            
             if (ventanaAnt2.noMaestroT == 9){
            ListadoMaestro mat9 = new ListadoMaestro();
            mat9.rellenar(ventanaAnt2.noRegisT, ventanaAnt2.nombreT, ventanaAnt2.domicilioT, ventanaAnt2.telefonoT, ventanaAnt2.correoT, ventanaAnt2.noMaestroT);
            impresion9 = mat9.impri(mat9.getnoRegisT(), mat9.getNombreT(), mat9.getDomicilioT(), mat9.getTelefonoT(),mat9.getCorreoT(), mat9.getNoMaestroT());
            impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
            jTextArea1.setText(impresion);     
            }
             
            if (ventanaAnt2.noMaestroT == 8){
            ListadoMaestro mat8 = new ListadoMaestro();
            mat8.rellenar(ventanaAnt2.noRegisT, ventanaAnt2.nombreT, ventanaAnt2.domicilioT, ventanaAnt2.telefonoT, ventanaAnt2.correoT, ventanaAnt2.noMaestroT);
            impresion8 = mat8.impri(mat8.getnoRegisT(), mat8.getNombreT(), mat8.getDomicilioT(), mat8.getTelefonoT(),mat8.getCorreoT(), mat8.getNoMaestroT());
            impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
            jTextArea1.setText(impresion);  
            }
            
            if (ventanaAnt2.noMaestroT == 7){
            ListadoMaestro mat7 = new ListadoMaestro();
            mat7.rellenar(ventanaAnt2.noRegisT, ventanaAnt2.nombreT, ventanaAnt2.domicilioT, ventanaAnt2.telefonoT, ventanaAnt2.correoT, ventanaAnt2.noMaestroT);
            impresion7 = mat7.impri(mat7.getnoRegisT(), mat7.getNombreT(), mat7.getDomicilioT(), mat7.getTelefonoT(),mat7.getCorreoT(), mat7.getNoMaestroT());
            impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
            jTextArea1.setText(impresion);  
            }
            
            if (ventanaAnt2.noMaestroT == 6){
            ListadoMaestro mat6 = new ListadoMaestro();
            mat6.rellenar(ventanaAnt2.noRegisT, ventanaAnt2.nombreT, ventanaAnt2.domicilioT, ventanaAnt2.telefonoT, ventanaAnt2.correoT, ventanaAnt2.noMaestroT);
            impresion6 = mat6.impri(mat6.getnoRegisT(), mat6.getNombreT(), mat6.getDomicilioT(), mat6.getTelefonoT(),mat6.getCorreoT(), mat6.getNoMaestroT());
            impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
            jTextArea1.setText(impresion);    
            }   
                
            if (ventanaAnt2.noMaestroT == 5){
            ListadoMaestro mat5 = new ListadoMaestro();
            mat5.rellenar(ventanaAnt2.noRegisT, ventanaAnt2.nombreT, ventanaAnt2.domicilioT, ventanaAnt2.telefonoT, ventanaAnt2.correoT, ventanaAnt2.noMaestroT);
            impresion5 = mat5.impri(mat5.getnoRegisT(), mat5.getNombreT(), mat5.getDomicilioT(), mat5.getTelefonoT(),mat5.getCorreoT(), mat5.getNoMaestroT());
            impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
            jTextArea1.setText(impresion);    
            }
            
            if (ventanaAnt2.noMaestroT == 4){
            ListadoMaestro mat4 = new ListadoMaestro();
            mat4.rellenar(ventanaAnt2.noRegisT, ventanaAnt2.nombreT, ventanaAnt2.domicilioT, ventanaAnt2.telefonoT, ventanaAnt2.correoT, ventanaAnt2.noMaestroT);
            impresion4 = mat4.impri(mat4.getnoRegisT(), mat4.getNombreT(), mat4.getDomicilioT(), mat4.getTelefonoT(),mat4.getCorreoT(), mat4.getNoMaestroT());
            impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
            jTextArea1.setText(impresion);   
            }   
             
            if (ventanaAnt2.noMaestroT == 3){
            ListadoMaestro mat3 = new ListadoMaestro();
            mat3.rellenar(ventanaAnt2.noRegisT, ventanaAnt2.nombreT, ventanaAnt2.domicilioT, ventanaAnt2.telefonoT, ventanaAnt2.correoT, ventanaAnt2.noMaestroT);
            impresion3 = mat3.impri(mat3.getnoRegisT(), mat3.getNombreT(), mat3.getDomicilioT(), mat3.getTelefonoT(),mat3.getCorreoT(), mat3.getNoMaestroT());
            impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
            jTextArea1.setText(impresion);
            }
                
            if (ventanaAnt2.noMaestroT == 2){
            ListadoMaestro mat2 = new ListadoMaestro();
            mat2.rellenar(ventanaAnt2.noRegisT, ventanaAnt2.nombreT, ventanaAnt2.domicilioT, ventanaAnt2.telefonoT, ventanaAnt2.correoT, ventanaAnt2.noMaestroT);
            impresion2 = mat2.impri(mat2.getnoRegisT(), mat2.getNombreT(), mat2.getDomicilioT(), mat2.getTelefonoT(),mat2.getCorreoT(), mat2.getNoMaestroT());
            impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
            jTextArea1.setText(impresion);
            }

            if (ventanaAnt2.noMaestroT == 1){
            ListadoMaestro mat1 = new ListadoMaestro();
            mat1.rellenar(ventanaAnt2.noRegisT, ventanaAnt2.nombreT, ventanaAnt2.domicilioT, ventanaAnt2.telefonoT, ventanaAnt2.correoT, ventanaAnt2.noMaestroT);
            impresion1 = mat1.impri(mat1.getnoRegisT(), mat1.getNombreT(), mat1.getDomicilioT(), mat1.getTelefonoT(),mat1.getCorreoT(), mat1.getNoMaestroT());
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
            java.util.logging.Logger.getLogger(ListadoMaestro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListadoMaestro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListadoMaestro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListadoMaestro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListadoMaestro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
