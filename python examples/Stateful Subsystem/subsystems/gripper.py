from wpilib.command import Subsystem
from wpilib import Servo

class Gripper (Subsystem):

  def __init__ (self, robot):
    self.robot = robot
    self.isOpen = True

    self.left_servo = Servo(3)
    self.right_servo = Servo(4)

  def open (self):
    self.left_servo.set(0.0)
    self.right_servo.set(1.0)

  def close (self):
    self.left_servo.set(0.5)
    self.right_servo.set(0.5)

  def toggle (self):
    (self.close, self.open)[self.isOpen]()

  