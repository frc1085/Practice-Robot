from wpilib.command import Subsystem
from wpilib import Joystick

class Dashboard (Subsystem):

  def __init__ (self, robot):
    self.robot = robot
    self.firstDriver = Joystick(0)