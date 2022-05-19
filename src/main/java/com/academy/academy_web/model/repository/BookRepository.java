package com.academy.academy_web.model.repository;

import com.academy.academy_web.model.entity.Book;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
  List<Book> getBookByTitle(String title);
  List<Book> getBookByYear(Integer year);
  List<Book> getBookByYearLessThan(Integer year);
  List<Book> getBookByYearBetweenOrderByYearAsc(Integer start, Integer end);
  List<Book> getBookByTitleAndYearLessThan(String title, Integer year);
  List<Book> getBookByTitleOrYear(String title, Integer year);

  @Query("from Book b where b.title = :title")
  List<Book> getAllBooks(@Param("title") String titleBook);
}
