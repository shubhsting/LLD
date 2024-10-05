package DESIGN_PATTERNS.STRUCTURAL_PATTERNS.FACADE;

public class VideoFile {
    String fileName;
    String codecType;

    VideoFile(String fileName) {
        this.fileName = fileName;
        this.codecType = fileName.split("\\.")[1];
    }
    public String getFileName() {
        return fileName.split("\\.")[0];
    }
    public FileCodec getFileCodec() {
        if (codecType.equals("mp4"))
            return FileCodec.MP4;
        else if (codecType.equals("ogg"))
            return FileCodec.OGG;
        throw new IllegalArgumentException("Invalid codec type");
    }
}
