package org.wecancoeit.reviews;

public class Review {

    private Long id;
    private String name;
    private String category;
    private String description;
    private String image;
    private String listPrice;



    public Review(long id, String name,  String category, String description, String image, String listPrice) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.description = description;
        this.image = image;
        this.listPrice = listPrice;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription(){
        return description;
    }

    public String getCategory(){
        return category;
    }

    public String getImage(){
        return image;
    }

    public String getListPrice(){
        return listPrice;
    }
}
