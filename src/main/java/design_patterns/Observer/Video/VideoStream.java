package design_patterns.Observer.Video;

public class VideoStream implements IObserver {
    @Override
    public void Updates(String videoTitle) {
        System.out.println("new video uploaded: "+videoTitle);
    }

    @Override
    public void Updates(String liveStreamTitle, boolean isLive) {

    }
}
