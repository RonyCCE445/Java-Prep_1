interface Camera {
    void clickPhoto();
}

interface MusicPlayer{
    void playMusic();
}

class SmartPhone implements Camera , MusicPlayer{
    @Override
    public void clickPhoto(){
        System.out.println("Photo clicked on smartphone through the camera. hence camera working");

    }

     @Override
    public void playMusic(){
        System.out.println("Music played on the smartphone through the MusicPlayer");
    }
}

public class q18 {
    public static void main(String[] args) {
    Camera c1 = new SmartPhone();
    MusicPlayer m1 = new SmartPhone();

    c1.clickPhoto();
    m1.playMusic();



    }
}
