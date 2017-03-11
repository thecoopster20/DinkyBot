package org.usfirst.frc3602.DinkyBot.commands;

import org.usfirst.frc3602.DinkyBot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.TimedCommand;

/**
 *
 */
public class LinearTimedToggle extends TimedCommand {

    public LinearTimedToggle(double timeout) {
        super(timeout);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(Robot.linearActuator);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	if (Robot.linearActuator.getPos() == 1.0) {
    		Robot.linearActuator.setMinLength();
    	}
    	else if (Robot.linearActuator.getPos() == 0.0) {
    		Robot.linearActuator.setMaxLength();
    	}
    	else {
    		System.out.println("Linear Actuator Not At Exact Position");
    	}
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Called once after timeout
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
