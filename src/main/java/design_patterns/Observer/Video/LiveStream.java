package design_patterns.Observer.Video;

public class LiveStream implements IObserver{
    @Override
    public void Updates(String videoTitle) {

    }

    @Override
    public void Updates(String liveStreamTitle ,boolean isLive) {
        System.out.println(liveStreamTitle + " is "+(isLive?"started":"ended"));
    }
}
