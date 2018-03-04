package design.structural.bridge;

public class Reports {
    public static void main(String[] args) {
        InventoryReport inventoryReport = new InventoryReport();
        System.out.println(inventoryReport.getReportId());
        System.out.println(inventoryReport.getTotalNumberOfRecords());
        inventoryReport.getPaginatedData(1, 50);

        EmployeesReport employeesReport = new EmployeesReport();
        System.out.println(employeesReport.getReportId());
        System.out.println(employeesReport.getTotalNumberOfRecords());
        employeesReport.getData();
    }
}
