package design_patterns.Observer.Video;

public interface IObserver {

    public void Updates(String videoTitle);

    public void Updates(String liveStreamTitle,boolean isLive);
}
