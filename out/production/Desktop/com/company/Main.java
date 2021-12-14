package com.company;

public class Main {

    public static void main(String[] args) {
        AdminDepartment admin = new AdminDepartment();
        System.out.println("Welcome to " + admin.departmentName());
        System.out.println(admin.getTodaysWork());
        System.out.println(admin.getWorkDeadline());
        System.out.println(admin.isTodayAHoliday());
        System.out.println(" ");
        HrDepartment hrd = new HrDepartment();
        System.out.println("Welcome to " + hrd.departmentName());
        System.out.println(hrd.doActivity());
        System.out.println(hrd.getTodaysWork());
        System.out.println(hrd.getWorkDeadline());
        System.out.println(hrd.isTodayAHoliday());
        System.out.println(" ");
        TechDepartment tech = new TechDepartment();
        System.out.println("Welcome to " + tech.departmentName());
        System.out.println(tech.getTodaysWork());
        System.out.println(tech.getWorkDeadline());
        System.out.println(tech.getTechStackInformation());
        System.out.println(tech.isTodayAHoliday());
        System.out.println(" ");
    }
}

class SuperDepartment {

    public String departmentName() {
        return "Super Department";
    }

    public String getTodaysWork() {
        return "No Work as of now";
    }

    public String getWorkDeadline() {
        return "Nil";
    }

    public String isTodayAHoliday() {
        return "Today is not a holiday";
    }
}


class AdminDepartment extends SuperDepartment {

    public String departmentName() {
        return "Admin Department";
    }

    public String getTodaysWork() {
        return "Complete your documents Submission";
    }

    public String getWorkDeadline() {
        return "Complete by EOD";
    }
}


class HrDepartment extends SuperDepartment {

    public String departmentName() {
        return "HR Department";
    }

    public String getTodaysWork() {
        return "Fill today’s timesheet and mark your attendance";
    }

    public String getWorkDeadline() {
        return "Complete by EOD";
    }

    public String doActivity() {
        return "team Lunch";
    }
}

class TechDepartment extends SuperDepartment {

    public String departmentName() {
        return "Tech Department";
    }

    public String getTodaysWork() {
        return "Complete coding of module 1";
    }

    public String getWorkDeadline() {
        return "Complete by EOD";
    }

    public String getTechStackInformation() {
        return "core Java";
    }
}