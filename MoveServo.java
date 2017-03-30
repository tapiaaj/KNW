import rxtxrobot.*;

public class MoveServo {
		public static RXTXRobot robot;
		public static Process wait;
		public static void main(String[] args){
		  robot = new ArduinoUno();
		  robot.setPort("COM3");
		  robot.connect();
		  
		  robot.attachServo(RXTXRobot.SERVO1, 7);
		  
		  int angle = 170;
		  //accepts angle between 0 and 180
		  //<90 goes one way, >90 goes another way
		  robot.moveServo(RXTXRobot.SERVO1, angle);
		  robot.sleep(1000);

		  /*int value = 0;
		try {
			value = wait.waitFor();
		} catch (InterruptedException e) {
			System.out.println("Interrupted Exception");
		}
		  
		  System.out.println(value);*/
		  
		  //robot.moveServo(RXTXRobot.SERVO1, 90);
		  
		  robot.close();
		}
}