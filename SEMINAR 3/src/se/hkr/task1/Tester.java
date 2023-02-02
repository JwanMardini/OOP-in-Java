package se.hkr.task1;

public class Tester extends Employee{
    private String[] tools;

    public Tester(int id, String name, String dept, double salary, String[] tools) {
        super(id, name, dept, salary);
        this.tools = tools;
    }

    public String[] getTools() {
        return tools;
    }

    public void setTools(String[] tools) {
        this.tools = tools;
    }

    @Override
    public void work() {
        super.work();
        System.out.println("Tester is testing:");
        System.out.println("1) Selenium");
        System.out.println("2) TestingWhiz");
        System.out.println("3) Ranorex");
    }
}
