package com.api.ecommerce.repository;

import com.api.ecommerce.models.Review;
import org.springframework.data.repository.CrudRepository;

public interface ReviewRepository extends CrudRepository<Review, Integer> {
}
