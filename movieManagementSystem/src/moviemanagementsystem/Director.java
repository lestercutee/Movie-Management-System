/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moviemanagementsystem;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Director {

    private String directorId;
    private String dName;
    private String bDate;
    private String movie;

    private static int count = 00001;
    private static ArrayList<Director> dLists = new ArrayList<>();

    public Director() {

    }

    public Director(String directorId, String dName, String bDate, String movie) {
        this.directorId = generateId();
        this.dName = dName;
        this.bDate = bDate;
        this.movie = movie;
    }

    public String getDirectorId() {
        return this.directorId;
    }

    public String getName() {
        return this.dName;
    }

    public String getBDate() {
        return this.bDate;
    }

    public String getMovie() {
        return this.movie;
    }

    /*==================================
    add movie method
        will add the credentials to the array list
     ===================================*/
    public void addDirector(String name, String bDate, String movie) {
        dLists.add(new Director(generateId(), name, bDate, movie));

    }

    public Object[] displayDirector() {

        Object[] data = new Object[4];
        for (Director director : dLists) {
            data[0] = director.getDirectorId();
            data[1] = director.getName();
            data[2] = director.getBDate();
            data[3] = director.getMovie();
        }
        return data;
    }

    /*==================================
    update method
        will update the current object
     ===================================*/
    public boolean updateDirector(String id, String name, String bDate, String movie) {
        boolean isUpdated = false;
        for (Director director : dLists) {

            if (director.isFound(id)) {
                this.directorId = id;
                this.dName = name;
                this.bDate = bDate;
                this.movie = movie;

                dLists.set(0, this);
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
    public void deleteDirector(String directorId, String name, String bDate, String movie) {

        if (getDirectorId().equals(isFound(directorId))) {
            this.directorId = getDirectorId();
            this.dName = name;
            this.bDate = bDate;
            this.movie = movie;

            dLists.remove(this);
        }
    }

    /*==================================
    Generate id
        will return count value as the id
     ===================================*/
    public static String generateId() {
        if (dLists.isEmpty()) {
            count = 1;
        } else {
            count = dLists.size() + 1;
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
        for (Director director : dLists) {
            if (director.getDirectorId().equals(id)) {
                isFound = true;
            }
        }
        return isFound;
    }

}
