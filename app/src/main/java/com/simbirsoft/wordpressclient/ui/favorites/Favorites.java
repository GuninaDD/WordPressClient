package com.simbirsoft.wordpressclient.ui.favorites;

class Favorites {
    private int image;
    private String header;
    private String favoritesURL;

    Favorites(int image, String header, String favoritesURL) {
        this.image = image;
        this.header = header;
        this.favoritesURL = favoritesURL;
    }

    int getImage() {
        return image;
    }

    String getHeader() {
        return header;
    }

    String getURL() {
        return favoritesURL;
    }


}
