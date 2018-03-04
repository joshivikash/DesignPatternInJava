package design.structural.bridge;

public class EmployeesReport extends NonPaginatedReportDataProvider {

    public EmployeesReport() {
        this("Employees Report");
    }

    public EmployeesReport(String reportId) {
        super(reportId);
    }

}
