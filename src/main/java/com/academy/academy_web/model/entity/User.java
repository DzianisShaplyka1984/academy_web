package com.academy.academy_web.model.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @Column
  private String name;
  @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
  @JoinColumn(name="id_role")
  private Role role;
}
