package com.example.uberreviewservice.services;

import com.example.uberreviewservice.models.Review;
import com.example.uberreviewservice.repositories.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ReviewService implements CommandLineRunner {
    private final ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository){
        this.reviewRepository = reviewRepository;

    }




    @Override
    public void run(String... args) throws Exception {
        System.out.println("*****************");
        Review r =Review
                .builder()
                .content("Amazing Service")
                .ratings(5.0)
                .build();
        reviewRepository.save(r);
    }

}
