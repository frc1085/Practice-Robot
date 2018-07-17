#include "WPILib.h"

class Robot;

class Dashboard : public frc::Dashboard {
 public:
  double GetFirstX () const;
  double GetFirstY () const;

  Dashboard (Robot*);
  ~Dashboard ();

 private:
  frc::Joystick* firstDriver;
  frc::Joystick* secondDriver;

  Robot* robot;
};