package neuralnet;

import java.util.ArrayList;

import math.IActivationFunction;

public abstract class NeuralLayer {
	protected int numberOfNeuronsInLayer;
    private ArrayList<Neuron> neuron;
    protected IActivationFunction activationFnc;
    protected NeuralLayer previousLayer;
    protected NeuralLayer nextLayer;
    protected ArrayList<Double> input;
    protected ArrayList<Double> output;
    protected int numberOfInputs;
}
