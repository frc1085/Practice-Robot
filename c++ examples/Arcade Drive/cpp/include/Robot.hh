#include "WPILib.h"

class Chassis;
class Dashboard;

class Robot : frc::IterativeRobot {
 public:
  void RobotInit ();
  void DisabledInit ();
  void AutonomousInit ();
  void TeleopInit ();
  void TestInit ();

  void DisabledPeriodic ();
  void AutonomousPeriodic ();
  void TeleopPeriodic ();
  void TestPeriodic ();

  Robot ();
  ~Robot ();

  Chassis* chassis;
  Dashboard* dashbaord;
};