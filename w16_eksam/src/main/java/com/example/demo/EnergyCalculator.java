package com.example.demo;
import com.example.demo.Device1;

public class EnergyCalculator
{
    public static double CalcEnergyPrice(int workFrom, int workTo, double price, double used)
    {
        return (workTo - workFrom) * used * price;
    }

    public static double CalcEnergyPrice(Device1 device, double price)
    {
        return CalcEnergyPrice(device.WorkHourFrom, device.WorkHourTo, price, device.Used);
    }

    public static double CalcIndividual(int workFrom, int workTo, double used)
    {
        return ((workTo - workFrom) * used);
    }
}