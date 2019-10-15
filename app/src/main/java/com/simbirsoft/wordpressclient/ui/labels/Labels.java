package com.simbirsoft.wordpressclient.ui.labels;

class Labels {
    private int image;
    private String labelHeader;

    Labels(int image, String labelHeader) {
        this.image = image;
        this.labelHeader = labelHeader;
    }

    String getLabelHeader() {
        return labelHeader;
    }

    int getImage() {
        return image;
    }
}
