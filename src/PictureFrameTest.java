
public class PictureFrameTest {
	public static void main(String[] args) {
		PictureFrame frame = new PictureFrame();
		
		EmptyState emptyState = new EmptyState(frame);
		System.out.println("Empty State");
		emptyState.emptyFrame();
		emptyState.addPicture();
		emptyState.onStandState();
		emptyState.onUpRightState();
		emptyState.soldState();
		
		
		PictureState pictureState = new PictureState(frame);
		System.out.println("Picture State");
		pictureState.emptyFrame();
		pictureState.addPicture();
		pictureState.onStandState();
		pictureState.onUpRightState();
		pictureState.soldState();
		
		StandState standState = new StandState(frame);
		System.out.println("Stand State");
		standState.emptyFrame();
		standState.addPicture();
		standState.onStandState();
		standState.onUpRightState();
		standState.soldState();
		
		UpRightState rightState = new UpRightState(frame);
		System.out.println("Up right State");
		rightState.emptyFrame();
		rightState.addPicture();
		rightState.onStandState();
		rightState.onUpRightState();
		rightState.soldState();
		
		SoldState soldState = new SoldState(frame);
		System.out.println("Sold State");
		soldState.emptyFrame();
		soldState.addPicture();
		soldState.onStandState();
		soldState.onUpRightState();
		soldState.soldState();
		
		WinnerState winnerState = new WinnerState(frame);
		System.out.println("Winner State");
		System.out.println(winnerState);
	}
}
