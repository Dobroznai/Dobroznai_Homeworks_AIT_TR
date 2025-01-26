package de.ait.Homework30;

public class MediaManager {

    public static void main(String[] args) {

        Uploadable videoUpload = new VideoUploader();
        String videoPath = "/Dokuments/private/video.mp4";
        boolean checkFileResult = videoUpload.checkFileType(videoPath);
        if (checkFileResult) {
            videoUpload.uploadMedia(videoPath);
        } else {
            System.out.println("Wrong video type");
        }

        System.out.println("---------------------------");


        String imagePath = "/Dokuments/private/image.jpg";
        Uploadable imageUpload = new PhotoUploader();
        boolean checkImageResult = imageUpload.checkFileType(imagePath);
        if (checkImageResult) {
            imageUpload.uploadMedia(imagePath);
        } else {
            System.out.println("Wrong image type");
        }

        System.out.println("---------------------------");


        String photoPath = "/Dokuments/private/image.png24";
        Uploadable photoUpload = new PhotoUploader();
        boolean checkPhotoResult = imageUpload.checkFileType(photoPath);
        if (checkPhotoResult) {
            photoUpload.uploadMedia(photoPath);
        } else {
            System.out.println("Wrong photo type");
        }
    }
}


