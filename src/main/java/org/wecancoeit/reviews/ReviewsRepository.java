package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewsRepository {

    Map<Long, Review> reviewsList = new HashMap<>();

    public ReviewsRepository(){
        Review acousticGuitar = new Review(1L,"Little Martin LX1", "Acoustic Guitar","A pure delight to play. Smaller sized for smaller hands, yet " +
                "still delivers a full, rich sound.");
        Review electricGuitar = new Review(2L, "Les Paul Signature", "Electric Guitar","While heavy, the smooth fretboard will suck you in for hours.");
        Review hollowBodyGuitar = new Review(3L, "Gretch","Hollow Body Guitar","Blues legends can't be wrong. Enjoy the best of both worlds while plugged in.");

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
