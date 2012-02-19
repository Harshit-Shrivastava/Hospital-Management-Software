package hospital.ui;
import hospital.db.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class users extends javax.swing.JFrame {

    private String oldPasswd;

    /** Creates new form login */
    public users() {
        initComponents();
        actionListener e=new actionListener();
        focusListen f=new focusListen();
        txtPasswd.addFocusListener(f);
        buttonClear.addActionListener(e);
        buttonOk.addActionListener(e);
        //          fkeylisten k=new keylisten();
        buttonExit.addActionListener(e);
        //buttonOk.addKeyListener(k);
        this.getRootPane().setDefaultButton(buttonOk);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setTitle("Login Screen");
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        buttonOk = new javax.swing.JButton();
        buttonClear = new javax.swing.JButton();
        txtPasswd = new javax.swing.JPasswordField();
        buttonExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Login Screen"));
        jPanel1.setName("panelLogin"); // NOI18N

        jLabel1.setText("Username");

        jLabel2.setText("Password");

        txtUsername.setName("txtUser"); // NOI18N

        buttonOk.setText("OK");
        buttonOk.setName("buttonOk"); // NOI18N

        buttonClear.setText("Clear");
        buttonClear.setName("buttonClear"); // NOI18N

        txtPasswd.setName("txtPasswd"); // NOI18N

        buttonExit.setText("Exit");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonOk, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPasswd)
                            .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtPasswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonClear)
                    .addComponent(buttonOk))
                .addGap(18, 18, 18)
                .addComponent(buttonExit)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new users().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtPasswd;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables


    public class actionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource()==buttonClear){
                txtUsername.setText(null);
                txtPasswd.setText(null);
            }

            if(e.getSource()==buttonExit)
            {
                System.exit(0);
            }

            if(e.getSource()==buttonOk)
            {
                int found=0;
                String username=null,password=null;
                try{
                String query="select * from tbluser";
                dbconnect db=new dbconnect(query);
                ResultSet res=db.exquery();
                
                while(res.next())
                {
                    username=res.getString("username");
                    password=res.getString("password");
                    if(username.compareTo(txtUsername.getText())==0
                            && password.compareTo(txtPasswd.getText())==0)
                    {
                        found=1;
                        break;
                    }

                }
                if(found==0){
                    JOptionPane.showMessageDialog(users.this, "Invalid Username/Password",
                            "Login Failed",JOptionPane.ERROR_MESSAGE);
                }
                else{
                    int uid=res.getInt("uid");
                    JOptionPane.showMessageDialog(users.this,"Logged on as "+username,"Login Succeeded",
                            JOptionPane.INFORMATION_MESSAGE);
                    mainwindow win=new mainwindow(username,uid);
                    users.this.setVisible(false);
                    users.this.dispose();
                    }
                }

                catch(SQLException p)
                {
                    p.printStackTrace();
                }
            }
        }
    }

private class focusListen implements FocusListener
{

        public void focusGained(FocusEvent e) {

            if(e.getSource()==txtPasswd){
            txtPasswd.setText("");
            }
        }

        public void focusLost(FocusEvent e) {
        }

}

//private class keylisten implements KeyListener
//{
//
//        public void keyTyped(KeyEvent e) {
//            throw new UnsupportedOperationException("Not supported yet.");
//        }
//
//        public void keyPressed(KeyEvent e) {
//            if(e.getKeyCode()==e.VK_ENTER)
//                buttonOk.doClick();
//        }
//
//        public void keyReleased(KeyEvent e) {
//            throw new UnsupportedOperationException("Not supported yet.");
//        }
//
//}

}

