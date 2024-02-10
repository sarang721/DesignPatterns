package AdapterDessignPattern;

import AdapterDessignPattern.Adaptee.WeightMachineForBabies;
import AdapterDessignPattern.Adapter.WeightMachineAdapter;
import AdapterDessignPattern.Adapter.WeightMachineAdapterImpl;

public class Main {
    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}