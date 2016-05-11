package net.jgp.commons.log;

import org.junit.Test;

import net.jgp.commons.log.LogConstants;
import net.jgp.commons.log.Logger;
import net.jgp.commons.log.LoggerFactory;

public class LoggerTest {

    private static final transient Logger log = LoggerFactory.getLogger(LoggerTest.class);

    public void allLog() {
        log.debug("Debug");
        log.info("Info");
        log.warning("Warning");
        log.error("Error");
    }

    @Test
    public void testDebug() {
        System.out.println("--- Debug");
        allLog();
        assert (true);
    }

    @Test
    public void testInfo() {
        System.out.println("--- Info");
        LoggerFactory.setLevel(LogConstants.INFO);
        allLog();
        assert (true);
    }

    @Test
    public void testWarning() {
        System.out.println("--- Warning");
        LoggerFactory.setLevel(LogConstants.WARNING);
        allLog();
        assert (true);
    }

    @Test
    public void testError() {
        System.out.println("--- Error");
        LoggerFactory.setLevel(LogConstants.ERROR);
        allLog();
        assert (true);
    }
}
