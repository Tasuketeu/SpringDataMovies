package com.company.base.accenture.movies.Interfaces;

import com.company.base.accenture.movies.ObjModelClass.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends CrudRepository<Review,String> {

}
