package DESIGN_PATTERNS.STRUCTURAL_PATTERNS.FACADE;

public enum FileCodec {
    MP4(".mp4"), OGG(".ogg");

    public String codec;

    FileCodec(String codec) {
        this.codec = codec;
    }

    public static FileCodec fromValues(String value) {
        for (FileCodec f : FileCodec.values()) {
            if (f.codec.equals(value))
                return f;
        }
        throw new IllegalArgumentException("Invalid codec passed");
    }
}
