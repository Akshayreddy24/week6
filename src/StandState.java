
public class StandState implements State {
	PictureFrame frame;
	public StandState(PictureFrame frame) {
		this.frame = frame;
	}
	@Override
	public void emptyFrame() {
		// TODO Auto-generated method stub
		System.out.println("Frame empty");
	}

	@Override
	public void addPicture() {
		// TODO Auto-generated method stub
		System.out.println("Image needed to be added");
	}

	@Override
	public void onStandState() {
		// TODO Auto-generated method stub
		System.out.println("Current frame state is Standing state");
	}

	@Override
	public void onUpRightState() {
		// TODO Auto-generated method stub
		System.out.println("not in Up right state");
	}

	@Override
	public void soldState() {
		// TODO Auto-generated method stub
		System.out.println("Not sold yet");
	}

}
