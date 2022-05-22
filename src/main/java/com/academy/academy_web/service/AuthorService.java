package com.academy.academy_web.service;

import com.academy.academy_web.model.entity.Author;
import java.util.List;

public interface AuthorService {
  List<Author> getAll();

  Author getById(Integer id);
}
