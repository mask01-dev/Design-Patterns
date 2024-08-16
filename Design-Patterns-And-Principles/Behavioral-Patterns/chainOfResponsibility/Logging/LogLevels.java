package chainOfResponsibility.Logging;

public class LogLevels {

	private String logLevelWanted;
	private String message;

	public LogLevels(String logLevelWanted, String message) {
		this.logLevelWanted = logLevelWanted;
		this.message = message;
	}

	public String getLogLevel() {
		return logLevelWanted;
	}

	public String getMessage() {
		return message;
	}
}
