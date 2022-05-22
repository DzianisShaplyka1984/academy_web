package com.academy.academy_web.model.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import lombok.Data;

@Data
@Entity
public class Author {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @Column
  private String name;
  @ManyToMany(mappedBy = "authors", cascade = CascadeType.ALL)
  private List<Book> books;
}
