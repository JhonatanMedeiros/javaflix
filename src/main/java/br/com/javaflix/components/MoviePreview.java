package br.com.javaflix.components;

import br.com.javaflix.model.Movie;
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
        this.add(filme);
    }
    
}
