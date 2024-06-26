package Code;

import java.awt.Color;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.Date;

public class ManageFeesForm extends javax.swing.JFrame {

    /**
     * Creates new form ManageFeesForm
     */
    
    Fee f = new Fee();
    FeeReceiptPDF fp = new FeeReceiptPDF();
    
    public ManageFeesForm() {
        initComponents();
        disableFields();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_course = new javax.swing.JLabel();
        lbl_snm = new javax.swing.JLabel();
        lbl_enrollment = new javax.swing.JLabel();
        lbl_sem = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_eno = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        cb_sem = new javax.swing.JComboBox<>();
        cb_program = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_receiptno = new javax.swing.JTextField();
        txt_total = new javax.swing.JTextField();
        cb_payment = new javax.swing.JComboBox<>();
        txt_date = new com.toedter.calendar.JDateChooser();
        btn_payfee = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txt_totalwords = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txt_enr = new javax.swing.JTextField();
        panel_back = new javax.swing.JPanel();
        lbl_back = new javax.swing.JLabel();
        panel_logout = new javax.swing.JPanel();
        lbl_logout1 = new javax.swing.JLabel();
        btn_clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));

        lbl_course.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_course.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_course.setText("Manage Fees");

        lbl_snm.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl_snm.setText("Student's Name");

        lbl_enrollment.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl_enrollment.setText("Enrollment NO");

        lbl_sem.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl_sem.setText("Semester");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Program : ");

        txt_eno.setEditable(false);
        txt_eno.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        txt_name.setEditable(false);
        txt_name.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        cb_sem.setBackground(new java.awt.Color(240, 240, 240));
        cb_sem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cb_sem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));

        cb_program.setBackground(new java.awt.Color(240, 240, 240));
        cb_program.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cb_program.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Program", "BCA", "BBA" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Receipt Date");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Total Amount (Rs.)");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("Receipt No");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("Payment Type");

        txt_receiptno.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        txt_total.setEditable(false);
        txt_total.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txt_total.setText("20000");
        txt_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_totalActionPerformed(evt);
            }
        });

        cb_payment.setEditable(true);
        cb_payment.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cb_payment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Payment Type", "Cash", "Online" }));
        cb_payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_paymentActionPerformed(evt);
            }
        });

        txt_date.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btn_payfee.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_payfee.setText("Pay Fee");
        btn_payfee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_payfeeActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setText("Total in Words");

        txt_totalwords.setEditable(false);
        txt_totalwords.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txt_totalwords.setText("TWENTY THOUSAND ONLY");
        txt_totalwords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_totalwordsActionPerformed(evt);
            }
        });

        btn_search.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_search.setText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchbtn_searchActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel17.setText("Student Enrollement No:");

        txt_enr.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txt_enr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_enrActionPerformed(evt);
            }
        });

        panel_back.setBackground(new java.awt.Color(0, 102, 102));

        lbl_back.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lbl_back.setForeground(new java.awt.Color(255, 255, 255));
        lbl_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back-button.png"))); // NOI18N
        lbl_back.setText("   Back");
        lbl_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_backMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_backLayout = new javax.swing.GroupLayout(panel_back);
        panel_back.setLayout(panel_backLayout);
        panel_backLayout.setHorizontalGroup(
            panel_backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
            .addGroup(panel_backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_backLayout.createSequentialGroup()
                    .addContainerGap(40, Short.MAX_VALUE)
                    .addComponent(lbl_back, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(24, Short.MAX_VALUE)))
        );
        panel_backLayout.setVerticalGroup(
            panel_backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 91, Short.MAX_VALUE)
            .addGroup(panel_backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_backLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_back)
                    .addContainerGap(14, Short.MAX_VALUE)))
        );

        panel_logout.setBackground(new java.awt.Color(0, 102, 102));

        lbl_logout1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lbl_logout1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_logout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout.png"))); // NOI18N
        lbl_logout1.setText("   Logout");
        lbl_logout1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_logout1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_logout1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_logout1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_logoutLayout = new javax.swing.GroupLayout(panel_logout);
        panel_logout.setLayout(panel_logoutLayout);
        panel_logoutLayout.setHorizontalGroup(
            panel_logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
            .addGroup(panel_logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_logoutLayout.createSequentialGroup()
                    .addGap(0, 42, Short.MAX_VALUE)
                    .addComponent(lbl_logout1)
                    .addGap(0, 43, Short.MAX_VALUE)))
        );
        panel_logoutLayout.setVerticalGroup(
            panel_logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 91, Short.MAX_VALUE)
            .addGroup(panel_logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_logoutLayout.createSequentialGroup()
                    .addGap(0, 13, Short.MAX_VALUE)
                    .addComponent(lbl_logout1)
                    .addGap(0, 14, Short.MAX_VALUE)))
        );

        btn_clear.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel17)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_enr, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_enrollment)
                                            .addComponent(lbl_sem)
                                            .addComponent(jLabel5))
                                        .addGap(54, 54, 54)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cb_sem, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_eno, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cb_program, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl_snm, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(346, 346, 346)
                                .addComponent(lbl_course, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)
                        .addComponent(panel_back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panel_logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 382, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_receiptno, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cb_payment, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_totalwords, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_payfee, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(324, 324, 324))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lbl_course)
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_enr, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel_back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel_logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_receiptno, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_snm, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_enrollment)
                            .addComponent(txt_eno, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_sem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_sem))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_totalwords, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_program, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_payfee, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_payment, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void txt_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_totalActionPerformed

    private void cb_paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_paymentActionPerformed

        
           
       
    }//GEN-LAST:event_cb_paymentActionPerformed

    private void btn_payfeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_payfeeActionPerformed

        try {
                 String sname = txt_name.getText();
                 int eno = Integer.parseInt(txt_eno.getText());
                 String program = cb_program.getSelectedItem().toString();
                 int sem = Integer.parseInt(cb_sem.getSelectedItem().toString());
                 String receiptno = txt_receiptno.getText();

                 SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
                 Date selectedDate =  txt_date.getDate();
                 Date currentDate = new Date(); // Get the current date
        
                 // Validate if the selected date is not null and is the current date
                if (selectedDate == null || !dateformat.format(selectedDate).equals(dateformat.format(currentDate))) {
                    String errorMessage = "<html><b style='font-size: 12px;'>Please select the current date.</b></html>";
                    JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.WARNING_MESSAGE);
                } else {
                   String receiptdate = dateformat.format(selectedDate);
                   int total = Integer.parseInt(txt_total.getText());
                   String words = txt_totalwords.getText();

                   // Check if any payment type is selected
                   if (cb_payment.getSelectedIndex() == 0) {
                       String errorMessage = "<html><b style='font-size: 12px;'>Please select a payment type.</b></html>";
                       JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.WARNING_MESSAGE);
                   } else if (sname.isEmpty() || eno == 0 || program.isEmpty() || sem == 0 || receiptno.isEmpty()
                           || receiptdate.isEmpty() || total == 0 || words.isEmpty()) {
                       String errorMessage = "<html><b style='font-size: 12px;'>Please fill in all the fields.</b></html>";
                       JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.WARNING_MESSAGE);
                   } else {
                       // Check if the enrollment number already exists
                       if (f.enrollmentExists(eno)) {
                           String errorMessage = "<html><b style='font-size: 12px;'>Enrollment No. already exists!</b></html>";
                           JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.WARNING_MESSAGE);
                       } else {
                           String paymenttype = cb_payment.getSelectedItem().toString();

                           // Call the insertFee method
                           f.insertFee('i', null, eno, sname, sem, program, receiptno, receiptdate, paymenttype, total, words);

                           // Generate PDF receipt
                           fp.generatePDFReceipt(sname, eno, program, sem, receiptno, receiptdate, paymenttype, total, words);

                           // Clear fields
                           clearFields();
                       }
                   }
           }
       } catch (Exception e) {
           String errorMessage = "<html><b style='font-size: 12px;'>" + e.getMessage() + "</b></html>";
           JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.WARNING_MESSAGE);
       }

    }//GEN-LAST:event_btn_payfeeActionPerformed

    
        // Method to clear all fields
        private void clearFields() {
            txt_name.setText("");
            txt_eno.setText("");
            cb_program.setSelectedItem(null);
            cb_sem.setSelectedItem(null);
            txt_receiptno.setText("");
            txt_date.setDate(null);
            cb_payment.setSelectedItem(null);
           // txt_total.setText("");
            //txt_totalwords.setText("");
            txt_enr.setText("");
        }

    
    private void txt_totalwordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_totalwordsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_totalwordsActionPerformed

    private void btn_searchbtn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchbtn_searchActionPerformed
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;

        try {
            String enrollmentNo = txt_enr.getText(); // Assuming txt_enr represents the enrollment number field

            if (!enrollmentNo.isEmpty()) {
                // Prepare a SQL query to retrieve information based on the entered enrollment number
                String query = "SELECT StudentName, EnrollmentNo, Semester, Course FROM student WHERE EnrollmentNo = ?";
                ps = con.prepareStatement(query);
                ps.setString(1, enrollmentNo);

            // Execute the query
            ResultSet rs = ps.executeQuery();

                // Check if the result set has any data
                if (rs.next()) {
                    // Retrieve and display information
                    String studentName = rs.getString("StudentName");
                    String semester = rs.getString("Semester");
                    String program = rs.getString("Course");

                    // Assuming you have JTextFields for displaying the information
                    txt_name.setText(studentName);
                    txt_eno.setText(enrollmentNo);
                    cb_sem.setSelectedItem(semester);
                    cb_program.setSelectedItem(program);
                    disableFields();
                } else {
                    // Clear the JTextFields if no matching record is found
                    txt_name.setText("");
                    txt_eno.setText("");
                    cb_sem.setSelectedItem(null);
                    cb_program.setSelectedItem(null);
      
                String errorMessage = "<html><b style='font-size: 12px;'>Invalid Enrollment No. No matching record found.</b></html>";
                JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                // Clear the JTextFields if the entered enrollment number is empty
                txt_name.setText("");
                txt_eno.setText("");
                cb_sem.setSelectedItem(null);
                cb_program.setSelectedItem(null);
                
                String errorMessage = "<html><b style='font-size: 12px;'>Please enter Enrollment No.</b></html>";
                JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.WARNING_MESSAGE);
        
            }
        } catch (SQLException e) {
            String errorMessage = "<html><b style='font-size: 12px;'>" + e.getMessage() + "</b></html>";
            JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.WARNING_MESSAGE);
        }
    
    
    }//GEN-LAST:event_btn_searchbtn_searchActionPerformed

    public void disableFields(){
     txt_name.setEnabled(false);
     txt_eno.setEnabled(false);
     cb_program.setEnabled(false);
     cb_sem.setEnabled(false);
 }

    
    private void txt_enrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_enrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_enrActionPerformed

    private void lbl_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_backMouseClicked
        Home h = new Home();
        h.setTitle("Home");
        h.setVisible(true);
        h.pack();
        h.setLocationRelativeTo(null);
        h.lbl_username.setText("Welcome " + UserSession.getUsername());
        this.dispose();
    }//GEN-LAST:event_lbl_backMouseClicked

    private void lbl_backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_backMouseEntered
        Color c1 = new Color(0,51,51);
        panel_back.setBackground(c1);
    }//GEN-LAST:event_lbl_backMouseEntered

    private void lbl_backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_backMouseExited
        Color c1 = new Color(0,102, 102);
        panel_back.setBackground(c1);
    }//GEN-LAST:event_lbl_backMouseExited

    private void lbl_logout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_logout1MouseClicked
       int option = JOptionPane.showConfirmDialog(null, "<html><b style='font-size: 14px;color: #111810;'>Are you sure you want to logout?</b></html>", "Logout", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
               UserSession.setUsername(null);
               LoginForm lf = new LoginForm();
               lf.setTitle("LoginForm");
               lf.setLocationRelativeTo(null);
               lf.setVisible(true);
               this.dispose();
         }
    }//GEN-LAST:event_lbl_logout1MouseClicked

    private void lbl_logout1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_logout1MouseEntered
        Color c1 = new Color(0,51,51);
        panel_logout.setBackground(c1);
    }//GEN-LAST:event_lbl_logout1MouseEntered

    private void lbl_logout1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_logout1MouseExited
        Color c1 = new Color(0,102, 102);
        panel_logout.setBackground(c1);
    }//GEN-LAST:event_lbl_logout1MouseExited

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        clearFields();
    }//GEN-LAST:event_btn_clearActionPerformed

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
            java.util.logging.Logger.getLogger(ManageFeesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageFeesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageFeesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageFeesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ManageFeesForm mf = new ManageFeesForm();
                mf.setTitle("Manage Fees");
                mf.setLocationRelativeTo(null);
                mf.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_payfee;
    private javax.swing.JButton btn_search;
    private javax.swing.JComboBox<String> cb_payment;
    private javax.swing.JComboBox<String> cb_program;
    private javax.swing.JComboBox<String> cb_sem;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_back;
    private javax.swing.JLabel lbl_course;
    private javax.swing.JLabel lbl_enrollment;
    private javax.swing.JLabel lbl_logout1;
    private javax.swing.JLabel lbl_sem;
    private javax.swing.JLabel lbl_snm;
    private javax.swing.JPanel panel_back;
    private javax.swing.JPanel panel_logout;
    private com.toedter.calendar.JDateChooser txt_date;
    private javax.swing.JTextField txt_eno;
    private javax.swing.JTextField txt_enr;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_receiptno;
    private javax.swing.JTextField txt_total;
    private javax.swing.JTextField txt_totalwords;
    // End of variables declaration//GEN-END:variables
}

