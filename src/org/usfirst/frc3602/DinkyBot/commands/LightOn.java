package org.usfirst.frc3602.DinkyBot.commands;

import org.usfirst.frc3602.DinkyBot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class LightOn extends Command {

    public LightOn() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.lightSwitch);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.lightSwitch.lightOn();
    	Timer.delay(.1);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.lightSwitch.lightOn();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.lightSwitch.lightOff();
    }
}
