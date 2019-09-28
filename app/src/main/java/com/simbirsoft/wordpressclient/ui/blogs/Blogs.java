package com.simbirsoft.wordpressclient.ui.blogs;

class Blogs {

    Blogs(int image, String header, String blogURL) {
        this.image = image;
        this.header = header;
        this.blogURL = blogURL;
    }

    private int image;
    private String header, blogURL;

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
