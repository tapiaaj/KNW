import rxtxrobot.*;

public class MoveForward {
	public static RXTXRobot robot;
	public static void main(String [] args){
		robot = new ArduinoUno();
		robot.setPort("COM3");
	    robot.connect();
	    
	    //run at speeds bw -500 to 500
	    //for int time, 1000 = 1 second
	    robot.attachMotor(RXTXRobot.MOTOR3, 5);
	    robot.attachMotor(RXTXRobot.MOTOR4, 6);
	    //robot.runMotor(RXTXRobot.MOTOR3, -100, 5000);
	    robot.runMotor(RXTXRobot.MOTOR3, -150, RXTXRobot.MOTOR4, 150, 2000);
	    
	    robot.close();
	}
}
