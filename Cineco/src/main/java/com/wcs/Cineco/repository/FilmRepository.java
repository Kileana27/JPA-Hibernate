package com.wcs.Cineco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wcs.Cineco.entity.Film;

@Repository
public interface FilmRepository extends JpaRepository<Film, Long> {

}
