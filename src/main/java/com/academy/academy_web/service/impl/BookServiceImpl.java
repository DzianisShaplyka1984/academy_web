package com.academy.academy_web.service.impl;

import com.academy.academy_web.model.repository.BookRepository;
import com.academy.academy_web.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
  private final BookRepository bookRepository;
}
