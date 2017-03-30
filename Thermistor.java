import rxtxrobot.*;

public class Thermistor {
		public static RXTXRobot robot;
		public static void main(String[] args){
		  robot = new ArduinoUno();
		  robot.setPort("COM3");
		  robot.connect();
		  
		  int thermistorReading = getThermistorReading();
		  double temperature = getTemperature(thermistorReading);
		  System.out.println("The probe read the value: " + thermistorReading);
		  System.out.println("In volts: " + (thermistorReading * (5.0/1023.0)));
		  System.out.printf("\nThe temperature in Celcius is: %.2f", temperature);
		  
		  robot.close();
		}
		
		public static int getThermistorReading() {
	        int sum = 0;         
	        int readingCount = 10;                 
	        //Read the analog pin values ten times, adding to sum each time         
	        for (int i = 0; i < readingCount; i++) {
	            //Refresh the analog pins so we get new readings
	            robot.refreshAnalogPins();             
	            int reading = robot.getAnalogPin(0).getValue();             
	            sum += reading;         }     
	        
	        //Return the average reading         
	        return sum / readingCount;
		}
		
		public static double getTemperature(int reading){
			//return ((reading-804.9496124)/(-9.331395349))-4;
			return ((reading-794.5506018725)/-9.0138207757);
		}

}
