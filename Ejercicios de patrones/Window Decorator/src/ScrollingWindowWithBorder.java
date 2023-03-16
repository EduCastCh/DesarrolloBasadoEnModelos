public class ScrollingWindowWithBorder extends ScrollingWindow{

    ScrollingWindow scrollingWindow;

    public ScrollingWindowWithBorder(ScrollingWindow scrollingWindow){
        this.scrollingWindow = scrollingWindow;
    }

    public String getDescription(){
        return scrollingWindow.getDescription() + "con barras laterales";
    }
}