package internationalization;

import java.text.MessageFormat;

/**
 * TODO CARREGAR A LINGUA ANTES DE INICIAR QUALQUER ACAO.
 *
 * The traductor class, translate system messages according selected language,
 * searching messages from .properties archive.
 *
 * @author renantdesouza.
 * @since 04/06/2016.
 * */
public class Internalizator {

    private Languages language;
    private static final String PATTERN_MESSAGE_PATH = "message_{0}.properties";

    public Internalizator() {
    }

    public Languages getLanguage() {
        return language;
    }

    public void setLanguage(Languages language) {
        this.language = language;
    }

    public void setLanguage(String language) {
        setLanguage(Languages.getByDescription(language));
    }

    public void setLanguage(int language) {
        setLanguage(Languages.getByCode(language));
    }

    public String getPatternMessagePath() {
        return MessageFormat.format(PATTERN_MESSAGE_PATH, language.getDescription());
    }

    public String getText(String key) {
        return (String) PropertyReader.getProperty(getPatternMessagePath(), key);
    }

}

