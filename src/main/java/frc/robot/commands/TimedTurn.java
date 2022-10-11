package frc.robot.commands;

//import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.CommandBase;
//import edu.wpi.first.wpilibj2.command.Subsystem;
//import edu.wpi.first.wpilibj2.command.PIDCommand;
import frc.robot.subsystems.DriveSubsystem;

public class TimedTurn extends CommandBase{
    @SuppressWarnings({"PWS.UnusedPrivateFeild", "PDM.SingularField"})
    private final DriveSubsystem m_Subsystem;
    private long timeStart = 0;
    private long duration = 5000;

    //@param subsystem
    public TimedTurn(DriveSubsystem subsystem, long angle){
        //PIDController edu.wpi000..first.wpilibj2.command.PIDCommand.getController();
        m_Subsystem = subsystem;
        addRequirements(subsystem);
        // getController().enableContinuousInput(-180, 180);

        duration = (angle * (200/9));
        //708cm x 540cm table
        //67.625 cm/s
        //708/67.625 x 540/67.625 table
    }

    @Override
    public void initialize(){

        m_Subsystem.arcadeDrive(0, 0.5);
        timeStart= System.currentTimeMillis();
        //possibly do a negitive left turn to engadge other wheels

    }

    public void Turn(Long angle){

  
    }

    @Override
    public void execute(){
    
    
    
    }

    public boolean isFinished(){

        return System.currentTimeMillis() - timeStart >= duration;

    }

    public void end(){

        m_Subsystem.arcadeDrive(0, 0);

    }
}
    
