package org.team1085.guppy;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import org.team1085.guppy.subsystems.Gripper;
import org.team1085.guppy.subsystems.Dashboard;

public class Robot extends IterativeRobot {

  public static Gripper gripper = new Gripper();
  public static Dashboard dashboard = new Dashboard();

  public void robotInit () {}

  public void autonomousInit () { Scheduler.getInstance().removeAll(); }
  public void teleopInit () { Scheduler.getInstance().removeAll(); }

  public void autonomousPeriodic () { Scheduler.getInstance().run(); }
  public void teleopPeriodic () { Scheduler.getInstance().run(); }

}