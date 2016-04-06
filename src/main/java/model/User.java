package model;

import java.util.Date;
import java.util.Scanner;

/**
 * @author renantdesouza
 * @since 03/30/2016
 * */
public class User {

    private Long id;
    private String name;
    private String nickname;
    private String pass;
    private Date firstAccess;
    private Date lastAccess;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Date getFirstAccess() {
        return firstAccess;
    }

    public void setFirstAccess(Date firstAccess) {
        this.firstAccess = firstAccess;
    }

    public Date getLastAccess() {
        return lastAccess;
    }

    public void setLastAccess(Date lastAccess) {
        this.lastAccess = lastAccess;
    }

}
