package design.structural.bridge;

public abstract class AbstractReportDAO implements ReportDAO {

    int totalNumberOfRecords = 0;

    @Override
    public int getTotalNumberOfRecords() {
        if (totalNumberOfRecords == 0) {
            totalNumberOfRecords = (int) (Math.random() * 1000);
            while (totalNumberOfRecords < 50) {
                totalNumberOfRecords = (int) (Math.random() * 1000);
            }
        }
        return totalNumberOfRecords;
    }

}
