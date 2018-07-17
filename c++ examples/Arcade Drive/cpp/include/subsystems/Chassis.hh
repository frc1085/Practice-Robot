#include "WPILin.h"

class Chassis : public frc::Subsystem {
 public:
  void SetLeftRaw (double) const;
  void SetRightRaw (double) const;

  Chassis ();
  ~Chassis ();

 private:
  frc::Spark* leftMaster;
  frc::Spark* leftSlaveA;
  frc::Spark* leftSlaveB;

  frc::Spark* rightMaster;
  frc::Spark* rightSlaveA;
  frc::Spark* rightSlaveB;
};