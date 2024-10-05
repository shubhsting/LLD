package DESIGN_PATTERNS.STRUCTURAL_PATTERNS.FACADE;

public class VideoConversionFacade {
    //all internal logic is completely abstracted from user
    public VideoFile convertVideo(String fileName, String destinationformat) {
        VideoFile file = new VideoFile(fileName);
        BitrateReader reader = new BitrateReader();
        reader.read(fileName, file.getFileCodec());
        return reader.convert(fileName, FileCodec.fromValues(destinationformat));
    }
}