from wpilib.command import Command

class OpenGripper (Command):

  def __init__ (self, robot):
    self.robot = robot
    self.requires(robot.gripper)

  def execute (self):
    self.robot.gripper.open()
  
  def isFinished ():
    return True