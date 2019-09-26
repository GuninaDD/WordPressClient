package com.simbirsoft.wordpressclient.ui.labels;

public class Labels {
    private int image;

    public int getImage() {
        return image;
    }

    public String getLabelHeader() {
        return labelHeader;
    }

    public Labels(int image, String labelHeader) {
        this.image = image;
        this.labelHeader = labelHeader;
    }

    private String labelHeader;
}
