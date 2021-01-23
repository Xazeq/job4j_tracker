package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Иванов Иван Иванович");
        student.setGroup("ДКИ-401");
        student.setReceiptDate(new Date());
        System.out.println(student.getFullName() + " зачислен в группу " + student.getGroup() + " с " + student.getReceiptDate());
    }
}
