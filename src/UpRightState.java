
public class UpRightState implements State{
	PictureFrame frame;
	public UpRightState(PictureFrame frame) {
		this.frame = frame;
	}

	@Override
	public void emptyFrame() {
		// TODO Auto-generated method stub
		System.out.println("Empty Frame");
	}

	@Override
	public void addPicture() {
		// TODO Auto-generated method stub
		System.out.println("Image added");
	}

	@Override
	public void onStandState() {
		// TODO Auto-generated method stub
		System.out.println("not in Standing state");
	}

	@Override
	public void onUpRightState() {
		// TODO Auto-generated method stub
		System.out.println("In the Up right state");
	}

	@Override
	public void soldState() {
		// TODO Auto-generated method stub
		System.out.println("Not sold yet");
	}
}
