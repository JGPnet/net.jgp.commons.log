package net.jgp.commons.log;

public class Logger {

    private org.slf4j.Logger internatlLogger;

    public Logger(String className) {
        internatlLogger = org.slf4j.LoggerFactory.getLogger(className);
    }

    public void debug(String message) {
        if (LoggerFactory.getLevel() > LogConstants.DEBUG) {
            return;
        }
        internatlLogger.debug(message);
    }

    public void debug(String message, Object... arguments) {
        if (LoggerFactory.getLevel() > LogConstants.DEBUG) {
            return;
        }
        internatlLogger.debug(message, arguments);
    }

    public void info(String message) {
        if (LoggerFactory.getLevel() > LogConstants.INFO) {
            return;
        }
        internatlLogger.info(message);
    }

    public void info(String message, Object... arguments) {
        if (LoggerFactory.getLevel() > LogConstants.INFO) {
            return;
        }
        internatlLogger.info(message, arguments);
    }

    public void warning(String message) {
        if (LoggerFactory.getLevel() > LogConstants.WARNING) {
            return;
        }
        internatlLogger.warn(message);
    }

    public void warning(String message, Object... arguments) {
        if (LoggerFactory.getLevel() > LogConstants.WARNING) {
            return;
        }
        internatlLogger.warn(message, arguments);
    }

    public void error(String message) {
        if (LoggerFactory.getLevel() > LogConstants.ERROR) {
            return;
        }
        internatlLogger.error(message);
    }

    public void error(String message, Object... arguments) {
        if (LoggerFactory.getLevel() > LogConstants.ERROR) {
            return;
        }
        internatlLogger.error(message, arguments);
    }
}
