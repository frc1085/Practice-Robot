package org.team1085.guppy.subsystems

import edu.wpi.first.wpilibj.command.Subsystem
import edu.wpi.firts.wpilibj.buttons.JoystickButton
import edu.wpi.first.wpilibj.Joystick
import org.team1085.guppy.Map

public class Dashboard : Subsystem () {

  public val firstDriver = Joystick(Map.FIRST_DRIVER_PORT)

  init {
    JoystickButton(firstDriver, Map.OPEN_BTN).whenPressed(OpenGriper())
    JoystickButton(firstDriver, Map.CLOSE_BTN).whenPressed(CloseGriper())
    JoystickButton(firstDriver, Map.TRIGGER).whenPressed(ToggleGripper())
  }

}