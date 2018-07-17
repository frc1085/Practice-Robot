#include "WPILib.h"
#include "../../include/subsystems/Dashboard.hh"

Chassis::Chassis () {
  this->firstDriver = new frc::Joystick(0);
  this->secondDriver = new frc::Joystick(1);
}