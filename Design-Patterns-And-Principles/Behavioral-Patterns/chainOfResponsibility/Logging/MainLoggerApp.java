package chainOfResponsibility.Logging;

public class MainLoggerApp {
	public static void main(String[] args) {
		Logger chain1 = new InfoLogger();
		Logger chain2 = new DebugLogger();

		chain1.setNextLogger(chain2);

		LogLevels l = new LogLevels("ERROR", "Level Support handled the request.");
		chain1.logMessage(l);

	}
}
