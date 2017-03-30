import rxtxrobot.*;

public class ReadDistances {
		public static RXTXRobot robot;
		public static void main(String[] args){
		  robot = new ArduinoUno();
		  robot.setPort("COM3");
		  robot.connect();
		  
		  int distance = robot.getPing(8);
		  System.out.println("The distance to the object is " + distance + "cm.");
		  
		  robot.close();
		}
}