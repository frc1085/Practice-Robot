from wpilib.command import Command

class ArcadeDrive (Command):

  def __init__ (self, robot):
    self.robot = robot
    self.requires(robot.chassis)
  
  def initialize ():
    pass
  
  def execute (self):
    x = self.robot.dashboard.firstDriver.getX()
    y = self.robot.dashboard.firstDriver.getY()

    self.robot.chassis.setLeftRaw(y - x)
    self.robot.chassis.setRightRaw(y + x)
  
  def isFinished ():
    return False