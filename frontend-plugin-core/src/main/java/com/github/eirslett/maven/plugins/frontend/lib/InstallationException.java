package com.github.eirslett.maven.plugins.frontend.lib;

public final class InstallationException extends Exception {
    InstallationException(String message){
        super(message);
    }
    InstallationException(String message, Throwable cause){
        super(message, cause);
    }
}
