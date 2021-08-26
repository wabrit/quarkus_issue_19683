package com.example.jparepo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Erewhon  {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(updatable = false, insertable = false)
  private Long id;

  @Column(name = "NAME", unique = false, nullable = false)
  private String name;

  public Long getId() { return id; }

  public void setId(final long id) { this.id = id; }

  public String getName() { return name; }

  public void setName(final String name) { this.name = name; }
}
