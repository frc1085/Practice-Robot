package org.team1085.guppy.commands

import edu.wpi.first.wpilibj.command.Command
import org.team1085.bluegill.Robot

class CloseGripper : Command () {

  init { requires(Robot.gripper) }

  override fun isFinished () = true
  override fun execute () = Robot.gripper.closeGripper()
  
}