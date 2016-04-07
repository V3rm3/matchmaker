package functional;

import internationalization.Internalizator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author renantdesouza
 * @since 07/04/2016.
 */
public class InternationalizationTest {

    private static final String MOCK_LOCALE = "test";
    private static final String MOCK_MESSAGE_PATH = "message_test.properties";
    private static final String TEST = "TEST";

    @Test
    public void getText() {
        Internalizator i = new Internalizator();
        i.setLanguage(MOCK_LOCALE);

        assertEquals(MOCK_LOCALE, i.getLanguage().getDescription());
        assertEquals(MOCK_MESSAGE_PATH, i.getPatternMessagePath());
        assertEquals(TEST,  i.getText(MOCK_LOCALE));
    }

}
