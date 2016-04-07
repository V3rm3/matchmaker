package model;

import lombok.Data;
import java.util.Date;

/**
 * @author renantdesouza
 * @since 03/30/2016
 * */
public @Data class User {

    private Long id;
    private String name;
    private String nickname;
    private String pass;
    private Date firstAccess;
    private Date lastAccess;

    public User() {
    }

}
