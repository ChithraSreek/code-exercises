package main.java.chess;

import java.util.LinkedList;

public class Piece {
    int xp;
    int yp;
    int x;
    int y;
    boolean isWhite;
    String name;
    LinkedList<Piece> ps;

    public Piece(int xp, int yp, boolean isWhite, String n, LinkedList<Piece> ps) {
        this.xp = xp;
        this.yp = yp;
        this.isWhite = isWhite;
        x = xp*64;
        y = yp*64;
        this.ps = ps;
        this.name = n;
        ps.add(this);
    }

    public void movePiece(int xp, int  yp) {
        if (ChessGame.getPiece(xp*64, yp*64) != null) {
            if (ChessGame.getPiece(xp*64, yp*64).isWhite != isWhite) {
                ChessGame.getPiece(xp*64, yp*64).kill();
            } else {
                x = this.xp*64;
                y = this.yp*64;
                return;
            }
        }
        this.xp = xp;
        this.yp = yp;
        x = xp*64;
        y = yp*64;
    }

    public void kill() {
        ps.remove(this);
    }
}
