package br.com.javaflix.components;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Lucas Fernandes de Jesus
 */
public class NavBar extends JPanel {

    public NavBar() throws IOException {
        super();
        
        this.setVisible(true);

        BoxLayout boxLayout = new BoxLayout(this, BoxLayout.X_AXIS);
        this.setLayout(boxLayout);

        BufferedImage img = null;
        try {
            img = ImageIO.read(this.getClass().getResource("/images/netflix-logo.png"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        Image newImg = new ImageIcon(img).getImage().
                getScaledInstance(80, 50, java.awt.Image.SCALE_SMOOTH);
        
        this.add(new JLabel(new ImageIcon(newImg)), BorderLayout.WEST);
        
    }
}
