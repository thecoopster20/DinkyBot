package org.usfirst.frc3602.DinkyBot.subsystems;

import org.usfirst.frc3602.DinkyBot.RobotMap;
import org.usfirst.frc3602.DinkyBot.commands.FeedIn;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Feeder extends Subsystem {
	
	private final SpeedController FeederSpark = RobotMap.feederFeederSpark;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void runFeeder(double feederSpeed, boolean invertFeederDirection) {
    	if (invertFeederDirection == false) {
    		FeederSpark.set(feederSpeed);
    	}
    	else {
    		FeederSpark.set(-feederSpeed);
    	}
    	
    }
    
    public void stopFeeder() {
    	FeederSpark.stopMotor();
    }
}

