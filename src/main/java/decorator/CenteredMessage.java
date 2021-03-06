package decorator;

public class CenteredMessage implements Message{
    private final Message message;
    private final int width;

    public CenteredMessage(Message message, int width) {
        this.message = message;
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public String content() {
        String centeredMessage = message.content();
        return  shiftCursor() + centeredMessage;
    }

    private String shiftCursor() {
        int length = (width - message.content().length()) / 2;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
}
