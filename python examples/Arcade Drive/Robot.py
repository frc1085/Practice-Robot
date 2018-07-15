import wpilib

from wpilib.command import Scheduler
from subsystems.chassis import Chassis
from subsystems.dashboard import Dashboard

class Guppy (wpilib.IterativeRobot):

  def robotInit (self):
    self.chassis = Chassis(self)
    self.dashboard = Dashboard(self)

  def teleopInit ():
    Scheduler.getInstance.removeAll()
  
  def autonomousInit ():
    Scheduler.getInstance.removeAll()
  
  def autonomousPeriodic ():
    Scheduler.getInstance().run()
  
  def teleopPeriodic ():
    Scheduler.getInstance().run()

if __name__ == '__main__':
  wpilib.run(Guppy)

