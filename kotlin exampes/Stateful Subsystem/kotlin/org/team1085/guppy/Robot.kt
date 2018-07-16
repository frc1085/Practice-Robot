package org.team1085.guppy

import edu.wpi.first.wpilibj.IterativeRobot
import edu.wpi.first.wpilibj.command.Scheduler
import org.team1085.guppy.subsystems.Gripper
import org.team1085.guppy.subsystems.Dashboard

class Robot : IterativeRobot () {

  companion object {
    public val chassis = Gripper()
    public val dashboard = Dashboard()
  }

  override fun robotInit () {}

  override fun autonomousInit () = Scheduler.getInstance().removeAll()
  override fun teleopInit () = Scheduler.getInstance().removeAll()

  override fun autonomousPeriodic () = Scheduler.getInstance().run()
  override fun teleopPeriodic () = Scheduler.getInstance().run()

}