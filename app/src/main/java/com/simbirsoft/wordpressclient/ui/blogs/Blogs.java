package com.simbirsoft.wordpressclient.ui.blogs;

class Blogs {
    private int image;
    private String header, blogURL;

    Blogs(int image, String header, String blogURL) {
        this.image = image;
        this.header = header;
        this.blogURL = blogURL;
    }

    int getImage() {
        return image;
    }

    String getHeader() {
        return header;
    }

    String getURL() {
        return blogURL;
    }
}
