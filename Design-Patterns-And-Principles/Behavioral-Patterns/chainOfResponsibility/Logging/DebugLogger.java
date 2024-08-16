package chainOfResponsibility.Logging;

public class DebugLogger implements Logger {
	private Logger nextLogger;

	@Override
	public void setNextLogger(Logger nextLogger) {
		this.nextLogger = nextLogger;

	}

	@Override
	public void logMessage(LogLevels request) {
		if (request.getLogLevel().equals("DEBUG")) {
			System.out.println("DEBUG Logger: " + request.getMessage());
		} else {
			System.out.println("Only INFO, DEBUG is supported");
			//nextLogger.logMessage(request);
		}

	}

}
