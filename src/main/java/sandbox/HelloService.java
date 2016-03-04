package sandbox;

/**
 * Created by joeabrams on 3/3/16.
 */
public class HelloService {

    String name;

    public HelloService() {
        this.name = "Mimmy Kitty";
    }

    public String sayHey () {
        return "Hello " + name;
    }

}
