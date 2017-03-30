import rxtxrobot.ArduinoUno;
import rxtxrobot.RXTXRobot;

public class RunUntilBump {
		public static RXTXRobot robot;
		public static void main(String[] args){
		  robot = new ArduinoUno();
		  robot.setPort("COM3");
		  robot.connect();
		  
		  robot.attachMotor(RXTXRobot.MOTOR3, 5);
		  robot.attachMotor(RXTXRobot.MOTOR4, 6);
		  
          int reading = 1;
		  do{
			  robot.refreshDigitalPins();             
	          reading = robot.getDigitalPin(4).getValue();
	          robot.runMotor(RXTXRobot.MOTOR3, -100, RXTXRobot.MOTOR4, 100, 0);
		  }while(reading != 0);

	       robot.close();
     	  
		}
}