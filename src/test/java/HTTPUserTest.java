import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.junit.Test;

import javax.ws.rs.core.MediaType;

import static org.junit.Assert.assertNotNull;

/**
 * @author renantdesouza.
 * @since 07/04/2016.
 */
public class HTTPUserTest extends AbstractHTTPTest {

    @Test
    public void insert() {
        Client client = Client.create();
        WebResource resource = client.resource("http://localhost:8082").path("user/insert");
        resource.accept(MediaType.APPLICATION_JSON);
        String process = resource.post(String.class);

        assertNotNull(process);
    }

}