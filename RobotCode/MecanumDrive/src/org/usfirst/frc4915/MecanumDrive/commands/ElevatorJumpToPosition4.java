package org.usfirst.frc4915.MecanumDrive.commands;

import org.usfirst.frc4915.MecanumDrive.RobotMap;
import org.usfirst.frc4915.MecanumDrive.subsystems.Elevator;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ElevatorJumpToPosition4 extends Command {
	
	Elevator elevator = RobotMap.elevator;

    public ElevatorJumpToPosition4() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(elevator);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	System.out.println("Moving elevator to position 4");
    	elevator.moveToPosition(4);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return (elevator.isInPosition(4));
    }

    // Called once after isFinished returns true
    protected void end() {
    	System.out.println("Elevator is in position 4");
    	elevator.stopElevator();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}