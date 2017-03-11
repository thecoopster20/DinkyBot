package org.usfirst.frc3602.DinkyBot.commands;

import org.usfirst.frc3602.DinkyBot.Robot;
import org.usfirst.frc3602.DinkyBot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class driveWithJoystick extends Command {

    public driveWithJoystick() {
        requires(Robot.driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.driveTrain.manualDrive(Robot.oi.getGamepad());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.driveTrain.setDrive(0, 0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.driveTrain.setDrive(0, 0);
    }
}
