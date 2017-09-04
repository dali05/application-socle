package com.weslaty.data.access.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Past;
import java.time.LocalDateTime;

@Entity
@Data
public class User {
    @Id
    private Integer id;

    private String login;

    //@JsonIgnore
    private String password;

    private String firstName;

    private String lastName;

    private String email;

    private String mobilePhone;

    private Integer status;

    //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    @Past
    @Column(updatable = false)
    private LocalDateTime createDate;

    //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    @Past
    private LocalDateTime lastUpdateDate;

    @Past
    private LocalDateTime lastConnection;

}
