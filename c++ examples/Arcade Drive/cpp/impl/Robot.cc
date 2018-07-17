#include "WPILib.h"
#include "../include/Robot.hh"
#include "subsystems/Chassis.cc"
#include "subsystems/Dashboard.cc"

void Robot::RobotInit () {
  this->chassis = new Chassis();
  this->dashbaord = new Dashbaord();
}