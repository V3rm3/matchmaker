import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.junit.Test;

/**
 * @author renantdesouza.
 * @since 07/04/2016.
 */
public class HTTPUserTest {

    @Test
    public void insert() {
        //TODO COLOCAR CHAMADA REAL DO SERVICE DE USER

        Client client = Client.create();
        WebResource resource = client.resource("http://localhost:9998").path("resource");
        resource.accept("application/json");
        /*if (response.getStatus() != 200) {
          throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
        }*/
        String process = resource.get(String.class);
    }

}