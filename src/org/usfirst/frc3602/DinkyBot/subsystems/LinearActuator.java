package org.usfirst.frc3602.DinkyBot.subsystems;

import org.usfirst.frc3602.DinkyBot.RobotMap;

import edu.wpi.first.wpilibj.PWM;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class LinearActuator extends Subsystem {
	
	private final Servo linear = RobotMap.linear;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public LinearActuator() {
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void setMaxLength() {
    	linear.setSpeed(1.0);
    }
    
    public void setMinLength() {
    	linear.setSpeed(-1);
    }
    
    public double getPos() {
    	return linear.get();
    }
    
    public void log() {
    	SmartDashboard.putNumber("Linear Actuator Position", linear.get());
    }
}

