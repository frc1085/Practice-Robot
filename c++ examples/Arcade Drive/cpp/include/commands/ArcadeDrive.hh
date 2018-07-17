#include "WPILib.h"

class Robot;

class ArcadeDrive : public frc::CommandBase {
 public:
  void Initilize ();
  void Execute ();
  bool IsFinished ();
  void End ();
  void Interupted ();

  ArcadeDrive (Robot*);
  ~ArcadeDrive ();

 private:
  Robot* robot;
};