package model;

import java.util.Date;
import java.util.List;

/**
 * @author renantdesouza
 * @since 03/30/2016
 * */
public class Match {

    private List<User> users;
    private Date date;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
