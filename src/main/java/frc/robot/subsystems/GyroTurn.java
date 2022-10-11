package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.Subsystem;

public class GyroTurn extends CommandBase {
    @suppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularFeild"});
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
}
@Override
public void execute(){
m_subsystem.arcadeDrive(0, 0.5);
}
public boolean isFinished(){
    System.out.println();
}
