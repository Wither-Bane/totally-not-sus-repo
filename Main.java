import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;
class Main {
  private static final Logger logger =
    LogManager.getLogger("HelloWorld");
  public static void main(String[] args) {
    ThreadContext.put("myContext", "${env:HOME}");
    logger.error("Hello world");
    // log4j2.xml is configured to print the value of
    // myContext to the log
  }
}