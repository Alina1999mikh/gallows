package app;

import app.GameProcess.RoundTest;
import app.model.WordTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        RoundTest.class,
        WordTest.class
})
public class AllTest {
}