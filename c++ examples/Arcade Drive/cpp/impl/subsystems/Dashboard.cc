#include "WPILib.h"
#include "../../include/subsystems/Dashboard.hh"

Chassis::Chassis () {
  this->firstDriver = new frc::Joystick(0);
  this->secondDriver = new frc::Joystick(1);
}

double Chassis::GetFirstX () const {
  return this->firstDriver->GetX();
}

double Chassis::GetFirstY () const {
  return this->firstDriver->GetY();
}