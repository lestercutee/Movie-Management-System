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
public class Actor {

    private String actorId;
    private String aName;
    private String bDate;
    private String aQoutes;

    private static int count = 00001;
    private static ArrayList<Actor> aLists = new ArrayList<Actor>();

    public Actor() {

    }

    public Actor(String actorId, String aName, String bDate, String aQoutes) {
        this.actorId = generateId();
        this.aName = aName;
        this.bDate = bDate;
        this.aQoutes = aQoutes;
    }

    public String getActorId() {
        return this.actorId;
    }

    public String getName() {
        return this.aName;
    }

    public String getBDate() {
        return this.bDate;
    }

    public String aQoutes() {
        return this.aQoutes;
    }

    /*==================================
    add movie method
        will add the credentials to the array list
     ===================================*/
    public void addActor(String name, String bDate, String qoutes) {

        aLists.add(new Actor(generateId(), name, bDate, qoutes));

    }

    public Object[] displayActor() {

        Object[] data = new Object[4];
        for (Actor actor : aLists) {
            data[0] = actor.getActorId();
            data[1] = actor.getName();
            data[2] = actor.getBDate();
            data[3] = actor.aQoutes();
        }
        return data;
    }

    /*==================================
    update method
        will update the current object
     ===================================*/
    public boolean updateActor(String id, String name, String bDate, String qoutes) {
        boolean isUpdated = false;
        for (Actor actors : aLists) {

            if (actors.isFound(id)) {
                this.actorId = id;
                this.aName = name;
                this.bDate = bDate;
                this.aQoutes = qoutes;

                aLists.set(0, this);
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
    public void deleteMovie(String actorId, String name, String bDate, String qoutes) {

        if (getActorId().equals(isFound(actorId))) {
            this.actorId = getActorId();
            this.aName = name;
            this.bDate = bDate;
            this.aQoutes = qoutes;

            aLists.remove(this);
        }
    }

    /*==================================
    Generate id
        will return count value as the id
     ===================================*/
    public static String generateId() {
        if (aLists.isEmpty()) {
            count = 1;
        } else {
            count = aLists.size() + 1;
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
        for (Actor actors : aLists) {
            if (actors.getActorId().equals(id)) {
                isFound = true;
            }
        }
        return isFound;
    }

}
