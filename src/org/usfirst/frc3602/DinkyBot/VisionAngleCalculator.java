package org.usfirst.frc3602.DinkyBot;

import edu.wpi.first.wpilibj.networktables.NetworkTable;

public class VisionAngleCalculator {

	private final double fieldOfView = 53;
	private final double cameraWidth = 360;
	private final double focalLength = cameraWidth / (2*Math.tan(fieldOfView));
	private final double imageCenterX = 160;
	
	private double targetCenterX;
	private double angle;
	public VisionAngleCalculator() {
		targetCenterX = 0;
	}
	
	public double getHorizontalAngle() {
		targetCenterX = NetworkTable.getTable("GRIP").getNumber("centerX", 0);
		angle = (Math.atan((targetCenterX - imageCenterX) / focalLength)) * (180/Math.PI);		
		return angle;		
	}

}
