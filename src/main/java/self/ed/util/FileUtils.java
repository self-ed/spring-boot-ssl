package self.ed.util;

public class FileUtils {
    public static String getAbsolutePath(String fileName) {
        return FileUtils.class.getResource("/" + fileName).getPath();
    }
}
