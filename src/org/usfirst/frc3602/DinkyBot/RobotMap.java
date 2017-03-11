// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3602.DinkyBot;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Relay;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveTrainLeftRearMotor;
    public static SpeedController driveTrainLeftFrontMotor;
    public static SpeedController driveTrainRightFrontMotor;
    public static SpeedController driveTrainRightRearMotor;
    public static RobotDrive driveTrainRobotDrive;
    public static SpeedController shooterShooterVictor;
    public static SpeedController feederFeederSpark;
    public static SpeedController pickupPickupVictor;
    public static Encoder shooterShooterEncoder;
    public static AnalogInput driveTrainGearSonar;
    public static Relay lightSwitch;
    public static Servo linear;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    


    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainLeftRearMotor = new Talon(3);
        LiveWindow.addActuator("DriveTrain", "LeftRearMotor", (Talon) driveTrainLeftRearMotor);
        
        driveTrainLeftFrontMotor = new Talon(2);
        LiveWindow.addActuator("DriveTrain", "LeftFrontMotor", (Talon) driveTrainLeftFrontMotor);
        
        driveTrainRightFrontMotor = new Talon(0);
        LiveWindow.addActuator("DriveTrain", "RightFrontMotor", (Talon) driveTrainRightFrontMotor);
        
        driveTrainRightRearMotor = new Talon(1);
        LiveWindow.addActuator("DriveTrain", "RightRearMotor", (Talon) driveTrainRightRearMotor);
        
        driveTrainRobotDrive = new RobotDrive(driveTrainLeftFrontMotor, driveTrainLeftRearMotor,
              driveTrainRightFrontMotor, driveTrainRightRearMotor);
        
        driveTrainRobotDrive.setSafetyEnabled(true);
        driveTrainRobotDrive.setExpiration(0.1);
        driveTrainRobotDrive.setSensitivity(0.5);
        driveTrainRobotDrive.setMaxOutput(1.0);

        shooterShooterVictor = new Victor(4);
        LiveWindow.addActuator("Shooter", "ShooterVictor", (Victor) shooterShooterVictor);
        
        feederFeederSpark = new Spark(6);
        LiveWindow.addActuator("Feeder", "FeederSpark", (Spark) feederFeederSpark);
        
        pickupPickupVictor = new Victor(5);
        LiveWindow.addActuator("Pickup", "PickupVictor", (Victor) pickupPickupVictor);
        
        shooterShooterEncoder = new Encoder(0, 1, false, EncodingType.k4X);
        
        driveTrainGearSonar = new AnalogInput(0);
        AnalogInput.setGlobalSampleRate(1);
        
        lightSwitch = new Relay(0, Relay.Direction.kForward);
        
        linear = new Servo(7);
        linear.setBounds(2, 0, 0, 0, 1);
        		

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
