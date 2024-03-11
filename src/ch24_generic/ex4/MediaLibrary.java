package ch24_generic.ex4;

public class MediaLibrary <T extends Media>{
    Media[] medias = new Media[10];
    int index = 0;
    public void addMedia(T media) {
        medias[index++] = media;
    }

    public void printMediaTitles() {
        for (int i = 0; i < index; i++) {
            System.out.println(medias[i].getTitle());
        }
    }
}
