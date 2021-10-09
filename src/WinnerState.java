
public class WinnerState implements State{
	PictureFrame frame;
	public WinnerState(PictureFrame frame) {
		this.frame = frame;
	}

	@Override
	public void emptyFrame() {
		// TODO Auto-generated method stub
		System.out.println("You will need to remove the image");
	}

	@Override
	public void addPicture() {
		// TODO Auto-generated method stub
		System.out.println("Image needed to be added");
	}

	@Override
	public void onStandState() {
		// TODO Auto-generated method stub
		System.out.println("Standing state");
	}

	@Override
	public void onUpRightState() {
		// TODO Auto-generated method stub
		System.out.println("Up right state");
	}

	@Override
	public void soldState() {
		// TODO Auto-generated method stub
		System.out.println("Frame sold");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "You are given an extra frame because you are the winner";
	}
}
