package functional;

import internationalization.PropertyReader;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author renantdesouza
 * @since 04/07/2016.
 */
public class PropertyReaderTest {

    private static final String TEST = "TEST";

    @Test
    public void getProperty() {
        Object value = PropertyReader.getProperty("test.properties", "test");
        assertNotNull(value);
        assertEquals(String.class, value.getClass());
        assertEquals(value, TEST);
    }

}