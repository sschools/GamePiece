package com.ironyard;

import java.util.Random;

public class Main {

    public static class GamePiece {
        int positionX;
        int positionY;
        boolean frozen;
        String name;
        String color;

        public int getPositionX() {
            return positionX;
        }

        public int getPositionY() {
            return positionY;
        }

        public boolean isFrozen() {
            return frozen;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public GamePiece() {

        }

        public void move(int xPos, int yPos) {
            if (!this.frozen) {
                this.positionX = xPos;
                this.positionY = yPos;
            }
        }

        public void freeze() {
            this.frozen = true;
        }

        public void unfreeze() {
            this.frozen = false;
        }
    }

    public static void main(String[] args) {
        Random randomNum = new Random();
        GamePiece King = new GamePiece();
        King.setName("King");
        King.setColor("Blue");
        System.out.println("The name: " + King.getName());
        System.out.println("Color: " + King.getColor());
        System.out.println("Frozen?: " + King.isFrozen());
        System.out.println("Initial Position: " + King.getPositionX() + ", " + King.getPositionY());
        System.out.println("Attempt to Move");
        King.move(randomNum.nextInt(100), randomNum.nextInt(100));
        System.out.println("New Position: " + King.getPositionX() + ", " + King.getPositionY());
        System.out.println("Then Freeze");
        King.freeze();
        System.out.println("Frozen?: " + King.isFrozen());
        System.out.println("Attempt to Move");
        King.move(randomNum.nextInt(100), randomNum.nextInt(100));
        System.out.println("New Position: " + King.getPositionX() + ", " + King.getPositionY());
        System.out.println("Then unfreeze");
        King.unfreeze();
        System.out.println("Frozen?: " + King.isFrozen());
        System.out.println("Attempt to Move");
        King.move(randomNum.nextInt(100), randomNum.nextInt(100));
        System.out.println("New Position: " + King.getPositionX() + ", " + King.getPositionY());
    }
}
