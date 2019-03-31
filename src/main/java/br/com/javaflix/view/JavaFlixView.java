package br.com.javaflix.view;

import br.com.javaflix.components.NavBar;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
    
/**
 *
 * @author Lucas Fernandes de Jesus
 */
public class JavaFlixView extends JFrame {
    
    public JavaFlixView() throws HeadlessException {
        super("JavaFlix");
       
        // Criação do JFrame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);
        this.setResizable(false);

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

        this.setContentPane(panelUm);
    }
}
