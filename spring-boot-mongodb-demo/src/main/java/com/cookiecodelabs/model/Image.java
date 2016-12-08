package com.cookiecodelabs.model;

import org.springframework.data.annotation.Id;

/**
 * Created by Kithmal on 12/6/16.
 */
public class Image {

    @Id
    private String id;
    private String name;

    public  Image(){
    }

    public Image(String id, String name){
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
