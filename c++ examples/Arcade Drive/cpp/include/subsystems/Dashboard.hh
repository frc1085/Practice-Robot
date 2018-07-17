#include "WPILib.h"

class Dashboard : public frc::Dashboard {
 public:
  Dashboard ();
  ~Dashboard ();

 private:
  frc::Joystick* firstDriver;
  frc::Joystick* secondDriver;
};