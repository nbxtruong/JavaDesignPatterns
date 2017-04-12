package mvc;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view){
    	this.model=model;
    	this.view=view;
    }

    public void setModelName(String name){
    	model.setName(name);
    }

    public String getModelName(){
    	return model.getName();
    }

    public void setModelYear(int year){
    	model.setYear(year);
    }

    public int getModelYear(){
    	return model.getYear();
    }

    public void updateView(){
    	view.show(getModelName(), getModelYear());
    }
}
