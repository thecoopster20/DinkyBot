package org.usfirst.frc3602.DinkyBot.subsystems;

import org.usfirst.frc3602.DinkyBot.RobotMap;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Shooter extends Subsystem {
	
	private final SpeedController ShooterVictor = RobotMap.shooterShooterVictor;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void fireShooter(double shooterSpeed) {
    	ShooterVictor.set(shooterSpeed);
    }
    
    public void stopShooter() {
    	ShooterVictor.stopMotor();
    }
 
}

