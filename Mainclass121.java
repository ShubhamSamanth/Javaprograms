import java.util.Scanner;

class employee {
    final String id;
    String name;
    String companyname;
    String job;
    String dept;
    double sal;
    static int rdnm = 1001;
    String stname = "SJ";

    employee(String name, String companyname, String job,
            String dept, double sal) {

        this.id = stname + rdnm++;
        this.name = name;
        this.companyname = companyname;
        this.job = job;
        this.dept = dept;
        this.sal = sal;

    }

    void update(double sal1) {
        sal = sal1;
    }

    void disp() {
        System.out.println("\nID=" + id + "\nName=" + name + "\nCompany Name=" + companyname + "\nJob=" + job
                + "\nDepartment=" + dept + "\nSalary =" + sal);
    }

}

class Mainclass121

{
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        String name = s1.nextLine();
        String companyname = s1.nextLine();
        String job = s1.nextLine();
        String dept = s1.nextLine();
        double sal = s1.nextDouble();
        employee e1 = new employee(name, companyname, job, dept, sal);
        e1.update(50000);
        employee e2 = new employee(name, companyname, job, dept, sal);
        employee e3 = new employee("Rocky", "INFY", "Analyst", "40Upeer", 45000.00);
        e1.disp();
        e2.disp();
        e3.disp();
    }
}
