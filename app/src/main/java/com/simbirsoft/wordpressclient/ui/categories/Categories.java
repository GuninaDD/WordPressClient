package com.simbirsoft.wordpressclient.ui.categories;

class Categories {

    Categories(String categorie, String categorieDescription) {
        this.categorie = categorie;
        this.categorieDescription = categorieDescription;
    }

    private String categorie;
    private String categorieDescription;

    String getCategorie() {
        return categorie;
    }

    String getCategorieDescription() {
        return categorieDescription;
    }


}
