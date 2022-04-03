package task2;


public class square extends Rectangle{
    public square(){
        super();
    }
    public square(double side){
        super(side,side);
    }
    public square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }
    public double getSide(){
        return super.getLength();
    }
    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    @Override
    public String toString(){
        return "A square side "+getSide()+", which is a subclass of " +super.toString();
    }
    @Override
        public double getPerimeter(){
            return 4*getSide();
        }
    @Override
        public void setLength(double side){
            setSide(side);
        }
    @Override
        public void setWidth(double side){
            setSide(side);
        }
}
