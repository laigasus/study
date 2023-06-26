package Builder;

public class TextBuilder extends Builder {

    private StringBuilder sb = new StringBuilder();
    private int barLen=30;

    @Override
    public void makeTitle(String title) {
        sb.append("=".repeat(barLen)).append("\n");
        sb.append("[");
        sb.append(title);
        sb.append("]").append("\n\n");

    }

    @Override
    public void makeString(String str) {
        sb.append("\u25A0 ");
        sb.append(str);
        sb.append("\n\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (String s : items) {
            sb.append(" \u25CF ");
            sb.append(s);
            sb.append("\n");
        }
        sb.append("\n");
    }

    @Override
    public void close() {
        sb.append("=".repeat(barLen));
    }

    public String getTextResult() {
        return sb.toString();
    }
}
