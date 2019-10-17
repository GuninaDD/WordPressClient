package com.simbirsoft.wordpressclient.ui.bookmarks;

class Bookmarks {
    private int image;
    private String header;
    private String bookmarksURL;

    Bookmarks(int image, String header, String bookmarksURL) {
        this.image = image;
        this.header = header;
        this.bookmarksURL = bookmarksURL;
    }

    int getImage() {
        return image;
    }

    String getHeader() {
        return header;
    }

    String getURL() {
        return bookmarksURL;
    }
}
