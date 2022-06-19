package moddingfile;
import pathing.*;
import java.io.File;
/**
 *
 * @author Raven
 */
public final class FileMod {
    
    private FileMod(){};
    
    public final static void restoreFileMahasiswa(String path_bkp){
        //isi dengan path file dan backup
        Algorithm.replacingMahasiswa(Path.path,path_bkp);
    }
    public final static void restoreFileDosen(String path_bkp){
        //isi dengan path file dan backup
        Algorithm.replacingDosen(Path.path,path_bkp);
    }
    public final static void backupFileMahasiswa(){
        //isi dengan path file current
        Algorithm.backupMahasiswa(Path.path);
    }
    public final static void backupFileDosen(){
        //isi dengan path file current
        Algorithm.backupDosen(Path.path);
    }
}   