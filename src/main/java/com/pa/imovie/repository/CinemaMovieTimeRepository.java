package com.pa.imovie.repository;

import com.pa.imovie.entity.CinemaMovie;
import com.pa.imovie.entity.CinemaMovieTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CinemaMovieTimeRepository extends JpaRepository<CinemaMovieTime, Integer> {

    List<CinemaMovieTime> findByCinemaMovie_id(Integer cinemaMovie_id);

}
