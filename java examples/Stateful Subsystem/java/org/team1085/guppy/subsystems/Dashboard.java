package org.team1085.guppy.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.buttons.JoysticButton;
import edu.wpi.first.wpilibj.Joystick;
import org.team1085.guppy.commands.ToggleGripper;
import org.team1085.guppy.commands.OpenGripper;
import org.team1085.guppy.commands.CloseGripper;
import org.team1085.guppy.Map;

public class Dashboard extends Subsystem {

  public Joystick driver = new Joystick(Map.FIRST_DRIVER_PORT);

  public Dashboard () {
    new JoysticButton(driver, Map.TRIGGER).whenPressed(new ToggleGripper());
    new JoysticButton(driver, Map.OPEN_GRIPPER).whenPressed(new OpenGripper());
    new JoysticButton(driver, Map.CLOSE_GRIPPER).whenPressed(new CloseGripper());
  }

}