package sandbox;

/**
 * Created by joeabrams on 3/6/16.
 */
public class StatsService {

    int callCounter = 0;

    public void incr() {
        callCounter++;
    }

    public int getCallCount() {
        return callCounter;
    }
}
