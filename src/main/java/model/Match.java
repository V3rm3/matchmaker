package model;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author renantdesouza
 * @since 03/30/2016
 * */
public @Data class Match {

    private List<User> users;
    private Date date;

    public Match() {
    }

}
