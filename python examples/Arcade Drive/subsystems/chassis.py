from wpilib.command import Subsystem
from ctre import WPI_TalonSRX
from commands.arcadeDrive import ArcadeDrive

class Chassis (wpilib.command.Subsystem):

  def __init__ (self, robot):
    self.robot = robot

    self.leftMaster = WPI_TalonSRX(50)
    self.leftSlaveA = WPI_TalonSRX(51)
    self.leftSlaveB = WPI_TalonSRX(52)

    self.rightMaster = WPI_TalonSRX(40)
    self.rightSlaveA = WPI_TalonSRX(41)
    self.rightSlaveB = WPI_TalonSRX(42)

    self.leftMaster.setInverted(True)
    self.leftSlaveA.setInverted(True)
    self.leftSlaveB.setInverted(True)

    self.rightMaster.setInverted(False)
    self.rightSlaveA.setInverted(False)
    self.rightSlaveB.setInverted(False)

    self.leftSlaveA.follow(self.leftMaster)
    self.leftSlaveB.follow(self.leftMaster)

    self.rightSlaveA.follow(self.rightMaster)
    self.rightSlaveB.follow(self.rightMaster)

  def setLeftRaw (rate):
    self.leftMaster.set(rate)

  def setRightRaw (rate):
    self.rightMaster.set(rate)

  def fullStop ():
    self.leftMaster.set(0.0)
    self.rightMaster.set(0.0)

  def initDefaultCommand ():
    self.setDefaultCommand(ArcadeDrive(self.robot))
