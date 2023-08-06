/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package blood_donation_management_system;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author user
 */
public class Blood_donation_management_system {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Main_frame mf = new Main_frame();
    Dimension d =Toolkit.getDefaultToolkit().getScreenSize();
    mf.setVisible(true);
    mf.setSize(d);
    }
    
}
