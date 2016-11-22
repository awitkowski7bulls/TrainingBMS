package eu.sig.training.ch05;

import java.awt.Graphics;
import java.util.List;

public class BoardPanel {
    @SuppressWarnings("unused")
    // tag::render[]
    /**
     * Renders a single square on the given graphics context on the specified
     * rectangle.
     * 
     * @param square
     *            The square to render.
     * @param g
     *            The graphics context to draw on.
     * @param x
     *            The x position to start drawing.
     * @param y
     *            The y position to start drawing.
     * @param w
     *            The width of this square (in pixels).
     * @param h
     *            The height of this square (in pixels).
     */
    private void render(Square square, Graphics g, Position p) {
        square.getSprite().draw(g, p, square);
        for (Unit unit : square.getOccupants()) {
            unit.getSprite().draw(g, p, square);
        }
    }
    // end::render[]

    private class Sprite {
        @SuppressWarnings("unused")
        public void draw(Graphics g, Position p, Square square) {

        }
    }

    private class Unit {
        public Sprite getSprite() {
            return null;
        }
    }

    private class Square extends Unit{

        public Square

        int w,h;

        public int getWidth(){ return w;}

        public int getHeight(){ return h;}

        public List<Unit> getOccupants() {
            return null;
        }

    }

    private class Position {
        int x,y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX(){ return x;}
        public int getY(){ return y;}
    }

}
