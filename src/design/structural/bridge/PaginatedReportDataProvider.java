package design.structural.bridge;

import java.util.List;
import java.util.Map;

public class PaginatedReportDataProvider extends AbstractReportDataProvider {

    private PaginatedReportDAO paginatedReportDAO = new PaginatedReportDAO();

    public PaginatedReportDataProvider(String reportId) {
        super(reportId);
    }

    @Override
    public int getTotalNumberOfRecords() {
        return paginatedReportDAO.getTotalNumberOfRecords();
    }

    List<Map<String, Object>> getPaginatedData(int offSet, int pageLength) {
        paginatedReportDAO.setOffSet(offSet);
        paginatedReportDAO.setPageLength(pageLength);
        return paginatedReportDAO.getData();
    }

}
