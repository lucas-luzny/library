package com.ncdc.library.model;

import com.ncdc.library.service.validator.StartsWithA;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Lucas on 10.02.2018
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name = "book")
@AttributeOverrides({@AttributeOverride(name = "id", column = @Column(name = "book_id"))})
public class Book extends BaseModel {

    @NotNull
    @Column(name = "title")
    private String title;
    @NotNull
    @StartsWithA
    @Column(name = "author")
    private String author;
    @NotNull
    @Column(name = "isbn")
    private String isbn;
}
