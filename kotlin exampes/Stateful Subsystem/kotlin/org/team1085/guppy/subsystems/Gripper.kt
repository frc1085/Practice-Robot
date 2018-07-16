package org.team1085.guppy.subsystems

import edu.wpi.first.wpilibj.command.Subsystem
import edu.wpi.first.wpilibj.Servo
import org.team1085.bluegill.Map

public class Gripper : Subsystem () {

  private val leftServo = Servo(Map.LEFT_SERVO_CHANNEL)
  private val rightServo = Servo(Map.RIGHT_SERVO_CHANNEL)
  private var isOpen = true

  public fun openGripper () {
    leftServo.set(0.0)
    rightServo.set(1.0)
    isOpen = true
  }

  public fun closeGripper () {
    leftServo.set(0.5)
    rightServo.set(0.5)
    isOpen = false
  }

  public fun toggleGripper () {
    if (isOpen) closeGripper()
    else openGripper()
  }

}