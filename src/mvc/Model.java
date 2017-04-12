package mvc;

public class Model {
    private String name;
    private int year;

    public void setName(String name){
    	this.name=name;
    }

    public String getName(){
    	return this.name;
    }

    public void setYear(int year){
    	this.year=year;
    }

    public int getYear(){
    	return this.year;
    }
}
