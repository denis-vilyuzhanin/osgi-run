package ipojo.example.code;

/**
 * Defines an interface for services that can run code in different programming languages.
 */
public interface CodeRunner {

    /**
     * @param script text
     * @return the value returned by the script
     */
    Object runScript(String script);

}