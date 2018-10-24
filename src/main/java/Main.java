package main.java;

import java.awt.Dimension;
import java.awt.Toolkit;

import main.java.form.LoginFrame;
import main.java.form.CashierFrame;
import main.java.model.UserModel;

public class Main {
    public static LoginFrame loginFrame;
    public static CashierFrame cashierFrame;
    public static final Dimension SCREEN_DIM =
            Toolkit.getDefaultToolkit().getScreenSize();
    
    public static void main(String[] args) {
        Main.initGUI();
    }
    
    public static void initGUI() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            javax.swing.UIManager.setLookAndFeel(
                    javax.swing.UIManager.getSystemLookAndFeelClassName()
            );
        } catch (javax.swing.UnsupportedLookAndFeelException
                | ClassNotFoundException
                | InstantiationException
                | IllegalAccessException ex) {
            
        }
        //</editor-fold>
        
        loginFrame = new LoginFrame();
        cashierFrame = new CashierFrame();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                loginFrame.setVisible(true);
            }
        });
    }
    
    public static void showLoginFrame() {
        cashierFrame.dispose();
        loginFrame.setVisible(true);
    }
    
    public static void showCashierFrame(UserModel user) {
        loginFrame.dispose();
        cashierFrame.setUser(user);
        cashierFrame.setVisible(true);
    }
}
