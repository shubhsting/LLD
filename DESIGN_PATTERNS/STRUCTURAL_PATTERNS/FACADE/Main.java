package DESIGN_PATTERNS.STRUCTURAL_PATTERNS.FACADE;

public class Main {
    public static void main(String[] args) {
        VideoConversionFacade facade = new VideoConversionFacade();
        VideoFile converted = facade.convertVideo("test.ogg", ".mp4");
        System.out.println(converted.fileName);
    }
}
