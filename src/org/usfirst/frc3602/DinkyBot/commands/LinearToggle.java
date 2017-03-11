package org.usfirst.frc3602.DinkyBot.commands;

import org.usfirst.frc3602.DinkyBot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class LinearToggle extends Command {
	
	private boolean goingMin = false;
	private boolean goingMax = false;

    public LinearToggle() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.linearActuator);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	if (Robot.linearActuator.getPos() == 1.0) {
    		Robot.linearActuator.setMinLength();
    		Timer.delay(2);
    		goingMin = true;
    	}
    	else if (Robot.linearActuator.getPos() == 0.0) {
    		Robot.linearActuator.setMaxLength();
    		Timer.delay(2);
    		goingMax = true;
    	}
    	else {
    		System.out.println("Linear Actuator Not At Exact Position");
    	}
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        if(goingMax || goingMin == true) {
        	return true;
        }
        else {
        	return false;
        }
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
