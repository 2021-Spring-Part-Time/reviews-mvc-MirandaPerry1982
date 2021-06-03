package org.wecancoeit.reviews;

public class Review {

    private Long id;
    private String name;
    private String category;
    private String description;


    public Review(long id, String name,  String category, String description) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.description = description;
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
}
