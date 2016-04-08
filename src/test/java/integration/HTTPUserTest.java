package integration;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * @author renantdesouza.
 * @since 07/04/2016.
 */
public class HTTPUserTest {

    @Test
    public void insert() {
        Client client = Client.create();
        WebResource resource = client.resource("http://localhost:8082").path("rest/user/insert");
        String process = resource.get(String.class);

        System.out.println(process);

        assertNotNull(process);
    }

}