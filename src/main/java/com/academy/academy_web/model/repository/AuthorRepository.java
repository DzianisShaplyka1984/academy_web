package com.academy.academy_web.model.repository;

import com.academy.academy_web.model.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
