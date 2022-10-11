package frc.robot.commands;

//import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.CommandBase;
//import edu.wpi.first.wpilibj2.command.Subsystem;
//import edu.wpi.first.wpilibj2.command.PIDCommand;
import frc.robot.subsystems.DriveSubsystem;

public class TimedStraight extends CommandBase{
    @SuppressWarnings({"PWS.UnusedPrivateFeild", "PDM.SingularField"})
    private final DriveSubsystem m_Subsystem;
    private long timeStart = 0;
    private long duration = 5000;

    //@param subsystem


    public TimedStraight(DriveSubsystem subsystem, long cm){
        //PIDController edu.wpi000..first.wpilibj2.command.PIDCommand.getController();
        m_Subsystem = subsystem;
        addRequirements(subsystem);
        // getController().enableContinuousInput(-180, 180);
        cm = 704;
        double speed = 0.067625;
        duration = (long) (cm / speed);
        //704cm x 540cm table
        //0.067625 cm/ms
        //708/67.625 x 540/67.625 table
    }

    @Override
    public void initialize(){

      
        timeStart= System.currentTimeMillis();

    }

    public void Turn(Long angle){

  
    }

    @Override
    public void execute(){
    
        m_Subsystem.arcadeDrive(0.5, 0);
    
    }

    public boolean isFinished(){

        return System.currentTimeMillis() - timeStart >= duration;

    }

    public void end(){

        m_Subsystem.arcadeDrive(0, 0);

    }
}
    
