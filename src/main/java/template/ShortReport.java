package template;

public class ShortReport extends ReportTemplate{
    final String content;

    public ShortReport(String content) {
        this.content = content;
    }

    @Override
    public String generate() {
        return "Short Report: \n" + content();
    }

    @Override
    String header() {
        return null;
    }

    @Override
    String content() {
        return content;
    }

    @Override
    String footer() {
        return null;
    }
}
