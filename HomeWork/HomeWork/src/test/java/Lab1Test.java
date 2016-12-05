import Lab1.Core.Disk;
import Lab1.Core.DiskFactory;
import Lab1.mp3agic.InvalidDataException;
import Lab1.mp3agic.UnsupportedTagException;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by mafio on 30.11.2016.
 */

public class Lab1Test {
    private static final String WORKPATH="C:\\Users\\mafio\\Downloads\\CUsersmafioDownloadsvkmusicdownload";
    @Test
    public void DiskTest() throws InvalidDataException, IOException, UnsupportedTagException {
        Disk disk= DiskFactory.getInstance().create(WORKPATH);
        disk.saveTo(WORKPATH);
    }
}
