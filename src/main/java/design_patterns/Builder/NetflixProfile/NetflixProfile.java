package design_patterns.Builder.NetflixProfile;

import java.util.Arrays;

public class NetflixProfile {
    private final String username;
    private final String displayPicture;
    private final String[] preferences;



    public NetflixProfile(NetflixProfileBuilder builder){
        this.username =builder.username;
        this.displayPicture = builder.displayPicture;
        this.preferences = builder.preferences.clone();
    }

    public static class NetflixProfileBuilder{
        private String username;
        private String displayPicture;
        private String[] preferences = new String[0];

        public NetflixProfileBuilder setUsername(String username){
            this.username = username;
            return this;
        }
        public NetflixProfileBuilder setDisplayPicture(String displayPicture){
            this.displayPicture = displayPicture;
            return this;
        }

        public NetflixProfileBuilder setPreferences(String[] prefer){
            this.preferences = prefer.clone();
            return this;
        }
        public NetflixProfile build(){
            return new NetflixProfile(this);
        }
    }

    public String getUsername() {
        return username;
    }
    public String getDisplayPicture() {
        return displayPicture;
    }
    public String[] getPreferences() {
        return preferences.clone();
    }
    @Override
    public String toString() {
        return "NetflixProfile{" +
                "username='" + username + '\'' +
                ", displayPicture='" + displayPicture + '\'' +
                ", preferences=" + Arrays.toString(preferences) +
                '}';
    }


}
