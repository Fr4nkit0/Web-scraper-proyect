package com.example.persistence.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor @NoArgsConstructor
@Setter @Getter
public class WebPage {
    @Id
    @GeneratedValue (strategy =  GenerationType.IDENTITY)
    private Integer id;
    @Column( nullable = false , length = 60)
    private String url;
    @Column( nullable = false, length =  45)
    private String title;
    @Column( nullable = false , length = 255)
    private String description;
}
