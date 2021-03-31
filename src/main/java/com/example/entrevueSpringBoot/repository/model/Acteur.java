package com.example.entrevueSpringBoot.repository.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "acteur")
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
public class Acteur {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(length = 30)
  private String nom;

  @Column(length = 30)
  private String prenom;

}
