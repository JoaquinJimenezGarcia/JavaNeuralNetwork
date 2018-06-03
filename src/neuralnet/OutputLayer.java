package neuralnet;

import math.IActivationFunction;

public class OutputLayer extends NeuralLayer{
	public OutputLayer(int numberofneurons, IActivationFunction iaf, int numberofinputs){
        super(numberofneurons, iaf);
        numberOfInputs = numberofinputs;
        nextLayer = null;
        init();
    }
    
    @Override
    public void setNextLayer(NeuralLayer layer){
        nextLayer = null;
    }
    
    @Override
    public void setPreviousLayer(NeuralLayer layer){
        previousLayer=layer;
        if(layer.nextLayer != this) {
        	layer.setNextLayer(this);
        }
    }
}
