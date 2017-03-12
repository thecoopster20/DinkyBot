package org.usfirst.frc3602.DinkyBot.commands;

import org.usfirst.frc3602.DinkyBot.Robot;

import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.PIDSource;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.command.TimedCommand;

/**
 *
 */
public class DriveForTime extends TimedCommand {
	
	private double speed;
	private double pidTurnValue;
	private PIDController pidTurn;
	private final double kPTurn = .1;
	private final double kITurn = 0;
	private final double kDTurn = 0;

    public DriveForTime(double timeout, double speed) {
        super(timeout);
        this.speed = speed;
        requires(Robot.driveTrain);
        
        pidTurn = new PIDController(kPTurn, kITurn, kDTurn, new PIDSource() {
			PIDSourceType m_sourceType = PIDSourceType.kDisplacement;

			@Override
			public double pidGet() {
				return Robot.driveTrain.getGyroAngle();
			}

			@Override
			public void setPIDSourceType(PIDSourceType pidSource) {
				m_sourceType = pidSource;
			}

			@Override
			public PIDSourceType getPIDSourceType() {
				return m_sourceType;
			}
		}, new PIDOutput() {
			@Override
			public void pidWrite(double t) {
				pidTurnValue = t;
			}
		});
		pidTurn.setAbsoluteTolerance(0.1);
		pidTurn.setSetpoint(0);
		pidTurn.setOutputRange(-0.75, 0.75);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	pidTurn.reset();
    	Robot.driveTrain.reset();
    	pidTurn.enable();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.driveTrain.manualArcade(speed, -pidTurnValue);
    }

    // Called once after timeout
    protected void end() {
    	pidTurn.disable();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
