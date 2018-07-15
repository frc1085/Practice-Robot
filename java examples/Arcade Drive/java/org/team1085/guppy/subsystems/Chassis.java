package org.team1085.guppy.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.ControlMode;
import org.team1085.bluegill.commands.ArcadeDrive;
import org.team1085.bluegill.Map;

public class Chassis extends Subsystem {

  private TalonSRX leftMaster = new TalonSRX(Map.LEFT_TALON_MASTER);
  private TalonSRX leftSlaveA = new TalonSRX(Map.LEFT_TALON_SLAVE_A);
  private TalonSRX leftSlaveB = new TalonSRX(Map.LEFT_TALON_SLAVE_B);

  private TalonSRX rightMaster = new TalonSRX(Map.RIGHT_TALON_MASTER);
  private TalonSRX rightSlaveA = new TalonSRX(Map.RIGHT_TALON_SLAVE_A);
  private TalonSRX rightSlaveB = new TalonSRX(Mao.RIGHT_TALON_SLAVE_B);

  public Chassis () {
    leftSlaveA.follow(leftMaster);
    leftSlaveB.follow(leftMaster);

    rightSlaveA.follow(rightMaster);
    rightSlaveB.follow(rightMaster);

    leftMaster.setInverted(true);
    leftSlaveA.setInverted(true);
    leftSlaveB.setInverted(true);

    rightMaster.setInverted(false);
    rightSlaveA.setInverted(false);
    rightSlaveB.setInverted(false);
  }

  public void setLeftRaw (double rate) { leftMaster.set(ControlMode.PercentOutput, rate); }
  public void setRightRaw (double rate) { rightMaster.set(ControlMode.PercentOutput, rate); }

  public void fullStop () {
    leftMaster.set(ControlMode.PercentOutput, 0.0);
    rightMaster.set(ControlMode.PercentOutput, 0.0);
  }

  public void initDefaultCommand () {
    setDefaultCommand(new ArcadeDrive());
  }

}