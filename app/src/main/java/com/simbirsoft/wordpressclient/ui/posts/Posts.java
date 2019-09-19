package com.simbirsoft.wordpressclient.ui.posts;

public class Posts {

  int avatar;
  int label;
  String header;
    String username;
    String date_time;

    public Posts(int avatar, int label, String header, String username, String date_time) {
        this.avatar = avatar;
        this.label = label;
        this.header = header;
        this.username = username;
        this.date_time = date_time;
    }


    public int getAvatar() {
        return avatar;
    }

    public int getLabel() {
        return label;
    }

    public String getHeader() {
        return header;
    }

    public String getUsername() {
        return username;
    }

    public String getDate_time() {
        return date_time;
    }
}
