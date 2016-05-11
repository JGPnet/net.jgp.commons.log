package net.jgp.commons.log;

import org.slf4j.helpers.FormattingTuple;
import org.slf4j.helpers.MessageFormatter;

public class LogUtils {

    public static String formatMessage(String message, Object[] additionalInfo) {
        FormattingTuple ft;

        ft = MessageFormatter.arrayFormat(message, additionalInfo);

        return ft.getMessage();
    }

}
