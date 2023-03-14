package com.example.crossroad1;

public abstract class Tile {
    // grid x and y
    private Coordinate coord;
    private int playerImage;
    private boolean hasPlayerSprite;
    protected int tileType;

    public Tile() {
        tileType = playerImage;
    }

    public Tile(Coordinate coord, int playerImage) {
        this.coord = coord;
        this.playerImage = playerImage;
        tileType = playerImage;
    }

    public int getImage() {
        return hasPlayerSprite ? ConfigActivity.getPlayer().getImage() : playerImage;
    }

    public void setImage(int playerImage) {
        if (hasPlayerSprite) {
            this.playerImage = playerImage;
        } else {
            this.playerImage = tileType;
        }
    }

    public boolean hasSprite() {
        return hasPlayerSprite;
    }

    public void addSprite() {
        hasPlayerSprite = true;
    }

    public void removeSprite() {
        hasPlayerSprite = false;

    }

    public void setTileType(int type) {
        tileType = type;
    }

}
