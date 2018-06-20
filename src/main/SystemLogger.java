package main;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.*;

public class SystemLogger extends Logger {
    private boolean debugMode; //if true exception messages and stack traces will be also displayed in console output

    public SystemLogger(String filename, boolean append, boolean debugMode) {
        super("System Logger", null);
        this.debugMode = debugMode;
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

    public SystemLogger(String filename, boolean append) {
        this(filename, append, false); //redirection to ctor SystemLogger(String filename, boolean append, boolean debugMode)
    }


    public void setDebugModeEnabled(boolean debugMode) {
        this.debugMode = debugMode;
    }


    public static String stackTraceToString(Throwable t){
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        t.printStackTrace(pw);
        String sStackTrace = sw.toString(); // stack trace as a string
        return sw.toString();
    }

    private void printIfDebugMode(String s){
        if (debugMode)
            System.out.println(s);
    }

    public void log(Throwable t){
        log(Level.SEVERE, stackTraceToString(t));
    }


    public void log(Level level, Throwable t){
        String stackTrace = stackTraceToString(t);
        log(level, stackTrace);
        printIfDebugMode(stackTrace);
    }

}
