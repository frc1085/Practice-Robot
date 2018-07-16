package org.team1085.guppy.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Servo;
import org.team1085.bluegill.Map;

public class Gripper extends Subsystem {

  private Servo leftServo = new Servo(Map.LEFT_SERVO_CHANNEL);
  private Servo rightServo = new Servo(Map.RIGHT_SERVO_CHANNEL);
  private boolean isOpen = true;

  public void openGripper () {
    leftServo.set(0.0);
    rightServo.set(1.0);
    isOpen = true;
  }

  public void closeGripper () {
    leftServo.set(0.5);
    rightServo.set(0.5);
    isOpen = false;
  }

  public void toggleGripper () {
    if (isOpen) closeGripper()
    else openGripper()
  }

}