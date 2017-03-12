package org.usfirst.frc3602.DinkyBot.commands;

import org.usfirst.frc3602.DinkyBot.VisionAngleCalculator;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.networktables.NetworkTable;

/**
 *
 */
public class VisionTurn extends CommandGroup {
	
	private VisionAngleCalculator visionAngle;
	private double calculatedAngle = 0;

    public VisionTurn() {
    	visionAngle = new VisionAngleCalculator();
    	calculatedAngle = visionAngle.getHorizontalAngle();
        addSequential(new Turn(calculatedAngle));
        //addSequential(new DriveForTime(5, 0.5));
        //addSequential(new DriveForTime(5, -0.5));
        //addSequential(new Turn(-calculatedAngle));
    }
}
