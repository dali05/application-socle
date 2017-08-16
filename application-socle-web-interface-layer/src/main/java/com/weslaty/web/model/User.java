package com.weslaty.web.model;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private Integer id;
    private String login;
    private String password;
    private String first_name;
    private String last_name;
    private String picture;
    private String email;
    private String mobile_phone;
    private Byte status;
    private Date create_date;
    private Date last_update_date;
    private Date last_connection;

    public User(Integer id, String login, String password, String first_name, String last_name, String picture, String email, String mobile_phone, Byte status, Date create_date, Date last_update_date, Date last_connection) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.first_name = first_name;
        this.last_name = last_name;
        this.picture = picture;
        this.email = email;
        this.mobile_phone = mobile_phone;
        this.status = status;
        this.create_date = create_date;
        this.last_update_date = last_update_date;
        this.last_connection = last_connection;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile_phone() {
        return mobile_phone;
    }

    public void setMobile_phone(String mobile_phone) {
        this.mobile_phone = mobile_phone;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Date getLast_update_date() {
        return last_update_date;
    }

    public void setLast_update_date(Date last_update_date) {
        this.last_update_date = last_update_date;
    }

    public Date getLast_connection() {
        return last_connection;
    }

    public void setLast_connection(Date last_connection) {
        this.last_connection = last_connection;
    }
}
