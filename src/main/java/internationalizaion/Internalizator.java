package internationalizaion;

/**
 * TODO CARREGAR A LINGUA ANTES DE INICIAR QUALQUER ACAO.
 *
 * @author renantdesouza.
 * @since 06/04/2016.
 */
public class Internalizator {

    private Languages language;

    public Internalizator() {
    }

    public Internalizator(Languages language) {
        setLanguage(language);
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

    public String getText(String key) {
        return (String) PropertyReader.getProperty("message_" + language.getDescription() + ".properties", key);
    }

    public static void main(String...args) {
        Internalizator i = new Internalizator(Languages.EN_US);
        System.out.println(i.getText("text"));
    }

}

