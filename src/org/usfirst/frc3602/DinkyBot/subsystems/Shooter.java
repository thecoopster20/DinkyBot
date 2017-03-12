package org.usfirst.frc3602.DinkyBot.subsystems;

import org.usfirst.frc3602.DinkyBot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Shooter extends Subsystem {
	
	private final SpeedController feeder = RobotMap.shooterFeederVictor;
	private final CANTalon shooter = RobotMap.shooterMotor;
	
	private static final double shooterWheelDiameter = 7;
	private static final double pi = Math.PI;
	private static final double pulsesPerRevolution = 360;
	private static final double shooterGearRatio = 1;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public Shooter() {
		super();
		final double pulseDistance = pi * shooterWheelDiameter / pulsesPerRevolution / shooterGearRatio;
		
		
		
	}
	
	public void log() {
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void fireShooter(double shooterSpeed) {
    	shooter.set(shooterSpeed);
    }
    
    public void runFeeder() {
    	feeder.set(-.75);
    }
    
    public void stopFeeder() {
    	feeder.set(0);
    }
    
    public void stopShooter() {
    	shooter.set(0);
    }
    
    public void reset() {
    }
 
}

