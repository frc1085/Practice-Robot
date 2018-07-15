package org.team1085.guppy.subsystems

import edu.wpi.first.wpilibj.command.Subsystem
import com.ctre.phoenix.motorcontrol.can.TalonSRX
import com.ctre.phoenix.motorcontrol.ControlMode
import org.team1085.bluegill.commands.ArcadeDrive
import org.team1085.bluegill.Map

public class Chassis : Subsystem () {

  private val leftMaster = TalonSRX(Map.LEFT_TALON_MASTER)
  private val leftSlaveA = TalonSRX(Map.LEFT_TALON_SLAVE_A)
  private val leftSlaveB = TalonSRX(Map.LEFT_TALON_SLAVE_B)

  private val rightMaster = TalonSRX(Map.RIGHT_TALON_MASTER)
  private val rightSlaveA = TalonSRX(Map.RIGHT_TALON_SLAVE_A)
  private val rightSlaveB = TalonSRX(Mao.RIGHT_TALON_SLAVE_B)

  init {
    leftSlaveA.follow(leftMaster)
    leftSlaveB.follow(leftMaster)

    rightSlaveA.follow(rightMaster)
    rightSlaveB.follow(rightMaster)

    leftMaster.setInverted(true)
    leftSlaveA.setInverted(true)
    leftSlaveB.setInverted(true)

    rightMaster.setInverted(false)
    rightSlaveA.setInverted(false)
    rightSlaveB.setInverted(false)
  }

  public fun setLeftRaw (rate: Double) = leftMaster.set(ControlMode.PercentOutput, rate)
  public fun setRightRaw (rate: Double) = rightMaster.set(ControlMode.PercentOutput, rate)

  public fun fullStop () {
    leftMaster.set(ControlMode.PercentOutput, 0.0)
    rightMaster.set(ControlMode.PercentOutput, 0.0)
  }

  public fun initDefaultCommand () = setDefaultCommand(ArcadeDrive())

}