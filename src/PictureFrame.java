
public class PictureFrame {
	State emptyState;
	State pictureState;
	State standState;
	State upRightState;
	State soldState;
	State winnerState;
	
	State state = emptyState;
	
	public PictureFrame() {
		emptyState = new EmptyState(this);
		pictureState = new PictureState(this);
		standState = new StandState(this);
		upRightState = new UpRightState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);
		
	}
	
	public void emptyFrame() {
		state.emptyFrame();
	}
	public void addPicture() {
		state.addPicture();
	}
	public void onStandState() {
		state.onStandState();
	}
	public void onUpRightState() {
		state.onUpRightState();
	}
	public void soldState() {
		state.soldState();
	}
	void setState() {
		this.state = state;
	}
	public State getState() {
		return state;
	}

	public State getEmptyState() {
		return emptyState;
	}

	public State getPictureState() {
		return pictureState;
	}

	public State getStandState() {
		return standState;
	}

	public State getUpRightState() {
		return upRightState;
	}

	public State getSoldState() {
		return soldState;
	}

	public State getWinnerState() {
		return winnerState;
	}
	
}

