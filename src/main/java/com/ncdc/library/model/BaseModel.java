package com.ncdc.library.model;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Created by Lucas on 10.02.2018
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@MappedSuperclass
class BaseModel {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "id")
    protected String id;
}
