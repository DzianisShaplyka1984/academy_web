package com.academy.academy_web.controller;

import com.academy.academy_web.model.entity.Author;
import com.academy.academy_web.model.entity.Book;
import com.academy.academy_web.service.AuthorService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class AuthorController {
  private final AuthorService authorService;

  @GetMapping(value = "/authors")
  public String authors(Model model) {
    List<Author> authors = authorService.getAll();

    model.addAttribute("authors", authors);

    return "authors";
  }

  @GetMapping(value = "/author")
  public String book(@RequestParam() Integer id, Model model) {
    Author author = authorService.getById(id);

    model.addAttribute("author", author);
    return "authorDetails";
  }
}
