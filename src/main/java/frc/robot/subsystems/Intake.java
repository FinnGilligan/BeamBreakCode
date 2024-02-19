package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase{
    private final CANSparkMax left = new CANSparkMax(5, MotorType.kBrushed);
    private final CANSparkMax right = new CANSparkMax(4, MotorType.kBrushed);
    public static boolean isSpinning = false;
    public static boolean checkDirection = true;

    public Intake(){
    }

    public void intake() {
        left.set(0.1);
        right.set(-0.1);
    }

    public void outtake() {
        left.set(-0.1);
        right.set(0.1);
    }

    public void stop(){
        left.set(0);
        right.set(0);
    }

}