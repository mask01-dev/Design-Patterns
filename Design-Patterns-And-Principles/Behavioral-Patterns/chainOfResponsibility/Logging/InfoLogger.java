package chainOfResponsibility.Logging;

public class InfoLogger implements Logger {
	private Logger nextLogger;

	@Override
	public void setNextLogger(Logger nextLogger) {
		this.nextLogger = nextLogger;

	}

	@Override
	public void logMessage(LogLevels request) {
		if (request.getLogLevel().equals("INFO")) {
			System.out.println("INFO Logger: " + request.getMessage());
		} else {
			nextLogger.logMessage(request);
		}

	}

}
