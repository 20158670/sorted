package sorted;

public class Interface {
	public static void main(String[] args){
	}
	interface Bicycle{
		void changeCadence(int newValue);
		void changeGear(int newValue);
		void speedUp(int increment);
		void applyBrakes(int decrement);
	}
	class ACMEBicycle implements Bicycle{
		int cadence = 0;
		int speed = 0;
		int gear = 1;
		
		@Override
		public void changeCadence(int newValue) {
			cadence = newValue;
		}

		@Override
		public void changeGear(int newValue) {
				gear = newValue;
		}

		@Override
		public void speedUp(int increment) {
			speed = speed + increment;
		}

		@Override
		public void applyBrakes(int decrement) {
			speed = speed - decrement;
		}
		
		public void printStates(){
			System.out.println("cadence:" + cadence + ", speed:" + speed + ", gear:" + gear);
		}
	}
}
