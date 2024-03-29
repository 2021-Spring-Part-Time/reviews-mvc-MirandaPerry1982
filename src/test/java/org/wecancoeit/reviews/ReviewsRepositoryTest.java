package org.wecancoeit.reviews;

import org.junit.jupiter.api.Test;
import org.wecancoeit.reviews.Review;
import org.wecancoeit.reviews.ReviewsRepository;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewsRepositoryTest {

        private ReviewsRepository underTest;
        private Review reviewOne = new Review(1L, "review one name", "category","description","image one","price");
        private Review reviewTwo = new Review(2L, "review two name", "category","description","image two","price");



    @Test
    public void shouldFindReviewOne(){
        underTest = new ReviewsRepository(reviewOne);
        Review foundReview = underTest.findOne(1L);
        assertEquals(reviewOne, foundReview);
    }

    @Test
    public void shouldFindReviewOneAndReviewTwo(){
        underTest = new ReviewsRepository(reviewOne, reviewTwo);
        Collection<Review> foundReviews = underTest.findAll();
        assertThat(foundReviews).contains(reviewOne, reviewTwo);
    }

}
