package sandbox;

import com.google.inject.Inject;

/**
 * Created by joeabrams on 3/3/16.
 */
public class HelloService{

    protected String name = "Mimmy Kitty";
    @Inject StatsService statsService;

    public String sayHey () {
        statsService.incr();
        return "Hello " + name +  " " + statsService.getCallCount();
    }

}
