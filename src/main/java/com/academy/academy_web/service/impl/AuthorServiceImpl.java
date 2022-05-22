package com.academy.academy_web.service.impl;

import com.academy.academy_web.model.entity.Author;
import com.academy.academy_web.model.repository.AuthorRepository;
import com.academy.academy_web.service.AuthorService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {
  private final AuthorRepository authorRepository;

  @Override
  public List<Author> getAll() {
    return authorRepository.findAll();
  }

  @Override
  public Author getById(Integer id) {
    return authorRepository.getById(id);
  }
}
