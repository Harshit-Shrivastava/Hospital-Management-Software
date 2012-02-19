package hospital.ui;
import java.awt.event.*;
import java.util.Date;
import javax.swing.*;
import java.util.regex.*;
import hospital.db.dbconnect;
import java.sql.*;
import hospital.service.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class mainwindow extends javax.swing.JFrame {


    String username;
    JMenu admin;
    private int opno;
    public mainwindow(String s,int uid) throws SQLException {
        this.username=s;
        initComponents();
        this.setTitle("Hospital Management System");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        admin=new JMenu();
        mouseclick m=new mouseclick();
        logoutItem.addActionListener(m);
        exitItem.addActionListener(m);
        ipdRegItem.addActionListener(m);
        opdRegItem.addActionListener(m);
        opdBillItem.addActionListener(m);
        ipdBillItem.addActionListener(m);
        pharmacyBillItem.addActionListener(m);
        buttonSubmit.addActionListener(m);
        buttonClear.addActionListener(m);
        buttonIPDReg.addActionListener(m);
        buttonIPDBilling.addActionListener(m);
        buttonOpdBillSubmit.addActionListener(m);
        admin.setText("Admin");

        dateSelect.setMinSelectableDate(new Date());

        if(uid==1)
        {
           menuBar.add(admin);
        }

//        Toolkit toolkit = Toolkit.getDefaultToolkit();
//        Dimension dimension = toolkit.getScreenSize();
//        this.setSize(dimension);

        lblErrorName.setVisible(false);
        lblErrorFname.setVisible(false);
        lblErrorAddress.setVisible(false);
        lblErrorAge.setVisible(false);
        lblErrorContact.setVisible(false);
        lblErrorGender.setVisible(false);
        lblErrorDate.setVisible(false);
        lblErrHospIPD.setVisible(false);
        lblErrWardIPD.setVisible(false);
        lblErrBedIPD.setVisible(false);
        lblErrDateIPD.setVisible(false);
        lblErrHospNoOPB.setVisible(false);
        lblErrDateOPB.setVisible(false);
        lblErrDeptCodeOPB.setVisible(false);
        lblErrIPIPDBill.setVisible(false);
        lblErrIPIPDBill.setVisible(false);
        buttonGroupGender.add(optMale);
        buttonGroupGender.add(optFemale);

        //Code for Loading Departments
        String query="select * from tbldept";
        dbconnect conn=new dbconnect(query);
        ResultSet r=conn.exquery();
        try{
        while(r.next())
        {
            comboDept.addItem(r.getInt("deptunit")+":"+r.getString("deptname"));
        }
        }



        catch(SQLException e){}
                     String str=(String)comboDept.getSelectedItem();
//                    int deptunit=(int)(str.charAt(0)-48);
//                    System.out.println(deptunit);

        
                     //System.out.println(opno);
//             String testrows="select * from tbltests";
//             dbconnect test=new dbconnect(testrows);
//             ResultSet t=test.exquery();
//             try{
//                 while(t.next()){
//                     comboTestCode.addItem(t.getInt("testcode"));
//                 }
//             }
//             catch(SQLException sq){}
        this.pack();
        this.setVisible(true);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupGender = new javax.swing.ButtonGroup();
        tabPanel = new javax.swing.JTabbedPane();
        opRegPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        txtFname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        optMale = new javax.swing.JRadioButton();
        optFemale = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        buttonSubmit = new javax.swing.JButton();
        buttonClear = new javax.swing.JButton();
        lblErrorName = new javax.swing.JLabel();
        lblErrorFname = new javax.swing.JLabel();
        lblErrorAge = new javax.swing.JLabel();
        lblErrorGender = new javax.swing.JLabel();
        lblErrorAddress = new javax.swing.JLabel();
        lblErrorContact = new javax.swing.JLabel();
        comboDept = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        lblErrorDate = new javax.swing.JLabel();
        ipdRegPanel = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtHospitalNoIPDReg = new javax.swing.JTextField();
        txtWardNoIPDReg = new javax.swing.JTextField();
        txtBedNoIPDReg = new javax.swing.JTextField();
        buttonIPDReg = new javax.swing.JButton();
        lblErrHospIPD = new javax.swing.JLabel();
        lblErrWardIPD = new javax.swing.JLabel();
        lblErrBedIPD = new javax.swing.JLabel();
        lblErrDateIPD = new javax.swing.JLabel();
        opBillPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtHospNoOPDReg = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtDeptCode = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtAmountOPDBill = new javax.swing.JTextField();
        buttonOpdBillSubmit = new javax.swing.JButton();
        lblErrHospNoOPB = new javax.swing.JLabel();
        lblErrDateOPB = new javax.swing.JLabel();
        lblErrDeptCodeOPB = new javax.swing.JLabel();
        ipBillPanel = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtAmountIPD = new javax.swing.JTextField();
        ipNoIPDReg = new javax.swing.JTextField();
        buttonIPDBilling = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        lblErrIPIPDBill = new javax.swing.JLabel();
        lblErrDateIPDBill = new javax.swing.JLabel();
        pharmacyBillPanel = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtMedID = new javax.swing.JTextField();
        txtManID = new javax.swing.JTextField();
        txtMedName = new javax.swing.JTextField();
        txtMedType = new javax.swing.JTextField();
        txtMedCost = new javax.swing.JTextField();
        buttonSubmitPharmacy = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        opdRegItem = new javax.swing.JMenuItem();
        ipdRegItem = new javax.swing.JMenuItem();
        opdBillItem = new javax.swing.JMenuItem();
        ipdBillItem = new javax.swing.JMenuItem();
        pharmacyBillItem = new javax.swing.JMenuItem();
        exitItem = new javax.swing.JMenuItem();
        accountMenu = new javax.swing.JMenu();
        logoutItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabPanel.setBackground(new java.awt.Color(171, 246, 245));

        opRegPanel.setBackground(new java.awt.Color(171, 181, 245));
        opRegPanel.setForeground(new java.awt.Color(160, 184, 233));

        jLabel1.setText("Name");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        jLabel2.setText("Address");

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        jLabel3.setText("Fathers Name");

        jLabel4.setText("Age");

        jLabel5.setText("Gender");

        optMale.setText("Male");

        optFemale.setText("Female");

        jLabel6.setText("Contact Number");

        jLabel7.setText("Department");

        buttonSubmit.setText("Submit");

        buttonClear.setText("Clear");

        lblErrorName.setForeground(new java.awt.Color(127, 46, 46));
        lblErrorName.setText("Specify Name");

        lblErrorFname.setForeground(new java.awt.Color(127, 46, 46));
        lblErrorFname.setText("Specify Fathers Name");

        lblErrorAge.setForeground(new java.awt.Color(127, 46, 46));
        lblErrorAge.setText("Specify Age");

        lblErrorGender.setForeground(new java.awt.Color(127, 46, 46));
        lblErrorGender.setText("Specify Gender");

        lblErrorAddress.setForeground(new java.awt.Color(127, 46, 46));
        lblErrorAddress.setText("Specify Address");

        lblErrorContact.setForeground(new java.awt.Color(127, 46, 46));
        lblErrorContact.setText("Specify Contact Number");

        comboDept.setModel(new javax.swing.DefaultComboBoxModel());

        jLabel8.setText("Bill Date");

        lblErrorDate.setForeground(new java.awt.Color(127, 46, 46));
        lblErrorDate.setText("Invalid Date Selected");

        javax.swing.GroupLayout opRegPanelLayout = new javax.swing.GroupLayout(opRegPanel);
        opRegPanel.setLayout(opRegPanelLayout);
        opRegPanelLayout.setHorizontalGroup(
            opRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opRegPanelLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(opRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, opRegPanelLayout.createSequentialGroup()
                        .addGroup(opRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buttonSubmit)
                            .addComponent(jLabel6))
                        .addGap(106, 106, 106)
                        .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, opRegPanelLayout.createSequentialGroup()
                        .addGroup(opRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(opRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(62, 62, 62)
                        .addGroup(opRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(opRegPanelLayout.createSequentialGroup()
                                .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblErrorContact))
                            .addGroup(opRegPanelLayout.createSequentialGroup()
                                .addGroup(opRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(comboDept, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                                    .addComponent(txtFname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAge, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, opRegPanelLayout.createSequentialGroup()
                                        .addComponent(optMale)
                                        .addGap(26, 26, 26)
                                        .addComponent(optFemale)))
                                .addGap(12, 12, 12)
                                .addGroup(opRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblErrorDate)
                                    .addGroup(opRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblErrorAddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, opRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblErrorName, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblErrorFname, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                            .addComponent(lblErrorAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblErrorGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))))
                .addContainerGap(425, Short.MAX_VALUE))
        );
        opRegPanelLayout.setVerticalGroup(
            opRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opRegPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(opRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorName))
                .addGap(34, 34, 34)
                .addGroup(opRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorFname))
                .addGap(20, 20, 20)
                .addGroup(opRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorAge))
                .addGap(29, 29, 29)
                .addGroup(opRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(opRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblErrorGender)
                        .addComponent(jLabel5))
                    .addGroup(opRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(optMale)
                        .addComponent(optFemale)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(opRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(lblErrorDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(opRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(comboDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(opRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(opRegPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblErrorAddress)))
                .addGap(27, 27, 27)
                .addGroup(opRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorContact))
                .addGap(18, 18, 18)
                .addGroup(opRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSubmit)
                    .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2290, 2290, 2290))
        );

        tabPanel.addTab("OPD Registration", opRegPanel);

        ipdRegPanel.setBackground(new java.awt.Color(171, 181, 245));

        jLabel20.setText("Hospital No");

        jLabel21.setText("Ward Number");

        jLabel22.setText("Bed Number");

        jLabel23.setText("Date of Admission");

        buttonIPDReg.setText("Submit");

        lblErrHospIPD.setForeground(new java.awt.Color(127, 46, 46));
        lblErrHospIPD.setText("Enter Valid Hospital Number");

        lblErrWardIPD.setForeground(new java.awt.Color(127, 46, 46));
        lblErrWardIPD.setText("Enter Valid Ward Number");

        lblErrBedIPD.setForeground(new java.awt.Color(127, 46, 46));
        lblErrBedIPD.setText("Enter Valid Bed Number");

        lblErrDateIPD.setForeground(new java.awt.Color(127, 46, 46));
        lblErrDateIPD.setText("Enter Valid Date");

        javax.swing.GroupLayout ipdRegPanelLayout = new javax.swing.GroupLayout(ipdRegPanel);
        ipdRegPanel.setLayout(ipdRegPanelLayout);
        ipdRegPanelLayout.setHorizontalGroup(
            ipdRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ipdRegPanelLayout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(buttonIPDReg)
                .addContainerGap(738, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ipdRegPanelLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(ipdRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addGap(43, 43, 43)
                .addGroup(ipdRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHospitalNoIPDReg, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ipdRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtWardNoIPDReg, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtBedNoIPDReg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(ipdRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ipdRegPanelLayout.createSequentialGroup()
                        .addComponent(lblErrWardIPD)
                        .addContainerGap())
                    .addGroup(ipdRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ipdRegPanelLayout.createSequentialGroup()
                            .addComponent(lblErrBedIPD)
                            .addGap(434, 434, 434))
                        .addGroup(ipdRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ipdRegPanelLayout.createSequentialGroup()
                                .addComponent(lblErrHospIPD)
                                .addGap(405, 405, 405))
                            .addComponent(lblErrDateIPD, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)))))
        );
        ipdRegPanelLayout.setVerticalGroup(
            ipdRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ipdRegPanelLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(ipdRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ipdRegPanelLayout.createSequentialGroup()
                        .addComponent(txtHospitalNoIPDReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtWardNoIPDReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ipdRegPanelLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel21))
                    .addGroup(ipdRegPanelLayout.createSequentialGroup()
                        .addComponent(lblErrHospIPD)
                        .addGap(36, 36, 36)
                        .addComponent(lblErrWardIPD)))
                .addGap(18, 18, 18)
                .addGroup(ipdRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ipdRegPanelLayout.createSequentialGroup()
                        .addGroup(ipdRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblErrBedIPD, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addGap(18, 18, 18)
                        .addGroup(ipdRegPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ipdRegPanelLayout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(39, 39, 39)
                                .addComponent(buttonIPDReg))
                            .addComponent(lblErrDateIPD, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtBedNoIPDReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(188, Short.MAX_VALUE))
        );

        tabPanel.addTab("IPD Registration", ipdRegPanel);

        opBillPanel.setBackground(new java.awt.Color(171, 181, 245));

        jLabel9.setText("Hospital No");

        jLabel10.setText("Bill Date");

        jLabel13.setText("Department Code");

        jLabel14.setText("Amount");

        buttonOpdBillSubmit.setText("Submit");

        lblErrHospNoOPB.setForeground(new java.awt.Color(127, 46, 46));
        lblErrHospNoOPB.setText("Enter Valid Hospital No");

        lblErrDateOPB.setForeground(new java.awt.Color(127, 46, 46));
        lblErrDateOPB.setText("Enter Valid Date");

        lblErrDeptCodeOPB.setForeground(new java.awt.Color(127, 46, 46));
        lblErrDeptCodeOPB.setText("Enter Valid Department Code");

        javax.swing.GroupLayout opBillPanelLayout = new javax.swing.GroupLayout(opBillPanel);
        opBillPanel.setLayout(opBillPanelLayout);
        opBillPanelLayout.setHorizontalGroup(
            opBillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opBillPanelLayout.createSequentialGroup()
                .addGroup(opBillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(opBillPanelLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(opBillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(opBillPanelLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(opBillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel13))))
                        .addGap(85, 85, 85)
                        .addGroup(opBillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAmountOPDBill)
                            .addComponent(txtDeptCode)
                            .addComponent(txtHospNoOPDReg, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                        .addGap(197, 197, 197)
                        .addGroup(opBillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblErrDeptCodeOPB)
                            .addComponent(lblErrHospNoOPB)
                            .addComponent(lblErrDateOPB)))
                    .addGroup(opBillPanelLayout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(buttonOpdBillSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(308, Short.MAX_VALUE))
        );
        opBillPanelLayout.setVerticalGroup(
            opBillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opBillPanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(opBillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtHospNoOPDReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrHospNoOPB))
                .addGap(62, 62, 62)
                .addGroup(opBillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lblErrDateOPB))
                .addGap(60, 60, 60)
                .addGroup(opBillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDeptCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrDeptCodeOPB))
                .addGap(82, 82, 82)
                .addGroup(opBillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(opBillPanelLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(53, 53, 53)
                        .addComponent(buttonOpdBillSubmit))
                    .addComponent(txtAmountOPDBill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        tabPanel.addTab("OPD Billing", opBillPanel);

        ipBillPanel.setBackground(new java.awt.Color(171, 181, 245));

        jLabel16.setText("IP No");

        jLabel18.setText("Amount");

        buttonIPDBilling.setText("Submit");

        jLabel19.setText("Bill Date");

        lblErrIPIPDBill.setForeground(new java.awt.Color(127, 46, 46));
        lblErrIPIPDBill.setText("Enter Valid IP No");

        lblErrDateIPDBill.setForeground(new java.awt.Color(127, 46, 46));
        lblErrDateIPDBill.setText("Enter Valid Date");

        javax.swing.GroupLayout ipBillPanelLayout = new javax.swing.GroupLayout(ipBillPanel);
        ipBillPanel.setLayout(ipBillPanelLayout);
        ipBillPanelLayout.setHorizontalGroup(
            ipBillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ipBillPanelLayout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(buttonIPDBilling)
                .addContainerGap(747, Short.MAX_VALUE))
            .addGroup(ipBillPanelLayout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(ipBillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel19)
                    .addComponent(jLabel18))
                .addGap(100, 100, 100)
                .addGroup(ipBillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ipBillPanelLayout.createSequentialGroup()
                        .addComponent(txtAmountIPD, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                        .addGap(648, 648, 648))
                    .addGroup(ipBillPanelLayout.createSequentialGroup()
                        .addComponent(ipNoIPDReg, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                        .addGap(82, 82, 82)
                        .addGroup(ipBillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblErrIPIPDBill)
                            .addComponent(lblErrDateIPDBill))
                        .addGap(466, 466, 466))))
        );
        ipBillPanelLayout.setVerticalGroup(
            ipBillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ipBillPanelLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(ipBillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(ipNoIPDReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrIPIPDBill))
                .addGap(18, 18, 18)
                .addGroup(ipBillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ipBillPanelLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(37, 37, 37)
                        .addGroup(ipBillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(txtAmountIPD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addComponent(buttonIPDBilling))
                    .addComponent(lblErrDateIPDBill))
                .addContainerGap(174, Short.MAX_VALUE))
        );

        tabPanel.addTab("IPD Billing", ipBillPanel);

        pharmacyBillPanel.setBackground(new java.awt.Color(171, 181, 245));

        jLabel24.setText("Manufacturer ID");

        jLabel25.setText("Medicine ID");

        jLabel26.setText("Medicine Name");

        jLabel27.setText("Medicine Type");

        jLabel28.setText("Medicine Cost");

        buttonSubmitPharmacy.setText("Submit");

        javax.swing.GroupLayout pharmacyBillPanelLayout = new javax.swing.GroupLayout(pharmacyBillPanel);
        pharmacyBillPanel.setLayout(pharmacyBillPanelLayout);
        pharmacyBillPanelLayout.setHorizontalGroup(
            pharmacyBillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pharmacyBillPanelLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(pharmacyBillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jLabel25))
                .addGap(52, 52, 52)
                .addGroup(pharmacyBillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMedID, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addGroup(pharmacyBillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtMedCost)
                        .addComponent(txtMedType)
                        .addComponent(txtMedName)
                        .addComponent(txtManID, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)))
                .addGap(714, 714, 714))
            .addGroup(pharmacyBillPanelLayout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(buttonSubmitPharmacy)
                .addContainerGap(809, Short.MAX_VALUE))
        );
        pharmacyBillPanelLayout.setVerticalGroup(
            pharmacyBillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pharmacyBillPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pharmacyBillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtManID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(pharmacyBillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMedID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(47, 47, 47)
                .addGroup(pharmacyBillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtMedName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(pharmacyBillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(txtMedType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(pharmacyBillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txtMedCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(buttonSubmitPharmacy)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        tabPanel.addTab("Pharmacy Billing", pharmacyBillPanel);

        fileMenu.setText("File");

        opdRegItem.setText("OPD Registration");
        fileMenu.add(opdRegItem);

        ipdRegItem.setText("IPD Registration");
        fileMenu.add(ipdRegItem);

        opdBillItem.setText("OPD Billing");
        fileMenu.add(opdBillItem);

        ipdBillItem.setText("IPD Billing");
        fileMenu.add(ipdBillItem);

        pharmacyBillItem.setText("Pharmacy Billing");
        fileMenu.add(pharmacyBillItem);

        exitItem.setText("Exit");
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);

        accountMenu.setText("Account");

        logoutItem.setText("Logout");
        accountMenu.add(logoutItem);

        menuBar.add(accountMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1061, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new mainwindow().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu accountMenu;
    private javax.swing.JButton buttonClear;
    private javax.swing.ButtonGroup buttonGroupGender;
    private javax.swing.JButton buttonIPDBilling;
    private javax.swing.JButton buttonIPDReg;
    private javax.swing.JButton buttonOpdBillSubmit;
    private javax.swing.JButton buttonSubmit;
    private javax.swing.JButton buttonSubmitPharmacy;
    private javax.swing.JComboBox comboDept;
    private javax.swing.JMenuItem exitItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JPanel ipBillPanel;
    private javax.swing.JTextField ipNoIPDReg;
    private javax.swing.JMenuItem ipdBillItem;
    private javax.swing.JMenuItem ipdRegItem;
    private javax.swing.JPanel ipdRegPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblErrBedIPD;
    private javax.swing.JLabel lblErrDateIPD;
    private javax.swing.JLabel lblErrDateIPDBill;
    private javax.swing.JLabel lblErrDateOPB;
    private javax.swing.JLabel lblErrDeptCodeOPB;
    private javax.swing.JLabel lblErrHospIPD;
    private javax.swing.JLabel lblErrHospNoOPB;
    private javax.swing.JLabel lblErrIPIPDBill;
    private javax.swing.JLabel lblErrWardIPD;
    private javax.swing.JLabel lblErrorAddress;
    private javax.swing.JLabel lblErrorAge;
    private javax.swing.JLabel lblErrorContact;
    private javax.swing.JLabel lblErrorDate;
    private javax.swing.JLabel lblErrorFname;
    private javax.swing.JLabel lblErrorGender;
    private javax.swing.JLabel lblErrorName;
    private javax.swing.JMenuItem logoutItem;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JPanel opBillPanel;
    private javax.swing.JPanel opRegPanel;
    private javax.swing.JMenuItem opdBillItem;
    private javax.swing.JMenuItem opdRegItem;
    private javax.swing.JRadioButton optFemale;
    private javax.swing.JRadioButton optMale;
    private javax.swing.JMenuItem pharmacyBillItem;
    private javax.swing.JPanel pharmacyBillPanel;
    private javax.swing.JTabbedPane tabPanel;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtAmountIPD;
    private javax.swing.JTextField txtAmountOPDBill;
    private javax.swing.JTextField txtBedNoIPDReg;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtDeptCode;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtHospNoOPDReg;
    private javax.swing.JTextField txtHospitalNoIPDReg;
    private javax.swing.JTextField txtManID;
    private javax.swing.JTextField txtMedCost;
    private javax.swing.JTextField txtMedID;
    private javax.swing.JTextField txtMedName;
    private javax.swing.JTextField txtMedType;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtWardNoIPDReg;
    // End of variables declaration//GEN-END:variables


    private class mouseclick implements ActionListener
    {

        public void actionPerformed(ActionEvent e){
            if(e.getSource()==logoutItem)
            {
                users l=new users();
                mainwindow.this.setVisible(false);
                mainwindow.this.dispose();
                l.setVisible(true);
            }
            else if(e.getSource()==exitItem)
            {
                System.exit(0);
            }
            else if(e.getSource()==ipdRegItem)
            {
                tabPanel.setSelectedIndex(1);
            }
            else if(e.getSource()==opdRegItem)
            {
                tabPanel.setSelectedIndex(0);
            }
            else if(e.getSource()==opdBillItem)
            {
                tabPanel.setSelectedIndex(2);
            }
            else if(e.getSource()==ipdBillItem)
            {
                tabPanel.setSelectedIndex(3);
            }
            else if(e.getSource()==pharmacyBillItem)
            {
                tabPanel.setSelectedIndex(4);
            }
            else if(e.getSource()==buttonClear)
            {
                txtName.setText(null);
                txtAddress.setText(null);
                txtFname.setText(null);
                txtContact.setText(null);
            }
            else if(e.getSource()==buttonSubmit)
            {
                boolean validData=validation();
                if(validData)
                {
                    Date currentDate=new Date();
                    //Code for Adding Record
                    String query="select max(opdno) as opd from tblopdreg";
                    dbconnect conn=new dbconnect(query);
                    opno=0;
                    try{
                     ResultSet resm=conn.exquery();
                     while(resm.next()){
                     opno=resm.getInt("opd");
                     if(opno==0)
                     {
                         opno=1;
                     }
                        }
                    }
                     catch(SQLException f){}


                    opno++;
                    String str=(String)comboDept.getSelectedItem();
                    int deptunit=(int)(str.charAt(0)-48);
                    String name=txtName.getText();
                    String fname=txtFname.getText();
                    int age=Integer.parseInt(txtAge.getText());
                    char gender=optMale.isSelected()?'M':'F';
                    String address=txtAddress.getText();
                    int contactNo=Integer.parseInt(txtContact.getText());
                    DateFormat df=new SimpleDateFormat("dd/mm/yy");
                    Date regDt=dateSelect.getDate();
                    String regDate=regDt.getDate()+"/"+regDt.getMonth()+"/"+(regDt.getYear()+1900);
                    query="insert into tblopdreg (opdno,patientname,fathersname,age,"
                            + "gender,address,contactno,deptunit,dateofregistration) values("
                            + opno+",'"+txtName.getText()+"','"+txtFname.getText()+"',"+
                            Integer.parseInt(txtAge.getText())+",'"+gender+"','"+address+"',"+
                            contactNo+","+""+deptunit+",'"+regDate.toString()+"')";
                    System.out.println(query);
                    dbconnect conn1=new dbconnect(query);
                    try{
                        conn1.insquery();
                    }catch(Exception s){
                        JOptionPane.showMessageDialog(mainwindow.this,"Not Inserted","Hospital",JOptionPane.WARNING_MESSAGE);
                    }


                }
            }
            else if(e.getSource()==buttonClear)
            {
                txtName.setText(null);
                txtFname.setText(null);
                txtAddress.setText(null);
                txtAge.setText(null);
                txtContact.setText(null);
                dateSelect.setDate(new Date());
            }
 else if(e.getSource()==buttonOpdBillSubmit){
     opBill opb=new opBill();
     int hospno=Integer.parseInt(txtHospNoOPDReg.getText());
     Date billdate=opdBillDate.getDate();
     int depcode=Integer.parseInt(txtDeptCode.getText());
     int amnt=Integer.parseInt(txtAmountOPDBill.getText());    //initialise with formula

     opb.setBill(hospno,billdate,depcode,amnt);
     boolean val4=validation4();
     //Code for Executing query to Insert into OPBills Table


                    try{
                        opb.insertDB(val4);
                    }catch(Exception s){
                        JOptionPane.showMessageDialog(mainwindow.this,"Not Inserted","Hospital",JOptionPane.WARNING_MESSAGE);
                    }
 }

 else if(e.getSource()==buttonIPDBilling){

     int ipno=Integer.parseInt(ipNoIPDReg.getText());
     Date billDateIPD=dateIPDBill.getDate();
     int amount=Integer.parseInt(txtAmountIPD.getText());      //calculate amount
     ipBill ipb=new ipBill();
     ipb.setBill(billDateIPD, amount,ipno);
     boolean val3=validation3();

                         try{
                        ipb.insertDB(val3);
                    }catch(Exception s){
                        JOptionPane.showMessageDialog(mainwindow.this,"Not Inserted","Hospital",JOptionPane.WARNING_MESSAGE);
                    }
     //Code for Inserting into DB
 }

 else if(e.getSource()==buttonIPDReg){
     int hospnoipdreg=Integer.parseInt(txtHospitalNoIPDReg.getText());
     int wardNoIPDReg=Integer.parseInt(txtWardNoIPDReg.getText());
     int bedNoIPDReg=Integer.parseInt(txtBedNoIPDReg.getText());
     Date dateofAdmissionIPDReg=dateAdmissionIPDReg.getDate();
     ipd ip=new ipd();
     ip.setDepartment(hospnoipdreg, wardNoIPDReg, bedNoIPDReg, dateofAdmissionIPDReg);

     //Code for inserting into DB
     boolean val2=validation2();
                    try{
                        ip.insertDB(val2);
                    }catch(Exception s){
                        JOptionPane.showMessageDialog(mainwindow.this,"Not Inserted","Hospital",JOptionPane.WARNING_MESSAGE);
                    }
 }

 else if(e.getSource()==buttonSubmitPharmacy){
     String pharName=txtMedName.getText();
     int MedID=Integer.parseInt(txtMedID.getText());
     int ManID=Integer.parseInt(txtManID.getText());
     String MedType=txtMedType.getText();
     double medCost=Double.parseDouble(txtMedCost.getText());
     pharmacy phar=new pharmacy();
     phar.setPharmacy(pharName, MedType, medCost, MedType, ManID);

     //Code for Inserting into DB

//     boolean val5=validation5();
 }
        }
        }


        boolean validation()
        {
            Pattern pattern=Pattern.compile("[0-9]{1,3}");
            Matcher m=pattern.matcher(txtAge.getText());
            boolean correctAge=m.matches();
            //System.out.println(dateSelect.getDate());
            

            if(txtName.getText().isEmpty()){
                lblErrorName.setVisible(true);
               return false;
            }
            else lblErrorName.setVisible(false);

                        if(!correctAge){
                lblErrorAge.setText("Enter Valid Age");
                lblErrorAge.setVisible(true);
                return false;
            }
            else
                lblErrorAge.setVisible(false);

            if(dateSelect.getDate()==null || dateSelect.getDate().compareTo(new Date())<0)
            {
                lblErrorDate.setVisible(true);
            }
            else {
                lblErrorDate.setVisible(false);
            }

            if(txtAddress.getText().isEmpty()){
                lblErrorAddress.setVisible(true);
                return false;
            }
            else lblErrorAddress.setVisible(false);
            if(txtContact.getText().isEmpty()){
                lblErrorContact.setVisible(true);
                return false;
            }
            else lblErrorContact.setVisible(false);

            return true;
            }

        boolean validation2(){
            if(Integer.parseInt(txtHospitalNoIPDReg.getText())==0){
                lblErrHospIPD.setVisible(true);
                System.out.println(Integer.parseInt(txtHospitalNoIPDReg.getText()));
                return false;
            }
        else{
                lblErrHospIPD.setVisible(false);
            }

            if(Integer.parseInt(txtWardNoIPDReg.getText())==0){
                lblErrWardIPD.setVisible(true);
                return false;
            }
             else{
                lblErrWardIPD.setVisible(false);
                    }

            if(Integer.parseInt(txtBedNoIPDReg.getText())==0){
                lblErrBedIPD.setVisible(true);
                return false;
            }
             else{
                lblErrBedIPD.setVisible(false);
                    }
            if(dateAdmissionIPDReg.getDate()==null || dateAdmissionIPDReg.getDate().compareTo(new Date())<0)
            {
                lblErrDateIPD.setVisible(true);
            }
            else {
                lblErrDateIPD.setVisible(false);
            }
            return true;
        }

        boolean validation3(){

                  if(Integer.parseInt(ipNoIPDReg.getText())==0){
                lblErrIPIPDBill.setVisible(true);
                return false;
            }
        else{
                lblErrIPIPDBill.setVisible(false);
            }

            if(dateIPDBill.getDate()==null || dateIPDBill.getDate().compareTo(new Date())<0)
            {
                lblErrDateIPDBill.setVisible(true);
            }
            else {
                lblErrDateIPDBill.setVisible(false);
            }
            return true;
        }

        boolean validation4(){
        if(Integer.parseInt(txtHospNoOPDReg.getText())==0){
                lblErrHospNoOPB.setVisible(true);
                return false;
            }
        else{
                lblErrHospNoOPB.setVisible(false);
            }
        if(opdBillDate.getDate()==null || opdBillDate.getDate().compareTo(new Date())<0)
            {
                lblErrDateOPB.setVisible(true);
            }
            else {
                lblErrDateOPB.setVisible(false);
            }
        if(Integer.parseInt(txtDeptCode.getText())==0){
                lblErrDeptCodeOPB.setVisible(true);
                return false;
            }
        else{
                lblErrDeptCodeOPB.setVisible(false);
            }
            return true;

        }

//        boolean validation5(){
//
//        }
    }
