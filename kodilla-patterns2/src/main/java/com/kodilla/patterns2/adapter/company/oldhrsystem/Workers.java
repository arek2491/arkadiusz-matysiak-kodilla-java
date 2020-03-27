package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {
    private String [][] workers = {
            {"23423423423", "John", "Smith"},
            {"12312312312", "Ivone", "Novak"},
            {"34534534534", "Jessie", "Pinkman"},
            {"45645645645", "Walter", "White"},
            {"56756756756", "Clara", "Lanson"}};
    private double [] salaries = {
            4500.00,
            3700.00,
            4350.00,
            9000.00,
            6200.00};
    public String getWorker(int n) {
        if(n > salaries.length) {
            return "";
        }
        return workers[n][0] + ", " + workers[n][1] + ", " + workers[n][2] + ", " + salaries[n];
    }
    public String[][] getWorkers() {
        return workers;
    }
    public double[] getSalaries() {
        return salaries;
    }
}
