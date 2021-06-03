package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewsRepository {

    Map<Long, Review> reviewsList = new HashMap<>();

    public ReviewsRepository(){
        Review acousticGuitar = new Review(1L,"Martin LX1 Little Martin", "Acoustic Guitar","A pure delight to play. This small-sized dreadnought" +
                " can be taken anywhere. It delivers exceptional tone for its size. Not only is this guitar worth it's price tag, it's kind of adorable. ","./images/acoustic-guitar.jpg","List Price: $300.00");
        Review electricGuitar = new Review(2L, "Epiphone SG Standard", "Electric Guitar","This guitars distinctive look starts with it's mahogany body" +
                " and neck. Twin Alnico Classic PRO humbuckers provide all the thick, fat tone you could ever want. Neatly priced for the budget player, this guitar is worth the value." +
                "You won't be able to put it down.","./images/electric-guitars.jpg","List Price: $449.00");
        Review hollowBodyGuitar = new Review(3L, "G2420T STREAMLINER with Bigsby Gretch","Hollow Body Guitar","This cherry red eye catcher comes packed" +
                "with the Broad'Tron BT-2S humbucking pickup. Designed specifically for this collection, it delivers a robust and shaped sound. While " +
                "it may feel huge, it's light weight makes up for it and hangs well when strapped on. That many blues legends can't " +
                "be wrong. ","./images/hollow-body-guitar.jpg","List Price $549.00");

        reviewsList.put(acousticGuitar.getId(),acousticGuitar);
        reviewsList.put(electricGuitar.getId(),electricGuitar);
        reviewsList.put(hollowBodyGuitar.getId(),hollowBodyGuitar);
    }


    public ReviewsRepository(Review...reviewsToAdd) {
        for(Review review: reviewsToAdd){
            reviewsList.put(review.getId(), review);
        }
    }

    public Review findOne(long id) {
        return reviewsList.get(id);
    }

    public Collection<Review> findAll() {
        return reviewsList.values();
    }
}
