package mvc;

public class Main {
	public static void main(String[] args) {
		Model model=defaulInfo();
		View view=new View();

		Controller objectOne=new Controller(model, view);
		objectOne.updateView();

		objectOne.setModelName("Minh");
		objectOne.updateView();
	}

	private static Model defaulInfo(){
		Model model=new Model();
		model.setName("Truong");
		model.setYear(25);
		return model;
	} 
}
