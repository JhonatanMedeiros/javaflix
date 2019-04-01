package br.com.javaflix.view;

import br.com.javaflix.components.MoviePreview;
import br.com.javaflix.components.NavBar;
import br.com.javaflix.controller.TheMovieDB;
import br.com.javaflix.model.Movie;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
    
/**
 *
 * @author Lucas Fernandes de Jesus
 */
public class JavaFlixView extends JFrame {
    
    private JPanel mainPanel;
    private JProgressBar progress;
    private JPanel moviesPanel;
    private NavBar navBar;
    
    public JavaFlixView() throws HeadlessException, IOException {
        super("JavaFlix");
       
        // Criação do JFrame
        this.setLayout(new GridLayout(0, 1));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        

        // Create Main Panel
        this.mainPanel = new JPanel();
        this.mainPanel.setLayout(new BorderLayout());

        // GridLayout para os filmes
        this.moviesPanel = new JPanel();
        this.moviesPanel.setLayout(new GridLayout(0, 6));

        //Navbar
        this.navBar = new NavBar();
        
        // Add Progress bar
        this.progress = new JProgressBar(SwingConstants.HORIZONTAL);
        this.progress.setIndeterminate(true);
        
        this.mainPanel.add(navBar, BorderLayout.NORTH);
        this.mainPanel.add(moviesPanel, BorderLayout.CENTER);
        this.mainPanel.add(progress, BorderLayout.SOUTH);
        this.mainPanel.setPreferredSize(new Dimension(800,600));
        this.mainPanel.setVisible(true);
        
        this.getContentPane().add(mainPanel);
        
        // Get Movie List from API The Movie DB
        this.GetMovies();        
    }
    
    public void GetMovies() {
        TheMovieDB.getIntance().refresh();
         this.progress.setVisible(true);
        for (Movie movie : TheMovieDB.getIntance().getMovies()) {
            this.moviesPanel.add(new MoviePreview(movie));
        }
         this.progress.setVisible(false);
         this.mainPanel.updateUI();
         this.mainPanel.setVisible(true);    
    }
    
    
}
