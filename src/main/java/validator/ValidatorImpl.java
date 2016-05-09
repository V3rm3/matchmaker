package validator;

import annotation.Validate;
import model.Model;

import java.lang.reflect.Field;

/**
 * Used to validate before persist data.
 *
 * @author renantdesouza.
 * @since 04/07/2016.
 */
public class ValidatorImpl<T extends Model> implements  Validator<T> {

    private Class<T> modelClass;

    public ValidatorImpl(Class<T> modelClass) {
        this.modelClass = modelClass;
    }

    protected boolean validate(T entity) {
        Field[] fields = modelClass.getDeclaredFields();
        for (Field f : fields) {
            if (f.isAnnotationPresent(Validate.class)) {
                f.setAccessible(true);
                try {
                    Validate validate = f.getAnnotation(Validate.class);
                    if (f.get(this) == null && !validate.notnull()) {
                        return false;
                    }
                } catch (IllegalArgumentException | IllegalAccessException e) {
                    return false;
                }
            }
        }
        return true;
    }

}
