package ru.mirea.pract06;

public class SortingStudentsByGPA implements Comparator {
    public void main() {
        Students[] students = new Students [6];
        input(students);
        quickSort(students);
        output(students);
    }

    public static void input(Students[] students){
        students[0]=new Students("Туманов",1);
        students[1]=new Students("Иванов",4);
        students[2]=new Students("Попов",10);
        students[3]=new Students("Семенов",5);
        students[4]=new Students("Кирьяков",12);
        students[5]=new Students("Иванцов",3);
    }

    public static void output(Students[] students){
        for(int i=5; i>=0;i--){
            System.out.println("Имя студента:"+students[i].name+" Оценка: "+students[i].mark);
        }
    }

    private static void doSort(int start, int end, Students[] students) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (students[i].mark <= students[cur].mark)) {
                i++;
            }
            while (j > cur && (students[cur].mark <= students[j].mark)) {
                j--;
            }
            if (i < j) {
                Students temp = students[i];
                students[i] = students[j];
                students[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        doSort(start, cur, students);
        doSort(cur+1, end, students);
    }

    @Override
    public void quickSort(Students[] students) {
        int startIndex = 0;
        int endIndex = 6 - 1;
        doSort(startIndex, endIndex, students);
    }
}

