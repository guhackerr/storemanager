package com.kelvyn.storemanager.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter 
@Setter
public class Game {
    @Id
    @EqualsAndHashCode.Include
    private String id;

    @EqualsAndHashCode.Include
    private String gamename;

    private LocalDate release;
    private String urlGame;
    private String description;
    private String developer;
    private BigDecimal price;
}
