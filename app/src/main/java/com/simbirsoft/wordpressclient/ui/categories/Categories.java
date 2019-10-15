package com.simbirsoft.wordpressclient.ui.categories;

class Categories {

    Categories(String category, String categoryDescription) {
        this.category = category;
        this.categoryDescription = categoryDescription;
    }

    private String category;
    private String categoryDescription;

    String getCategory() {
        return category;
    }

    String getCategoryDescription() {
        return categoryDescription;
    }


}
