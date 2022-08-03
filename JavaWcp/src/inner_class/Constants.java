package inner_class;

public class Constants {
		
	public static class Cat {
		public static final String NAME = "猫";
		public static final int LEG_COUNT = 4;
	}
	
	public static class Octopus {
		public static final String NAME = "タコ";
		public static final int LEG_COUNT = 8;
	}
	
	public static void main(String[] args) {
	System.out.println(Constants.Cat.NAME);
	System.out.println(Constants.Cat.LEG_COUNT);
	System.out.println(Constants.Octopus.NAME);
	System.out.println(Constants.Octopus
			.LEG_COUNT);
	}
}