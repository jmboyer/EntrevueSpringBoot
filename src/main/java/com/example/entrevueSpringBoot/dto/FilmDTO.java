package com.example.entrevueSpringBoot.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class FilmDTO {

  private Long id;
  private String titre;
  private String description;
  private List<ActeurDTO> acteurs;

}
