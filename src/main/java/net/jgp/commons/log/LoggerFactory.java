package net.jgp.commons.log;

import java.util.HashMap;

public class LoggerFactory {

    private static transient LoggerFactory instance = null;
    private static int level;

    private HashMap<String, Logger> loggers;

    @SuppressWarnings("rawtypes")
    public static Logger getLogger(Class class1) {
        return LoggerFactory.getInstance().getLogger0(class1.getName());
    }

    private Logger getLogger0(String className) {
        Logger logger = null;

        logger = this.loggers.get(className);
        if (logger == null) {
            logger = new Logger(className);
            this.loggers.put(className, logger);
        }
        return logger;
    }

    private LoggerFactory() {
        loggers = new HashMap<>();
        level = LogConstants.DEBUG;
    }

    private static LoggerFactory getInstance() {
        if (instance == null) {
            instance = new LoggerFactory();
        }
        return instance;
    }

    public static void setLevel(int logLevel) {
        level = logLevel;
    }

    public static int getLevel() {
        return level;
    }

}
