package AdapterDessignPattern.Adapter;

import AdapterDessignPattern.Adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{
    WeightMachine weightMachine;
    public WeightMachineAdapterImpl(WeightMachine obj)
    {
        this.weightMachine = obj;
    }
    @Override
    public double getWeightInKg() {
        return weightMachine.getWeightInPound() * 0.20;
    }
}
