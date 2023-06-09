
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAMYAK & ATISHAY
 */
public class PROFILE_SETTING extends javax.swing.JFrame {

    /**
     * Creates new form PROFILE_SETTING
     */
    public PROFILE_SETTING(String un) {
        initComponents();
        L2.setText(un);
            UIManager.put("OptionPane.messageFont", new Font("TIMES NEW ROMAN", Font.BOLD, 20));
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        L1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cc = new javax.swing.JTextField();
        cn = new javax.swing.JTextField();
        ce = new javax.swing.JTextField();
        cph = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        opl2 = new javax.swing.JLabel();
        opl1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        L2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        OPF = new javax.swing.JPasswordField();
        NPF = new javax.swing.JPasswordField();
        l1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1282, 683));
        setMinimumSize(new java.awt.Dimension(1282, 683));
        setPreferredSize(new java.awt.Dimension(1282, 683));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        L1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profile1.jpg"))); // NOI18N
        getContentPane().add(L1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 340, 190));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CHANGE YOUR PROFILE IMAGE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 450, 30));

        jLabel3.setFont(new java.awt.Font("Modern No. 20", 2, 24)); // NOI18N
        jLabel3.setText("_______________________________________________CHANGE YOUR PROFILE");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1130, 40));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CHANGE PHONE NUMBER");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, 320, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CHANGE  NAME");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 270, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CHANGE CITY");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 270, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CHANGE EMAIL");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, 270, 30));
        getContentPane().add(cc, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 550, 620, 30));
        getContentPane().add(cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 610, 40));
        getContentPane().add(ce, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 590, 620, 30));

        cph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cphActionPerformed(evt);
            }
        });
        getContentPane().add(cph, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 630, 620, 40));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("UPDATE MY PROFILE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 50, 340, 50));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setText("CHANGE  DP");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 180, 30));

        jButton3.setVisible(false);
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton3.setText("DONE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 490, 360, 40));

        opl2.setVisible(false);
        opl2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        opl2.setForeground(new java.awt.Color(255, 255, 255));
        opl2.setText("NEW PASSWORD");
        getContentPane().add(opl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 330, 30));

        opl1.setVisible(false);
        opl1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        opl1.setForeground(new java.awt.Color(255, 255, 255));
        opl1.setText("OLD PASSWORD");
        getContentPane().add(opl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 330, 30));

        jLabel11.setForeground(new java.awt.Color(153, 255, 255));
        jLabel11.setText("<<back to home");
        jLabel11.setMaximumSize(new java.awt.Dimension(1282, 683));
        jLabel11.setPreferredSize(new java.awt.Dimension(1282, 683));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 110, 20));

        L2.setBackground(new java.awt.Color(255, 255, 255));
        L2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        L2.setOpaque(true);
        getContentPane().add(L2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 230, 30));

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton4.setText("CHANGE PASSWORD");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 750, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("USERNAME");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 230, 40));

        jButton5.setVisible(false);
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton5.setText("VERIFY OLD PASSWORD");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 430, 360, 50));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 542, 1200, 10));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 1200, 10));

        OPF.setVisible(false);
        OPF.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        OPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OPFActionPerformed(evt);
            }
        });
        getContentPane().add(OPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 430, 40));

        NPF.setVisible(false);
        NPF.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        getContentPane().add(NPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, 430, 40));
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pf.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents
String n,c,e,op,np;
int ph;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
JFileChooser mn=new JFileChooser(); 
mn.showOpenDialog(null);
try
{
File f =mn.getSelectedFile();
Image wq=ImageIO.read(f);
ImageIcon ab=new ImageIcon(wq);
L1.setIcon(ab);
}

catch(Exception ex)
        {
        JOptionPane.showMessageDialog(null,"PLEASE CHOOSE AN IMAGE");
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 
     np=new String(NPF.getPassword());
        try
        {
            Class.forName("java.sql.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/irctc?zeroDateTimeBehavior=convertToNull","root","123456");
            Statement stmt=con.createStatement();
            String sql="update register set pw='"+np+"'where un='"+L2.getText()+"'";
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null," PASSWORD CHANGED SUCCESFULLY........");
            jButton5.setVisible(false);
OPF.setVisible(false);
opl1.setVisible(false);
opl2.setVisible(false);
NPF.setVisible(false);
jButton3.setVisible(false);
        }catch(Exception ex)
        {
             JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cphActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cphActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  n=cn.getText();
  c=cc.getText();
        e=ce.getText();
        ph=Integer.parseInt(cph.getText());
              String s;
    
        try
        {
            Class.forName("java.sql.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/irctc?zeroDateTimeBehavior=convertToNull","root","123456");
            Statement stmt=con.createStatement();
            String sql="update register set n='"+n+"',ct='"+c+"',e='"+e+"',ph='"+ph+"' where un='"+L2.getText()+"'";
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null," RECORD IS UPDATED............");
        }catch(Exception ex)
        {
             JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        new HOME(L2.getText()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         String a=null;
          op=new String(OPF.getPassword());
         try
        {
            Class.forName("java.sql.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/irctc?zeroDateTimeBehavior=convertToNull","root","123456");
            Statement stmt=con.createStatement();
            String sql="Select pw from register where un='"+L2.getText()+"'";
             ResultSet rs= stmt.executeQuery(sql);
               while (rs.next()) {
           
             a= rs.getString("pw");
               }
        }catch(Exception ex)
        {
             JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        if(op.equals(a))
        {
      jButton3.setVisible(true);  
        NPF.setVisible(true);
        
        }
       else
        {
        JOptionPane.showMessageDialog(null,"enter correct password.........");
        
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
jButton5.setVisible(true);
OPF.setVisible(true);
opl1.setVisible(true);
opl2.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void OPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OPFActionPerformed

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
            java.util.logging.Logger.getLogger(PROFILE_SETTING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PROFILE_SETTING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PROFILE_SETTING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PROFILE_SETTING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PROFILE_SETTING(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L2;
    private javax.swing.JPasswordField NPF;
    private javax.swing.JPasswordField OPF;
    private javax.swing.JTextField cc;
    private javax.swing.JTextField ce;
    private javax.swing.JTextField cn;
    private javax.swing.JTextField cph;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel opl1;
    private javax.swing.JLabel opl2;
    // End of variables declaration//GEN-END:variables
}
