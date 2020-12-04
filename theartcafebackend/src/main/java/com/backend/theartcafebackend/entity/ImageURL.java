package com.backend.theartcafebackend.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="imageurl")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ImageURL {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="url")
    private String url;

    public ImageURL(String url) {
        this.url = url;
    }
}
