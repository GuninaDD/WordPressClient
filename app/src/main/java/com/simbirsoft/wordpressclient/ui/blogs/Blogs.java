package com.simbirsoft.wordpressclient.ui.blogs;

public class Blogs {

    public Blogs(int image, String header, String URL) {
        this.image = image;
        this.header = header;
        this.URL = URL;
    }

    private int image;
    private String header, URL;


    public int getImage() {
        return image;
    }

    public String getHeader() {
        return header;
    }

    public String getURL() {
        return URL;
    }
}
