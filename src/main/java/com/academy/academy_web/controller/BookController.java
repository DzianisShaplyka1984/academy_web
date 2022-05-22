package com.academy.academy_web.controller;

import com.academy.academy_web.model.entity.Book;
import com.academy.academy_web.model.repository.BookRepository;
import com.academy.academy_web.service.BookService;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class BookController {
  private final BookService bookService;

  @GetMapping(value = "/books")
  public String books(Model model) {
    List<Book> books = bookService.getAll();

    model.addAttribute("books", books);

    return "books";
  }

  @GetMapping(value = "/book")
  public String book(@RequestParam() Integer id, Model model) {
    Book book = bookService.getById(id);

    model.addAttribute("book", book);
    return "bookDetails";
  }

  @GetMapping(value = "/showCreateBook")
  public String showCreateBook() {
    return "createBook";
  }

  @GetMapping(value = "/createBook")
  public String createBook(@RequestParam String title, @RequestParam Integer year, Model model) {
      Book book = new Book();
      book.setTitle(title);
      book.setYear(year);

      bookService.save(book);

      List<Book> books = bookService.getAll();

      model.addAttribute("books", books);

      return "books";
  }
}
