package com.example.entrevueSpringBoot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ActeurDTO {

  private Long id;
  private String nom;
  private String prenom;

}
