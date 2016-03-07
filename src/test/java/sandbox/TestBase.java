package sandbox;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Before;

/**
 * Created by joeabrams on 3/6/16.
 */
public class TestBase {
    protected Injector injector = Guice.createInjector(new AbstractModule() {
        @Override
        protected void configure() {
            bind(HelloService.class).to(HelloServiceForTesting.class);
            bind(StatsService.class);
        }
    });

    @Before
    public void setup () {
        injector.injectMembers(this);
    }
}
