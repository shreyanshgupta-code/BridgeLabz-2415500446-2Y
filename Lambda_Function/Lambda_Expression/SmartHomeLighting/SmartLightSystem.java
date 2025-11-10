package Lambda_Expression.SmartHomeLighting;
public class SmartLightSystem {
    public static void main(String[] args) {
        LightBehavior motionBehavior = () -> 
            System.out.println("Motion detected → Turning lights ON with soft white glow.");
        LightBehavior timeBehavior = () -> 
            System.out.println("It's 7 PM → Turning lights ON with warm evening mode.");
        LightBehavior voiceBehavior = () -> 
            System.out.println("Voice command received → Activating party mode lights!");
            
        motionBehavior.activate();
        timeBehavior.activate();
        voiceBehavior.activate();
    }
}
