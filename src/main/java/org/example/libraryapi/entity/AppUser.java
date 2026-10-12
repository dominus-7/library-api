package org.example.libraryapi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true,length = 50)
    private String username;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false,length = 20)
    @Enumerated(EnumType.STRING)
    private Role role;


}
