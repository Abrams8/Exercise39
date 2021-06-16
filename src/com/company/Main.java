package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        List<Integer> studentGradeList = new LinkedList<>();
        List<Integer> studentGradeListNew = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            studentGradeList.add(ThreadLocalRandom.current().nextInt(1, 11));
        }
        System.out.println("Все оценки: " + studentGradeList);

        for (int i = 0; i < studentGradeList.size(); i++) {
            if (studentGradeList.get(i) < 4) {
                studentGradeList.remove(i);
                i--;
            }
        }
        System.out.println("Хорошие оценки: " + studentGradeList);
    }
}