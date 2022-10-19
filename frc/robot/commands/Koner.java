package frc.robot.commands;


import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.DriveSubsystem;


public class Koner extends SequentialCommandGroup{
    public Koner(DriveSubsystem drive){
//708cm x 540cm wall to wall table
//67.625 cm/s
//708/67.625 x 540/67.625 table
int degrees = 90;
int lenth = 705;
int width = 540;
addCommands(
        new TimedStraight( drive, lenth),
        new TimedTurn(drive, degrees),
        new TimedStraight(drive, width),
        new TimedTurn(drive, degrees),
        new TimedStraight( drive, lenth),
        new TimedTurn(drive, degrees),
        new TimedStraight(drive, width)
);
    }
}
