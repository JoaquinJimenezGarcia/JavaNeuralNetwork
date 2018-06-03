package neuralnet;

import math.IActivationFunction;

public class HiddenLayer extends NeuralLayer{
	public HiddenLayer(int numberofneurons, IActivationFunction iaf,
            int numberofinputs){
        super(numberofneurons, iaf);
        numberOfInputs = numberofinputs;
        init();
    }
    
    @Override
    public void setPreviousLayer(NeuralLayer previous){
        this.previousLayer = previous;
        
        if(previous.nextLayer != this) {
        	previous.setNextLayer(this);
        }
    }
    
    @Override
    public void setNextLayer(NeuralLayer next){
        nextLayer = next;
        
        if(next.previousLayer != this) {
        	next.setPreviousLayer(this);
        }
    }
}
