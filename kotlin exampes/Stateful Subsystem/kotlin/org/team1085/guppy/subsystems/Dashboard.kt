package org.team1085.guppy.subsystems

import edu.wpi.first.wpilibj.command.Subsystem
import edu.wpi.firts.wpilibj.buttons.JoystickButton
import edu.wpi.first.wpilibj.Joystick
import org.team1085.guppy.Map

public class Dashboard : Subsystem () {

  public val firstDriver = Joystick(Map.FIRST_DRIVER_PORT)

  init {
    JoystickButton(firstDriver, 3).whenPressed(OpenGriper())
    JoystickButton(firstDriver, 4).whenPressed(CloseGriper())
    JoystickButton(firstDriver, 1).whenPressed(ToggleGripper())
  }

}