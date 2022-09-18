
package javaapplication1;
import javax.swing.event.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt. *;

public class ListadoAlumnos extends javax.swing.JFrame {

    public String noRegisAl = "null";
    public String nombreAl = "null";
    public String domicilioAl = "null";
    public String telefonoAl = "null";
    public String correoAl = "null";
    public String gradoAl = "null";
    public float calificacionAl = 0;
    public int noAlumnoAl = 0;
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
    
    
    void rellenar (String a, String b, String c, String d, String e, String f, float g, int h){
        noRegisAl = a;
        nombreAl = c;
        domicilioAl = b;
        telefonoAl = d;
        correoAl = e;
        gradoAl = f;
        calificacionAl = g;
        noAlumnoAl = h;
    }
    
    String getnoRegisA (){
        return noRegisAl;
    }
    
    String getNombreA (){
        return nombreAl;
    }
    
    String getDomicilioA (){
        return domicilioAl;
    }
    
    String getTelefonoA (){
        return telefonoAl;
    }
    
    String getCorreoA (){
        return correoAl;
    }
    
    String getGradoA (){
        return gradoAl;
    }
    
    float getCalificacionA (){
        return calificacionAl;
    }
    
    int getNoAlumnoA(){
        return noAlumnoAl;
    }
    
    String impri(String a, String b, String c, String d, String e, String f, float g,  int h){
        String numMat= Integer.toString(h);
        String cal = Float.toString(g);
        return "No. de Registro: " + a + "\nNombre: " +  b + "\nDomicilio : " + c + "\nTelefono : " + d + "\nCorreo: "+ e + "\nGrado: " + f + "\nCalificacion: " + cal + "\nNo. Alumno: " + numMat + "\n\n";
    }

    public ListadoAlumnos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("LISTA DE ALUMNOS");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/Alumno.jpg"))); // NOI18N

        jButton1.setText("Nuevo Alumno");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Modificar Alumno");
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(11, 11, 11))
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            ListadoAlumnos mat1 = new ListadoAlumnos();
        }
        
        if (noMatInt == 2){
            ListadoAlumnos mat2 = new ListadoAlumnos();
        }
        
        if (noMatInt == 3){
            ListadoAlumnos mat3 = new ListadoAlumnos();
        }
        
        if (noMatInt == 4){
            ListadoAlumnos mat4 = new ListadoAlumnos();
        }
        
        if (noMatInt == 5){
            ListadoAlumnos mat5 = new ListadoAlumnos();
        }
        
        if (noMatInt == 6){
            ListadoAlumnos mat6 = new ListadoAlumnos();
        }
        
        if (noMatInt == 7){
            ListadoAlumnos mat7 = new ListadoAlumnos();
        }
        
        if (noMatInt == 8){
            ListadoAlumnos mat8 = new ListadoAlumnos();
        }
        
        if (noMatInt == 9){
            ListadoAlumnos mat9 = new ListadoAlumnos();
        }
        
        if (noMatInt == 10){
            ListadoAlumnos mat10 = new ListadoAlumnos();
        }
        
        if (noMatInt >= 1 && noMatInt <= 10){
        RegistroAlumnos modifica = new RegistroAlumnos ();
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
           ListadoAlumnos mat1 = new ListadoAlumnos();
           impresion1="";
           impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
        }
       
       if (noMatInt == 2){
           ListadoAlumnos mat2 = new ListadoAlumnos();
           impresion2="";
           impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
       }
       
       if (noMatInt == 3){
           ListadoAlumnos mat3 = new ListadoAlumnos();
           impresion3="";
           impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
       }
       
       if (noMatInt == 4){
           ListadoAlumnos mat4 = new ListadoAlumnos();
           impresion4="";
           impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
       }
       
       if (noMatInt == 5){
           ListadoAlumnos mat5 = new ListadoAlumnos();
           impresion5="";
           impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
       }
       
       if (noMatInt == 6){
           ListadoAlumnos mat6 = new ListadoAlumnos();
           impresion6="";
           impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
       }
       
       if (noMatInt == 7){
           ListadoAlumnos mat7 = new ListadoAlumnos();
           impresion7="";
           impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
       }
       
       if (noMatInt == 8){
           ListadoAlumnos mat8 = new ListadoAlumnos();
           impresion8="";
           impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
       }
       
       if (noMatInt == 9){
           ListadoAlumnos mat9 = new ListadoAlumnos();
           impresion9="";
           impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
       }
       
       if (noMatInt == 10){
           ListadoAlumnos mat10 = new ListadoAlumnos();
           impresion10="";
           impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
       }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                RegistroAlumnos registra = new RegistroAlumnos();
                registra.setBounds(0, 0, 442, 500);
                registra.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
                RegistroAlumnos ventanaAnt2 = new RegistroAlumnos ();
                jTextArea1.setText("");
        
                if (noBorrado == ventanaAnt2.noAlumnoA ){
                      jTextArea1.setText(impresion);
                }
        
        else{
             if (ventanaAnt2.noAlumnoA== 10){
            ListadoAlumnos mat10 = new ListadoAlumnos();
            mat10.rellenar(ventanaAnt2.noRegisA, ventanaAnt2.nombreA, ventanaAnt2.domicilioA, ventanaAnt2.telefonoA, ventanaAnt2.correoA, ventanaAnt2.gradoA, ventanaAnt2.calificacionA, ventanaAnt2.noAlumnoA);
            impresion10 = mat10.impri(mat10.getnoRegisA(), mat10.getNombreA(), mat10.getDomicilioA(), mat10.getTelefonoA(),mat10.getCorreoA(), mat10.getGradoA(), mat10.getCalificacionA(), mat10.getNoAlumnoA());
            impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
            jTextArea1.setText(impresion);
             }

             if (ventanaAnt2.noAlumnoA== 9){
            ListadoAlumnos mat9 = new ListadoAlumnos();
            mat9.rellenar(ventanaAnt2.noRegisA, ventanaAnt2.nombreA, ventanaAnt2.domicilioA, ventanaAnt2.telefonoA, ventanaAnt2.correoA, ventanaAnt2.gradoA, ventanaAnt2.calificacionA, ventanaAnt2.noAlumnoA);
            impresion9 = mat9.impri(mat9.getnoRegisA(), mat9.getNombreA(), mat9.getDomicilioA(), mat9.getTelefonoA(),mat9.getCorreoA(), mat9.getGradoA(), mat9.getCalificacionA(), mat9.getNoAlumnoA());
            impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
            jTextArea1.setText(impresion);
             }
             
             if (ventanaAnt2.noAlumnoA== 8){
            ListadoAlumnos mat8 = new ListadoAlumnos();
            mat8.rellenar(ventanaAnt2.noRegisA, ventanaAnt2.nombreA, ventanaAnt2.domicilioA, ventanaAnt2.telefonoA, ventanaAnt2.correoA, ventanaAnt2.gradoA, ventanaAnt2.calificacionA, ventanaAnt2.noAlumnoA);
            impresion8 = mat8.impri(mat8.getnoRegisA(), mat8.getNombreA(), mat8.getDomicilioA(), mat8.getTelefonoA(),mat8.getCorreoA(), mat8.getGradoA(), mat8.getCalificacionA(), mat8.getNoAlumnoA());
            impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
            jTextArea1.setText(impresion);
             }

             if (ventanaAnt2.noAlumnoA== 7){
            ListadoAlumnos mat7 = new ListadoAlumnos();
            mat7.rellenar(ventanaAnt2.noRegisA, ventanaAnt2.nombreA, ventanaAnt2.domicilioA, ventanaAnt2.telefonoA, ventanaAnt2.correoA, ventanaAnt2.gradoA, ventanaAnt2.calificacionA, ventanaAnt2.noAlumnoA);
            impresion7 = mat7.impri(mat7.getnoRegisA(), mat7.getNombreA(), mat7.getDomicilioA(), mat7.getTelefonoA(),mat7.getCorreoA(), mat7.getGradoA(), mat7.getCalificacionA(), mat7.getNoAlumnoA());
            impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
            jTextArea1.setText(impresion);
            }
 
            if (ventanaAnt2.noAlumnoA== 6){
            ListadoAlumnos mat6 = new ListadoAlumnos();
            mat6.rellenar(ventanaAnt2.noRegisA, ventanaAnt2.nombreA, ventanaAnt2.domicilioA, ventanaAnt2.telefonoA, ventanaAnt2.correoA, ventanaAnt2.gradoA, ventanaAnt2.calificacionA, ventanaAnt2.noAlumnoA);
            impresion6 = mat6.impri(mat6.getnoRegisA(), mat6.getNombreA(), mat6.getDomicilioA(), mat6.getTelefonoA(),mat6.getCorreoA(), mat6.getGradoA(), mat6.getCalificacionA(), mat6.getNoAlumnoA());
            impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
            jTextArea1.setText(impresion);
             }

            if (ventanaAnt2.noAlumnoA== 5){
            ListadoAlumnos mat5 = new ListadoAlumnos();
            mat5.rellenar(ventanaAnt2.noRegisA, ventanaAnt2.nombreA, ventanaAnt2.domicilioA, ventanaAnt2.telefonoA, ventanaAnt2.correoA, ventanaAnt2.gradoA, ventanaAnt2.calificacionA, ventanaAnt2.noAlumnoA);
            impresion5 = mat5.impri(mat5.getnoRegisA(), mat5.getNombreA(), mat5.getDomicilioA(), mat5.getTelefonoA(),mat5.getCorreoA(), mat5.getGradoA(), mat5.getCalificacionA(), mat5.getNoAlumnoA());
            impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
            jTextArea1.setText(impresion);
             }
  
            if (ventanaAnt2.noAlumnoA== 4){
            ListadoAlumnos mat4 = new ListadoAlumnos();
            mat4.rellenar(ventanaAnt2.noRegisA, ventanaAnt2.nombreA, ventanaAnt2.domicilioA, ventanaAnt2.telefonoA, ventanaAnt2.correoA, ventanaAnt2.gradoA, ventanaAnt2.calificacionA, ventanaAnt2.noAlumnoA);
            impresion4 = mat4.impri(mat4.getnoRegisA(), mat4.getNombreA(), mat4.getDomicilioA(), mat4.getTelefonoA(),mat4.getCorreoA(), mat4.getGradoA(), mat4.getCalificacionA(), mat4.getNoAlumnoA());
            impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
            jTextArea1.setText(impresion);
             }

            if (ventanaAnt2.noAlumnoA== 3){
            ListadoAlumnos mat3 = new ListadoAlumnos();
            mat3.rellenar(ventanaAnt2.noRegisA, ventanaAnt2.nombreA, ventanaAnt2.domicilioA, ventanaAnt2.telefonoA, ventanaAnt2.correoA, ventanaAnt2.gradoA, ventanaAnt2.calificacionA, ventanaAnt2.noAlumnoA);
            impresion3 = mat3.impri(mat3.getnoRegisA(), mat3.getNombreA(), mat3.getDomicilioA(), mat3.getTelefonoA(),mat3.getCorreoA(), mat3.getGradoA(), mat3.getCalificacionA(), mat3.getNoAlumnoA());
            impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
            jTextArea1.setText(impresion);
             }
   
            if (ventanaAnt2.noAlumnoA== 2){
            ListadoAlumnos mat2 = new ListadoAlumnos();
            mat2.rellenar(ventanaAnt2.noRegisA, ventanaAnt2.nombreA, ventanaAnt2.domicilioA, ventanaAnt2.telefonoA, ventanaAnt2.correoA, ventanaAnt2.gradoA, ventanaAnt2.calificacionA, ventanaAnt2.noAlumnoA);
            impresion2 = mat2.impri(mat2.getnoRegisA(), mat2.getNombreA(), mat2.getDomicilioA(), mat2.getTelefonoA(),mat2.getCorreoA(), mat2.getGradoA(), mat2.getCalificacionA(), mat2.getNoAlumnoA());
            impresion = impresion1 + impresion2 + impresion3 + impresion4 + impresion5 + impresion6 +impresion7 +impresion8+ impresion9 +impresion10;
            jTextArea1.setText(impresion);       
            }         
   
            if (ventanaAnt2.noAlumnoA== 1){
            ListadoAlumnos mat1 = new ListadoAlumnos();
            mat1.rellenar(ventanaAnt2.noRegisA, ventanaAnt2.nombreA, ventanaAnt2.domicilioA, ventanaAnt2.telefonoA, ventanaAnt2.correoA, ventanaAnt2.gradoA, ventanaAnt2.calificacionA, ventanaAnt2.noAlumnoA);
            impresion1 = mat1.impri(mat1.getnoRegisA(), mat1.getNombreA(), mat1.getDomicilioA(), mat1.getTelefonoA(),mat1.getCorreoA(), mat1.getGradoA(), mat1.getCalificacionA(), mat1.getNoAlumnoA());
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
            java.util.logging.Logger.getLogger(ListadoAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListadoAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListadoAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListadoAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListadoAlumnos().setVisible(true);
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
