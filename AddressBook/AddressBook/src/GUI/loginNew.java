package GUI;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class loginNew extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * Creates new form Login
     */
    public loginNew() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
  //  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    	this.setResizable(false);

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        pnlLogin = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        txtUserName = new javax.swing.JTextField();
        pnlLogin.setBorder(BorderFactory.createTitledBorder("Login"));
        txtUserName.setSize(110, 35);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        pnlLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnLogin.setText(" Login ");
        
        JLabel lblUserName = new JLabel("User Name");
        
        JLabel lblPasword = new JLabel("Password");

        javax.swing.GroupLayout gl_pnlLogin = new javax.swing.GroupLayout(pnlLogin);
        gl_pnlLogin.setHorizontalGroup(
        	gl_pnlLogin.createParallelGroup(Alignment.TRAILING)
        		.addGroup(gl_pnlLogin.createSequentialGroup()
        			.addContainerGap(66, Short.MAX_VALUE)
        			.addGroup(gl_pnlLogin.createParallelGroup(Alignment.LEADING)
        				.addComponent(lblUserName)
        				.addComponent(lblPasword))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(gl_pnlLogin.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_pnlLogin.createSequentialGroup()
        					.addGap(28)
        					.addComponent(btnLogin))
        				.addGroup(gl_pnlLogin.createParallelGroup(Alignment.TRAILING)
        					.addComponent(txtPassword, 138, 138, 138)
        					.addComponent(txtUserName, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)))
        			.addGap(133))
        );
        gl_pnlLogin.setVerticalGroup(
        	gl_pnlLogin.createParallelGroup(Alignment.TRAILING)
        		.addGroup(gl_pnlLogin.createSequentialGroup()
        			.addContainerGap(77, Short.MAX_VALUE)
        			.addGroup(gl_pnlLogin.createParallelGroup(Alignment.BASELINE)
        				.addComponent(txtUserName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblUserName))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(gl_pnlLogin.createParallelGroup(Alignment.BASELINE)
        				.addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblPasword))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(btnLogin)
        			.addGap(56))
        );
        pnlLogin.setLayout(gl_pnlLogin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(0, 53, Short.MAX_VALUE)
        			.addComponent(filler1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(43)
        			.addComponent(pnlLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(84))
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
        			.addContainerGap(113, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(loginNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new loginNew().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton btnLogin;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
}