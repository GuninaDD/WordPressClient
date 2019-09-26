package com.simbirsoft.wordpressclient.ui.categories;

public class Categories {
    public Categories(String categorie, String categorieDescription) {
        this.categorie = categorie;
        this.categorieDescription = categorieDescription;
    }

    public String getCategorie() {
        return categorie;
    }

    public String getCategorieDescription() {
        return categorieDescription;
    }

    private String categorie;
    private String categorieDescription;
}
