package design.structural.bridge;

import java.util.List;
import java.util.Map;

public interface ReportDAO {
    int getTotalNumberOfRecords();

    List<Map<String, Object>> getData();
}
