package DESIGN_PATTERNS.STRUCTURAL_PATTERNS.FACADE;

public class BitrateReader {
    public VideoFile read(String fileName, FileCodec codec) {
        System.out.println("reading file: " + fileName);
        return new VideoFile(fileName);
    }

    public VideoFile convert(String fileName, FileCodec desCodec) {
        System.out.println("converting file: " + fileName + " to " + desCodec.name());
        VideoFile file = new VideoFile(fileName);
        return new VideoFile(file.getFileName() + desCodec.codec);
    }
}
