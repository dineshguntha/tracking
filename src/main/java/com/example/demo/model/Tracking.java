package com.example.demo.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "rating")
public class Tracking implements Serializable {
    @Id
    private Integer id;

    private Integer rating;

    public Integer getId() {
        return id;
    }

    public Integer getRating() {
        return rating;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}

