package com.academy.academy_web.service;

import com.academy.academy_web.model.entity.Book;
import java.util.List;

public interface BookService {
  List<Book> getAll();
  Book getById(Integer id);
  void save(Book book);
}
