package design.structural.bridge;

public class InventoryReport extends PaginatedReportDataProvider {

    public InventoryReport() {
        this("Inventory Report");
    }

    public InventoryReport(String reportId) {
        super(reportId);
    }

}
