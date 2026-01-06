class Computer {
    public void PlayMusic() {
        System.out.println("Music is Playing");
    }

    public String getMeApen(int cost) {
        if (cost >= 10)

            return "Pen";
        return "Nothing";
    }

}

public class objectspractice {
    public static void main(String argds[]) {
        Computer obj = new Computer();
        obj.PlayMusic();
        String str = obj.getMeApen(2);
        System.out.println(str);
    }
}
