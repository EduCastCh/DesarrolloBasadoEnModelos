public class WindowWithBorder extends ScrollingWindow{
    
    ScrollingWindow scrollingWindow;

    public WindowWithBorder(ScrollingWindow scrollingWindow){
        this.scrollingWindow = scrollingWindow;
    }

    public String getDescription(){
        return scrollingWindow.getDescription() + "con barras inferior";
    }
}
 