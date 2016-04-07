package model;

import internationalization.Languages;
import lombok.Data;

/**
 * @author renantdesouza.
 * @ssince 04/07/2016.
 * */
public @Data class UserLanguage {

    private User user;
    private Languages selectedLanguage;

    public UserLanguage() {
    }

}
