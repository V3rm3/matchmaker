package controller;

import dao.DAO;
import model.Model;
import validator.Validator;
import validator.ValidatorImpl;

/**
 * Base generic service, used to send and receive data from frontend.
 *
 * @author  renantdesouza.
 * @since 05/04/2016.
 * */
public class Service<T extends Model> {

    protected DAO<T> dao;
    protected Validator<T> validator;

    public Service(DAO<T> dao, Validator<T> validator) {
        this.dao = dao;
        this.validator = validator;
    }

    public Service(DAO<T> dao, Class<T> modelClass) {
        this(dao, new ValidatorImpl<T>(modelClass));
    }

    public Service(ValidatorImpl<T> validator, Class<T> modelClass) {
        this(new DAO<T>(modelClass), validator);
    }

    public Service(Class<T> modelClass) {
        dao = new DAO<>(modelClass);
        validator = new ValidatorImpl<>(modelClass);
    }

}
