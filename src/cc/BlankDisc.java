package cc;

import java.util.List;

/**
 * created on 2019/2/22 13:50
 *
 * @author zhangalong
 */
public class BlankDisc implements Cd {
    private String title;
    private String ar;
    private List<String> tracks;

    public BlankDisc(String title, String ar,List<String> tracks) {
        this.title = title;
        this.ar = ar;
        this.tracks = tracks;
    }

    public BlankDisc(String title, String att) {
        this.title = title;
        this.ar = att;
    }

    @Override
    public void play() {
        System.out.println(title+ar);
        for (String track:tracks){
            System.out.println("track=="+track);
        }
    }
}
