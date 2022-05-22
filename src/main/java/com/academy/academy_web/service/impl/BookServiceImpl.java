package com.academy.academy_web.service.impl;

import com.academy.academy_web.model.entity.Book;
import com.academy.academy_web.model.repository.BookRepository;
import com.academy.academy_web.service.BookService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
  private final BookRepository bookRepository;


  @Override
  public List<Book> getAll() {
    return bookRepository.findAll();
  }

  @Override
  public Book getById(Integer id) {
    return bookRepository.getById(id);
  }

  @Override
  public void save(Book book) {
    bookRepository.save(book);
  }
}
