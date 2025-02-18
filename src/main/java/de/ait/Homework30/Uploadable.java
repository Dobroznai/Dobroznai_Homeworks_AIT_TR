package de.ait.Homework30;

public interface Uploadable {

    String FILE_TYPE_JPG = ".jpg";
    String FILE_TYPE_PNG = ".png";
    String FILE_TYPE_MP4 = ".mp4";
    String FILE_TYPE_MOV = ".mov";

    void uploadMedia(String filePath);

    default boolean checkFileType(String filePath) {
        if (filePath.endsWith(FILE_TYPE_JPG) || filePath.endsWith(FILE_TYPE_PNG)
                || filePath.endsWith(FILE_TYPE_MP4) || filePath.endsWith(FILE_TYPE_MOV)) {
            return true;
        } else {
            return false;
        }
    }
}