public class Driver extends SuperDepartment {
    public static void main(String [] args){
        AdminDepartment a =new AdminDepartment();
        System.out.println("Welcome to " +a.departmentName());
        System.out.println(a.getTodaysWork());
        System.out.println(a.getWorkDeadline());
        System.out.println(a.isTodayAHoliday());

        HRDepartment b =new HRDepartment();
        System.out.println("Welcome to " +b.departmentName());
        System.out.println(b.doActivity());
        System.out.println(b.getTodaysWork());
        System.out.println(b.getWorkDeadline());
        System.out.println(b.isTodayAHoliday());
        TechDepartment c =new TechDepartment();
        System.out.println("Welcome to " +c.departmentName());
        System.out.println(c.getTodaysWork());
        System.out.println(c.getWorkDeadline());
        System.out.println(c.getTechStackInformation());
        System.out.println(c.isTodayAHoliday());
    }
}
