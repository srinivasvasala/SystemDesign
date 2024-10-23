package design_patterns.Observer.Video;

public class Video {
    private String videoTitle;
    private String liveStreamtitle;
    private boolean isLive;
    private VideoStream videoStream;
    private LiveStream liveStream;



    private void updates(String liveStreamTitle, boolean isLive) {
        this.liveStreamtitle = liveStreamTitle;
        this.isLive = isLive;
        if (isLive) {
            liveStream.Updates(liveStreamtitle, isLive);
        } else {
            videoStream.Updates(videoTitle);
        }
    }
}
