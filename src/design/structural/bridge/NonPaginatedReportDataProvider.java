package design.structural.bridge;

import java.util.List;
import java.util.Map;

public abstract class NonPaginatedReportDataProvider extends AbstractReportDataProvider {

    private NonPaginatedDAO nonPaginatedDAO = new NonPaginatedDAO();

    public NonPaginatedReportDataProvider(String reportId) {
        super(reportId);
    }

    @Override
    public int getTotalNumberOfRecords() {
        return nonPaginatedDAO.getTotalNumberOfRecords();
    }

    public List<Map<String, Object>> getData() {
        return nonPaginatedDAO.getData();
    }

}
