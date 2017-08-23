package com.weslaty.data.access.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
public class User {
    @Id
    private Integer id;

    private String login;

    private String password;

    private String firstName;

    private String lastName;

    private String email;

    private String mobilePhone;

    private Integer status;

    //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    private LocalDateTime createDate;

    //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    private LocalDateTime lastUpdateDate;

    private LocalDateTime lastConnection;

}
