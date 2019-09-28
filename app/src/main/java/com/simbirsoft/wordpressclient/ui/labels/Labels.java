package com.simbirsoft.wordpressclient.ui.labels;

class Labels {
    private int image;

    int getImage() {
        return image;
    }

    String getLabelHeader() {
        return labelHeader;
    }

    Labels(int image, String labelHeader) {
        this.image = image;
        this.labelHeader = labelHeader;
    }

    private String labelHeader;
}
