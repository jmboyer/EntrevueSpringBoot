package com.example.entrevueSpringBoot.repository.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "film")
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
public class Film {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(length = 100)
  private String titre;

  @Column(length = 500)
  private String description;

  @Column
  @OneToMany(cascade = CascadeType.ALL)
  private List<Acteur> acteurs;

}
