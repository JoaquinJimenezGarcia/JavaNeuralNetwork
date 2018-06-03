package math;

public class Linear implements IActivationFunction{
	private double a=1.0;
    
    public Linear(){
        
    }
    
    
    public Linear(double value){
        this.setA(value);
    }
    
    
    public void setA(double value){
        this.a = value;
    }
    
    
    @Override
    public double calc(double x){
        return a*x;
    }
}
