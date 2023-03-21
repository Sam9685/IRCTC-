
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
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
public class RETIRING_ROOM extends javax.swing.JFrame {

    /**
     * Creates new form RETIRING_ROOM
     */
    public RETIRING_ROOM(String un) {
        initComponents();
        L2.setText(un);
            UIManager.put("OptionPane.messageFont", new Font("TIMES NEW ROMAN", Font.BOLD, 20));
    }
int a,b,c,d,e,f,g,hr,h,i,j,k,l,m,n,nr,o,p,q,r,s,sr=0,tr,u,v,w,x,y,z;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        STN = new javax.swing.JComboBox<>();
        DR = new javax.swing.JComboBox<>();
        RO = new javax.swing.JComboBox<>();
        NRO = new javax.swing.JComboBox<>();
        NP = new javax.swing.JComboBox<>();
        ES = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA1 = new javax.swing.JTextArea();
        L2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 255));
        setMaximumSize(new java.awt.Dimension(1282, 683));
        setMinimumSize(new java.awt.Dimension(1282, 683));
        setPreferredSize(new java.awt.Dimension(1282, 683));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 1950, 10));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("SELECT YOUR STATION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 386, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("DURATION OF STAY");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 386, 57));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("TYPES OF ROOM");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 330, 50));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("NUMBER OF ROOM");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 224, 58));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("NUMBER OF PEOPLE");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 314, 52));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("EXTRA SERVICES");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 314, 50));

        STN.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        STN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AMRITSAR  (ASR)", "AGRA CANTT (AGC)", "ALLAHABAD (ALD)", "AHMEDABAD JN (ADI)", "BHOPAL JN (BPL)", "BHUVANESHWAR (BBS)", "BENGALURU EAST (BNCE)", "CHENNAI CTL (MAS)", "CHANDIGARH (CDG)", "DEHRADUN (DDN)", "DHANBAD JN (DHN)", "ERNAKULAM JN (ERS)", "ERODE JN (ED)", "FIROZPUR CANTT (FZR)", "GHAZIABAD (GZB)", "GUWAHATI (GHY)", "HABIBGANJ (HBJ)", "HOWRAH (HWH)", "HARIDWAR JN (HW)", "ITARSI JN  (ET)", "INDORE JN (INDB)", "JHANSI JN (JHS)", "JAIPUR JN (JP)", "JODHPUR JN (JU)", "KOTA JN (KOTA)", "KHARAGPUR JN (KGP)", "KANPUR CTL (CNB)", "KAYTNI JN ()", "LUDHIANA JN (LDH)", "LUCKNOW CITY (LDH)", "MATHURA JN (MTJ)", "MANGALURU JN (MAJN)", "NEW DELHI  (NDLS)", "NAGPUR JN (NGP)", "PATNA JN (PNBE)", "PATHANKOT (PTK)", "RAIPUR JN (R)", "RANCHI (RNC)", "SECUNDERABAD JN (SC)", "TRIVANDRUM CNTL (TVC)", "UDAIPUR CTY (UDZ)", "UJJAIN JN (UJN)", "VIJAYWADA JN (BZA)", "VADODARA JN(BRC)", "YESVANTPUR (YPR)", " ", " ", " " }));
        STN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STNActionPerformed(evt);
            }
        });
        getContentPane().add(STN, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 430, 40));

        DR.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        DR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT DURATION", "1 HOUR", "3 HOURS", "6 HOURS", "12 HOURS", "24 HOURS" }));
        DR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DRActionPerformed(evt);
            }
        });
        getContentPane().add(DR, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 430, 40));

        RO.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        RO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT YOUR ROOM TYPE", "NORMAL NON-AC ROOM", "DELUXE NON-AC ROOM", "NORMAL AC ROOM", "DELUXE AC ROOM" }));
        RO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ROActionPerformed(evt);
            }
        });
        getContentPane().add(RO, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 430, 40));

        NRO.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        NRO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT NUMBER OF ROOMS", "1", "2", "3", "4" }));
        NRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NROActionPerformed(evt);
            }
        });
        getContentPane().add(NRO, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 430, 40));

        NP.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        NP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT NUMBER OF PEOPLE", "1", "2", "3", "4", "5", "6" }));
        NP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NPActionPerformed(evt);
            }
        });
        getContentPane().add(NP, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 430, 40));

        ES.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ES.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT EXTRA SERVICE", "NEWSPAPER SERVICE", "EXTRA BEDDING", "MINEREL WATER", "EXTRA PILLOW" }));
        ES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ESActionPerformed(evt);
            }
        });
        getContentPane().add(ES, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, 430, 40));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("CLICK HERE TO CONFIRM YOUR BOOKING");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 660, 80));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RR.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 250, 200));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel10.setText("RETIRING ROOM ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 470, 90));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setText("THE PLACE WHERE YOU FEEL LIKE YOUR HOME");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 600, 90));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RR2.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 40, 330, 170));

        TA1.setEditable(false);
        TA1.setColumns(20);
        TA1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        TA1.setRows(10);
        jScrollPane1.setViewportView(TA1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 260, 580, 400));

        L2.setBackground(new java.awt.Color(255, 255, 255));
        L2.setOpaque(true);
        getContentPane().add(L2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 170, 30));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("USERNAME");
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 110, 30));

        jLabel13.setForeground(new java.awt.Color(0, 102, 255));
        jLabel13.setText("<<back to home");
        jLabel13.setMaximumSize(new java.awt.Dimension(1282, 683));
        jLabel13.setPreferredSize(new java.awt.Dimension(1282, 683));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 110, 20));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/673299.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NROActionPerformed
nr=NRO.getSelectedIndex();        
// TODO add your handling code here:
    }//GEN-LAST:event_NROActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        r=nr*((hr*tr)+sr+50*(n-1));
TA1.setText("");
TA1.append("                                                          TAX INVOICE                                                          "+"\n"+"\n"+"\n"+"YOUR TOTAL AMOUNT IS:   "+ r+"\n"+"\n"+"\n"+"THANKS FOR HAVING TRANSACTION WITH IRCTC");
 String room=(String)RO.getSelectedItem();    
try{
           // Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
       // Connection con = DriverManager.getConnection("jdbc:odbc:ins");
           Class.forName("java.sql.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/irctc?zeroDateTimeBehavior=convertToNull","root","123456");
            Statement stmt=con.createStatement();
            String sql="Insert into retiring_room values('"+L2.getText()+"','"+room+"',"+r+")";
            stmt.executeUpdate(sql);
           
          }
       catch(Exception ex)
       {
       JOptionPane.showMessageDialog(null,ex.getMessage());
       }
int pm=0;
pm=r;
PAYMENT RR=new PAYMENT(pm,L2.getText());
     RR.setVisible(true);
this.dispose();



    }//GEN-LAST:event_jButton1ActionPerformed

    private void STNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_STNActionPerformed

    private void ROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ROActionPerformed
m=RO.getSelectedIndex();
switch(m)
{
    case 0:tr=0;
    break;
    case 1:tr=10;
    break;
      case 2:tr=15;
    break;
      case 3:tr=20;
    break;
      case 4:tr=25;
    break;
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_ROActionPerformed

    private void DRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DRActionPerformed

        h=DR.getSelectedIndex();
switch(h)
{
    case 0:hr=0;
    break;
    case 1:hr=10;
    break;
      case 2:hr=15;
    break;
      case 3:hr=30;
    break;
      case 4:hr=40;
    break; 
          case 5:hr=50;
    break; 
         
    
}      // TODO add your handling code here:
    }//GEN-LAST:event_DRActionPerformed

    private void NPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NPActionPerformed
n=NP.getSelectedIndex();        //
    }//GEN-LAST:event_NPActionPerformed

    private void ESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ESActionPerformed
  s=ES.getSelectedIndex();
switch(s)
{
    case 0:sr=0;
    break; 
    case 1:sr=5;
    break;
      case 2:sr=50;
    break;
      case 3:sr=20;
    break;
      case 4:sr=10;
    break; 
}    
        // TODO add your handling code here:
    }//GEN-LAST:event_ESActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        new HOME(L2.getText()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel13MouseClicked

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
            java.util.logging.Logger.getLogger(RETIRING_ROOM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RETIRING_ROOM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RETIRING_ROOM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RETIRING_ROOM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RETIRING_ROOM(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> DR;
    private javax.swing.JComboBox<String> ES;
    private javax.swing.JLabel L2;
    private javax.swing.JComboBox<String> NP;
    private javax.swing.JComboBox<String> NRO;
    private javax.swing.JComboBox<String> RO;
    private javax.swing.JComboBox<String> STN;
    private javax.swing.JTextArea TA1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}