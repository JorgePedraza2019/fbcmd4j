/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package fbcmd4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.User;

public class App {
    private static final Logger logger = LogManager.getLogger(App.class);

    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {

        Facebook facebook = new FacebookFactory().getInstance();

        User me = null;
        try {
            me = facebook.getMe();
        } catch (FacebookException e) {
            e.printStackTrace();
        }

        logger.error(me.getId());
        logger.error(me.getName());
        logger.error(me.getEmail());

    }
}
