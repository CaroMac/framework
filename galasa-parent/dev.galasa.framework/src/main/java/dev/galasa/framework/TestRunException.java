/*
 * Licensed Materials - Property of IBM
 * 
 * (c) Copyright IBM Corp. 2019.
 */
package dev.galasa.framework;

/**
 * @see java.lang.Exception
 */
public class TestRunException extends Exception {

    private static final long serialVersionUID = 1L;

    /**
     * @see java.lang.Exception#Exception()
     */
    public TestRunException() {
        super();
    }

    /**
     * @see java.lang.Exception#Exception(String)
     */
    public TestRunException(String message) {
        super(message);
    }

    /**
     * @see java.lang.Exception#Exception(Throwable)
     */
    public TestRunException(Throwable cause) {
        super(cause);
    }

    /**
     * @see java.lang.Exception#Exception(String, Throwable)
     */
    public TestRunException(String message, Throwable cause) {
        super(message, cause);
    }

}
