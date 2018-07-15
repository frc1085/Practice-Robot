package org.team1085.guppy.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Joystick;
import org.team1085.guppy.Map;

public class Dashboard extends Subsystem {

  public Joystick firstDriver = new Joystick(Map.FIRST_DRIVER_PORT);

}