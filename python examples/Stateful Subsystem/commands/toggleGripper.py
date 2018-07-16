from wpilib.command import Command

class CloseGripper (Command):

  def __init__ (self, robot):
    self.robot = robot
    self.requires(robot.gripper)

  def execute (self):
    self.robot.gripper.toggle()
  
  def isFinished ():
    return True