package part2.lection8;

public class InnerClass {

	private void doSmth(boolean b) {
		if (b) {
			class GoToSlip {
				private String id;

				GoToSlip(String s) {
					id = s;
				}

				String getSlip() {
					return id;
				}
			}
			GoToSlip gts = new GoToSlip("Пішо спати о 23");
			String s = gts.getSlip();
		}
		// Але викликати за областю видимості неможна ...
		// ! GoToSlip пts = new GoToSlip("x");
	}

	public void track() {
		doSmth(true);
	}

	public static void main(String[] args) {
		InnerClass ic = new InnerClass();
		ic.track();
	}

}
