package MinorProject02;


import java.util.Arrays;

class Employee {
    private String name;
    private int empId;
    private double salary;
    private Date hireDate;
    private String jobPosition;
    private String contactNumber;
    private Address address;

    public Employee(String name, int empId, double salary, Date hireDate, String jobPosition, String contactNumber, Address address) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
        this.hireDate = hireDate;
        this.jobPosition = jobPosition;
        this.contactNumber = contactNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getEmpId() {
        return empId;
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public Address getAddress() {
        return address;
    }
}

class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}

class Address {
    private String street;
    private String city;
    private String state;
    private String country;

    public Address(String street, String city, String state, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String getStreet() {

        return street;
    }

    public String getCity() {

        return city;
    }

    public String getState() {

        return state;
    }

    public String getCountry() {

        return country;
    }
}

class Test {
    public static void main(String[] args) {
        // Create an array of Employee objects (employee database)
        Employee[] employees = new Employee[500];

        // Initialize the employees array with sample data (for demonstration purposes)
        initializeEmployees(employees);

        // Arrange employees by salary in descending order
        arrangeEmployeeBySalary(employees);

        // Display details of employees whose job position is "manager"
        getEmployeesByJobPosition(employees, "manager");

        // Display details of employees hired between 01-04-2022 and 31-03-2023
        Date startDate = new Date(1, 4, 2022);
        Date endDate = new Date(31, 3, 2023);
        getEmployeesByHireDate(employees, startDate, endDate);

        // Count the number of foreign employees
        int foreignEmployeeCount = foreignEmployeeCount(employees);
        System.out.println("Number of foreign employees: " + foreignEmployeeCount);

        // Display details of employees with salaries in the range 150000 to 300000 INR
        double minSalary = 150000;
        double maxSalary = 300000;
        getEmployeesBySalary(employees, minSalary, maxSalary);
    }

    public static void initializeEmployees(Employee[] employees) {
        // Sample data for demonstration purposes
        for (int i = 0; i < employees.length; i++) {
            String name = "Employee " + (i + 1);
            int empId = i + 1001; // assuming employee IDs start from 1001
            double salary = Math.random() * 100000; // assuming salary increases by 1000 for each employee
            Date hireDate = new Date(15, 6, 2022); // assuming all employees were hired on the same date
            String jobPosition = "Manager"; // assuming all employees have the job position "manager"
            String contactNumber = "+91 123-456-7890"; // assuming all employees have the same contact number
            Address address = new Address("Street " + (i + 1), "ITER COLLEGE", "ODISHA", "INDIA"); // assuming all employees have the same address
            employees[i] = new Employee(name, empId, salary, hireDate, jobPosition, contactNumber, address);
        }
    }
    public static void arrangeEmployeeBySalary(Employee[] employees) {
        Arrays.sort(employees, (e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));
    }

    public static void getEmployeesByJobPosition(Employee[] employees, String jobPosition) {
        System.out.println("Employees with job position '" + jobPosition + "':");
        for (Employee employee : employees) {
            if (employee.getJobPosition().equalsIgnoreCase(jobPosition)) {
                displayEmployeeDetails(employee);
            }
        }
    }

    public static void getEmployeesByHireDate(Employee[] employees, Date startDate, Date endDate) {
        System.out.println("Employees hired between " + formatDate(startDate) + " and " + formatDate(endDate) + ":");
        for (Employee employee : employees) {
            Date hireDate = employee.getHireDate();
            if (isDateInRange(hireDate, startDate, endDate)) {
                displayEmployeeDetails(employee);
            }
        }
    }

    public static int foreignEmployeeCount(Employee[] employees) {
        int count = 0;
        for (Employee employee : employees) {
            String countryCode = employee.getContactNumber().substring(0, 3);
            if (!countryCode.equals("+91")) { // Assuming foreign country code is not "+91"
                count++;
            }
        }
        return count;
    }

    public static void getEmployeesBySalary(Employee[] employees, double minSalary, double maxSalary) {
        System.out.println("Employees with salary in the range " + minSalary + " INR to " + maxSalary + " INR:");
        for (Employee employee : employees) {
            double salary = employee.getSalary();
            if (salary >= minSalary && salary <= maxSalary) {
                displayEmployeeDetails(employee);
            }
        }
    }

    public static void displayEmployeeDetails(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmpId());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("Hire Date: " + formatDate(employee.getHireDate()));
        System.out.println("Job Position: " + employee.getJobPosition());
        System.out.println("Contact Number: " + employee.getContactNumber());
        Address address = employee.getAddress();
        System.out.println("Address: " + address.getStreet() + ", " + address.getCity() + ", " + address.getState() + ", " + address.getCountry());
        System.out.println("-----------------------");
    }

    public static String formatDate(Date date) {
        return date.getDay() + "-" + date.getMonth() + "-" + date.getYear();
    }

    public static boolean isDateInRange(Date date, Date startDate, Date endDate) {
        if (date.getYear() < startDate.getYear() || date.getYear() >
                endDate.getYear()) {
            return false;
        }
        else if (date.getYear() == startDate.getYear() && date.getMonth() < startDate.getMonth()) {
            return false;
        }
        else if (date.getYear() == endDate.getYear() && date.getMonth() > endDate.getMonth()) {
            return false;
        }
        else if (date.getYear() == startDate.getYear() && date.getMonth() == startDate.getMonth()
                && date.getDay() < startDate.getDay()) {
            return false;
        }
        else{
            return date.getYear() != endDate.getYear() || date.getMonth() != endDate.getMonth()
                    || date.getDay() <= endDate.getDay();
        }
    }
}