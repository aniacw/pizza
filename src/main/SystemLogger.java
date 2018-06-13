package main;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.*;

public class SystemLogger extends Logger {
    public SystemLogger(String filename, boolean append) {
        super("System Logger", null);
        Formatter formatter = new SimpleFormatter();
        try {
            Handler handler = new FileHandler(filename, append);
            handler.setFormatter(formatter);
            setUseParentHandlers(false);
            addHandler(handler);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String stackTraceToString(Throwable t){
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        t.printStackTrace(pw);
        String sStackTrace = sw.toString(); // stack trace as a string
        return sw.toString();
    }

    public void log(Throwable t){
        log(Level.SEVERE, stackTraceToString(t));
    }

    public void log(Level level, Throwable t){
        log(level, stackTraceToString(t));
    }

}
