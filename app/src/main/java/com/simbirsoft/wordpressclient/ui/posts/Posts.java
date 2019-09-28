package com.simbirsoft.wordpressclient.ui.posts;

class Posts {

    private int avatar;
    private int label;
    private String header;
    private String username;
    private String publication;

    Posts(int avatar, int label, String header, String username, String publication) {
        this.avatar = avatar;
        this.label = label;
        this.header = header;
        this.username = username;
        this.publication = publication;
    }


    int getAvatar() {
        return avatar;
    }

    int getLabel() {
        return label;
    }

    String getHeader() {
        return header;
    }

    String getUsername() {
        return username;
    }

    String getPublication() {
        return publication;
    }
}
