// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4909.PTCAgileBot;

import org.usfirst.frc4909.PTCAgileBot.commands.*;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;

import org.usfirst.frc4909.PTCAgileBot.subsystems.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton moatButton;
    public JoystickButton driveButton;
    public JoystickButton slowButton;
    public JoystickButton doADonutButton;
    public JoystickButton mediumMode;
    public Joystick controller;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        controller = new Joystick(0);
        
        driveButton = new JoystickButton(controller, 4);
        driveButton.whenPressed(new Drive());
        
        slowButton = new JoystickButton(controller, 3);
        slowButton.whenPressed(new SlowDrive());
        
        mediumMode = new JoystickButton(controller, 2);
        mediumMode.whenPressed(new MediumDrive());
        
//        moatButton = new JoystickButton(controller, 1);
//        moatButton.whenPressed(new CrossMoat());
        
        doADonutButton = new JoystickButton(controller, 8);
        doADonutButton.whenPressed(new AutonomousCommand());


        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("Drive", new Drive());
        SmartDashboard.putData("Cross Moat", new CrossMoat());

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getController() {
        return controller;
    }
    public double getLeftY() {
    	double y = controller.getRawAxis(1);
    	if(Math.abs(y)<.075)
    		return 0;
        return y*Math.abs(y)*.65;
    }
    public double getRightY() {
    	double y = controller.getRawAxis(4);
    	if(Math.abs(y)<.075)
    		return 0;
        return y*Math.abs(y)*.65;
    }
    public double getRightTrigger(){
    	double y = controller.getRawAxis(3);
    	return Math.abs(y);
    }
    public void vibrate(float intensity){
    //	controller.setRumble(Joystick.RumbleType.kLeftRumble, intensity);
    	// controller.setRumble(Joystick.RumbleType.kRightRumble, intensity);

    	
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

