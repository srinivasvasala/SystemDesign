package design_patterns.Prototype;

import java.util.HashMap;
import java.util.Map;

public class PlanRegistry {
    private Map<String,SubscriptionPlan> registry = new HashMap<>();
    public void addPlann(String planeName, SubscriptionPlan plan) {
        registry.put(planeName,plan);
    }

    public SubscriptionPlan getPlan(String planeName) {
        SubscriptionPlan plan = registry.get(planeName);
        return plan!=null?plan.clone():null;
    }
}
