from wpilib import Joystick
from wpilib.command import Subsystem
from wpilib.buttons import JoystickButton

class Dashboard (Subsystem):

  def __init__ (self, robot):
    self.driver = Joystick(0)

    JoystickButton(self.driver, 3).whenPressed(OpenGripper(robot))
    JoystickButton(self.driver, 4).whenPressed(CloseGripper(robot))
    JoystickButton(self.driver, 1).whenPressed(ToggleGripper(robot))

