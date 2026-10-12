package org.example.libraryapi.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Table(name = "authors")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 100)
    private String firstname;
    @Column(nullable = false, length = 100)
    private String lastname;
    @Column(length = 100)
    private String nationality;
}
