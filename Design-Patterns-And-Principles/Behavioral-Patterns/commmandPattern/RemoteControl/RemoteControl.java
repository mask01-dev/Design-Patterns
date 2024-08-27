package commmandPattern.RemoteControl;

import java.util.Stack;

public class RemoteControl {
	private Command currentCommand;
	private Stack<Command> commandHistory = new Stack<>();
	private Stack<Command> redoStack = new Stack<>();

	public void setCommand(Command command) {
		this.currentCommand = command;
	}

	public void pressButton() {
		currentCommand.execute();
		commandHistory.push(currentCommand);
		redoStack.clear(); // Clear redo stack since new command is executed
	}

	public void pressUndoButton() {
		if (!commandHistory.isEmpty()) {
			Command lastCommand = commandHistory.pop();
			lastCommand.undo();
			redoStack.push(lastCommand);
		}
	}

	public void pressRedoButton() {
		if (!redoStack.isEmpty()) {
			Command commandToRedo = redoStack.pop();
			commandToRedo.execute();
			commandHistory.push(commandToRedo);
		}
	}
}
