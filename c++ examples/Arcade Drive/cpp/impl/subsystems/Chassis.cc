#include "WPILib.h"
#include "../../include/subsystems/Chassis.hh"
#include "../commands/ArcadeDrive.cc"

Chassis::Chassis (Robot* robot) {
  this->leftMaster = new frc::Spark(1);
  this->leftSlaveA = new frc::Spark(2);
  this->leftSlaveB = new frc::Spark(3);

  this->rightMaster = new frc::Spark(4);
  this->rightSlaveA = new frc::Spark(5);
  this->rightSlaveB = new frc::Spark(6);

  this->robot = robot;
}

void Chassis::SetLeftRaw (double rate) const {
  this->leftMaster->Set(rate);
  this->leftSlaveA->Set(rate);
  this->leftSlaveB->Set(rate);
}

void Chassis::SetRightRaw (double rate) const {
  this->rightMaster->Set(rate);
  this->rightSlaveA->Set(rate);
  this->rightSlaveB->Set(rate);
}

void Chassis::InitDefaultCommand () {
  SetDefaultCommand(new ArcadeDrive(this->robot));
}