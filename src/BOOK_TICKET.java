
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAMYAK & ATISHAY
 */
public class BOOK_TICKET extends javax.swing.JFrame {

    /**
     * Creates new form BOOK_TICKET
     */
    public BOOK_TICKET(String un,String tn,String as) {
        initComponents();
       L2.setText(un);
    tnl.setText(tn);
    asl.setText(as);
        System.out.println(tnl.getText());
        System.out.println(asl.getText());
    }
String un;
     //To change body of generated methods, choose Tools | Templates.
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        C1 = new javax.swing.JComboBox<>();
        C2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        L2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        C4 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        SRT = new javax.swing.JComboBox<>();
        SLT = new javax.swing.JComboBox<>();
        day = new javax.swing.JComboBox();
        mon = new javax.swing.JComboBox();
        yer = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        tnl = new javax.swing.JLabel();
        asl = new javax.swing.JLabel();

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("jLabel13");
        jLabel13.setOpaque(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1282, 683));
        setMinimumSize(new java.awt.Dimension(1282, 683));
        setPreferredSize(new java.awt.Dimension(1282, 683));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 260, 1990, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SELECT YOUR DESTINATION STATION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 250, 350, 57));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SELECT YOUR SOURCE STATION");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 350, 57));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("<---------------");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 320, 100, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("-------------->");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 340, 100, -1));

        C1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        C1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT SOURCE STATION", "AMRITSAR  (ASR)", "AGRA CANTT (AGC)", "ALLAHABAD (ALD)", "AHMEDABAD JN (ADI)", "BHOPAL JN (BPL)", "BHUVANESHWAR (BBS)", "BENGALURU EAST (BNCE)", "CHENNAI CTL (MAS)", "CHANDIGARH (CDG)", "DEHRADUN (DDN)", "DHANBAD JN (DHN)", "ERNAKULAM JN (ERS)", "ERODE JN (ED)", "FIROZPUR CANTT (FZR)", "GHAZIABAD (GZB)", "GUWAHATI (GHY)", "HABIBGANJ (HBJ)", "HOWRAH (HWH)", "HARIDWAR JN (HW)", "ITARSI JN  (ET)", "INDORE JN (INDB)", "JHANSI JN (JHS)", "JAIPUR JN (JP)", "JODHPUR JN (JU)", "KOTA JN (KOTA)", "KHARAGPUR JN (KGP)", "KANPUR CTL (CNB)", "KAYTNI JN ()", "LUDHIANA JN (LDH)", "LUCKNOW CITY (LDH)", "MATHURA JN (MTJ)", "MANGALURU JN (MAJN)", "NEW DELHI  (NDLS)", "NAGPUR JN (NGP)", "PATNA JN (PNBE)", "PATHANKOT (PTK)", "RAIPUR JN (R)", "RANCHI (RNC)", "SECUNDERABAD JN (SC)", "TRIVANDRUM CNTL (TVC)", "UDAIPUR CTY (UDZ)", "UJJAIN JN (UJN)", "VIJAYWADA JN (BZA)", "VADODARA JN(BRC)", "YESVANTPUR (YPR)", " ", " ", " " }));
        C1.setToolTipText("");
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });
        getContentPane().add(C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 240, 50));

        C2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        C2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT DESTINATION STATION", "AMRITSAR  (ASR)", "AGRA CANTT (AGC)", "ALLAHABAD (ALD)", "AHMEDABAD JN (ADI)", "BHOPAL JN (BPL)", "BHUVANESHWAR (BBS)", "BENGALURU EAST (BNCE)", "CHENNAI CTL (MAS)", "CHANDIGARH (CDG)", "DEHRADUN (DDN)", "DHANBAD JN (DHN)", "ERNAKULAM JN (ERS)", "ERODE JN (ED)", "FIROZPUR CANTT (FZR)", "GHAZIABAD (GZB)", "GUWAHATI (GHY)", "HABIBGANJ (HBJ)", "HOWRAH (HWH)", "HARIDWAR JN (HW)", "ITARSI JN  (ET)", "INDORE JN (INDB)", "JHANSI JN (JHS)", "JAIPUR JN (JP)", "JODHPUR JN (JU)", "KOTA JN (KOTA)", "KHARAGPUR JN (KGP)", "KANPUR CTL (CNB)", "KAYTNI JN ()", "LUDHIANA JN (LDH)", "LUCKNOW CITY (LDH)", "MATHURA JN (MTJ)", "MANGALURU JN (MAJN)", "NEW DELHI  (NDLS)", "NAGPUR JN (NGP)", "PATNA JN (PNBE)", "PATHANKOT (PTK)", "RAIPUR JN (R)", "RANCHI (RNC)", "SECUNDERABAD JN (SC)", "TRIVANDRUM CNTL (TVC)", "UDAIPUR CTY (UDZ)", "UJJAIN JN (UJN)", "VIJAYWADA JN (BZA)", "VADODARA JN(BRC)", "YESVANTPUR (YPR)", " ", " ", " " }));
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });
        getContentPane().add(C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 310, 290, 50));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DATE OF JORNEY");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 240, 40));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("   INDIAN RAILWAY");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 470, 120));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("   WELCOME TO IRCTC NEXT GENERATION TICKET BOOKING SYSTEM");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 630, 50));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/irt2.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-290, 340, -1, -1));

        L2.setBackground(new java.awt.Color(255, 255, 255));
        L2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        L2.setOpaque(true);
        getContentPane().add(L2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 170, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TRAINS AVAILABLE");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 220, 51));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("COACH TYPE");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 260, 51));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton3.setText("CONTINUE BOOKING");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 570, 950, 40));

        C4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        C4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT YOUR COACH TYPE", "SECOND SITTING(2S)", "SLEEPER(SL)", "EXECUTIVE CHAIR CAR(EC)", "AC CHAIRCAR(CC)", "AC THREE TIER(3A)", "AC TWO TIER(2A)", "FIRST AC(1A)", " " }));
        C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C4ActionPerformed(evt);
            }
        });
        getContentPane().add(C4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 940, 40));

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setText("SEARCH TRAINS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 320, 160, 40));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("<<back to home");
        jLabel16.setMaximumSize(new java.awt.Dimension(1282, 683));
        jLabel16.setPreferredSize(new java.awt.Dimension(1282, 683));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 190, 30));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("USERNAME");
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 110, 30));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("-------------->");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, 100, -1));

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("<---------------");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 100, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 252, 1270, 10));

        SRT.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        SRT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT YOUR TRAIN" }));
        SRT.setVisible(true);
        SRT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SRTActionPerformed(evt);
            }
        });
        getContentPane().add(SRT, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 930, 40));

        SLT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT YOUR TRAIN", "ANTODAYA EXPRESS(20972)", "VANDE BHARAT EXPRESS(22436)", "TEJAS EXPRESS(22119)", "HAMSAFAR EXPRESS(22920)", "UDAY EXPRESS(22666)", "MUMBAI DURONTO EXPRESS(22209)", "CHENNAI DURONTO(12270)", "YUVA EXPRESS(12247)", "CR RAJDHANI EXPRESS(22222)", "MUMBAI RAJDHANI EXPRESS(12953)", "BHOPAL SHATABDI EXPRESS(12001)", "SWARNA SHATABDI EXPRESS(12004)", "GATIMAAN EXPRESS(12050)", "KOTA JANSHATABDI EXPRESS(12060)", "MADHYA PRADESH SAMPARKA KRANTI EXPRESS(12122)", "BENGALURU DOUBLE DECKER EXPRESS(22626)", "BANDRA GARIBRATH EXPRESS(12215)", "LUCKNOW AC SUPERFASR EXPRESS(12430)", "SHAAN E BHOPAL EXPRESS(12155)", "CHENNAI EXPRESS(12696)", " " }));
        SLT.setVisible(false);
        SLT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SLTActionPerformed(evt);
            }
        });
        getContentPane().add(SLT, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 930, 40));

        day.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        day.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DATE", "1", "2", "3", "4", "5", "6", "7", "8", "9", "1", "1", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayActionPerformed(evt);
            }
        });
        getContentPane().add(day, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, 90, 30));

        mon.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        mon.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MONTH", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        mon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monActionPerformed(evt);
            }
        });
        getContentPane().add(mon, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 500, 90, 30));

        yer.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        yer.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "YEAR", "1980", "1981", "1882", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", " ", " " }));
        yer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yerActionPerformed(evt);
            }
        });
        getContentPane().add(yer, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 500, 90, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Railway-Wallpapers-013.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 690));
        getContentPane().add(tnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, 210, 30));
        getContentPane().add(asl, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 80, 200, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents
int m,n,o,p,q,r=0,s,u,v,a,b;String un1;String srt;
    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
// TODO add your handling code here:
SRT.removeAllItems();

    }//GEN-LAST:event_C1ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.out.println(L2.getText());
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
String a=(String)C1.getSelectedItem();
String b=(String)C2.getSelectedItem();
        if(a.equals(b))
        {
        JOptionPane.showMessageDialog(null,"PLEASE SELECT DIFFERENT SOURCE AND DESTINATINATION STATION");
        }
        else{
        SRT.setVisible(true);
int max=1,mn=0,mn1=0;

int n=SRT.getItemCount();
        int min =20;
        int range = max - min + 1;
        for (int i = 0; i < 10; i++) {
            mn = (int)(Math.random() * range) + min;
        }
        int ab=mn;
        String item=(String)SLT.getItemAt(ab);
        SRT.addItem(item);
        
        for (int i = 0; i < 10; i++) {
            mn1 = (int)(Math.random() * range) + min;
      }
        int ab1=mn1;
        String item1=(String)SLT.getItemAt(ab1);
        SRT.addItem(item1); 

        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
int t=0;
        int m=C1.getSelectedIndex();
int n=C2.getSelectedIndex();
int q=m-n;
int q1=Math.abs(q);
int fr=q1*75;
r=C4.getSelectedIndex();
switch(r)
{
      case 1: t=fr;
      break; 
      case 2: t=2*fr;
      break;
      case 3: t=(2*fr)+100;
      break;
      case 4: t=(2*fr)+200;
      break;
      case 5: t=3*fr;
      break;
      case 6: t=(3*fr)+500;
      break;
      case 7: t=5*fr;
      break;
}

           
String dy=(String)day.getSelectedItem();
         String mn=(String)mon.getSelectedItem();
         String yr=(String)yer.getSelectedItem();
         String dob=(String)(yr+"/"+mn+"/"+dy);
         String src=(String)C1.getSelectedItem();
         String dst=(String)C2.getSelectedItem();
         String trn=(String)SRT.getSelectedItem();
         un1=L2.getText();
          new ADD_PASSANGER(un1,t,dob,src,dst,trn).setVisible(true);
             this.dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        new HOME(L2.getText()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void SRTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SRTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SRTActionPerformed

    private void SLTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SLTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SLTActionPerformed

    private void monActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monActionPerformed

    private void dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayActionPerformed

    private void yerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yerActionPerformed

    private void C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C4ActionPerformed

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
            java.util.logging.Logger.getLogger(BOOK_TICKET.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BOOK_TICKET.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BOOK_TICKET.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BOOK_TICKET.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              new BOOK_TICKET(null,null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> C1;
    private javax.swing.JComboBox<String> C2;
    private javax.swing.JComboBox<String> C4;
    private javax.swing.JLabel L2;
    private javax.swing.JComboBox<String> SLT;
    private javax.swing.JComboBox<String> SRT;
    private javax.swing.JLabel asl;
    private javax.swing.JComboBox day;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox mon;
    private javax.swing.JLabel tnl;
    private javax.swing.JComboBox yer;
    // End of variables declaration//GEN-END:variables
}
