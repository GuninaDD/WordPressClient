package com.simbirsoft.wordpressclient.ui.favorites;

public class Favorites {
    private int image;
    private String header;
    private String URL;

    public Favorites(int image, String header, String URL) {
        this.image = image;
        this.header = header;
        this.URL = URL;
    }

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
