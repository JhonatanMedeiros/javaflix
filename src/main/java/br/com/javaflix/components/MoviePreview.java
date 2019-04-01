package br.com.javaflix.components;

import br.com.javaflix.model.Movie;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
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
        
        try {
            Image img = ImageIO.read(new URL("https://image.tmdb.org/t/p/w500/" + this.movie.getThumUrl()));
            Image newimg = img.getScaledInstance( 100, 100,  java.awt.Image.SCALE_SMOOTH ) ;  
            Icon icon = new ImageIcon( newimg );
            filme.setIcon(icon);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
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
