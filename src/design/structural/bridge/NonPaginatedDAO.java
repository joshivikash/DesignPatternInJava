package design.structural.bridge;

import java.util.List;
import java.util.Map;

public class NonPaginatedDAO extends AbstractReportDAO {
    @Override
    public List<Map<String, Object>> getData() {
        System.out.println("Getting all " + getTotalNumberOfRecords() + " Records.");
        return null;
    }
}
