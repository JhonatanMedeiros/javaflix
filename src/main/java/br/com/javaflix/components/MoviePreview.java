package br.com.javaflix.components;

import br.com.javaflix.model.Movie;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Jhonatan Medeiros
 */
public class MoviePreview extends JPanel {

    private Movie movie;
    
    public MoviePreview(Movie m) {
        this.movie = m;
        
        JButton filme = new JButton(this.movie.getTitle());
        filme.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                MovieDetails movieview = new MovieDetails();
            } catch (IOException ex) {
                Logger.getLogger(MoviePreview.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    });
        this.add(filme);
    }
    
}
