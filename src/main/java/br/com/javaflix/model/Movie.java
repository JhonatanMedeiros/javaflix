package br.com.javaflix.model;

/**
 *
 * @author blslu
 */
public class Movie {
    private int id;
    private String title;
    private String thumUrl;
    private String description;

    public Movie(int id, String title, String thumUrl, String description) {
        this.id = id;
        this.title = title;
        this.thumUrl = thumUrl;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThumUrl() {
        return thumUrl;
    }

    public void setThumUrl(String thumUrl) {
        this.thumUrl = thumUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
    
}
