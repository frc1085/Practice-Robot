#include "WPILib.h"
#include "../../include/commands/ArcadeDrive.hh"

ArcadeDrive::ArcadeDrive (Robot* robot) {
  this->robot = robot;
  Requires(robot->chassis);
}

bool ArcadeDrive::IsFinished () {
  return false;
}

void ArcadeDrive::Execute () {
  double x = this->robot->dashboard->GetFirstX();
  double y = this->robot->dashboard->GetFirstY();

  this->robot->chassis->SetLeftRaw(y - x);
  this->robot->chassis->SetRightRaw(y + x);
}

void ArcadeDrive::Interupted () {
  this->robot->chassis->SetLeftRaw(0.0);
  this->robot->chassis->SetRightRaw(0.0);
}