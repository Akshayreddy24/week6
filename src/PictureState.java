
public class PictureState implements State{
	PictureFrame frame;
	public PictureState(PictureFrame frame) {
		this.frame = frame;
	}

	@Override
	public void emptyFrame() {
		// TODO Auto-generated method stub
		System.out.println("image removed");
	}

	@Override
	public void addPicture() {
		// TODO Auto-generated method stub
		System.out.println("image added");
	}

	@Override
	public void onStandState() {
		// TODO Auto-generated method stub
		System.out.println("frame is in Standing state");
	}

	@Override
	public void onUpRightState() {
		// TODO Auto-generated method stub
		System.out.println("frame is in Up right state");
	}


	@Override
	public void soldState() {
		// TODO Auto-generated method stub
		
	}

}
