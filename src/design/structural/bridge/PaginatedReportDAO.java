package design.structural.bridge;

import java.util.List;
import java.util.Map;

public class PaginatedReportDAO extends AbstractReportDAO {
    private int pageLength;
    private int offSet;

    @Override
    public List<Map<String, Object>> getData() {
        return getPaginatedData();
    }

    protected List<Map<String, Object>> getPaginatedData() {
        int startIndex = offSet + 1;
        int endIndex = offSet + pageLength;
        System.out.println("Getting data from " + startIndex + " to " + endIndex + " of " + getTotalNumberOfRecords()
                + " Records");
        return null;
    }

    public int getPageLength() {
        return pageLength;
    }

    public void setPageLength(int pageLength) {
        this.pageLength = pageLength;
    }

    public int getOffSet() {
        return offSet;
    }

    public void setOffSet(int offSet) {
        this.offSet = offSet;
    }
}
