package retsrif.Slopes;

public enum Direction {
	NORTH(0),
	EAST(1),
	SOUTH(2),
	WEST(3);

	int num;
	
	private Direction(int num) {
		this.num = num;
	}
}
