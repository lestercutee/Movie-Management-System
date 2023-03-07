/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moviemanagementsystem;

import java.util.ArrayList;

public class Movie {

    //class properties
    private String movieId;
    private String title;
    private String yearReleased;
    private String director;
    private String actor;
    private String plotOutline;
    private String genre;

    private static int count = 00001;
    private static ArrayList<Movie> mLists = new ArrayList<>();

    /*
     * Constructor
     */
    public Movie() {

    }

    public Movie(String movieId, String title, String yearReleased, String director, String actor, String plotOutline, String genre) {
        this.movieId = movieId;
        this.title = title;
        this.yearReleased = yearReleased;
        this.director = director;
        this.actor = actor;
        this.plotOutline = plotOutline;
        this.genre = genre;
    }

    /*
     * Get Methods
     */
    public String getMovieId() {
        return this.movieId;
    }

    public String getTitle() {
        return this.title;
    }

    public String getYearReleased() {
        return this.yearReleased;
    }

    public String getDirector() {
        return this.director;
    }

    public String getActor() {
        return this.actor;
    }

    public String getPlotOutline() {
        return this.plotOutline;
    }

    public String getGenre() {
        return this.genre;
    }

    /*==================================
    add movie method
        will add the credentials to the array list
     ===================================*/
    public void addMovie(String title, String yearReleased, String director, String actor, String plotOutline, String genre) {

        mLists.add(new Movie(generateId(), title, yearReleased, director, actor, plotOutline, genre));

    }

    public Object[] displayMovie() {

        Object[] data = new Object[7];
        for (Movie movie : mLists) {
            data[0] = movie.getMovieId();
            data[1] = movie.getTitle();
            data[2] = movie.getYearReleased();
            data[3] = movie.getActor();
            data[4] = movie.getDirector();
            data[5] = movie.getPlotOutline();
            data[6] = movie.getGenre();
        }
        return data;
    }

    /*==================================
    update method
        will update the current object
     ===================================*/
    public boolean updateMovie(String id, String title, String yearReleased, String director, String actor, String plotOutline, String genre) {
        boolean isUpdated = false;
        for (Movie movie : mLists) {

            if (movie.isFound(id)) {
                this.movieId = id;
                this.title = title;
                this.yearReleased = yearReleased;
                this.director = director;
                this.actor = actor;
                this.plotOutline = plotOutline;
                this.genre = genre;

                mLists.set(0, this);
                isUpdated = true;

            } else {
                isUpdated = false;
            }
        }
        return isUpdated;
    }

    /*==================================
    delete method
        will delete the current object
     ===================================*/
    public void deleteMovie(String movieId, String title, String yearReleased, String director, String actor, String plotOutline, String genre) {

        if (getMovieId().equals(isFound(movieId))) {
            this.movieId = getMovieId();
            this.title = title;
            this.yearReleased = yearReleased;
            this.director = director;
            this.actor = actor;
            this.plotOutline = plotOutline;
            this.genre = genre;

            mLists.remove(this);
        }
    }

    /*==================================
    Generate id
        will return count value as the id
     ===================================*/
    public static String generateId() {
        if (mLists.iterator().hasNext()) {
            count++;
        }
        return String.format("%05d", count);
    }

    /*==================================
    search method
        will search the current object based 
        on its id
     ===================================*/
    public boolean isFound(String id) {
        Boolean isFound = false;
        for (Movie sMovie : mLists) {
            if (sMovie.getMovieId().equals(id)) {
                isFound = true;
            }
        }
        return isFound;
    }

}
