package module8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zenovii on 08.03.2016.
 */
        public class MusicShop {

    public List<MusicInstrument> getMusicInstrumentList() {
        return musicInstrumentList;
    }

    List<MusicInstrument> musicInstrumentList = new ArrayList<>();


   public void musicInstrumentList(MusicInstrument musicInstrument) {
       musicInstrumentList.add(musicInstrument);
   }

}


