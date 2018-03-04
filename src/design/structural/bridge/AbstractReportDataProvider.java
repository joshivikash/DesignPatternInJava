package design.structural.bridge;

public abstract class AbstractReportDataProvider implements ReportDataProvider {
    private String reportId;

    public AbstractReportDataProvider(String reportId) {
        this.reportId = reportId;
    }

    @Override
    public String getReportId() {
        return reportId;
    }
}
