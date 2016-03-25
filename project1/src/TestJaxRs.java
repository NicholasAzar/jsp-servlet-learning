import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;

/**
 * Created by nick on 22/03/16.
 */
@ApplicationPath("/testjax")
@Path("/")
public class TestJaxRs extends Application {

    @GET
    @Produces("text/plain")
    public String getHelloWorld() {
        return "Hello World!";
    }
}
