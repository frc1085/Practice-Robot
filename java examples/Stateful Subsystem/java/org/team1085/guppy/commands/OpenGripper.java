package org.team1085.guppy.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.team1085.bluegill.Robot;
import org.team1085.bluegill.Map;

public class OpenGripper extends Command {

  public ArcadeDrive () { requires(Robot.gripper); }
  protected void execute () { Robot.gripper.openGripper(); }
  protected boolean isFinished () { return true; }
  
}