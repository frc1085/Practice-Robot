package org.team1085.guppy.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.team1085.bluegill.Robot;
import org.team1085.bluegill.Map;

public class ArcadeDrive extends Command {

  public ArcadeDrive () {
    requires(Robot.chassis);
  }

  protected void execute () {
    int x = Robot.dashboard.firstDriver.getX();
    int y = Robot.dashboard.firstDriver.getY();

    Robot.chassis.setLeftRaw(Math.pow(y - x, Map.INPUT_SCALE));
    Robot.chassis.setRightRaw(Math.pow(y + x, Map.INPUT_SCALE));
  }

  protected boolean isFinished () {
    return false;
  }
  
}