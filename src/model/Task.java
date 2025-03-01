package model;
//contain task constructor to create, modify, and extract information from taaks
public class Task {
    private int id;
    private String desc;
    //constructor
    public Task(int id, String desc){
        this.id = id;
        this.desc = desc;
    }
    // getter methods
    public int getId(){
        return id;
    }
    public String getDesc(){
        return desc;
    }
    //setter method
    public void setID(int id){
        this.id = id;
    }
    public void setDesc(String desc){
        this.desc = desc;
    }
    //string method
    @Override
    public String toString(){
        return "Task{id=" + id + ", description='" + desc + "'}";
    }

}
