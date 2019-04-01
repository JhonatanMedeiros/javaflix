package br.com.javaflix.core;

import br.com.javaflix.view.JavaFlixView;

/**
 *
 * @author Jhonatan Medeiros
 */
public class Application {

    public static void main(String[] args) {
        
        try {
            JavaFlixView frame = new JavaFlixView();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
