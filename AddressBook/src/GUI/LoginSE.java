package GUI;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.LayoutStyle.ComponentPlacement;
//import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class LoginSE extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public LoginSE() {
    	setResizable(false);
        initComponents();
    }
    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
    	setUndecorated(false);
    	

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        pnlLogin = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        txtPassowrd = new javax.swing.JPasswordField();
        txtUserName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        pnlLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnLogin.setText("Login");

        txtPassowrd.setText("jPasswordField1");

        txtUserName.setText("jTextField1");

        javax.swing.GroupLayout gl_pnlLogin = new javax.swing.GroupLayout(pnlLogin);
        gl_pnlLogin.setHorizontalGroup(
        	gl_pnlLogin.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_pnlLogin.createSequentialGroup()
        			.addGap(128)
        			.addGroup(gl_pnlLogin.createParallelGroup(Alignment.TRAILING, false)
        				.addComponent(txtPassowrd, Alignment.LEADING)
        				.addComponent(txtUserName, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
        			.addContainerGap(132, Short.MAX_VALUE))
        		.addGroup(Alignment.TRAILING, gl_pnlLogin.createSequentialGroup()
        			.addContainerGap(159, Short.MAX_VALUE)
        			.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
        			.addGap(155))
        );
        gl_pnlLogin.setVerticalGroup(
        	gl_pnlLogin.createParallelGroup(Alignment.TRAILING)
        		.addGroup(gl_pnlLogin.createSequentialGroup()
        			.addContainerGap(73, Short.MAX_VALUE)
        			.addComponent(txtUserName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(txtPassowrd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(btnLogin)
        			.addGap(64))
        );
        pnlLogin.setLayout(gl_pnlLogin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(0, 53, Short.MAX_VALUE)
        			.addComponent(filler1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(36)
        			.addComponent(pnlLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(91))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(137, 152, Short.MAX_VALUE)
        			.addComponent(filler1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(295))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(110)
        			.addComponent(pnlLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(120, Short.MAX_VALUE))
        );
      //  pnlLogin.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{txtUserName, txtPassowrd, btnLogin}));
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginSE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginSE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginSE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginSE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new LoginSE().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton btnLogin;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPasswordField txtPassowrd;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration
}