package design_patterns.Observer.Video;

public class Main {

    public static void main(String[] args) {

        Video video = new Video();
        VideoStream videoStream = new VideoStream();
        LiveStream liveStream = new LiveStream();
        videoStream.Updates("video1");
         liveStream.Updates("liveStream1",true);
    }
}
