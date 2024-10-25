package design_patterns.Prototype;

import java.util.ArrayList;
import java.util.List;

public class NetflixPlan implements SubscriptionPlan {
    private String planName;
    private List<String> features; // <features>

    public NetflixPlan(String planName, List<String> features) {
        this.planName = planName;
        this.features = features;
    }
    public String getPlanName() {
        return planName;
    }
    public List<String> getFeatures() {
        return features;
    }

    @Override
    public SubscriptionPlan clone() {
        try {
            NetflixPlan clonedPlan = (NetflixPlan) super.clone();
            clonedPlan.features = new ArrayList<>(this.features);
            return clonedPlan;
        }catch (CloneNotSupportedException e) {
            throw new RuntimeException("clone not supported", e);
        }
    }

    @Override
    public String toString() {
        return "NetflixPlan{" +
                "planName='" + planName + '\'' +
                ", features=" + features +
                '}';
    }
}
