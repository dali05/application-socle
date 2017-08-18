package com.weslaty.data.access.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

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

    private Date createDate;

    private Date lastUpdateDate;

    private Date lastConnection;

}
