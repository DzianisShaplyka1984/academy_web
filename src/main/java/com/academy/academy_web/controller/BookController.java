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

@Controller
@RequiredArgsConstructor
public class BookController {
  private final BookRepository bookRepository;
  private final BookService bookService;

  @GetMapping(value = "/books")
  public String books(Model model) {
    //Iterable<Book> books = bookRepository.findAll(Sort.by(Direction.DESC, "year"));
    Page<Book> books = bookRepository.findAll(PageRequest.of(1, 10, Sort.by(Direction.DESC, "year")));

    model.addAttribute("books", ((Page<?>) books).getContent());
    return "book";
  }

  @GetMapping(value = "/books/{id}")
  public String book(@PathVariable Integer id,Model model) {
    List<Book> books = new ArrayList<>();
    Optional<Book> mayBeBook = bookRepository.findById(id);

    mayBeBook.ifPresent(books::add);

    model.addAttribute("books", books);
    return "book";
  }

  @GetMapping(value = "/book/{title}")
  public String bookByTitle(@PathVariable String title,Model model) {
    //List<Book> books = bookRepository.getBookByTitle(title);

//    Book exampleBook = new Book();
//    exampleBook.setTitle(title);

    List<Book> books = bookRepository.getAllBooks(title);
    model.addAttribute("books", books);
    return "book";
  }

  @PostMapping(value = "/books")
  public String create(@RequestBody Book book, Model model) {
    Iterable<Book> books = bookRepository.findAll();

    model.addAttribute("books", books);
    return "book";
  }
}
