package com.mycompany.app.Week3;

// Abstract class Glyph
abstract class Glyph {
    abstract void draw();
    Glyph() {
        System.out.println("Glyph() beore draw");
        draw();
        System.out.println("Glyph() after draw");
    }
}

// Subclass RoundGlyph extends Glyph
class RoundGlyph extends Glyph {
    private int radius;

    RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph(), radius=" + radius);
    }

    void draw() {
        System.out.println("RoundGlyph.draw(), radius=" + radius);
    }
}

// GlyphTest class
class GlyphTest {
    public static void main(String[] args) {
        new RoundGlyph(5);
    }
}
