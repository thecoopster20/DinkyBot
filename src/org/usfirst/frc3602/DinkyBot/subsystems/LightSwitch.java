package org.usfirst.frc3602.DinkyBot.subsystems;

import org.usfirst.frc3602.DinkyBot.RobotMap;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class LightSwitch extends Subsystem {
	
	public final Relay lSwitch = RobotMap.lightSwitch;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public LightSwitch() {
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void lightOn() {
    	lSwitch.set(Relay.Value.kOn);
    }
    
    public void lightOff() {
    	lSwitch.set(Relay.Value.kOff);
    }
    
    public boolean isSwitchOn() {
    	if (lSwitch.get() == Relay.Value.kOn) {
    		return true;
    	}
    	else {
    		return false;
    	}
    		
    }
    
}

