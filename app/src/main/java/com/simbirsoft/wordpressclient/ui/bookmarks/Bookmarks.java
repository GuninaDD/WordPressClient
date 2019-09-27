package com.simbirsoft.wordpressclient.ui.bookmarks;

public class Bookmarks {
    private int image;

    public Bookmarks(int image, String header, String URL) {
        this.image = image;
        this.header = header;
        this.URL = URL;
    }

    private String header;
    private String URL;

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
