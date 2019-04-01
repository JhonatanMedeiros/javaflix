package br.com.javaflix.controller;

import br.com.javaflix.model.Movie;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Jhonatan Medeiros
 */
public class TheMovieDB {
    
    /**
     * The Movie DB
     * Docs: https://www.themoviedb.org/documentation/api
     */
    private final String API_URL = "https://api.themoviedb.org/3";
    private final String API_KEY = "00356e95f8470797034445c44ae2ae7c";
    
    private ArrayList<Movie> moveList;
    
    private static TheMovieDB instance;
    
    public static TheMovieDB getIntance() {
        if (instance == null) {
            instance = new TheMovieDB();
        }
        return instance;
    }
    
    public void refresh() {
        try {
            HttpResponse<JsonNode> request = Unirest.get(this.API_URL + "/movie/popular")
                    .queryString("api_key", this.API_KEY)
                    .queryString("language", "pt-BR")
                    .queryString("region", "BR")
                    .asJson();
            
            JSONObject responsejson = request.getBody().getObject();
            JSONArray results = responsejson.getJSONArray("results");
            moveList = new ArrayList<>();
                       
            for (int i = 0; i < results.length(); i++) {
                results.getJSONObject(i);
                 moveList.add(
                         new Movie(
                                 results.getJSONObject(i).optInt("id"),
                                 results.getJSONObject(i).getString("original_title"),
                                 results.getJSONObject(i).getString("poster_path"),
                                 results.getJSONObject(i).getString("overview")
                         )
                 );
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public ArrayList<Movie> getMovies() {
        return this.moveList;
    }
}
