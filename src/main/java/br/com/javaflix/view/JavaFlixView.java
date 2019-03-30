/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.javaflix.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
    
/**
 *
 * @author Lucas Fernandes de Jesus
 */
public class JavaFlixView extends JFrame {

       public static void main(final String[]args) {
           
           //Criação do JFrame
           JFrame frame = new JFrame("JavaFlix");
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
           frame.setVisible(true);
           frame.setResizable(false);
           
           // Criando painel principal
           JPanel panelUm = new JPanel();
           panelUm.setLayout(new BorderLayout());
           
           // GridLayout para os filmes
           JPanel moviesPanel = new JPanel();
           moviesPanel.setLayout(new GridLayout(2, 6, 30, 30));
           
           //Navbar
           NavBar navBar = new NavBar();
           
           // Cards clicáveis com os filmes
           JButton filmeUm = new JButton("Filme 1");
           JButton filmeDois = new JButton("Filme 2");
           JButton filmeTres = new JButton("Filme 3");
           JButton filmeQuatro = new JButton("Filme 4");
           JButton filmeCinco = new JButton("Filme 5");
           JButton filmeSeis = new JButton("Filme 6");
           
           moviesPanel.add(filmeUm);
           moviesPanel.add(filmeDois);
           moviesPanel.add(filmeTres);
           moviesPanel.add(filmeQuatro);
           moviesPanel.add(filmeCinco);
           moviesPanel.add(filmeSeis);
           
           panelUm.add(navBar, BorderLayout.NORTH);
           panelUm.add(moviesPanel, BorderLayout.CENTER);
           panelUm.setVisible(true);
           panelUm.setSize(550, 550);
           
           frame.setContentPane(panelUm);
       }
}
