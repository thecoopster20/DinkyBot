package org.usfirst.frc3602.DinkyBot.subsystems;

import org.usfirst.frc3602.DinkyBot.RobotMap;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Pickup extends Subsystem {
	
	private final SpeedController PickupVictor = RobotMap.pickupPickupVictor;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void runPickupIn(double inSpeed) {
    	PickupVictor.set(inSpeed);
    }
    
    public void runPickupOut(double outSpeed) {
    	PickupVictor.set(outSpeed);
    }
    
    public void stopPickup() {
    	PickupVictor.stopMotor();
    }
}

