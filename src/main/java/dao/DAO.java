package dao;

import model.Model;

/**
 * Generic data base manager.
 *
 * @author renantdesouza.
 * @ssince 05/04/2016.
 * */
public class DAO<T extends Model<?>> {

    private Class<T> klazz;

    public DAO(Class<T> klazz) {
        this.klazz = klazz;
    }

}
