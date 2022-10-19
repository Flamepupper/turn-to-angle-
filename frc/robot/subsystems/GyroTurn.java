package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.CommandBase;
//import edu.wpi.first.wpilibj2.command.Subsystem;
//import frc.robot.commands.suppressWarnings;

public class GyroTurn extends CommandBase {
   @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularFeild"})
    private final DriveSubsystem m_subsystem;
     double targetAngle = 90;

    //@param Subsystem
    public GyroTurn(DriveSubsystem subsystem){
        m_subsystem = subsystem;

        addRequirements(subsystem);
    }

    @Override
public void initialize(){
m_subsystem.zeroHeading();
}
@Override
public void execute(){

double angle = 90;
double speed = angle / 180;

if (angle > 180){
    angle = angle * -1;
}
if (speed < 0.25 && speed != 0){
speed = 0.25;
}
m_subsystem.arcadeDrive(0, speed);

}
public boolean isFinished(){
    return (m_subsystem.getHeading() >= 90 -2 && m_subsystem.getHeading() <= 90 + 2);
}
}