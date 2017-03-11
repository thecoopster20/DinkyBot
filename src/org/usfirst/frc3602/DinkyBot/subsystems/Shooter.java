package org.usfirst.frc3602.DinkyBot.subsystems;

import org.usfirst.frc3602.DinkyBot.RobotMap;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Shooter extends Subsystem {
	
	private final SpeedController ShooterVictor = RobotMap.shooterShooterVictor;
	private final SpeedController ShooterFeeder = RobotMap.pickupPickupVictor;
	private final Encoder ShooterEncoder = RobotMap.shooterShooterEncoder;
	
	private static final double shooterWheelDiameter = 7;
	private static final double pi = Math.PI;
	private static final double pulsesPerRevolution = 360;
	private static final double shooterGearRatio = 1;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public Shooter() {
		super();
		
		final double pulseDistance = pi * shooterWheelDiameter / pulsesPerRevolution / shooterGearRatio;
		ShooterEncoder.setDistancePerPulse(pulseDistance);
		
		LiveWindow.addSensor("Shooter", "Shooter Encoder" , ShooterEncoder);
		
		
	}
	
	public void log() {
		SmartDashboard.putNumber("Shooter Speed", ShooterEncoder.getRate());
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void fireShooter(double shooterSpeed) {
    	ShooterVictor.set(shooterSpeed);
    	ShooterFeeder.set(1);
    }
    
    public void stopShooter() {
    	ShooterVictor.stopMotor();
    	ShooterFeeder.stopMotor();
    }
    
    public void reset() {
    	ShooterEncoder.reset();
    }
 
}

