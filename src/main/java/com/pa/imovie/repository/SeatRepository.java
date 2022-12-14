package com.pa.imovie.repository;

import com.pa.imovie.entity.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeatRepository extends JpaRepository<Seat,Integer> {

    List<Seat> findByCinemaMovieTimeId(Integer cinemaMovieTimeId);

}
