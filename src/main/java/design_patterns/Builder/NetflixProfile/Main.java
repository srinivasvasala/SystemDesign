package design_patterns.Builder.NetflixProfile;

public class Main {

    public static void main(String[] args) {
        String[] preferences = {"Action","comedy","romance"};
        NetflixProfile profile = new NetflixProfile.NetflixProfileBuilder()
                .setUsername("Srinivas")
                .setDisplayPicture("profile.jpg")
                .setPreferences(preferences)
                .build();
        System.out.println(profile);

    }
}
