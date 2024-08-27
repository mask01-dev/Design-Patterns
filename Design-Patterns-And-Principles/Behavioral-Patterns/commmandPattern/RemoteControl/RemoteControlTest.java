package commmandPattern.RemoteControl;

public class RemoteControlTest {
	public static void main(String[] args) {
		Light livingRoomLight = new Light();

		Command lightOn = new LightOnCommand(livingRoomLight);
		Command lightOff = new LightOffCommand(livingRoomLight);

		RemoteControl remote = new RemoteControl();

		// Turn the light on
		remote.setCommand(lightOn);
		remote.pressButton(); // Output: Light is ON

		// Turn the light off
		remote.setCommand(lightOff);
		remote.pressButton(); // Output: Light is OFF

		// Undo the last command (turn the light back on)
		remote.pressUndoButton(); // Output: Light is ON

		// Redo the last undone command (turn the light back off)
		remote.pressRedoButton(); // Output: Light is OFF
	}
}
