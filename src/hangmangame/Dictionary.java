package hangmangame;

import java.util.List;

interface Dictionary {
    List<String> getWords();
}
class SimpleDictionary  implements Dictionary{
    @Override
    public List<String> getWords() {
        return List.of("apple", "table", "chair", "house", "light", "water", "music", "bread", "world", "dream", "earth", "plant", "cloud", "grass", "fire", "ocean", "river", "stone", "fruit", "heart", "smile", "dance", "sleep", "travel", "peace", "train", "horse", "zebra", "lemon", "mango", "quiet", "happy", "sunny", "storm", "rainy", "winter", "summer", "autumn", "spring", "shadow", "bright", "color", "magic", "dreamy", "funny", "clever", "brave", "strong", "gentle", "kindness", "family", "friend", "heartbeat", "journey", "island", "forest", "mountain", "valley", "desert", "sunset", "sunrise", "butterfly", "rainbow", "galaxy", "universe", "planetary", "creature", "adventure", "explore", "discover", "create", "imagine", "inspire", "believe", "achieve", "success", "failure", "challenge", "growth", "change", "freedom", "happiness", "knowledge", "wisdom", "courage", "loyalty", "trustworthy", "respectful", "compassionate", "ambitious", "motivated", "passionate", "enthusiastic", "grateful", "generous", "supportive", "resourceful", "thoughtful", "charismatic", "innovative");
    }
}