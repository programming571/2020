/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import frc.robot.subsystems.Color;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.commands.ConveyerMaster;
import frc.robot.commands.SpinToColor;
import frc.robot.subsystems.Climb;
import frc.robot.subsystems.Drive;
import frc.robot.subsystems.Leveling;
import frc.robot.subsystems.PowerCollection;

/**
 * This class takes the place of much of the old robot class, and entirely
 * replaces OI.java It initializes the joysticks, their buttons, and their axis,
 * and it binds them to commands.
 */
public class RobotContainer {
    // initializing robot subsytems
    private final Climb climb = new Climb();
    private final Color color = new Color();
    private final Drive drive = new Drive();
    private final Leveling level = new Leveling();
    private final PowerCollection powerCollection = new PowerCollection();
    // initialize joystick and off-brand XBox conroller from Chinese Walmart
    private final Joystick driveStick = new Joystick(0);
    private final XboxController opStick = new XboxController(1);
    

    // TODO: put in commandbase

    public RobotContainer() {
        // TODO: SmartDashBoard
        Shuffleboard.putData("JoystickX", driveStick.getX());

        configureButtonBindings();
    }

    private void configureButtonBindings() {
        // xbox buttons
        final JoystickButton green = new JoystickButton(opStick, 1);
        final JoystickButton red = new JoystickButton(opStick, 2);
        final JoystickButton blue = new JoystickButton(opStick, 3);
        final JoystickButton yellow = new JoystickButton(opStick, 4);
        // joystick buttons
        final JoystickButton intake = new JoystickButton(driveStick, 2);
        final JoystickButton output = new JoystickButton(driveStick, 1);



        // TODO: put in color parameters
        // green.whenPressed(new SpinToColor((byte)1));
        // red.whenPressed(new SpinToColor((byte)2));
        // blue.whenPressed(new SpinToColor((byte)3));
        // yellow.whenPressed(new SpinToColor((byte)4));

        // intake.whenPressed(); output.whenPressed();
    }

}
