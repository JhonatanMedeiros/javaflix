package br.com.javaflix.components;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.io.IOException;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JProgressBar;

/**
 *
 * @author Luiz Felipe De Amorim
 */
public class MovieDetails extends JFrame{
    
    private JPanel panel;
    private JLabel filmImg;
    private JLabel title;
    
    private JPanel info;
    private JProgressBar stars;
    private JLabel year;
    private JLabel classification;
    private JLabel duration;
    
    private JPanel description;
    private JLabel shortDescription;
    private JLabel cast;
    private JLabel director;
    
    private JPanel buttons;
    private JButton myList;
    private JButton downl;
    
    private JPanel relationated;
    private JLabel film0;
    private JLabel film01;
    
    
   public MovieDetails() throws IOException {
        super();
       
        //Inicializando frame
        this.setSize(800, 900);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
       
       //Jpanel 
       panel = new JPanel();//Add JPanel
       panel.setLayout(new GridLayout(0, 1));
  
      
       
       //Label de imagem do filme
       filmImg = new JLabel("IMAGEM");//Add JLabel 
       filmImg.setForeground(Color.red);
       filmImg.setLayout(new BorderLayout());
       
       //label titulo      
       title = new JLabel("Título");
       
       
       //panel descrição
       description = new JPanel();//texto de descrição do filme/serie
       BoxLayout layout = new BoxLayout(description, BoxLayout.Y_AXIS);
       description.setLayout(layout); 
       
       shortDescription = new JLabel("Descrição do filme/serie");//breve descrição filme/serie
       cast = new JLabel("Elenco");//elenco do filme/serie
       director = new JLabel("Diretores"); //diretor do filme/serie
       
       //panel de info
       info = new JPanel();
       info.setLayout(new GridLayout(1,4));//layout do panel info
       stars = new JProgressBar();//estrelas de recomendação
       year = new JLabel("19XX");//ano de lançamento do filme/serie
       classification = new JLabel("TV-MA");//classificação do filme/serie
       duration = new JLabel("1hr 28min"); //duração do filme/serie
       
       //painel de botoes minha lista e download
       buttons = new JPanel();
       myList = new JButton("My list");//botao de adicionar a minha lista
       downl = new JButton("Download");//botao de download
       
      /*
       //painel de filmes/series relacionadas
       relationated = new JPanel();
       BoxLayout layoutRelationed = new BoxLayout(relationated, BoxLayout.X_AXIS);
       description.setLayout(layoutRelationed);
       
       film0 = new JLabel("Filme0");//label filme relacionado 0
       film01=new JLabel("Filme01");//label filme relacionado 01
       */
       //Relacionando elementos
       this.add(panel); //Add panel ao frame.
       panel.add(filmImg);
       
       panel.add(title);
       
       panel.add(info);
       info.add(stars);
       info.add(year);
       info.add(classification);
       info.add(duration);
       
       panel.add(description);
       description.add(shortDescription);
       description.add(cast);
       description.add(director);
       
       panel.add(buttons);
       buttons.add(myList);
       buttons.add(downl);
       
       /*
       panel.add(relationated);
       relationated.add(film0);
       relationated.add(film01);
       */
       
        
 
       
       
   
   
   }
    
    
    
    
}
