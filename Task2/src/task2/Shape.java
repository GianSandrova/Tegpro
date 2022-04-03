package task2;
/**
 *
 * @author ASUS
 */
public class Shape {
    private String color;
    private boolean  filled;

public Shape(){
    color="red";
    filled=true;
}
public Shape(String color,boolean filled){
    this.color=color;
    this.filled=filled;
}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
public String toString(){
    String filledStr="filled";
    if(!filled){
        filledStr="not filled";
    }
    return "A shape with color of " + color + " and " + filledStr;
} 

}