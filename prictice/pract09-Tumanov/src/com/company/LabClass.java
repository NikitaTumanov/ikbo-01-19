package com.company;

public class LabClass{
    Student[] sort;
    private int temp = 0;
    public LabClass(Student[] sort)
    {
        this.sort = sort;
    }
    public Student findStudent(String name)
    {
        for (int i = 0; i < sort.length; i++)
        {
            if (sort[i].getName().equals(name)) {return sort[i];}
        }
        throw new StudentNotFoundException("Student not found");
    }
    public void quickSort(int low, int high) {
        if (sort.length == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        int opora = (int)sort[middle].getValue();

        int i = low, j = high;
        while (i <= j) {
            while ((int)sort[i].getValue() < opora) {
                i++;
            }
            while ((int)sort[j].getValue() > opora) {
                j--;
            }
            if (i <= j) {
                int temp = (int)sort[i].getValue();
                sort[i].setValue((int)sort[j].getValue());
                sort[j].setValue(temp);
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(low, j);

        if (high > i)
            quickSort(i, high);
    }
}
