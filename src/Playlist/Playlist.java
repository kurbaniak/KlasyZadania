package Playlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Playlist implements Playable {

    private List<Playable> list;
    private PlaylistType playlistType;
    private String playListname;

    public Playlist(String name) {
        this.playListname = name;
        list = new ArrayList<>();
        playlistType = PlaylistType.ONEBYONE;

    }

    public List<Playable> getList() {
        return list;
    }

    public void setList(List<Playable> list) {
        this.list = list;
    }

    public void add(Playable playable) {
        list.add(playable);
    }

    @Override
    public void play() {
        System.out.println(getPlayListname());
        switch (playlistType) {
            case LOOP:
                playLoop();
                break;
            case RANDOM:
               // playRandom();
                playRandm2();
                break;
            case ONEBYONE:
                playOneByOne();
                break;
        }

    }

    public void playOneByOne() {
        for (Playable p : list) {
            p.play();
        }

    }

    public void playRandom() {
       List<Playable> temp = new ArrayList<Playable>(list);

        while (!temp.isEmpty()) {
            Random random = new Random();
            int track = random.nextInt(temp.size());
            temp.get(track).play();
            temp.remove(track);
        }

    }

    public void playRandm2(){
        List<Playable> temp = new ArrayList<Playable>(list);
        Collections.shuffle(temp);
        for (Playable playable: temp            ) {
            playable.play();
        }
    }

    public void playLoop() {
        int i = 0;
        while (i < 1) {
            for (Playable playable : list) {
                playable.play();
            }

        }
    }

    public PlaylistType getPlaylistType() {
        return playlistType;
    }

    public void setPlaylistType(PlaylistType playlistType) {
        this.playlistType = playlistType;
    }

    public String getPlayListname() {
        return playListname;
    }

    public void setPlayListname(String playListname) {
        this.playListname = playListname;
    }
}
