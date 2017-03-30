import rxtxrobot.*;

public class ConductivityProbe {
		public static RXTXRobot robot;
		public static void main(String[] args){
		  robot = new ArduinoUno();
		  robot.setPort("COM3");
		  robot.connect();
		  
		  //the higher the water content of the soil, the higher the conductivity
		  //and the lower the R between the two electrodes
		  // int getConductivity()
		  robot.refreshAnalogPins();             
          int reading = robot.getConductivity();
		  
          System.out.println("The conductivity reading is " + reading);
          
          robot.close();
		}
}