package chainOfResponsibility.Logging;

public interface Logger {

	void setNextLogger(Logger nextLogger);

	void logMessage(LogLevels message);
}