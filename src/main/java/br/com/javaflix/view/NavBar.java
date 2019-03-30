/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.javaflix.view;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Lucas Fernandes de Jesus
 */
public class NavBar extends JPanel {

    public NavBar() {
        super();
        
        this.setVisible(true);

        BoxLayout boxLayout = new BoxLayout(this, BoxLayout.X_AXIS);
        this.setLayout(boxLayout);

        JButton image = new JButton("JAVAFLIX");
        JButton title = new JButton("JavaFlix");

        this.add(image);
        this.add(title);
        
    }
}
